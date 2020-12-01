package fr.ird.dropper.ers.syc.service;

import fr.ird.common.DateTimeUtils;
import fr.ird.common.log.LogService;
import fr.ird.driver.eva.business.ActivityDepartureToPort;
import fr.ird.driver.eva.business.ActivityReturnToPort;
import fr.ird.driver.eva.business.Capture;
import fr.ird.driver.eva.business.Discard;
import fr.ird.driver.eva.business.EndOFishing;
import fr.ird.driver.eva.business.FADActivity;
import fr.ird.driver.eva.business.FishingActivity;
import fr.ird.driver.eva.business.FishingContext;
import fr.ird.driver.eva.business.FishingEvent;
import fr.ird.driver.eva.business.Gear;
import fr.ird.driver.eva.business.GearActivity;
import fr.ird.driver.eva.business.Landing;
import fr.ird.driver.eva.business.Position;
import fr.ird.driver.eva.business.Specie;
import fr.ird.driver.eva.business.Trip;
import fr.ird.driver.eva.business.Well;
import fr.ird.driver.eva.dao.ActivityDepartureToPortDAO;
import fr.ird.driver.eva.dao.ActivityReturnToPortDAO;
import fr.ird.driver.eva.dao.FADActivityDAO;
import fr.ird.driver.eva.dao.FishingActivityDAO;
import fr.ird.driver.eva.dao.HarbourDAO;
import fr.ird.driver.eva.dao.TripDAO;
import fr.ird.driver.eva.dao.VesselDAO;
import fr.ird.dropper.ers.syc.business.*;
import fr.ird.dropper.ers.syc.common.ErsUtils;
import fr.ird.dropper.ers.syc.config.ERSDropperProperties;
import fr.ird.dropper.ers.syc.exception.DropperException;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author jlebranc
 */
public class DropperService extends ErsMainService {

    private static final DropperService SERVICE = new DropperService();

    public static DropperService getService() {
        return DropperService.SERVICE;
    }
    private static int exitCode = 0;
    private TripDAO tripDAO;
    private boolean DEBUG = true;

    /**
     * Constructeur privé car DropperService est un singleton.
     */
    private DropperService() {
    }

    public static void main(String[] args) {
        DropperService dropperService = DropperService.getService();
        try {
            dropperService.init();
            dropperService.traiteFichiers();
        } catch (Exception e) {
            LogService.getService(DropperService.class).logApplicationError(e.getMessage());
            System.exit(1);
        }
        System.exit(exitCode);
    }

    private void traiteFichiers() {
        integreFichiersDeRepertoire(ERSDropperProperties.MESSAGE_DIRECTORY);

    }

    /**
     * Intégre les fichiers du repertoire en controlant l'extension
     *
     * @param repDepot
     */
    private void integreFichiersDeRepertoire(String repDepot) {
        File repertoireDepot = new File(repDepot);
        // Récupération des fichiers à traiter
        // cca 25/4/13 : recupere uniquement les fichiers d'extension xml
        FileFilter xmlFilesFilter = (File f) -> {
            if (f.isDirectory()) {
                return true;
            } else if (f.getName().toLowerCase().endsWith(".xml")) {
                return true;
            } else {
                return false;
            }
        };
        File[] fichiers = repertoireDepot.listFiles(xmlFilesFilter);
        // Controle que la recherche des fichiers a pu etre realisee
        if (fichiers == null) {
            exitCode = 4;
        } else if (fichiers.length > 0) {
            integreFichiers(fichiers);
        }
    }

