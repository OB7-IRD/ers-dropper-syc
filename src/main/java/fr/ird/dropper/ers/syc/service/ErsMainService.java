package fr.ird.dropper.ers.syc.service;

import fr.ird.common.log.LogService;
import fr.ird.driver.eva.service.EvaService;
import fr.ird.dropper.ers.syc.business.CLS;
import fr.ird.dropper.ers.syc.config.ERSDropperProperties;
import java.io.File;

import java.util.Properties;

/**
 * Service permettant d'initialiser la connexion à la base de données, de lire
 * le fichier de configuration, d'initialiser le parseur Xstream.
 *
 * @author christelle.jeanberne
 */
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ErsMainService {

    private Unmarshaller jaxbUnmarshaller;

    protected void init() throws JAXBException {
        LogService.getService().logApplicationInfo("Initialisation de «ErsMainService».");
        ERSDropperProperties.getService().init();
        Properties properties = new Properties();
        properties.put("javax.persistence.jdbc.url", ERSDropperProperties.JDBC_URL);
        properties.put("javax.persistence.jdbc.password", ERSDropperProperties.JDBC_PASSWORD);
        properties.put("javax.persistence.jdbc.driver", ERSDropperProperties.JDBC_DRIVER_CLASS);
        properties.put("javax.persistence.jdbc.user", ERSDropperProperties.JDBC_USERNAME);
        EvaService.getService().init("eva", properties);

        // Initialisation du parser XML
        JAXBContext jaxbContext = JAXBContext.newInstance(CLS.class);
        jaxbUnmarshaller = jaxbContext.createUnmarshaller();

    }

    public CLS unmarshal(File file) throws JAXBException {
        return (CLS) jaxbUnmarshaller.unmarshal(file);
    }
}
