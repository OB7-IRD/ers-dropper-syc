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
 * Logbook declaration.
 *
 * <p>
 * Classe Java pour LogDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="LogDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DEP" type="{http://ec.europa.eu/fisheries/schema/ers/v3}DepDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="FAR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FarDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RLC" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RlcDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TRA" type="{http://ec.europa.eu/fisheries/schema/ers/v3}TraDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="COE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CoeDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="COX" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CoxDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CRO" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CroDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TRZ" type="{http://ec.europa.eu/fisheries/schema/ers/v3}TrzDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="INS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}InsDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DIS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}DisDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PNO" type="{http://ec.europa.eu/fisheries/schema/ers/v3}PnoDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="PNT" type="{http://ec.europa.eu/fisheries/schema/ers/v3}PntDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="EOF" type="{http://ec.europa.eu/fisheries/schema/ers/v3}EofDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="RTP" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RtpDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="LAN" type="{http://ec.europa.eu/fisheries/schema/ers/v3}LanDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="GEA" type="{http://ec.europa.eu/fisheries/schema/ers/v3}GeaDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SOW" type="{http://ec.europa.eu/fisheries/schema/ers/v3}ShipOwnerDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CfrType" /&gt;
 *       &lt;attribute name="RC" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RadioCallSignType" /&gt;
 *       &lt;attribute name="XR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}HullRegistrationType" /&gt;
 *       &lt;attribute name="NA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MD" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CountryType" /&gt;
 *       &lt;attribute name="IN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UD" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcDateType" /&gt;
 *       &lt;attribute name="UT" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcTimeType" /&gt;
 *       &lt;attribute name="VT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SO" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VD" type="{http://ec.europa.eu/fisheries/schema/ers/v3}BooleanType" /&gt;
 *       &lt;attribute name="LI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VA" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcDateType" /&gt;
 *       &lt;attribute name="TR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FishPresentationType" /&gt;
 *       &lt;attribute name="CT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AR" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PI" type="{http://ec.europa.eu/fisheries/schema/ers/v3}PortType" /&gt;
 *       &lt;attribute name="VP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VK" type="{http://ec.europa.eu/fisheries/schema/ers/v3}TripTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogDeclarationType", propOrder = {
    "dep",
    "far",
    "rlc",
    "tra",
    "coe",
    "cox",
    "cro",
    "trz",
    "ins",
    "dis",
    "pno",
    "pnt",
    "eof",
    "rtp",
    "lan",
    "gea",
    "sow"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class LogDeclarationType {

    @XmlElement(name = "DEP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<DepDeclarationType> dep;
    @XmlElement(name = "FAR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<FarDeclarationType> far;
    @XmlElement(name = "RLC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<RlcDeclarationType> rlc;
    @XmlElement(name = "TRA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<TraDeclarationType> tra;
    @XmlElement(name = "COE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<CoeDeclarationType> coe;
    @XmlElement(name = "COX")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<CoxDeclarationType> cox;
    @XmlElement(name = "CRO")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<CroDeclarationType> cro;
    @XmlElement(name = "TRZ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<TrzDeclarationType> trz;
    @XmlElement(name = "INS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<InsDeclarationType> ins;
    @XmlElement(name = "DIS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<DisDeclarationType> dis;
    @XmlElement(name = "PNO")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected PnoDeclarationType pno;
    @XmlElement(name = "PNT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected PntDeclarationType pnt;
    @XmlElement(name = "EOF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected EofDeclarationType eof;
    @XmlElement(name = "RTP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<RtpDeclarationType> rtp;
    @XmlElement(name = "LAN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<LanDeclarationType> lan;
    @XmlElement(name = "GEA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<GeaDeclarationType> gea;
    @XmlElement(name = "SOW")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<ShipOwnerDeclarationType> sow;
    @XmlAttribute(name = "IR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ir;
    @XmlAttribute(name = "RC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String rc;
    @XmlAttribute(name = "XR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String xr;
    @XmlAttribute(name = "NA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String na;
    @XmlAttribute(name = "MA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ma;
    @XmlAttribute(name = "MD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String md;
    @XmlAttribute(name = "FS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String fs;
    @XmlAttribute(name = "IN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String in;
    @XmlAttribute(name = "IM")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String im;
    @XmlAttribute(name = "UD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected XMLGregorianCalendar ud;
    @XmlAttribute(name = "UT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ut;
    @XmlAttribute(name = "VT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String vt;
    @XmlAttribute(name = "VL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String vl;
    @XmlAttribute(name = "HC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String hc;
    @XmlAttribute(name = "CN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String cn;
    @XmlAttribute(name = "SO")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String so;
    @XmlAttribute(name = "VD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer vd;
    @XmlAttribute(name = "LI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String li;
    @XmlAttribute(name = "VA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected XMLGregorianCalendar va;
    @XmlAttribute(name = "TR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String tr;
    @XmlAttribute(name = "CT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ct;
    @XmlAttribute(name = "MI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String mi;
    @XmlAttribute(name = "MT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String mt;
    @XmlAttribute(name = "MC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String mc;
    @XmlAttribute(name = "FT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ft;
    @XmlAttribute(name = "AR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ar;
    @XmlAttribute(name = "PI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String pi;
    @XmlAttribute(name = "VP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String vp;
    @XmlAttribute(name = "TN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String tn;
    @XmlAttribute(name = "VK")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected TripTypeEnum vk;

    /**
     * Obtient la valeur de la propriété dep.
     *
     * @return possible object is {@link DepDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<DepDeclarationType> getDEP() {
        if (dep == null) {
            dep = new ArrayList<>();
        }
        return this.dep;
    }

    /**
     * Définit la valeur de la propriété dep.
     *
     * @param value allowed object is {@link DepDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setDEP(List<DepDeclarationType> value) {
        this.dep = value;
    }

    /**
     * Gets the value of the far property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the far property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFAR().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<FarDeclarationType> getFAR() {
        if (far == null) {
            far = new ArrayList<FarDeclarationType>();
        }
        return this.far;
    }

    /**
     * Gets the value of the rlc property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the rlc property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRLC().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RlcDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<RlcDeclarationType> getRLC() {
        if (rlc == null) {
            rlc = new ArrayList<RlcDeclarationType>();
        }
        return this.rlc;
    }

    /**
     * Gets the value of the tra property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the tra property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRA().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TraDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<TraDeclarationType> getTRA() {
        if (tra == null) {
            tra = new ArrayList<TraDeclarationType>();
        }
        return this.tra;
    }

    /**
     * Gets the value of the coe property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the coe property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOE().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoeDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<CoeDeclarationType> getCOE() {
        if (coe == null) {
            coe = new ArrayList<CoeDeclarationType>();
        }
        return this.coe;
    }

    /**
     * Gets the value of the cox property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the cox property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOX().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoxDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<CoxDeclarationType> getCOX() {
        if (cox == null) {
            cox = new ArrayList<CoxDeclarationType>();
        }
        return this.cox;
    }

    /**
     * Gets the value of the cro property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the cro property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRO().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CroDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<CroDeclarationType> getCRO() {
        if (cro == null) {
            cro = new ArrayList<CroDeclarationType>();
        }
        return this.cro;
    }

    /**
     * Gets the value of the trz property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the trz property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRZ().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrzDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<TrzDeclarationType> getTRZ() {
        if (trz == null) {
            trz = new ArrayList<TrzDeclarationType>();
        }
        return this.trz;
    }

    /**
     * Gets the value of the ins property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the ins property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINS().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<InsDeclarationType> getINS() {
        if (ins == null) {
            ins = new ArrayList<InsDeclarationType>();
        }
        return this.ins;
    }

    /**
     * Gets the value of the dis property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the dis property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDIS().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<DisDeclarationType> getDIS() {
        if (dis == null) {
            dis = new ArrayList<DisDeclarationType>();
        }
        return this.dis;
    }

    /**
     * Obtient la valeur de la propriété pno.
     *
     * @return possible object is {@link PnoDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public PnoDeclarationType getPNO() {
        return pno;
    }

    /**
     * Définit la valeur de la propriété pno.
     *
     * @param value allowed object is {@link PnoDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setPNO(PnoDeclarationType value) {
        this.pno = value;
    }

    /**
     * Obtient la valeur de la propriété pnt.
     *
     * @return possible object is {@link PntDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public PntDeclarationType getPNT() {
        return pnt;
    }

    /**
     * Définit la valeur de la propriété pnt.
     *
     * @param value allowed object is {@link PntDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setPNT(PntDeclarationType value) {
        this.pnt = value;
    }

    /**
     * Obtient la valeur de la propriété eof.
     *
     * @return possible object is {@link EofDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public EofDeclarationType getEOF() {
        return eof;
    }

    /**
     * Définit la valeur de la propriété eof.
     *
     * @param value allowed object is {@link EofDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setEOF(EofDeclarationType value) {
        this.eof = value;
    }

    /**
     * Obtient la valeur de la propriété rtp.
     *
     * @return possible object is {@link RtpDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<RtpDeclarationType> getRTP() {
        if (rtp == null) {
            rtp = new ArrayList<>();
        }
        return rtp;
    }

    /**
     * Définit la valeur de la propriété rtp.
     *
     * @param value allowed object is {@link RtpDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRTP(List<RtpDeclarationType> value) {
        this.rtp = value;
    }

    /**
     * Obtient la valeur de la propriété lan.
     *
     * @return possible object is {@link LanDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<LanDeclarationType> getLAN() {
        return lan;
    }

    /**
     * Définit la valeur de la propriété lan.
     *
     * @param value allowed object is {@link LanDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setLAN(List<LanDeclarationType> value) {
        this.lan = value;
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
     * {@link GeaDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<GeaDeclarationType> getGEA() {
        if (gea == null) {
            gea = new ArrayList<GeaDeclarationType>();
        }
        return this.gea;
    }

    /**
     * Gets the value of the sow property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the sow property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOW().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipOwnerDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<ShipOwnerDeclarationType> getSOW() {
        if (sow == null) {
            sow = new ArrayList<ShipOwnerDeclarationType>();
        }
        return this.sow;
    }

    /**
     * Obtient la valeur de la propriété ir.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getIR() {
        return ir;
    }

    /**
     * Définit la valeur de la propriété ir.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setIR(String value) {
        this.ir = value;
    }

    /**
     * Obtient la valeur de la propriété rc.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getRC() {
        return rc;
    }

    /**
     * Définit la valeur de la propriété rc.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRC(String value) {
        this.rc = value;
    }

    /**
     * Obtient la valeur de la propriété xr.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getXR() {
        return xr;
    }

    /**
     * Définit la valeur de la propriété xr.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setXR(String value) {
        this.xr = value;
    }

    /**
     * Obtient la valeur de la propriété na.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getNA() {
        return na;
    }

    /**
     * Définit la valeur de la propriété na.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setNA(String value) {
        this.na = value;
    }

    /**
     * Obtient la valeur de la propriété ma.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getMA() {
        return ma;
    }

    /**
     * Définit la valeur de la propriété ma.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setMA(String value) {
        this.ma = value;
    }

    /**
     * Obtient la valeur de la propriété md.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getMD() {
        return md;
    }

    /**
     * Définit la valeur de la propriété md.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setMD(String value) {
        this.md = value;
    }

    /**
     * Obtient la valeur de la propriété fs.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getFS() {
        return fs;
    }

    /**
     * Définit la valeur de la propriété fs.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFS(String value) {
        this.fs = value;
    }

    /**
     * Obtient la valeur de la propriété in.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getIN() {
        return in;
    }

    /**
     * Définit la valeur de la propriété in.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setIN(String value) {
        this.in = value;
    }

    /**
     * Obtient la valeur de la propriété im.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getIM() {
        return im;
    }

    /**
     * Définit la valeur de la propriété im.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setIM(String value) {
        this.im = value;
    }

    /**
     * Obtient la valeur de la propriété ud.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public XMLGregorianCalendar getUD() {
        return ud;
    }

    /**
     * Définit la valeur de la propriété ud.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setUD(XMLGregorianCalendar value) {
        this.ud = value;
    }

    /**
     * Obtient la valeur de la propriété ut.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getUT() {
        return ut;
    }

    /**
     * Définit la valeur de la propriété ut.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setUT(String value) {
        this.ut = value;
    }

    /**
     * Obtient la valeur de la propriété vt.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getVT() {
        return vt;
    }

    /**
     * Définit la valeur de la propriété vt.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setVT(String value) {
        this.vt = value;
    }

    /**
     * Obtient la valeur de la propriété vl.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getVL() {
        return vl;
    }

    /**
     * Définit la valeur de la propriété vl.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setVL(String value) {
        this.vl = value;
    }

    /**
     * Obtient la valeur de la propriété hc.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getHC() {
        return hc;
    }

    /**
     * Définit la valeur de la propriété hc.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setHC(String value) {
        this.hc = value;
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

    /**
     * Obtient la valeur de la propriété so.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getSO() {
        return so;
    }

    /**
     * Définit la valeur de la propriété so.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setSO(String value) {
        this.so = value;
    }

    /**
     * Obtient la valeur de la propriété vd.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getVD() {
        return vd;
    }

    /**
     * Définit la valeur de la propriété vd.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setVD(Integer value) {
        this.vd = value;
    }

    /**
     * Obtient la valeur de la propriété li.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getLI() {
        return li;
    }

    /**
     * Définit la valeur de la propriété li.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setLI(String value) {
        this.li = value;
    }

    /**
     * Obtient la valeur de la propriété va.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public XMLGregorianCalendar getVA() {
        return va;
    }

    /**
     * Définit la valeur de la propriété va.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setVA(XMLGregorianCalendar value) {
        this.va  = value;
    }

    /**
     * Obtient la valeur de la propriété tr.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getTR() {
        return tr;
    }

    /**
     * Définit la valeur de la propriété tr.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTR(String value) {
        this.tr = value;
    }

    /**
     * Obtient la valeur de la propriété ct.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getCT() {
        return ct;
    }

    /**
     * Définit la valeur de la propriété ct.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setCT(String value) {
        this.ct = value;
    }

    /**
     * Obtient la valeur de la propriété mi.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getMI() {
        return mi;
    }

    /**
     * Définit la valeur de la propriété mi.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setMI(String value) {
        this.mi = value;
    }

    public void setFAR(List<FarDeclarationType> listFar) {
        this.far = listFar;
    }

    /**
     * Obtient la valeur de la propriété mt.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getMT() {
        return mt;
    }

    /**
     * Définit la valeur de la propriété mt.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setMT(String value) {
        this.mt = value;
    }

    /**
     * Obtient la valeur de la propriété mc.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getMC() {
        return mc;
    }

    /**
     * Définit la valeur de la propriété mc.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setMC(String value) {
        this.mc = value;
    }

    /**
     * Obtient la valeur de la propriété ft.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getFT() {
        return ft;
    }

    /**
     * Définit la valeur de la propriété ft.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFT(String value) {
        this.ft = value;
    }

    /**
     * Obtient la valeur de la propriété ar.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getAR() {
        return ar;
    }

    /**
     * Définit la valeur de la propriété ar.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setAR(String value) {
        this.ar = value;
    }

    /**
     * Obtient la valeur de la propriété pi.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getPI() {
        return pi;
    }

    /**
     * Définit la valeur de la propriété pi.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setPI(String value) {
        this.pi = value;
    }

    /**
     * Obtient la valeur de la propriété vp.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getVP() {
        return vp;
    }

    /**
     * Définit la valeur de la propriété vp.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setVP(String value) {
        this.vp = value;
    }

    /**
     * Obtient la valeur de la propriété tn.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getTN() {
        return tn;
    }

    /**
     * Définit la valeur de la propriété tn.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTN(String value) {
        this.tn = value;
    }

    /**
     * Obtient la valeur de la propriété vk.
     *
     * @return possible object is {@link TripTypeEnum }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public TripTypeEnum getVK() {
        return vk;
    }

    /**
     * Définit la valeur de la propriété vk.
     *
     * @param value allowed object is {@link TripTypeEnum }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setVK(TripTypeEnum value) {
        this.vk = value;
    }

}
