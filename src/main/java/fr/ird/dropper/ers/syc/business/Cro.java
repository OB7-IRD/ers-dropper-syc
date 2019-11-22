//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.04 à 06:18:33 PM MUT 
//
package fr.ird.dropper.ers.syc.business;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Crossing of Zone effort declaration. 1.1-2.0: COE and COX became optional
 * because it is acceptable to file either COE or COX.
 *
 *
 * <p>
 * Classe Java pour CroDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="CroDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CoeDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="COX" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CoxDeclarationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CroDeclarationType", propOrder = {
    "coe",
    "cox"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class Cro {

    @XmlElement(name = "COE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Coe coe;
    @XmlElement(name = "COX")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Cox cox;

    /**
     * Obtient la valeur de la propriété coe.
     *
     * @return possible object is {@link Coe }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Coe getCOE() {
        return coe;
    }

    /**
     * Définit la valeur de la propriété coe.
     *
     * @param value allowed object is {@link Coe }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setCOE(Coe value) {
        this.coe = value;
    }

    /**
     * Obtient la valeur de la propriété cox.
     *
     * @return possible object is {@link Cox }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Cox getCOX() {
        return cox;
    }

    /**
     * Définit la valeur de la propriété cox.
     *
     * @param value allowed object is {@link Cox }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setCOX(Cox value) {
        this.cox = value;
    }

}
