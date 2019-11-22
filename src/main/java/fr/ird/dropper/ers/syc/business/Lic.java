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
 * Fishing license.
 *
 * <p>
 * Classe Java pour LicDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="LicDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDN" type="{http://ec.europa.eu/fisheries/schema/ers/v3}IdnDeclarationType"/&gt;
 *         &lt;element name="ZON" type="{http://ec.europa.eu/fisheries/schema/ers/v3}ZonDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SPE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}SpeLicDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GEA" type="{http://ec.europa.eu/fisheries/schema/ers/v3}GeaDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RN" use="required" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RecordNumberType" /&gt;
 *       &lt;attribute name="RD" use="required" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcDateType" /&gt;
 *       &lt;attribute name="RT" use="required" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcTimeType" /&gt;
 *       &lt;attribute name="NL" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ST" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="VAL"/&gt;
 *             &lt;enumeration value="SUP"/&gt;
 *             &lt;enumeration value="MAJ"/&gt;
 *             &lt;enumeration value="DEV"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicDeclarationType", propOrder = {
    "idn",
    "zon",
    "spe",
    "gea"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class Lic {

    @XmlElement(name = "IDN", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Idn idn;
    @XmlElement(name = "ZON")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<Zon> zon;
    @XmlElement(name = "SPE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<SpeLic> spe;
    @XmlElement(name = "GEA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<Gea> gea;
    @XmlAttribute(name = "RN", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String rn;
    @XmlAttribute(name = "RD", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected XMLGregorianCalendar rd;
    @XmlAttribute(name = "RT", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String rt;
    @XmlAttribute(name = "NL", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String nl;
    @XmlAttribute(name = "ST", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String st;
    @XmlAttribute(name = "CN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String cn;

    /**
     * Obtient la valeur de la propriété idn.
     *
     * @return possible object is {@link Idn }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Idn getIDN() {
        return idn;
    }

    /**
     * Définit la valeur de la propriété idn.
     *
     * @param value allowed object is {@link Idn }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setIDN(Idn value) {
        this.idn = value;
    }

    /**
     * Gets the value of the zon property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the zon property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZON().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zon }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<Zon> getZON() {
        if (zon == null) {
            zon = new ArrayList<Zon>();
        }
        return this.zon;
    }

    /**
     * Gets the value of the spe property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the spe property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPE().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpeLic }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<SpeLic> getSPE() {
        if (spe == null) {
            spe = new ArrayList<SpeLic>();
        }
        return this.spe;
    }

    /**
     * Gets the value of the gea property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the gea property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGEA().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gea }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<Gea> getGEA() {
        if (gea == null) {
            gea = new ArrayList<Gea>();
        }
        return this.gea;
    }

    /**
     * Obtient la valeur de la propriété rn.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getRN() {
        return rn;
    }

    /**
     * Définit la valeur de la propriété rn.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRN(String value) {
        this.rn = value;
    }

    /**
     * Obtient la valeur de la propriété rd.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public XMLGregorianCalendar getRD() {
        return rd;
    }

    /**
     * Définit la valeur de la propriété rd.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRD(XMLGregorianCalendar value) {
        this.rd = value;
    }

    /**
     * Obtient la valeur de la propriété rt.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getRT() {
        return rt;
    }

    /**
     * Définit la valeur de la propriété rt.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRT(String value) {
        this.rt = value;
    }

    /**
     * Obtient la valeur de la propriété nl.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getNL() {
        return nl;
    }

    /**
     * Définit la valeur de la propriété nl.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setNL(String value) {
        this.nl = value;
    }

    /**
     * Obtient la valeur de la propriété st.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getST() {
        return st;
    }

    /**
     * Définit la valeur de la propriété st.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setST(String value) {
        this.st = value;
    }

    /**
     * Obtient la valeur de la propriété cn.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getCN() {
        return cn;
    }

    /**
     * Définit la valeur de la propriété cn.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setCN(String value) {
        this.cn = value;
    }

}