    private void integreFichiers(File[] fichiers) {
        // Tri des fichiers du plus ancien au plus récent puis sur le nom de
        // fichier par ordre alphabétique
        Arrays.sort(fichiers, (File o1, File o2) -> {
            if (o1.lastModified() - o2.lastModified() == 0) {
                if (o1.getName().compareTo(o2.getName()) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (o1.lastModified() - o2.lastModified() > 0) {
                return 1;
            } else {
                return -1;
            }
        });
        Trip trip = null;
        for (final File fichier : fichiers) {
            LogService.getService(this.getClass()).logApplicationDebug(fichier.getAbsolutePath());
            try {
                if (fichier.isDirectory() == false) {
                    Cls cls = unmarshal(fichier);
                    //Valider le fichier XML par le XSD ?
                    if (cls == null) {
                        // La transformation du flux XML en Ops a échoué
                        LogService.getService(DropperService.class)
                                .logApplicationError(
                                        "L'objet CLS n'a pas été créé. Vérifiez le mapping.");
                        exitCode = 4;
                        // On laisse le fichier pour qu'il soit traité
                        // de nouveau

                        continue;
                    }

                    trip = factory(cls.getOPS());

                    if (trip != null) {
                        Trip t = tripDAO.save(trip);
                        if (t == null) {
                            exitCode = 4;
                            // On laisse le fichier pour qu'il soit traité
                            // de nouveau
                            LogService.getService(DropperService.class)
                                    .logApplicationError(
                                            "L'objet Trip n'a pas pu être sauvegardé en base.");
                        }
                    }
                }
            } catch (Exception e) {
                LogService.getService(DropperService.class)
                        .logApplicationError(
                                "Une exception a été levée pendant le traitement du fichier ="
                                + fichier.getName() + "\n" + e);
                exitCode = 4;
            }
        }
    }

    private Trip factory(Ops ops) throws DropperException {
        Trip trip = null;
        tripDAO = new TripDAO();
        if (ops.getCor() != null) {

            Ers ers = ops.getCor().getErs();
            LogService.getService(this.getClass()).logApplicationDebug("Message de modification " + ops.getCor().getRN());
            if (ers != null) {
                trip = factory(ers, ops.getCor().getRN());
            } else {
                throw new DropperException("METTRE UN MESSAGE");
            }
        }
        if (ops.getDel() != null) {
            String rnMessageERS = ops.getDel().getRN();
            trip = delete(rnMessageERS);
        }

        if (ops.getDat() != null
                && ops.getDat().getErs() != null) {
            Ers ers = ops.getDat().getErs();
            trip = factory(ers, null);
        }

        return trip;
    }

    private Trip factory(Ers ers, String rnMessageERSToCorrect) throws DropperException {
        Trip trip = null;
        String longTripNumber = ErsUtils.getElogTn(ers);
        String vesselNumber = ErsUtils.getCfrRfaDuNavire(ers.getLog());
        Date dateMessageERS = DateTimeUtils.createDateTime(ers.getErsRdDt(), ers.getErsRtLb()).toDate();

        if (longTripNumber != null && vesselNumber != null) {
            LogService.getService(this.getClass()).logApplicationDebug("## " + vesselNumber + " - " + longTripNumber);
            LogService.getService(this.getClass()).logApplicationDebug("## " + ers.getLog().getRTP());
            LogService.getService(this.getClass()).logApplicationDebug("## " + ers.getLog().getRTP().size());
            Dep dep = null;
            if (ers.getLog().getDEP() != null && !ers.getLog().getDEP().isEmpty()) {
                dep = ers.getLog().getDEP().get(0);
            }
            Rtp rtp = null;
            if (ers.getLog().getRTP() != null && !ers.getLog().getRTP().isEmpty()) {
                rtp = ers.getLog().getRTP().get(ers.getLog().getRTP().size() - 1);
            }
            trip = factory(vesselNumber, longTripNumber, ers.getLog(), dep, rtp);

            if (ers.getLog().getEOF() != null) {
                LogService.getService(this.getClass()).logApplicationDebug("## " + trip);
                Eof eof = ers.getLog().getEOF();
                if (trip != null && trip.getDateOfDep() == null) {
//                    exitCode = 3;
                    throw new DropperException("La fin de pêche n'est pas assiocée à une marée existante en base(Marée num: " + longTripNumber + ", Message num : " + ers.getRN() + ")");
                }
                EndOFishing endOFishing = new EndOFishing();
                endOFishing.setDateMessageERS(dateMessageERS);
                endOFishing.setDateEof(eof.getDatiDt());
                endOFishing.setRnMessageERS(ers.getRN());
                endOFishing.setRnMessageERSToCorrect(rnMessageERSToCorrect);
                trip.setEof(endOFishing);
                return trip;
            }
            LogService.getService(this.getClass()).logApplicationDebug("Création du trip faite.");
            List<EvenementDePeche> edp = new ArrayList<>();
            LogService.getService(this.getClass()).logApplicationDebug("DEP " + ers.getLog().getDEP());
            edp.addAll(ers.getLog().getDEP());
            LogService.getService(this.getClass()).logApplicationDebug("FAR " + ers.getLog().getFAR());
            edp.addAll(ers.getLog().getFAR());
            LogService.getService(this.getClass()).logApplicationDebug("RTP " + ers.getLog().getRTP());
            edp.addAll(ers.getLog().getRTP());

            Collections.sort(edp, (EvenementDePeche o1, EvenementDePeche o2) -> {
                if (o1.getDatiDt() == null || o2.getDatiDt() == null) {
                    return 0;
                }
                return o1.getDatiDt().compareTo(o2.getDatiDt());
            });

            factoryFishingEvents(trip, edp, ers.getRN(), dateMessageERS, rnMessageERSToCorrect);
            trip.setLandings(factoryLandings(trip, ers.getLog().getLAN()));
            trip.setDiscards(factoryDiscards(trip, ers.getLog().getDIS()));
            LogService.getService(this.getClass()).logApplicationDebug("SAVE -> " + trip.toString());

        } else {
            throw new DropperException("Erreur dans les valeurs du numéro de marée (" + longTripNumber + ") ou de l'identifant du navire (" + vesselNumber + ").");
        }
        return trip;
    }

    /**
     * Construit une marée avec les éléments de bases: date de départ et de
     * retour...
     *
     * @param logbook un log ERS
     * @param departure un dep ERS
     * @param returnToPort un rtp ERS
     * @return the trip
     */
    private Trip factory(String vesselNumber, String longTripNumber, Log logbook, Dep departure, Rtp returnToPort) {
        LogService.getService(this.getClass()).logApplicationDebug("factory " + vesselNumber + " - " + longTripNumber);
        LogService.getService(this.getClass()).logApplicationDebug("Log " + logbook);
        LogService.getService(this.getClass()).logApplicationDebug("Dep " + departure);
        LogService.getService(this.getClass()).logApplicationDebug("rtp " + returnToPort);

        LogService.getService(this.getClass()).logApplicationDebug("1");
        Trip trip = tripDAO.findTripByLongTripNumber(longTripNumber);
        LogService.getService(this.getClass()).logApplicationDebug("Trip " + trip);
        Date dateOfRtp = null;
        Date dateOfDep = null;
        LogService.getService(this.getClass()).logApplicationDebug("2");
        if (trip == null) {
            LogService.getService(this.getClass()).logApplicationDebug("Trip " + trip);
            LogService.getService(this.getClass()).logApplicationDebug("Dep " + departure);
            if (departure != null) {
                dateOfDep = departure.getDatiDt();
                LogService.getService(this.getClass()).logApplicationDebug("## " + dateOfDep);
            }
            trip = new Trip(dateOfDep);
            trip.setTripNumber(longTripNumber);
            trip.setVessel(new VesselDAO().findVessel(vesselNumber));
            LogService.getService(this.getClass()).logApplicationDebug("## " + trip);
            if (departure != null) {
                trip.setHabourOfDep(new HarbourDAO().findHarbour(departure.getPO()));
                LogService.getService(this.getClass()).logApplicationDebug("## " + trip);
            }
        } else {
            if (trip.getMasterName() == null) {
                trip.setMasterName(logbook.getMA());
            }
            if (trip.getMasterAdress() == null) {
                trip.setMasterAdress(logbook.getMD());
            }
        }
        LogService.getService(this.getClass()).logApplicationDebug("3");
        if (returnToPort != null) {
            dateOfRtp = returnToPort.getDatiDt();
            trip.setHabourOfRtp(new HarbourDAO().findHarbour(returnToPort.getPO()));
            trip.setDateOfRtp(dateOfRtp);
        }
        LogService.getService(this.getClass()).logApplicationDebug("4");
        if (departure != null && returnToPort != null) {
            LogService.getService(DropperService.class).logApplicationDebug("###############");
            LogService.getService(DropperService.class).logApplicationDebug("T: " + trip);
            LogService.getService(DropperService.class).logApplicationDebug("RTP: " + returnToPort);
            LogService.getService(DropperService.class).logApplicationDebug("D: " + departure);
            LogService.getService(DropperService.class).logApplicationDebug("###############");
            Double ertpNdNb = 0d;
            Double edepNdNb = 0d;
            if (departure.getLOCH() != null) {
                edepNdNb = Double.valueOf(departure.getLOCH());
            }
            if (returnToPort.getLOCH() != null) {
                ertpNdNb = Double.valueOf(returnToPort.getLOCH());
            }
            trip.setNauticalDistance((int) Math.round(ertpNdNb - edepNdNb));
        }
        LogService.getService(this.getClass()).logApplicationDebug("5");
        LogService.getService(DropperService.class).logApplicationDebug("--> " + trip);
        return trip;
    }

    /**
     * Convertit les débarquements associés à l'ERS dans le modèle EvA.
     *
     * @param trip la marée ERS
     * @param lans les débarquements ERS
     * @return les débarquements
     */
    private static ArrayList<Landing> factoryLandings(Trip trip, List<Lan> lans) {
        LogService.getService(DropperService.class).logApplicationDebug("factoryLandings" + lans);
        if (lans == null || lans.isEmpty()) {
            return null;
        }

        ArrayList<Landing> landings = new ArrayList<Landing>();
        for (Lan lan : lans) {
            Landing landing = new Landing();
            landing.setDate(lan.getDatiDt());
            landing.setPortOfLanding(new HarbourDAO().findHarbour(lan.getPO()));
            landing.setSenderType(lan.getTS());

            ArrayList<Specie> species = new ArrayList<>();
            for (Spe spe : lan.getSPE()) {
                Specie specie = factorySpecie(spe);
                specie.setLanding(landing);
                species.add(specie);

            }
            landing.setSpecies(species);
            LogService.getService(DropperService.class).logApplicationInfo(landing.toString());
            landing.setTrip(trip);
            landings.add(landing);

        }
        return landings;
    }

    /**
     * Convertit les espèces associées à l'ERS dans le modèle EvA.
     *
     * @param specie la liste des espèces ERS
     * @return la liste des espèces
     */
    private static Specie factorySpecie(Spe specie) {
        Specie s = new Specie();
        s.setGearType(specie.getGE());
        s.setMeansOfWeightMeasuring(specie.getMM());
        s.setNameOfSpecies(specie.getSN());
        s.setNumberHeldInNets(specie.getNB());
        s.setNumberOfFished(specie.getNF());
        s.setNumberOfFishedToBeLanded(specie.getFL());
        s.setQuantityHeldInNets(specie.getNQ());
        s.setWell(new Well(specie.getSI(), specie.getSE(), specie.getOR()));
//        if (specie.getEspe() != null) {
//            if (specie.getEspe().getEspeZoLb() != null) {
//                s.setSizeCategory(Integer.valueOf(specie.getEspe().getEspeZoLb().substring(3, 5)));
//            }
//            s.setSizeComposition(specie.getEspe().getEspeZoLb());
//        }

//        s.setSizeCategory(specie.getST());
        s.setSizeComposition(specie.getSZ());
        s.setWeightOfFish(specie.getWT());
        return s;
    }

    /**
     * Convertit les rejets associés à l'ERS dans le modèle EvA.
     *
     * @param diss la liste des rejets ERS
     * @return la liste des rejets
     */
    private List<Discard> factoryDiscards(Trip trip, List<Dis> diss) {
        if (diss == null || diss.isEmpty()) {
            return null;
        }

        ArrayList<Discard> discards = new ArrayList<Discard>();
        for (Dis dis : diss) {
            Discard discard = new Discard();
            discard.setDate(dis.getDatiDt());
            Pos pos = dis.getPOS();
            if (pos != null) {
                discard.setPosition(new Position(dis.getPOS().getLT(), dis.getPOS().getLG()));
            }
            ArrayList<Specie> species = new ArrayList<Specie>();
            for (Spe spe : dis.getSPE()) {
                species.add(factorySpecie(spe));
            }
            discard.setSpecies(species);
            discard.setTrip(trip);
            discards.add(discard);
        }
        return discards;
    }

    /**
     * Créér les activités associées à une marée.
     *
     * @param trip la marée
     * @param evenementDePecheList liste evenement de pêche ERS
     * @param endOfFishing un message de fin de pêche
     * @return la liste des activités de pêche
     * @throws fr.ird.eva.core.exception.EVADriverException
     */
    private void factoryFishingEvents(Trip trip, List<EvenementDePeche> evenementDePecheList, String rnMessageERS, Date dateMessage, String rnMessageERSToCorrect) throws DropperException {
        LogService.getService(this.getClass()).logApplicationDebug("factoryFishingEvents");
//        List<FishingEvent> fishingEvents = new ArrayList<>();

//        int activityNumber = 1;
//        DateTime current = null;
//        HashSet<FishingEvent> fishingEventOfDay = new HashSet<>();
        for (EvenementDePeche evenementDePeche : evenementDePecheList) {
            LogService.getService(this.getClass()).logApplicationDebug("Evt Peche " + evenementDePeche + " " + evenementDePeche.getDatiDt() + " " + evenementDePeche.getTiLb());
            DateTime dateEventOfFishing = DateTimeUtils.createDateTime(evenementDePeche.getDatiDt(), evenementDePeche.getTiLb());
//
//            if (current != null && !DateTimeUtils.dateEqual(dateEventOfFishing, current)) {
//                fishingEvents.addAll(fishingEventOfDay);
//
//                //Initialisation pour une nouvelle itération
//                activityNumber = 1;
//                fishingEventOfDay = new HashSet<>();
//            }

            if (evenementDePeche instanceof Dep) {
                Dep dep = (Dep) evenementDePeche;
                FishingEvent fishingEvent = factoryActivityDepartureToPort(trip, dep, rnMessageERS, dateMessage, rnMessageERSToCorrect);

//                fishingEventOfDay.add(fishingEvent);
                if (dep.getTI() == null) {
                    LogService.getService(DropperService.class).logApplicationInfo("Pour l'activité suivante, le champs heure n'est pas renseigné " + fishingEvent.toString());
                }
//                current = DateTimeUtils.convertDate(dep.getDepDaDt());
            } else if (evenementDePeche instanceof Rtp) {
                Rtp rtp = (Rtp) evenementDePeche;

                FishingEvent fishingEvent = factoryActivityReturnToPort(trip, rtp, rnMessageERS, dateMessage, rnMessageERSToCorrect);
//                activityNumber += 1;
//                fishingEventOfDay.add(fishingEvent);
                if (rtp.getTI() == null) {
                    LogService.getService(DropperService.class).logApplicationInfo("Pour l'activité suivante, le champs heure n'est pas renseigné " + fishingEvent.toString());
                }
//                current = DateTimeUtils.convertDate(rtp.getRtpDaDt());
            } else if (evenementDePeche instanceof Far) {
                Far far = (Far) evenementDePeche;
                HashSet<FishingEvent> fishingEventSet = new HashSet<>();

                LogService.getService(DropperService.class).logApplicationDebug("Traite l''activité " + far);
                fishingEventSet.addAll(factoryFishingActivity(trip, far, rnMessageERS, dateMessage, rnMessageERSToCorrect));

//                if (far.getGEA() == null) {
//                    /**
//                     * Traite les DCPs de l'activité
//                     */
////                    if (DEBUG) {
//                    LogService.getService(DropperService.class).logApplicationDebug("Traite les DCPs de l'activité " + far);
////                    }
//                    fishingEventSet.addAll(factoryFADActivity(trip, far, rnMessageERS, dateMessage, rnMessageERSToCorrect));
////                    activityNumber += fishingEventSet.size();
//                } else if (far.getGEA() != null || (far.getRAS() != null && far.getGEA() == null && far.getGLS() == null)) {
//                    /**
//                     * Traite une calée, si il y a présence de DCP, elle sera
//                     * traitée de manière interne.
//                     */
//                    if (DEBUG) {
//                        LogService.getService(DropperService.class).logApplicationDebug("Traite les activités de calées avec DCP ou sans");
//                    }
//                    fishingEventSet.addAll(factoryFishingActivity(trip, far, rnMessageERS, dateMessage, rnMessageERSToCorrect));
////                    activityNumber += fishingEventSet.size();
//                } else {
//                    LogService.getService(DropperService.class).logApplicationError("L'activité n'a pas été traitée!!! FAR=" + far);
//                    throw new DropperException("L'activité n'a pas été traitée!!! FAR =" + far);
//                }
//                fishingEventOfDay.addAll(fishingEventSet);
                if (far.getTI() == null) {
                    LogService.getService(DropperService.class).logApplicationInfo("Pour l'activité suivante, le champs heure n'est pas renseigné " + fishingEventSet.toString());
                }
//                current = DateTimeUtils.convertDate(far.getFarDaDt());
            }
        }

//        if (fishingEventOfDay.size() > 0) {
//            fishingEvents.addAll(fishingEventOfDay);
//        }
//        if (DEBUG) {
//            LogService.getService(DropperService.class).logApplicationDebug("Le nombre d'activités trouvées, au sens AVDTH, est de " + fishingEvents.size());
//        }
//        return fishingEvents;
    }

    /**
     * Convertit une activité départ de port associées à une marée dans le
     * modèle EvA.
     *
     * @param trip la marée
     * @param dep le depart ERS
     * @param indexOfFishingEvent le numéro de l'activité
     * @return l'activité de depart au port
     * @throws fr.ird.eva.core.exception.EVADriverException
     */
    private ActivityDepartureToPort factoryActivityDepartureToPort(Trip trip, Dep dep, String rnMessageERS, Date dateMessage, String rnMessageERSToCorrect) throws DropperException {
        LogService.getService(DropperService.class).logApplicationDebug("factoryActivityDepartureToPort");
        ActivityDepartureToPort activityDepartureToPort = new ActivityDepartureToPort();
//        activityDepartureToPort.setIndexOfFishingEvent(indexOfFishingEvent);
        activityDepartureToPort.setDateOfFishingEvent(dep.getDatiDt());

        LogService.getService(DropperService.class).logApplicationDebug("La date de l'activité est le " + activityDepartureToPort.getDateOfFishingEvent().toString());// +  " -- " + far.getFarDaDt() + " -- " + far.getFarDatiDt() + "--" + far.getFarTiLb());

        activityDepartureToPort.setPortOfDeparture(new HarbourDAO().findHarbour(dep.getPO()));
        LogService.getService(DropperService.class).logApplicationDebug("AA " + dep.getAA());
        activityDepartureToPort.setAnticipatedActivity(dep.getAA());

        for (Gea gea : dep.getGEA()) {
            Gear gear = new Gear();
            gear.setType(gea.getGE());
            gear.setMeshSize(gea.getME());
            gear.setAverageHeightOfNets(gea.getGD());
            gear.setAverageLengthOfNets(gea.getGL());
            gear.setDimensions(gea.getGC());
            gear.setFishingDepths(gea.getFD());
            gear.setNumberOfFishingOperation(gea.getFO());
            gear.setQuantityOfGear(gea.getQG());
            gear.setTotalLengthOfGear(gea.getTL());

            if (!trip.hasGear(gear)) {
                trip.addGearOnBoard(gear);
            }

//            activityDepartureToPort.addGearOnBoard(gear);
        }

        trip.setPartialLanding(!dep.getSPE().isEmpty());
        for (Spe spe : dep.getSPE()) {
            Specie specie = new Specie();

            specie.setNameOfSpecies(spe.getSN());
//            specie.setSizeCategory(Integer.valueOf(spe.getEspe().getEspeZoLb().substring(3, 5)));
            specie.setNumberOfFishedToBeLanded(spe.getFL());
            specie.setNumberOfFished(spe.getNF());
//            specie.setSizeComposition(spe.getEspe().getEspeZoLb());
            specie.setGearType(spe.getGE());
            specie.setWeightOfFish(spe.getWT());
            specie.setNumberHeldInNets(spe.getNB());
            specie.setQuantityHeldInNets(spe.getNQ());
            specie.setMeansOfWeightMeasuring(spe.getMM());

            specie.setWell(new Well(spe.getSI(), spe.getSE(), spe.getOR()));
//        specie.setSizeCategory(spe.getST());
            specie.setSizeComposition(spe.getSZ());

            activityDepartureToPort.addSpecieOnBoard(specie);
        }

        activityDepartureToPort.setRnMessageERS(rnMessageERS);
        activityDepartureToPort.setDateMessageERS(dateMessage);
        if (rnMessageERSToCorrect != null) {
            activityDepartureToPort.setRnMessageERSToCorrect(rnMessageERSToCorrect);
            activityDepartureToPort.setCorMessageERS(true);
        }
        trip.addActivityDepartureToPort(activityDepartureToPort);
        return activityDepartureToPort;
    }
//

    /**
     * Convertit une activité retour au port associées à une marée dans le
     * modèle EvA.
     *
     * @param trip la marée
     * @param rtp le retour au port ERS
     * @param activityNumber le numéro de l'activité
     * @return l'activité de retour au port
     * @throws fr.ird.eva.core.exception.EVADriverException
     */
    private ActivityReturnToPort factoryActivityReturnToPort(Trip trip, Rtp rtp, String rnMessageERS, Date dateMessageERS, String rnMessageERSToCorrect) throws DropperException {
        LogService.getService(this.getClass()).logApplicationDebug("factoryActivityReturnToPort");
        ActivityReturnToPort activityReturnToPort = new ActivityReturnToPort();
        activityReturnToPort.setDateOfFishingEvent(rtp.getDatiDt());
        activityReturnToPort.setReasonOfReturn(rtp.getRE());

        LogService.getService(DropperService.class).logApplicationDebug(this.getClass().getName() + " " + rtp.getPO());

        activityReturnToPort.setPortOfReturn(new HarbourDAO().findHarbour(rtp.getPO()));
        LogService.getService(this.getClass()).logApplicationDebug("" + activityReturnToPort);
        for (Gea gea : rtp.getGEA()) {
            Gear gear = new Gear();
            gear.setType(gea.getGE());
            gear.setMeshSize(gea.getME());
            gear.setAverageHeightOfNets(gea.getGD());
            gear.setAverageLengthOfNets(gea.getGL());
            gear.setDimensions(gea.getGC());
            gear.setFishingDepths(gea.getFD());
            gear.setNumberOfFishingOperation(gea.getFO());
            gear.setQuantityOfGear(gea.getQG());
            gear.setTotalLengthOfGear(gea.getTL());
            if (!trip.hasGear(gear)) {
                trip.addGearOnBoard(gear);
            }
//            activityReturnToPort.addGearOnBoard(gear);
        }
        LogService.getService(this.getClass()).logApplicationDebug("------");

        activityReturnToPort.setRnMessageERS(rnMessageERS);
        activityReturnToPort.setDateMessageERS(dateMessageERS);
        if (rnMessageERSToCorrect != null) {
            activityReturnToPort.setRnMessageERSToCorrect(rnMessageERSToCorrect);
            activityReturnToPort.setCorMessageERS(true);
        }
        trip.addActivityReturnToPort(activityReturnToPort);
        return activityReturnToPort;
    }

    /**
     * Convertit une activité de pêche associées à une marée dans le modèle EvA.
     *
     * @param trip la marée
     * @param far le far ERS
     * @param activityNumber le numéro de l'activité
     * @return l'activité de pêche
     * @throws DropperException
     */
    private HashSet<FishingEvent> factoryFishingActivity(Trip trip, Far far, String rnMessageERS, Date dateMessage, String rnMessageERSToCorrect) throws DropperException {
        LogService.getService(this.getClass()).logApplicationDebug("factoryFishingActivity\n" + trip);
        HashSet<FishingEvent> fishingEvents = new HashSet<>();
        FishingActivity activity = new FishingActivity();
        activity.setDateOfFishingEvent(far.getDatiDt());
//        activity.setIndexOfFishingEvent(activityNumber);
        LogService.getService(DropperService.class).logApplicationDebug("Ceci est le FAR numéro " + far.toString());
        LogService.getService(DropperService.class).logApplicationDebug("La date de l'activité est le " + activity.getDateOfFishingEvent().toString());// +  " -- " + far.getFarDaDt() + " -- " + far.getFarDatiDt() + "--" + far.getFarTiLb());

        if (far.getPOS() != null) {
            activity.setPosition(new Position(far.getPOS().getLT(), far.getPOS().getLG()));
        }
//        if (far.getEfar() != null) {
//            activity.setDaysFished(far.getEfar().getEfarDfNb());
//        }

        if (far.getRAS() != null) {
            activity.setEconomicZone(far.getRAS().getRasEzLb());
        }

        activity.setRnMessageERS(rnMessageERS);
        activity.setDateMessageERS(dateMessage);
        if (rnMessageERSToCorrect != null) {
            activity.setRnMessageERSToCorrect(rnMessageERSToCorrect);
            activity.setCorMessageERS(true);
        }
        if (far.getSU() != null) {
            activity.setSuccessful(far.getSU() == 1);
            if (far.getSU() == 1) {
                activity.setOperation("COUP POSITIF");
            } else {
                activity.setOperation("COUP NEGATIF");
            }
        } else {
            activity.setOperation("COUP INCONNU");
        }

        Gea gea = far.getGEA();
        LogService.getService(this.getClass()).logApplicationDebug("GEA " + gea);
        if (gea != null) {
            Gear gear = new Gear();
            gear.setType(gea.getGE());
            gear.setMeshSize(gea.getME());
            gear.setAverageHeightOfNets(gea.getGD());
            gear.setAverageLengthOfNets(gea.getGL());
            gear.setDimensions(gea.getGC());
            gear.setFishingDepths(gea.getFD());
            gear.setNumberOfFishingOperation(gea.getFO());
            gear.setQuantityOfGear(gea.getQG());
            gear.setTotalLengthOfGear(gea.getTL());
            Gear gearInTrip = trip.isGearExist(gear);
            if (gearInTrip == null) {
                LogService.getService(this.getClass()).logApplicationDebug("No gear in trip");
                trip.addGearOnBoard(gear);
            } else {
                gear = gearInTrip;
            }
            activity.setGearUsed(gear);
            activity.setFishingTime(gea.getDU());

            if (gea.getGES() != null) {
                GearActivity ger = factoryGearShotActivity(gea.getGES());
                activity.addGearActivity(ger);
                activity.setPosition(ger.getPosition());

            }
            if (gea.getGER() != null) {
                GearActivity ges = factoryGearRetrieveActivity(gea.getGER());
                activity.addGearActivity(ges);
                activity.setPosition(ges.getPosition());
                if (ges.isSuccessfulCatch() != null) {
                    if (ges.isSuccessfulCatch()) {
                        activity.setOperation("COUP POSITIF");
                    } else {
                        activity.setOperation("COUP NEGATIF");
                    }
                } else {
                    activity.setOperation("COUP INCONNU");
                }

            } else {
                activity.setOperation("RECHERCHE");
            }
        }

        if (far.getFAD() != null) {
            fishingEvents.addAll(factoryFADActivity(trip, far.getFAD(), rnMessageERS, dateMessage, rnMessageERSToCorrect));
        }

//        if (far.getEfar() != null) {
//            LogService.getService(DropperService.class).logApplicationDebug("far.getEfar != null #1");
//            //Primary fishing association
//            if (far.getEfar().getEpfa() != null) {
//                activity.addFishingContext(
//                        factoryPrimaryFishingContext(far.getEfar().getEpfa()));
//            }
//
//            // le commentaire de Efad donne l'operation si coup inconnu
//        }
//        if (activity.getOperation() != null && activity.getOperation().equals("COUP INCONNU")) {
//            LogService.getService(DropperService.class).logApplicationDebug("COUP INCONNU");
//            if (far != null && far.getEfar() != null && far.getEfar().getEpfa() != null && far.getEfar().getEpfa().getListEfad() != null) {
//                activity.setOperation(far.getEfar().getEpfa().getListEfad().get(0).getEfadIfLb());
//                if (activity.getOperation().equals("")) {
//                    activity.setOperation("COUP INCONNU");
//                }
//            }
//        }
//        if (far.getEfar() != null) {
//            LogService.getService(DropperService.class).logApplicationDebug("far.getEfar() != null #2");
//            // Additional subdeclaration under PS tropical tuna fishing
//            Etts etts = far.getEfar().getEtts();
//            if (etts == null) {
//                LogService.getService(DropperService.class).logApplicationInfo("Les informations additionnelles telles que la direction et la vitesse "
//                        + "du vent ne sont pas renseignées.");
//            } else {
//                LogService.getService(DropperService.class).logApplicationDebug("ETTS non null");
//
//                /**
//                 * Élément lié au coup de pêche.
//                 */
////                activity.setHoldNumber(etts.getEttsHnNb().toString());
//                activity.setSeaState(etts.getEttsCdLb());
//                activity.setSeaSurfaceTemperature(etts.getEttsStNb());
//                activity.setDegreeOfCurrent(etts.getEttsCdLb());
//                activity.setSpeedOfCurrent(etts.getEttsScNb());
//                activity.setDegreeOfWind(etts.getEttsWdLb());
//                activity.setSpeedOfWind(etts.getEttsWsNb());
//                activity.setComment(etts.getEttsCmLb());
//                LogService.getService(DropperService.class).logApplicationDebug("--- 3");
//                if (activity.getOperation() == null || activity.getOperation().equals("COUP INCONNU")) {
//                    LogService.getService(DropperService.class).logApplicationDebug("--- 4");
//                    if ("RECHERCHE".equals(activity.getComment())) {
//                        activity.setOperation("RECHERCHE");
//                    } else if (far.getEfar() != null
//                            && far.getEfar().getEpfa() != null
//                            && far.getEfar().getEpfa().getListEfad() != null
//                            && far.getEfar().getEpfa().getListEfad().size() > 0) {
//                        LogService.getService(DropperService.class).logApplicationDebug("--- 5");
//                        activity.setOperation(far.getEfar().getEpfa().getListEfad().get(0).getEfadIfLb());
//                    } else {
//                        LogService.getService(DropperService.class).logApplicationDebug("--- 6");
//                        activity.setOperation("RECHERCHE");
//                    }
//                }
//                LogService.getService(DropperService.class).logApplicationDebug("--- 7");
//                activity.setSchoolSizeInfomartion(etts.getEttsSoNb());
//                activity.setMiscProblems(etts.getEttsMpLb());
//                if (etts.getEttsFaLb() != null) {
//                    LogService.getService(DropperService.class).logApplicationDebug("--- 8");
//                    for (String fa : etts.getEttsFaLb().split(" ")) {
//                        FishingContext fc = factoryFishingContext(fa);
//                        activity.addFishingContext(fc);
//                    }
//                }
//            }
//        }
        LogService.getService(DropperService.class).logApplicationDebug("--- 9");
        for (Spe spe : far.getSPE()) {
            Capture capture = factorySpeciesFished(activity, spe);
            activity.addElementaryCapture(capture);

        }

        trip.addFishingActivity(activity);
        fishingEvents.add(activity);

//        for (FADActivity fADActivity : factoryFADActivity(trip, activity, rnMessageERS, dateMessage, rnMessageERSToCorrect)) {
//            trip.addFADActivity(fADActivity);
//        }
        fishingEvents.addAll(factoryFADActivity(trip, activity, rnMessageERS, dateMessage, rnMessageERSToCorrect));

        return fishingEvents;
    }

    /**
     * Convertit les activités de DCP dans le modèle EvA. Fonction a revoir
     * selon les pratiques des pecheurs.
     *
     * @param fishingActivity une activitié de pêche
     * @param activityNumber le numéro de l'activité
     * @return la liste des activités de pêche
     * @throws DropperException
     */
    private HashSet<FADActivity> factoryFADActivity(Trip trip, FishingActivity fishingActivity, String rnMessageERS, Date dateMessage, String rnMessageERSToCorrect) throws DropperException {

        HashSet<FADActivity> fishingEvents = new HashSet<FADActivity>();
        if (fishingActivity == null) {
            return fishingEvents;
        }
        FADActivity activity;
        for (FishingContext fishingContext : fishingActivity.getFishingContexts()) {
            if (fishingContext != null) {

                for (fr.ird.driver.eva.business.Fad fad : fishingContext.getFads()) {

                    activity = new FADActivity();
//                    activity.setIndexOfFishingEvent(activityNumber);

                    //La liste de FAD associée au FC doit être toujours vide.
                    activity.addFishingContext(new FishingContext(true, fishingContext.getFishingContextType()));
                    activity.setDateOfFishingEvent(fishingActivity.getDateOfFishingEvent());

                    activity.setPosition(fishingActivity.getPosition());
                    activity.setEconomicZone(fishingActivity.getEconomicZone());
                    activity.setHoldNumber(fishingActivity.getHoldNumber());
                    activity.setSeaState(fishingActivity.getSeaState());
                    activity.setSeaSurfaceTemperature(fishingActivity.getSeaSurfaceTemperature());
                    activity.setDegreeOfCurrent(fishingActivity.getDegreeOfCurrent());
                    activity.setSpeedOfCurrent(fishingActivity.getSpeedOfCurrent());
                    activity.setDegreeOfWind(fishingActivity.getDegreeOfWind());
                    activity.setSpeedOfWind(fishingActivity.getSpeedOfWind());
                    activity.setSchoolSizeInfomartion(fishingActivity.getSchoolSizeInfomartion());
                    activity.setMiscProblems(fishingActivity.getMiscProblems());
                    activity.setComment(fishingActivity.getComment());

                    activity.setDateMessageERS(dateMessage);
                    activity.setRnMessageERS(rnMessageERS);
                    if (rnMessageERSToCorrect != null) {
                        activity.setCorMessageERS(true);
                        activity.setRnMessageERSToCorrect(rnMessageERSToCorrect);
                    }

                    //Gestion des FADs et des bouées associées
                    activity.setOperation(fad.getFadComment());
                    activity.setFad(fad);

                    if (!activity.getOperation().equals("")) {
                        trip.addFADActivity(activity);
                        fishingEvents.add(activity);
                    }
                }
            }
        }
        return fishingEvents;
    }

    /**
     * Convertit les activités de DCP dans le modèle EvA. Note: Fonction a
     * revoir selon les pratiques des pêcheurs.
     *
     * @param trip la marée
     * @param far le far ERS
     * @param activityNumber le numéro de l'activité
     * @return la liste des activités de pêche
     * @throws DropperException
     */
    private HashSet<FishingEvent> factoryFADActivity(Trip trip, Far far, String rnMessageERS, Date dateMessage, String rnMessageERSToCorrect) throws DropperException {
        LogService.getService(this.getClass()).logApplicationDebug("factoryFADActivity");
        HashSet<FishingEvent> fishingEvents = new HashSet<>();
        if (far == null || far.getFAD() == null) {
            return fishingEvents;
        }
        Fad fad = far.getFAD();
        FADActivity activity = new FADActivity();

        LogService.getService(DropperService.class).logApplicationDebug("EPFA " + fad);
        FishingContext context = new FishingContext();
        context.setPrimary(true);
//        context.setFishingContextType(fad.getEpfaPfLb());
        LogService.getService(DropperService.class).logApplicationDebug("FC " + context);

        activity.setRnMessageERS(rnMessageERS);
        activity.setDateMessageERS(dateMessage);
        if (rnMessageERSToCorrect != null) {
            activity.setCorMessageERS(true);
            activity.setRnMessageERSToCorrect(rnMessageERSToCorrect);
        }
//
////            activity.setIndexOfFishingEvent(activityNumber);
        //La liste de FAD associé au FC doit être toujours vide.
        activity.addFishingContext(context);
//
        activity.setDateOfFishingEvent(far.getDatiDt());
        LogService.getService(DropperService.class).logApplicationDebug("Ceci est le FAR numéro " + far.toString());
//
//            LogService.getService(DropperService.class).logApplicationDebug("La date de l'activité est le " + activity.getDateOfFishingEvent().toString());// +  " -- " + far.getFarDaDt() + " -- " + far.getFarDatiDt() + "--" + far.getFarTiLb());
//
        if (far.getPOS() != null) {
            activity.setPosition(new Position(far.getPOS().getLT(), far.getPOS().getLG()));
        }
//
//            activity.setDaysFished(far.getEfar().getEfarDfNb());
//
//            if (far.getRas() != null) {
//                activity.setEconomicZone(far.getRas().getRasEzLb());
//            }
//
//            // Additional subdeclaration under tropical tuna fishing
//            Etts etts = far.getEfar().getEtts();
//            if (etts == null) {
//                LogService.getService(DropperService.class).logApplicationInfo("Les informations additionnelles telles que la direction et la vitesse "
//                        + "du vent ne sont pas renseignées.");
//            } else {
//                /**
//                 * Élément lié au coup de pêche.
//                 */
//                activity.setHoldNumber(etts.getEttsHnNb().toString());
//                activity.setSeaState(etts.getEttsCdLb());
//                activity.setSeaSurfaceTemperature(etts.getEttsStNb());
//                activity.setDegreeOfCurrent(etts.getEttsCdLb());
//                activity.setSpeedOfCurrent(etts.getEttsScNb());
//                activity.setDegreeOfWind(etts.getEttsWdLb());
//                activity.setSpeedOfWind(etts.getEttsWsNb());
//                activity.setComment(etts.getEttsCmLb());
//
//                activity.setSchoolSizeInfomartion(etts.getEttsSoNb());
//                activity.setMiscProblems(etts.getEttsMpLb());
//
//                //Gestion des FADs et des bouées associées
//                activity.setOperation(efad.getEfadIfLb());
//
//                fr.ird.driver.eva.business.Fad fad = new fr.ird.driver.eva.business.Fad();
//                fad.setHasBuoy(efad.getEfadTp().equals("presence"));
//                fad.setFadType(efad.getEfadTfLb());
//                fad.setFadComment(efad.getEfadIfLb());
////                fad.setRnMessageERS(rnMessageERS);
//                if (fad.isHasBuoy()) {
//                    for (Etdd etdd : efad.getListEtdd()) {
//                        fad.addBuoy(etdd.getEtddGtLb(), etdd.getEtddGiLb(), etdd.getEtddGoLb());
//                    }
//                }
//                activity.setFad(fad);
//
//                if (etts.getEttsFaLb() != null) {
//                    for (String fa : etts.getEttsFaLb().split(" ")) {
//                        FishingContext fc = factoryFishingContext(fa);
////                        fc.setRnMessageERS(rnMessageERS);
//                        activity.addFishingContext(fc);
//                    }
//                }
//            }
//
//            trip.addFADActivity(activity);
//            fishingEvents.add(activity);
//        }
        return fishingEvents;
    }

    /**
     * Convertit les captures associés à l'ERS dans le modèle EvA.
     *
     * @param fishingActivity l'activité de pêche associée à la capture ERS
     * @param specie l'espèce capturée ERS
     * @return la capture
     * @throws DropperException
     */
    private Capture factorySpeciesFished(FishingActivity fishingActivity, Spe spe) throws DropperException {
        LogService.getService(this.getClass()).logApplicationDebug("factorySpeciesFished");
        Capture capture = new Capture();
        capture.setDate(fishingActivity.getDateOfFishingEvent());
        capture.setPosition(fishingActivity.getPosition());

        Specie specie = factorySpecie(spe);
        specie.setCapture(capture);
        capture.setSpecie(specie);
        return capture;
    }

    /**
     * Convertit les contextes de pêches associés à l'ERS dans le modèle EvA.
     *
     * @param epfa un contecte de pêche ERS
     * @return un contecte de pêche
     */
    private FishingContext factoryPrimaryFishingContext(Fad fad) {
        LogService.getService(this.getClass()).logApplicationDebug("factoryPrimaryFishingContext");
        LogService.getService(this.getClass()).logApplicationDebug("FAD " + fad);

        FishingContext context = new FishingContext();
        context.setPrimary(true);
//        context.setFishingContextType(epfa.getEpfaPfLb());
        LogService.getService(this.getClass()).logApplicationDebug("context " + context);
//        for (Efad efad : epfa.getListEfad()) {
//            fr.ird.driver.eva.business.Fad fad = new fr.ird.driver.eva.business.Fad();
//            fad.setHasBuoy(efad.getEfadTp().equals("presence"));
//            fad.setFadType(efad.getEfadTfLb());
//            fad.setFadComment(efad.getEfadIfLb());
//            if (fad.isHasBuoy()) {
//                for (Etdd etdd : efad.getListEtdd()) {
//                    fad.addBuoy(etdd.getEtddGtLb(), etdd.getEtddGiLb(), etdd.getEtddGoLb());
//                }
//            }
//            context.addFad(fad);
//        }
        return context;
    }

    /**
     * Convertit les contextes de pêches associés à l'ERS dans le modèle EvA.
     *
     * @param fa un contecte de pêche ERS
     * @return un contecte de pêche
     */
    private static FishingContext factoryFishingContext(String fa) {

        FishingContext context = new FishingContext();
        context.setPrimary(false);
        context.setFishingContextType(fa);
        return context;
    }

    /**
     * Convertit les engins de type "retrait" associés à l'ERS dans le modèle
     * EvA.
     *
     * @param ges une activité de mise à l'eau de l'engin ERS
     * @return une activité liée à l'engin
     */
    private static GearActivity factoryGearShotActivity(Ges ges) {
        if (ges == null) {
            return null;
        }
        GearActivity gearActivity = new GearActivity();
        gearActivity.setIsShot(true);
        gearActivity.setDate(ges.getDatiDt());
        gearActivity.setPosition(new Position(ges.getPOS().getLT(), ges.getPOS().getLG()));
        gearActivity.setIdentifier(ges.getGS());

        return gearActivity;
    }

    /**
     * Convertit les engins de type "mise à l'eau" associés à l'ERS dans le
     * modèle EvA.
     *
     * @param ger une activité de retrait de l'engin ERS
     * @return une activité liée à l'engin
     */
    private static GearActivity factoryGearRetrieveActivity(Ger ger) {
        if (ger == null) {
            return null;
        }
        GearActivity gearActivity = new GearActivity();
        gearActivity.setIsShot(false);
        gearActivity.setDate(ger.getDatiDt());
        gearActivity.setPosition(new Position(ger.getPOS().getLT(), ger.getPOS().getLG()));
        gearActivity.setIdentifier(ger.getGS());
//        if (ger.getEger() != null && ger.getEger().getEgerRfBl() != null) {
//            gearActivity.setIsSuccessfulCatch(ger.getEger().getEgerRfBl().equals(GearActivity.SUCCESSFUL_FISHING_OPERATION));
//        }
        return gearActivity;
    }

    private Trip delete(String rnMessageERS) {
        LogService.getService(this.getClass()).logApplicationDebug("Suppression du message " + rnMessageERS);
        Trip trip = tripDAO.findTripByRnMessageERS(rnMessageERS);
        if (trip != null) {
            for (Iterator<ActivityReturnToPort> iterator = trip.getActivityReturnToPorts().iterator(); iterator.hasNext();) {
                ActivityReturnToPort a = iterator.next();
                if (a.getRnMessageERS() == null ? rnMessageERS == null : a.getRnMessageERS().equals(rnMessageERS)) {
                    LogService.getService(this.getClass()).logApplicationDebug("Suppression de " + a);
                    trip.getActivityReturnToPorts().remove(a);
                    new ActivityReturnToPortDAO().delete(a);
                }
            }
            for (Iterator<ActivityDepartureToPort> iterator = trip.getActivityDepartureToPorts().iterator(); iterator.hasNext();) {
                ActivityDepartureToPort a = iterator.next();
                if (a.getRnMessageERS() == null ? rnMessageERS == null : a.getRnMessageERS().equals(rnMessageERS)) {
                    LogService.getService(this.getClass()).logApplicationDebug("Suppression de " + a);
                    trip.getActivityDepartureToPorts().remove(a);
                    new ActivityDepartureToPortDAO().delete(a);
                }
            }
            for (Iterator<FADActivity> iterator = trip.getFadActivitys().iterator(); iterator.hasNext();) {
                FADActivity a = iterator.next();
                if (a.getRnMessageERS() == null ? rnMessageERS == null : a.getRnMessageERS().equals(rnMessageERS)) {
                    LogService.getService(this.getClass()).logApplicationDebug("Suppression de " + a);
                    trip.getFadActivitys().remove(a);
                    new FADActivityDAO().delete(a);
                }
            }
            for (Iterator<FishingActivity> iterator = trip.getFishingActivitys().iterator(); iterator.hasNext();) {
                FishingActivity a = iterator.next();
                if (a.getRnMessageERS() == null ? rnMessageERS == null : a.getRnMessageERS().equals(rnMessageERS)) {
                    LogService.getService(this.getClass()).logApplicationDebug("Suppression de " + a);
                    trip.getFishingActivitys().remove(a);
                    new FishingActivityDAO().delete(a);
                }
            }
        }
        return trip;
    }

}
