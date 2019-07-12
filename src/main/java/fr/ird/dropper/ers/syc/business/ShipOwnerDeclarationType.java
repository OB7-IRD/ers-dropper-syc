//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.04 à 06:18:33 PM MUT 
//
package fr.ird.dropper.ers.syc.business;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Ship owner detail declaration of ressource present onboard.
 *
 *
 * <p>
 * Classe Java pour ShipOwnerDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="ShipOwnerDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}ShipOwnerSpeciesDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="repDate" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcDateType" /&gt;
 *       &lt;attribute name="CAR" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="HUI" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="NOU" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="ADP" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="SAL" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="TRN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipOwnerDeclarationType", propOrder = {
    "sos"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class ShipOwnerDeclarationType {

    @XmlElement(name = "SOS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<ShipOwnerSpeciesDeclarationType> sos;
    @XmlAttribute(name = "repDate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected XMLGregorianCalendar repDate;
    @XmlAttribute(name = "CAR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Double car;
    @XmlAttribute(name = "HUI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Double hui;
    @XmlAttribute(name = "NOU")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Double nou;
    @XmlAttribute(name = "ADP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Double adp;
    @XmlAttribute(name = "SAL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Double sal;
    @XmlAttribute(name = "TRN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String trn;

    /**
     * Gets the value of the sos property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the sos property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOS().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipOwnerSpeciesDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<ShipOwnerSpeciesDeclarationType> getSOS() {
        if (sos == null) {
            sos = new ArrayList<ShipOwnerSpeciesDeclarationType>();
        }
        return this.sos;
    }

    /**
     * Obtient la valeur de la propriété repDate.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public XMLGregorianCalendar getRepDate() {
        return repDate;
    }

    /**
     * Définit la valeur de la propriété repDate.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRepDate(XMLGregorianCalendar value) {
        this.repDate = value;
    }

    /**
     * Obtient la valeur de la propriété car.
     *
     * @return possible object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Double getCAR() {
        return car;
    }

    /**
     * Définit la valeur de la propriété car.
     *
     * @param value allowed object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setCAR(Double value) {
        this.car = value;
    }

    /**
     * Obtient la valeur de la propriété hui.
     *
     * @return possible object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Double getHUI() {
        return hui;
    }

    /**
     * Définit la valeur de la propriété hui.
     *
     * @param value allowed object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setHUI(Double value) {
        this.hui = value;
    }

    /**
     * Obtient la valeur de la propriété nou.
     *
     * @return possible object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Double getNOU() {
        return nou;
    }

    /**
     * Définit la valeur de la propriété nou.
     *
     * @param value allowed object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setNOU(Double value) {
        this.nou = value;
    }

    /**
     * Obtient la valeur de la propriété adp.
     *
     * @return possible object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Double getADP() {
        return adp;
    }

    /**
     * Définit la valeur de la propriété adp.
     *
     * @param value allowed object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setADP(Double value) {
        this.adp = value;
    }

    /**
     * Obtient la valeur de la propriété sal.
     *
     * @return possible object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Double getSAL() {
        return sal;
    }

    /**
     * Définit la valeur de la propriété sal.
     *
     * @param value allowed object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setSAL(Double value) {
        this.sal = value;
    }

    /**
     * Obtient la valeur de la propriété trn.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getTRN() {
        return trn;
    }

    /**
     * Définit la valeur de la propriété trn.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTRN(String value) {
        this.trn = value;
    }

}
