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
 * Transhipment declaration.
 *
 * <p>
 * Classe Java pour TraDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="TraDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RAS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RasDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="POS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}PosDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="COM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}SpeDeclarationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DA" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcDateType" /&gt;
 *       &lt;attribute name="TI" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcTimeType" /&gt;
 *       &lt;attribute name="DE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcDateType" /&gt;
 *       &lt;attribute name="TE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcTimeType" /&gt;
 *       &lt;attribute name="PO" type="{http://ec.europa.eu/fisheries/schema/ers/v3}PortType" /&gt;
 *       &lt;attribute name="PN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CfrType" /&gt;
 *       &lt;attribute name="TT" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RadioCallSignType" /&gt;
 *       &lt;attribute name="TC" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CountryType" /&gt;
 *       &lt;attribute name="RF" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CfrType" /&gt;
 *       &lt;attribute name="TF" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RadioCallSignType" /&gt;
 *       &lt;attribute name="FC" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CountryType" /&gt;
 *       &lt;attribute name="RN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PR" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraDeclarationType", propOrder = {
    "ras",
    "pos",
    "com",
    "des",
    "spe"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class Tra {

    @XmlElement(name = "RAS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Ras ras;
    @XmlElement(name = "POS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Pos pos;
    @XmlElement(name = "COM")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String com;
    @XmlElement(name = "DES")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String des;
    @XmlElement(name = "SPE", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<Spe> spe;
    @XmlAttribute(name = "DA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected XMLGregorianCalendar da;
    @XmlAttribute(name = "TI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ti;
    @XmlAttribute(name = "DE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected XMLGregorianCalendar de;
    @XmlAttribute(name = "TE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String te;
    @XmlAttribute(name = "PO")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String po;
    @XmlAttribute(name = "PN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String pn;
    @XmlAttribute(name = "IR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ir;
    @XmlAttribute(name = "TT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String tt;
    @XmlAttribute(name = "TC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String tc;
    @XmlAttribute(name = "RF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String rf;
    @XmlAttribute(name = "TF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String tf;
    @XmlAttribute(name = "FC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String fc;
    @XmlAttribute(name = "RN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String rn;
    @XmlAttribute(name = "RI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ri;
    @XmlAttribute(name = "DN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String dn;
    @XmlAttribute(name = "DI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String di;
    @XmlAttribute(name = "WN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String wn;
    @XmlAttribute(name = "PR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String pr;
    @XmlAttribute(name = "MN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String mn;

    /**
     * Obtient la valeur de la propriété ras.
     *
     * @return possible object is {@link Ras }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Ras getRAS() {
        return ras;
    }

    /**
     * Définit la valeur de la propriété ras.
     *
     * @param value allowed object is {@link Ras }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRAS(Ras value) {
        this.ras = value;
    }

    /**
     * Obtient la valeur de la propriété pos.
     *
     * @return possible object is {@link Pos }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Pos getPOS() {
        return pos;
    }

    /**
     * Définit la valeur de la propriété pos.
     *
     * @param value allowed object is {@link Pos }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setPOS(Pos value) {
        this.pos = value;
    }

    /**
     * Obtient la valeur de la propriété com.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getCOM() {
        return com;
    }

    /**
     * Définit la valeur de la propriété com.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setCOM(String value) {
        this.com = value;
    }

    /**
     * Obtient la valeur de la propriété des.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getDES() {
        return des;
    }

    /**
     * Définit la valeur de la propriété des.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setDES(String value) {
        this.des = value;
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
     * {@link Spe }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<Spe> getSPE() {
        if (spe == null) {
            spe = new ArrayList<Spe>();
        }
        return this.spe;
    }

    /**
     * Obtient la valeur de la propriété da.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public XMLGregorianCalendar getDA() {
        return da;
    }

    /**
     * Définit la valeur de la propriété da.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setDA(XMLGregorianCalendar value) {
        this.da = value;
    }

    /**
     * Obtient la valeur de la propriété ti.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getTI() {
        return ti;
    }

    /**
     * Définit la valeur de la propriété ti.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTI(String value) {
        this.ti = value;
    }

    /**
     * Obtient la valeur de la propriété de.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public XMLGregorianCalendar getDE() {
        return de;
    }

    /**
     * Définit la valeur de la propriété de.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setDE(XMLGregorianCalendar value) {
        this.de = value;
    }

    /**
     * Obtient la valeur de la propriété te.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getTE() {
        return te;
    }

    /**
     * Définit la valeur de la propriété te.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTE(String value) {
        this.te = value;
    }

    /**
     * Obtient la valeur de la propriété po.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getPO() {
        return po;
    }

    /**
     * Définit la valeur de la propriété po.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setPO(String value) {
        this.po = value;
    }

    /**
     * Obtient la valeur de la propriété pn.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getPN() {
        return pn;
    }

    /**
     * Définit la valeur de la propriété pn.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setPN(String value) {
        this.pn = value;
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
     * Obtient la valeur de la propriété tt.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getTT() {
        return tt;
    }

    /**
     * Définit la valeur de la propriété tt.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTT(String value) {
        this.tt = value;
    }

    /**
     * Obtient la valeur de la propriété tc.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getTC() {
        return tc;
    }

    /**
     * Définit la valeur de la propriété tc.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTC(String value) {
        this.tc = value;
    }

    /**
     * Obtient la valeur de la propriété rf.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getRF() {
        return rf;
    }

    /**
     * Définit la valeur de la propriété rf.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRF(String value) {
        this.rf = value;
    }

    /**
     * Obtient la valeur de la propriété tf.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getTF() {
        return tf;
    }

    /**
     * Définit la valeur de la propriété tf.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTF(String value) {
        this.tf = value;
    }

    /**
     * Obtient la valeur de la propriété fc.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getFC() {
        return fc;
    }

    /**
     * Définit la valeur de la propriété fc.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFC(String value) {
        this.fc = value;
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
     * Obtient la valeur de la propriété ri.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getRI() {
        return ri;
    }

    /**
     * Définit la valeur de la propriété ri.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRI(String value) {
        this.ri = value;
    }

    /**
     * Obtient la valeur de la propriété dn.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getDN() {
        return dn;
    }

    /**
     * Définit la valeur de la propriété dn.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setDN(String value) {
        this.dn = value;
    }

    /**
     * Obtient la valeur de la propriété di.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getDI() {
        return di;
    }

    /**
     * Définit la valeur de la propriété di.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setDI(String value) {
        this.di = value;
    }

    /**
     * Obtient la valeur de la propriété wn.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getWN() {
        return wn;
    }

    /**
     * Définit la valeur de la propriété wn.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setWN(String value) {
        this.wn = value;
    }

    /**
     * Obtient la valeur de la propriété pr.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getPR() {
        return pr;
    }

    /**
     * Définit la valeur de la propriété pr.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setPR(String value) {
        this.pr = value;
    }

    /**
     * Obtient la valeur de la propriété mn.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getMN() {
        return mn;
    }

    /**
     * Définit la valeur de la propriété mn.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setMN(String value) {
        this.mn = value;
    }

    public String getTraPoLb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
