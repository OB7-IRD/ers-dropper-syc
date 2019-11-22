package fr.ird.dropper.ers.syc.service;

/**
 *
 * @author jlebranc
 */
import fr.ird.dropper.ers.syc.business.Cls;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {

    public static void main(String[] args) {

        try {

            File file = new File("D:\\IRD\\Projets\\SI\\1_CCD\\eva_project\\seychelles-ers-dropper\\DAT-msg-20190515081719224-1.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Cls.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Cls cls = (Cls) jaxbUnmarshaller.unmarshal(file);
            System.out.println(cls);
            System.out.println("########################################################");
            file = new File("D:\\IRD\\Projets\\SI\\1_CCD\\eva_project\\seychelles-ers-dropper\\DAT-msg-20190515092037164-2.xml");
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            cls = (Cls) jaxbUnmarshaller.unmarshal(file);
            System.out.println(cls);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
