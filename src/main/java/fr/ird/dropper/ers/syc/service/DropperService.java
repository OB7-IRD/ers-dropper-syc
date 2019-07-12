/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ird.dropper.ers.syc.service;

import fr.ird.common.DateTimeUtils;
import fr.ird.common.OTUtils;
import fr.ird.common.log.LogService;
import fr.ird.driver.eva.business.ActivityDepartureToPort;
import fr.ird.driver.eva.business.ActivityReturnToPort;
import fr.ird.driver.eva.business.Capture;
import fr.ird.driver.eva.business.Discard;
import fr.ird.driver.eva.business.FADActivity;
import fr.ird.driver.eva.business.Fad;
import fr.ird.driver.eva.business.FishingActivity;
import fr.ird.driver.eva.business.FishingContext;
import fr.ird.driver.eva.business.FishingEvent;
import fr.ird.driver.eva.business.Gear;
import fr.ird.driver.eva.business.GearActivity;
import fr.ird.driver.eva.business.Harbour;
import fr.ird.driver.eva.business.Landing;
import fr.ird.driver.eva.business.Specie;
import fr.ird.driver.eva.business.Trip;
import fr.ird.driver.eva.dao.HarbourDAO;
import fr.ird.driver.eva.dao.TripDAO;
import fr.ird.driver.eva.dao.VesselDAO;
import fr.ird.dropper.ers.syc.business.CLS;
import fr.ird.dropper.ers.syc.business.DepDeclarationType;
import fr.ird.dropper.ers.syc.business.DisDeclarationType;
import fr.ird.dropper.ers.syc.business.ERS;
import fr.ird.dropper.ers.syc.business.EofDeclarationType;
import fr.ird.dropper.ers.syc.business.EvenementDePeche;
import fr.ird.dropper.ers.syc.business.FarDeclarationType;
import fr.ird.dropper.ers.syc.business.GeaDeclarationType;
import fr.ird.dropper.ers.syc.business.GerDeclarationType;
import fr.ird.dropper.ers.syc.business.GesDeclarationType;
import fr.ird.dropper.ers.syc.business.LanDeclarationType;
import fr.ird.dropper.ers.syc.business.LogDeclarationType;
import fr.ird.dropper.ers.syc.business.PosDeclarationType;
import fr.ird.dropper.ers.syc.business.RtpDeclarationType;
import fr.ird.dropper.ers.syc.business.SpeDeclarationType;
import fr.ird.dropper.ers.syc.common.EvaUtils;
import fr.ird.dropper.ers.syc.config.ERSDropperProperties;
import fr.ird.dropper.ers.syc.exception.EvaDriverException;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
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
        tripDAO = new TripDAO();
        for (final File fichier : fichiers) {
            LogService.getService(this.getClass()).logApplicationDebug(fichier.getAbsolutePath());
            try {
                if (fichier.isDirectory() == false) {
                    CLS cls = unmarshal(fichier);
                    //Valider le fichier XML par le XSD ?
                    if (cls != null && cls.getOPS() != null
                            && cls.getOPS().getDAT() != null
                            && cls.getOPS().getDAT().getERS() != null) {
                        ERS ers = cls.getOPS().getDAT().getERS();
                        String tripNumber = EvaUtils.getTripNumber(ers.getLOG());
                        String vesselNumber = EvaUtils.getVesselNumber(ers.getLOG());
                        if (tripNumber != null && vesselNumber != null) {
                            LogService.getService(this.getClass()).logApplicationDebug("## " + vesselNumber + " - " + tripNumber);
                            RtpDeclarationType rtp = null;
                            if (ers.getLOG().getRTP() != null && ers.getLOG().getRTP().size() != 0) {
                                rtp = ers.getLOG().getRTP().get(ers.getLOG().getRTP().size() - 1);
                            }
                            Trip trip = factory(ers.getLOG(), ers.getLOG().getDEP().get(0), rtp);
                            // if (trip == null) {
                            //                                trip = factoryTrip(ers, vesselNumber, tripNumber);
                            //                            }
                            //                            if (ers.getLOG().getDEP() != null) {
                            //                                trip = factoryDeparture(trip, ers);
                            //                            }
                            //                            if (ers.getLOG().getRTP() != null) {
                            //                                trip = factoryReturnToPort(trip, ers);
                            //                            }
                            //                            if (ers.getLOG().getFAR() != null) {
                            //                                trip = factoryFishingActivity(trip, ers);
                            //                            }
                            LogService.getService(this.getClass()).logApplicationDebug("Création du trip faite.");
                            List<EvenementDePeche> edp = new ArrayList<>();
                            LogService.getService(this.getClass()).logApplicationDebug("DEP " + ers.getLOG().getDEP());
                            edp.addAll(ers.getLOG().getDEP());
                            LogService.getService(this.getClass()).logApplicationDebug("FAR " + ers.getLOG().getFAR());
                            edp.addAll(ers.getLOG().getFAR());
                            LogService.getService(this.getClass()).logApplicationDebug("RTP " + ers.getLOG().getRTP());
                            edp.addAll(ers.getLOG().getRTP());

                            Collections.sort(edp, new Comparator<EvenementDePeche>() {
                                @Override
                                public int compare(EvenementDePeche o1, EvenementDePeche o2) {
                                    if (o1.getDatiDt() == null || o2.getDatiDt() == null) {
                                        return 0;
                                    }
                                    return o1.getDatiDt().compareTo(o2.getDatiDt());
                                }
                            });

                            trip.setFishingEvents(factoryFishingEvents(trip, edp, ers.getLOG().getEOF()));
                            trip.setLandings(factoryLandings(trip, ers.getLOG().getLAN()));
                            trip.setDiscards(factoryDiscards(ers.getLOG().getDIS()));
                            LogService.getService(this.getClass()).logApplicationDebug("SAVE -> " + trip.toString());
                            tripDAO.save(trip);

                        } else {
                            throw new EvaDriverException("Erreur dans les valeurs du numéro de marée (" + tripNumber + ") ou de l'identifant du navire (" + vesselNumber + ").");
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

//    private Trip factoryDeparture(Trip trip, ERS ers) {
//        LogService.getService(this.getClass()).logApplicationDebug("factoryDeparture ");
//        LogService.getService(this.getClass()).logApplicationDebug("" + trip);
//        trip.setDateOfDep(ers.getLOG().getDEP().getDA().toGregorianCalendar().getTime());
//        trip.setHabourOfDep(new HarbourDAO().findHarbour(ers.getLOG().getDEP().getPO()));
//        trip.setNauticalDistance(Integer.decode(ers.getLOG().getDEP().getLOCH()));
//        return trip;
//    }
//
//    private Trip factoryReturnToPort(Trip trip, ERS ers) {
//        LogService.getService(this.getClass()).logApplicationDebug("factoryReturnToPort ");
//        LogService.getService(this.getClass()).logApplicationDebug("" + trip);
//        if (ers.getLOG().getRTP().getDA() != null) {
//            trip.setDateOfRtp(ers.getLOG().getRTP().getDA().toGregorianCalendar().getTime());
//        }
//        if (ers.getLOG().getRTP().getPO() != null) {
//            trip.setHabourOfRtp(new HarbourDAO().findHarbour(ers.getLOG().getRTP().getPO()));
//        }
//        if (ers.getLOG().getRTP().getLOCH() != null) {
//            if (trip.getNauticalDistance() == null) {
//                trip.setNauticalDistance(Integer.decode(ers.getLOG().getRTP().getLOCH()));
//            } else {
//                trip.setNauticalDistance(Integer.decode(ers.getLOG().getRTP().getLOCH()) - trip.getNauticalDistance());
//            }
//        }
//        return trip;
//    }
//
//    private Trip factoryFishingActivity(Trip trip, ERS ers) {
//        LogService.getService(this.getClass()).logApplicationDebug("factoryFishingActivity ");
//        List<FishingEvent> events = new ArrayList();
//        FishingActivity fishingActivity;
//        for (FarDeclarationType far : ers.getLOG().getFAR()) {
//            fishingActivity = new FishingActivity();
//            Capture capture;
//            Specie specie;
//            for (SpeDeclarationType spe : far.getSPE()) {
//                capture = new Capture();
//                specie = new Specie();
//                capture.setDate(far.getDA().toGregorianCalendar().getTime());
//                capture.setLatitude(far.getPOS().getLT().doubleValue());
//                capture.setLongitude(far.getPOS().getLG().doubleValue());
//
//                specie.setNameOfSpecies(spe.getSN());
//                specie.setWeightOfFish(spe.getWT());
//                specie.setMeansOfWeightMeasuring(spe.ge);
//                specie.capture.setSpecie(specie);
//            }
//            events.add(fishingActivity);
//        }
//        trip.setFishingEvents(events);
//        return trip;
//    }
//
//    private Trip factoryTrip(ERS ers, String vesselNumber, String tripNumber) {
//        LogService.getService(this.getClass()).logApplicationDebug("factoryTrip ");
//        Trip trip = new Trip();
//        trip.setVessel(new VesselDAO().findVessel(vesselNumber));
//        trip.setTripNumber(vesselNumber + "-" + tripNumber);
//        if (ers.getLOG().getMA() != null) {
//            trip.setMasterName(ers.getLOG().getMA());
//        }
//        if (ers.getLOG().getMD() != null) {
//            trip.setMasterAdress(ers.getLOG().getMD());
//        }
//        return trip;
//    }
    /**
     * Construit une marée avec les éléments de bases: date de départ et de
     * retour...
     *
     * @param logbook un log ERS
     * @param departure un dep ERS
     * @param returnToPort un rtp ERS
     * @param isComplete true if the trip is created with all data
     * @return the trip
     */
    private Trip factory(LogDeclarationType logbook, DepDeclarationType departure, RtpDeclarationType returnToPort) {
        LogService.getService(this.getClass()).logApplicationDebug("factory");
        String tripNumber = EvaUtils.getTripNumber(logbook);
        String vesselNumber = EvaUtils.getVesselNumber(logbook);

        Trip trip = tripDAO.findTripByTripNumber(vesselNumber, tripNumber);
        LogService.getService(this.getClass()).logApplicationDebug("Trip " + trip);
        Date dateOfRtp = null;
        Date dateOfDep = null;

        if (trip == null) {
            LogService.getService(this.getClass()).logApplicationDebug("Trip " + trip);
            LogService.getService(this.getClass()).logApplicationDebug("Dep " + departure);
            if (departure != null) {
                dateOfDep = departure.getDA().toGregorianCalendar().getTime();

            }
            trip = new Trip(dateOfDep);
            trip.setHabourOfDep(new HarbourDAO().findHarbour(departure.getPO()));
            trip.setTripNumber(OTUtils.createLongTripNumber(vesselNumber, tripNumber));
            trip.setVessel(new VesselDAO().findVessel(vesselNumber));
        }
        if (trip.getMasterName() == null) {
            trip.setMasterName(logbook.getMA());
        }
        if (trip.getMasterAdress() == null) {
            trip.setMasterAdress(logbook.getMD());
        }
        if (returnToPort != null) {
            dateOfRtp = returnToPort.getDA().toGregorianCalendar().getTime();
            trip.setHabourOfRtp(new HarbourDAO().findHarbour(returnToPort.getPO()));
        }

//
//        if (isComplete && departure.getEdep() != null && returnToPort != null && returnToPort.getErtp() != null) {
//            LogService.getService(DropperService.class).logApplicationDebug("###############");
//            LogService.getService(DropperService.class).logApplicationDebug("T: " + trip);
//            LogService.getService(DropperService.class).logApplicationDebug("RTP: " + returnToPort);
//            LogService.getService(DropperService.class).logApplicationDebug("ERTP: " + returnToPort.getErtp());
//            LogService.getService(DropperService.class).logApplicationDebug("ErtpNdNb: " + returnToPort.getErtp().getErtpNdNb());
//            LogService.getService(DropperService.class).logApplicationDebug("D: " + departure);
//            LogService.getService(DropperService.class).logApplicationDebug("EDEP: " + departure.getEdep());
//            LogService.getService(DropperService.class).logApplicationDebug("EdepNdNb: " + departure.getEdep().getEdepNdNb());
//            LogService.getService(DropperService.class).logApplicationDebug("###############");
//            Double ertpNdNb = 0d;
//            Double edepNdNb = 0d;
//            if (departure.getEdep().getEdepNdNb() != null) {
//                edepNdNb = departure.getEdep().getEdepNdNb();
//            }
//            if (returnToPort.getErtp().getErtpNdNb() != null) {
//                ertpNdNb = returnToPort.getErtp().getErtpNdNb();
//            }
//            trip.setNauticalDistance((int) Math.round(ertpNdNb - edepNdNb));
//
//        }
        LogService.getService(DropperService.class).logApplicationDebug("--> " + trip);
        return trip;
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
    private List<FishingEvent> factoryFishingEvents(Trip trip, List<EvenementDePeche> evenementDePecheList, EofDeclarationType endOfFishing) throws EvaDriverException {
        LogService.getService(this.getClass()).logApplicationDebug("factoryFishingEvents");
        List<FishingEvent> fishingEvents = new ArrayList<>();

        int activityNumber = 1;
        DateTime current = null;
        HashSet<FishingEvent> fishingEventOfDay = new HashSet<>();

        for (EvenementDePeche evenementDePeche : evenementDePecheList) {
            System.out.println("Evt Peche " + evenementDePeche + " " + evenementDePeche.getDatiDt() + " " + evenementDePeche.getTiLb());
            DateTime dateEventOfFishing = DateTimeUtils.createDateTime(evenementDePeche.getDatiDt(), evenementDePeche.getTiLb());

            if (current != null && !DateTimeUtils.dateEqual(dateEventOfFishing, current)) {
                fishingEvents.addAll(fishingEventOfDay);

                //Initialisation pour une nouvelle itération
                activityNumber = 1;
                fishingEventOfDay = new HashSet<>();
            }

            if (evenementDePeche instanceof DepDeclarationType) {
                DepDeclarationType dep = (DepDeclarationType) evenementDePeche;
                FishingEvent fishingEvent = factoryActivityDepartureToPort(trip, dep, activityNumber);
                activityNumber += 1;
                fishingEventOfDay.add(fishingEvent);
                if (dep.getTI() == null) {
                    LogService.getService(DropperService.class).logApplicationInfo("Pour l'activité suivante, le champs heure n'est pas renseigné " + fishingEvent.toString());
                }
                current = new DateTime(dep.getDA().toGregorianCalendar().getTime());
            } else if (evenementDePeche instanceof RtpDeclarationType) {
                RtpDeclarationType rtp = (RtpDeclarationType) evenementDePeche;

                FishingEvent fishingEvent = factoryActivityReturnToPort(trip, rtp, activityNumber);
                activityNumber += 1;
                fishingEventOfDay.add(fishingEvent);
                if (rtp.getTI() == null) {
                    LogService.getService(DropperService.class).logApplicationInfo("Pour l'activité suivante, le champs heure n'est pas renseigné " + fishingEvent.toString());
                }
                current = new DateTime(rtp.getDA().toGregorianCalendar().getTime());
            } else if (evenementDePeche instanceof FarDeclarationType) {
                FarDeclarationType far = (FarDeclarationType) evenementDePeche;
                HashSet<FishingEvent> fishingEventSet = new HashSet<>();
//                if (far.getGEA() == null
//                        && far.getEfar() != null
//                        && far.getEfar().getEpfa() != null
//                        && far.getEfar().getEpfa().getListEfad() != null
//                        && !far.getEfar().getEpfa().getListEfad().isEmpty()) {
//                    /**
//                     * Traite les DCPs de l'activité
//                     */
////                    if (DEBUG) {
//                    LogService.getService(DropperService.class).logApplicationDebug("Traite les DCPs de l'activité " + far);
////                    }
//                    fishingEventSet.addAll(factoryFADActivity(trip, far, activityNumber));
//                    activityNumber += fishingEventSet.size();
//                } else if (far.getGEA() != null || (far.getRAS() != null && far.getGEA() == null && far.getGLS() == null)) {
//                    /**
//                     * Traite une calée, si il y a présence de DCP, elle sera
//                     * traitée de manière interne.
//                     */
//                    if (DEBUG) {
//                        LogService.getService(DropperService.class).logApplicationDebug("Traite les activités de calées avec DCP ou sans");
//                    }
//                    fishingEventSet.addAll(factoryFishingActivity(trip, far, activityNumber));
//                    activityNumber += fishingEventSet.size();
//                } else {
//                    LogService.getService(DropperService.class).logApplicationError("L'activité n'a pas été traitée!!! FAR_CDN=" + far);
//                    throw new EvaDriverException("L'activité n'a pas été traitée!!! FAR_CDN=" + far);
//                }
                fishingEventOfDay.addAll(fishingEventSet);

                if (far.getTI() == null) {
                    LogService.getService(DropperService.class).logApplicationInfo("Pour l'activité suivante, le champs heure n'est pas renseigné " + fishingEventSet.toString());
                }
                current = new DateTime(far.getDA().toGregorianCalendar().getTime());
            }
        }

        if (fishingEventOfDay.size() > 0) {
            fishingEvents.addAll(fishingEventOfDay);
        }
        if (DEBUG) {
            LogService.getService(DropperService.class).logApplicationDebug("Le nombre d'activités trouvées, au sens AVDTH, est de " + fishingEvents.size());
        }

        return fishingEvents;
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
    private ActivityDepartureToPort factoryActivityDepartureToPort(Trip trip, DepDeclarationType dep, int indexOfFishingEvent) throws EvaDriverException {
        LogService.getService(this.getClass()).logApplicationDebug("factoryActivityDepartureToPort");
        ActivityDepartureToPort activityDepartureToPort = new ActivityDepartureToPort();
        activityDepartureToPort.setIndexOfFishingEvent(indexOfFishingEvent);
        activityDepartureToPort.setDateOfFishingEvent(dep.getDA().toGregorianCalendar().getTime());

        if (DEBUG) {
            LogService.getService(DropperService.class).logApplicationDebug("La date de l'activité est le " + activityDepartureToPort.getDateOfFishingEvent().toString());// +  " -- " + far.getFarDaDt() + " -- " + far.getFarDatiDt() + "--" + far.getFarTiLb());
        }

        Harbour harbour = new HarbourDAO().findHarbour(dep.getPO());
        activityDepartureToPort.setPortOfDeparture(harbour);
        activityDepartureToPort.setAnticipatedActivity(dep.getAA());

        for (GeaDeclarationType gea : dep.getGEA()) {
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
            activityDepartureToPort.addGearOnBoard(gear);
        }

        trip.setPartialLanding(!dep.getSPE().isEmpty());
        for (SpeDeclarationType spe : dep.getSPE()) {
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

            activityDepartureToPort.addSpecieOnBoard(specie);
        }

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
    private ActivityReturnToPort factoryActivityReturnToPort(Trip trip, RtpDeclarationType rtp, int activityNumber) throws EvaDriverException {
        LogService.getService(this.getClass()).logApplicationDebug("factoryActivityReturnToPort");

        ActivityReturnToPort activityReturnToPort = new ActivityReturnToPort();
        activityReturnToPort.setDateOfFishingEvent(rtp.getDA().toGregorianCalendar().getTime());
        activityReturnToPort.setReasonOfReturn(rtp.getRE());

        LogService.getService(DropperService.class).logApplicationDebug(this.getClass().getName() + " " + rtp.getPO());

        Harbour harbour = new HarbourDAO().findHarbour(rtp.getPO());
        activityReturnToPort.setPortOfReturn(harbour);

        for (GeaDeclarationType gea : rtp.getGEA()) {
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
            activityReturnToPort.addGearOnBoard(gear);
        }
        return activityReturnToPort;
    }

    /**
     * Convertit une activité de pêche associées à une marée dans le modèle EvA.
     *
     * @param trip la marée
     * @param far le far ERS
     * @param activityNumber le numéro de l'activité
     * @return l'activité de pêche
     * @throws EvaDriverException
     */
    private HashSet<FishingEvent> factoryFishingActivity(Trip trip, FarDeclarationType far, int activityNumber) throws EvaDriverException {
        LogService.getService(this.getClass()).logApplicationDebug("factoryFishingActivity");

        HashSet<FishingEvent> fishingEvents = new HashSet<>();
        FishingActivity activity = new FishingActivity();
        activity.setDateOfFishingEvent(far.getDA().toGregorianCalendar().getTime());
        activity.setIndexOfFishingEvent(activityNumber);
        if (DEBUG) {
            LogService.getService(DropperService.class).logApplicationDebug("Ceci est le FAR numéro " + far.toString());
            LogService.getService(DropperService.class).logApplicationDebug("La date de l'activité est le " + activity.getDateOfFishingEvent().toString());// +  " -- " + far.getFarDaDt() + " -- " + far.getFarDatiDt() + "--" + far.getFarTiLb());
        }

        if (far.getPOS() != null) {
            activity.setLatitude(far.getPOS().getLT());
            activity.setLongitude(far.getPOS().getLG());
        }
//        if (far.getEfar() != null) {
//            activity.setDaysFished(far.getEfar().getEfarDfNb());
//        }

        if (far.getRAS() != null) {
            activity.setEconomicZone(far.getRAS().getEZ());
        }
        GeaDeclarationType gea = far.getGEA();
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
            activity.setGearUsed(gear);
            activity.setFishingTime(gea.getDU());

            if (gea.getGES() != null) {
                GearActivity ger = factoryGearShotActivity(gea.getGES());
                activity.addGearActivity(ger);
                activity.setLatitude(ger.getLatitude());
                activity.setLongitude(ger.getLongitude());
            }
            if (gea.getGER() != null) {
                GearActivity ges = factoryGearRetrieveActivity(gea.getGER());
                activity.addGearActivity(ges);
                activity.setLatitude(ges.getLatitude());
                activity.setLongitude(ges.getLongitude());
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
//        if (far.getEfar() != null) {
//            //Primary fishing association
//            activity.addFishingContext(
//                    factoryPrimaryFishingContext(far.getEfar().getEpfa()));
//            // le commentaire de Efad donne l'operation si coup inconnu
//        }
//        if (activity.getOperation() != null && activity.getOperation().equals("COUP INCONNU")) {
//            if (far != null && far.getEfar() != null && far.getEfar().getEpfa() != null && far.getEfar().getEpfa().getListEfad() != null) {
//                activity.setOperation(far.getEfar().getEpfa().getListEfad().get(0).getEfadIfLb());
//                if (activity.getOperation().equals("")) {
//                    activity.setOperation("COUP INCONNU");
//                }
//            }
//        }
//        if (far.getEfar() != null) {
//            // Additional subdeclaration under PS tropical tuna fishing
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
//                if (activity.getOperation() == null || activity.getOperation().equals("COUP INCONNU")) {
//                    if (activity.getComment().equals("RECHERCHE")) {
//                        activity.setOperation("RECHERCHE");
//                    } else if (far.getEfar() != null
//                            && far.getEfar().getEpfa() != null
//                            && far.getEfar().getEpfa().getListEfad() != null
//                            && far.getEfar().getEpfa().getListEfad().size() > 0) {
//                        activity.setOperation(far.getEfar().getEpfa().getListEfad().get(0).getEfadIfLb());
//                    } else {
//                        activity.setOperation("RECHERCHE");
//                    }
//                }
//                activity.setSchoolSizeInfomartion(etts.getEttsSoNb());
//                activity.setMiscProblems(etts.getEttsMpLb());
//                if (etts.getEttsFaLb() != null) {
//                    for (String fa : etts.getEttsFaLb().split(" ")) {
//                        activity.addFishingContext(factoryFishingContext(fa));
//                    }
//                }
//            }
//        }
//        for (SpeDeclarationType spe : far.get()) {
//            activity.addElementaryCapture(factorySpeciesFished(activity, spe));
//        }

        fishingEvents.add(activity);

        activityNumber += 1;
        fishingEvents.addAll(factoryFADActivity(activity, activityNumber));

        return fishingEvents;
    }

    /**
     * Convertit les activités de DCP dans le modèle EvA. Fonction a revoir
     * selon les pratiques des pecheurs.
     *
     * @param fishingActivity une activitié de pêche
     * @param activityNumber le numéro de l'activité
     * @return la liste des activités de pêche
     * @throws EvaDriverException
     */
    private HashSet<FishingEvent> factoryFADActivity(FishingActivity fishingActivity, int activityNumber) throws EvaDriverException {

        HashSet<FishingEvent> fishingEvents = new HashSet<FishingEvent>();
        if (fishingActivity == null) {
            return fishingEvents;
        }

        FADActivity activity;
        for (FishingContext fishingContext : fishingActivity.getFishingContexts()) {
            if (fishingContext != null) {

                for (Fad fad : fishingContext.getFads()) {

                    activity = new FADActivity();
                    activity.setIndexOfFishingEvent(activityNumber);

                    //La liste de FAD associée au FC doit être toujours vide.
                    activity.addFishingContext(new FishingContext(true, fishingContext.getFishingContextType()));
                    activity.setDateOfFishingEvent(fishingActivity.getDateOfFishingEvent());

                    activity.setLatitude(fishingActivity.getLatitude());
                    activity.setLongitude(fishingActivity.getLongitude());
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

                    //Gestion des FADs et des bouées associées
                    activity.setOperation(fad.getFadComment());
                    activity.setFad(fad);

                    if (!activity.getOperation().equals("")) {
                        fishingEvents.add(activity);
                        activityNumber += 1;
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
     * @throws EvaDriverException
     */
    private HashSet<FishingEvent> factoryFADActivity(Trip trip, FarDeclarationType far, int activityNumber) throws EvaDriverException {

        HashSet<FishingEvent> fishingEvents = new HashSet<>();
        if (far == null) {
            return fishingEvents;
        }

        FADActivity activity;
//        Epfa epfa = far.getEfar().getEpfa();
//        if (epfa == null) {
//            return fishingEvents;
//        }

        FishingContext context = new FishingContext();
        context.setPrimary(true);
//        context.setFishingContextType(epfa.getEpfaPfLb());

//        for (Efad efad : epfa.getListEfad()) {
//            activity = new FADActivity();
//            activity.setIndexOfFishingEvent(activityNumber);
//
//            //La liste de FAD associé au FC doit être toujours vide.
//            activity.addFishingContext(context);
//
//            activity.setDateOfFishingEvent(DateTimeUtils.createDateTime(far.getFarDaDt(), far.getFarTiLb()));
//            if (DEBUG) {
//                LogService.getService(DropperService.class).logApplicationDebug("Ceci est le FAR numéro " + far.toString());
//
//                LogService.getService(DropperService.class).logApplicationDebug("La date de l'activité est le " + activity.getDateOfFishingEvent().toString());// +  " -- " + far.getFarDaDt() + " -- " + far.getFarDatiDt() + "--" + far.getFarTiLb());
//            }
//
//            if (far.getPOS() != null) {
//                activity.setPosition(new Position(far.getPOS()));
//            }
//
//            activity.setDaysFished(far.getEfar().getEfarDfNb());
//
//            if (far.getRAS() != null) {
//                activity.setEconomicZone(far.getRAS().getRASEzLb());
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
//                Fad fad = new Fad();
//                fad.setHasBuoy(efad.getEfadTp().equals("presence"));
//                fad.setFadType(efad.getEfadTfLb());
//                fad.setFadComment(efad.getEfadIfLb());
//                if (fad.isHasBuoy()) {
//                    for (Etdd etdd : efad.getListEtdd()) {
//                        fad.addBuoy(etdd.getEtddGtLb(), etdd.getEtddGiLb(), etdd.getEtddGoLb());
//                    }
//                }
//                activity.setFad(fad);
//
//                if (etts.getEttsFaLb() != null) {
//                    for (String fa : etts.getEttsFaLb().split(" ")) {
//                        activity.addFishingContext(factoryFishingContext(fa));
//                    }
//                }
//            }
//
//            fishingEvents.add(activity);
//            activityNumber += 1;
//        }
        return fishingEvents;
    }

    /**
     * Convertit les captures associés à l'ERS dans le modèle EvA.
     *
     * @param fishingActivity l'activité de pêche associée à la capture ERS
     * @param specie l'espèce capturée ERS
     * @return la capture
     * @throws EvaDriverException
     */
    private Capture factorySpeciesFished(FishingActivity fishingActivity, SpeDeclarationType specie) throws EvaDriverException {
        Capture capture = new Capture();
        capture.setDate(fishingActivity.getDateOfFishingEvent());
        capture.setLatitude(fishingActivity.getLatitude());
        capture.setLongitude(fishingActivity.getLongitude());

        capture.setSpecie(factorySpecie(specie));
        return capture;
    }

    /**
     * Convertit les contextes de pêches associés à l'ERS dans le modèle EvA.
     *
     * @param epfa un contecte de pêche ERS
     * @return un contecte de pêche
     */
//    private static FishingContext factoryPrimaryFishingContext(Epfa epfa) {
//        FishingContext context = new FishingContext();
//        
//        if (epfa == null) {
//            return null;
//        }
//        
//        context.setPrimary(true);
//        context.setFishingContextType(epfa.getEpfaPfLb());
//        for (Efad efad : epfa.getListEfad()) {
//            Fad fad = new Fad();
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
//        return context;
//    }
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
    private static GearActivity factoryGearShotActivity(GesDeclarationType ges) {
        if (ges == null) {
            return null;
        }
        GearActivity gearActivity = new GearActivity();
        gearActivity.setIsShot(true);
        gearActivity.setDate(ges.getDA().toGregorianCalendar().getTime());
        gearActivity.setLatitude(ges.getPOS().getLT());
        gearActivity.setLongitude(ges.getPOS().getLG());
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
    private static GearActivity factoryGearRetrieveActivity(GerDeclarationType ger) {
        if (ger == null) {
            return null;
        }
        GearActivity gearActivity = new GearActivity();
        gearActivity.setIsShot(false);
        gearActivity.setDate(ger.getDA().toGregorianCalendar().getTime());
        gearActivity.setLatitude(ger.getPOS().getLT());
        gearActivity.setLongitude(ger.getPOS().getLG());
        gearActivity.setIdentifier(ger.getGS());
//        if (ger.getEger() != null && ger.getEger().getEgerRfBl() != null) {
//            gearActivity.setIsSuccessfulCatch(ger.getEger().getEgerRfBl().equals(GearActivity.SUCCESSFUL_FISHING_OPERATION));
//        }
        return gearActivity;
    }

    /**
     * Convertit les débarquements associés à l'ERS dans le modèle EvA.
     *
     * @param trip la marée ERS
     * @param lans les débarquements ERS
     * @return les débarquements
     */
    private static ArrayList<Landing> factoryLandings(Trip trip, List<LanDeclarationType> lans) {
        LogService.getService(DropperService.class).logApplicationInfo("factoryLandings");
        if (lans == null || lans.isEmpty()) {
            return null;
        }

        ArrayList<Landing> landings = new ArrayList<Landing>();
        for (LanDeclarationType lan : lans) {
            Landing landing = new Landing();
            landing.setDate(lan.getDA().toGregorianCalendar().getTime());
            landing.setPortOfLanding(new HarbourDAO().findHarbour(lan.getPO()));
            landing.setSenderType(lan.getTS());

            ArrayList<Specie> species = new ArrayList<Specie>();
            for (SpeDeclarationType spe : lan.getSPE()) {
                species.add(factorySpecie(spe));
            }
            landing.setSpecies(species);
            LogService.getService(DropperService.class).logApplicationInfo(landing.toString());
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
    private static Specie factorySpecie(SpeDeclarationType specie) {
        Specie s = new Specie();
        s.setGearType(specie.getGE());
        s.setMeansOfWeightMeasuring(specie.getMM());
        s.setNameOfSpecies(specie.getSN());
        s.setNumberHeldInNets(specie.getNB());
        s.setNumberOfFished(specie.getNF());
        s.setNumberOfFishedToBeLanded(specie.getFL());
        s.setQuantityHeldInNets(specie.getNQ());
//        if (specie.getEspe() != null) {
//            if (specie.getEspe().getEspeZoLb() != null) {
//                s.setSizeCategory(Integer.valueOf(specie.getEspe().getEspeZoLb().substring(3, 5)));
//            }
//            s.setSizeComposition(specie.getEspe().getEspeZoLb());
//        }
        s.setWeightOfFish(specie.getWT());
        return s;
    }

    /**
     * Convertit les rejets associés à l'ERS dans le modèle EvA.
     *
     * @param diss la liste des rejets ERS
     * @return la liste des rejets
     */
    private static List<Discard> factoryDiscards(List<DisDeclarationType> diss) {
        if (diss == null || diss.isEmpty()) {
            return null;
        }

        ArrayList<Discard> discards = new ArrayList<>();
        for (DisDeclarationType dis : diss) {
            Discard discard = new Discard();
            discard.setDate(dis.getDA().toGregorianCalendar().getTime());
            PosDeclarationType pos = dis.getPOS();
            if (pos != null) {
                discard.setLatitude(dis.getPOS().getLT());
                discard.setLongitude(dis.getPOS().getLG());
            }
            ArrayList<Specie> species = new ArrayList<>();
            for (SpeDeclarationType spe : dis.getSPE()) {
                species.add(factorySpecie(spe));
            }
            discard.setSpecies(species);
            discards.add(discard);
        }
        return discards;
    }

    /**
     * Creates only the trip object associated with the trip number. All related
     * objects, like activity or landing, are not created.
     *
     * @param longTripNumber the trip number with the long format
     * @return the trip or null
     */
//    public Trip getTrip(String longTripNumber) {
//
//        if (OTUtils.validFormatLongTripNumber(longTripNumber)) {
//            String cfr = OTUtils.splitLongTripNumber(longTripNumber)[0];
//            try {
//                return factory(cfr, longTripNumber, false);
//            } catch (EvaDriverException ex) {
//                LogService.getService(this.getClass()).logApplicationError(ex.getMessage());
//            }
//        }
//        return null;
//
//    }
    /**
     * Creates the trip object associated with the trip number. All related
     * objects, like activity or landing, are created.
     *
     * @param longTripNumber the trip number with the long format
     * @return the trip or null
     */
//    public Trip getFullTrip(String longTripNumber) {
//
//        if (OTUtils.validFormatLongTripNumber(longTripNumber)) {
//            String cfr = OTUtils.splitLongTripNumber(longTripNumber)[0];
//            try {
//                return factory(cfr, longTripNumber, true);
//            } catch (EvaDriverException ex) {
//                LogService.getService(DropperService.class).logApplicationError(ex.getMessage());
//            }
//        }
//        return null;
//
//    }
}
