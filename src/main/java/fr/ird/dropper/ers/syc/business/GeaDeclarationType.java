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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * GEA: gear deployment sub-declaration.
 *
 *
 * <p>
 * Classe Java pour GeaDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="GeaDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GES" type="{http://ec.europa.eu/fisheries/schema/ers/v3}GesDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="GER" type="{http://ec.europa.eu/fisheries/schema/ers/v3}GerDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="GIL" type="{http://ec.europa.eu/fisheries/schema/ers/v3}GilDeclarationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DA" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcDateType" /&gt;
 *       &lt;attribute name="TI" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcTimeType" /&gt;
 *       &lt;attribute name="GE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}GearType" /&gt;
 *       &lt;attribute name="ME" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="GC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FO" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="DU" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="SD" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="FD" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="NH" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="GL" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="GD" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="QG" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="TL" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="VA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IF1" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="IF2" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="IF3" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="HN" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="HNBF" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeaDeclarationType", propOrder = {
    "ges",
    "ger",
    "gil"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class GeaDeclarationType {

    @XmlElement(name = "GES")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected GesDeclarationType ges;
    @XmlElement(name = "GER")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected GerDeclarationType ger;
    @XmlElement(name = "GIL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected GilDeclarationType gil;
    @XmlAttribute(name = "DA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected XMLGregorianCalendar da;
    @XmlAttribute(name = "TI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ti;
    @XmlAttribute(name = "GE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ge;
    @XmlAttribute(name = "ME")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer me;
    @XmlAttribute(name = "GC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String gc;
    @XmlAttribute(name = "FO")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer fo;
    @XmlAttribute(name = "DU")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer du;
    @XmlAttribute(name = "SD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer sd;
    @XmlAttribute(name = "FD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer fd;
    @XmlAttribute(name = "NH")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer nh;
    @XmlAttribute(name = "GL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer gl;
    @XmlAttribute(name = "GD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer gd;
    @XmlAttribute(name = "QG")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer qg;
    @XmlAttribute(name = "TL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer tl;
    @XmlAttribute(name = "VA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String va;
    @XmlAttribute(name = "IF1")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer if1;
    @XmlAttribute(name = "IF2")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer if2;
    @XmlAttribute(name = "IF3")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer if3;
    @XmlAttribute(name = "HN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer hn;
    @XmlAttribute(name = "HNBF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Integer hnbf;

    /**
     * Obtient la valeur de la propriété ges.
     *
     * @return possible object is {@link GesDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public GesDeclarationType getGES() {
        return ges;
    }

    /**
     * Définit la valeur de la propriété ges.
     *
     * @param value allowed object is {@link GesDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setGES(GesDeclarationType value) {
        this.ges = value;
    }

    /**
     * Obtient la valeur de la propriété ger.
     *
     * @return possible object is {@link GerDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public GerDeclarationType getGER() {
        return ger;
    }

    /**
     * Définit la valeur de la propriété ger.
     *
     * @param value allowed object is {@link GerDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setGER(GerDeclarationType value) {
        this.ger = value;
    }

    /**
     * Obtient la valeur de la propriété gil.
     *
     * @return possible object is {@link GilDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public GilDeclarationType getGIL() {
        return gil;
    }

    /**
     * Définit la valeur de la propriété gil.
     *
     * @param value allowed object is {@link GilDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setGIL(GilDeclarationType value) {
        this.gil = value;
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
     * Obtient la valeur de la propriété ge.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getGE() {
        return ge;
    }

    /**
     * Définit la valeur de la propriété ge.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setGE(String value) {
        this.ge = value;
    }

    /**
     * Obtient la valeur de la propriété me.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getME() {
        return me;
    }

    /**
     * Définit la valeur de la propriété me.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setME(Integer value) {
        this.me = value;
    }

    /**
     * Obtient la valeur de la propriété gc.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getGC() {
        return gc;
    }

    /**
     * Définit la valeur de la propriété gc.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setGC(String value) {
        this.gc = value;
    }

    /**
     * Obtient la valeur de la propriété fo.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getFO() {
        return fo;
    }

    /**
     * Définit la valeur de la propriété fo.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFO(Integer value) {
        this.fo = value;
    }

    /**
     * Obtient la valeur de la propriété du.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getDU() {
        return du;
    }

    /**
     * Définit la valeur de la propriété du.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setDU(Integer value) {
        this.du = value;
    }

    /**
     * Obtient la valeur de la propriété sd.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getSD() {
        return sd;
    }

    /**
     * Définit la valeur de la propriété sd.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setSD(Integer value) {
        this.sd = value;
    }

    /**
     * Obtient la valeur de la propriété fd.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getFD() {
        return fd;
    }

    /**
     * Définit la valeur de la propriété fd.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFD(Integer value) {
        this.fd = value;
    }

    /**
     * Obtient la valeur de la propriété nh.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getNH() {
        return nh;
    }

    /**
     * Définit la valeur de la propriété nh.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setNH(Integer value) {
        this.nh = value;
    }

    /**
     * Obtient la valeur de la propriété gl.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getGL() {
        return gl;
    }

    /**
     * Définit la valeur de la propriété gl.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setGL(Integer value) {
        this.gl = value;
    }

    /**
     * Obtient la valeur de la propriété gd.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getGD() {
        return gd;
    }

    /**
     * Définit la valeur de la propriété gd.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setGD(Integer value) {
        this.gd = value;
    }

    /**
     * Obtient la valeur de la propriété qg.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getQG() {
        return qg;
    }

    /**
     * Définit la valeur de la propriété qg.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setQG(Integer value) {
        this.qg = value;
    }

    /**
     * Obtient la valeur de la propriété tl.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getTL() {
        return tl;
    }

    /**
     * Définit la valeur de la propriété tl.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTL(Integer value) {
        this.tl = value;
    }

    /**
     * Obtient la valeur de la propriété va.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getVA() {
        return va;
    }

    /**
     * Définit la valeur de la propriété va.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setVA(String value) {
        this.va  = value;
    }

    /**
     * Obtient la valeur de la propriété if1.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getIF1() {
        return if1;
    }

    /**
     * Définit la valeur de la propriété if1.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setIF1(Integer value) {
        this.if1 = value;
    }

    /**
     * Obtient la valeur de la propriété if2.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getIF2() {
        return if2;
    }

    /**
     * Définit la valeur de la propriété if2.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setIF2(Integer value) {
        this.if2 = value;
    }

    /**
     * Obtient la valeur de la propriété if3.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getIF3() {
        return if3;
    }

    /**
     * Définit la valeur de la propriété if3.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setIF3(Integer value) {
        this.if3 = value;
    }

    /**
     * Obtient la valeur de la propriété hn.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getHN() {
        return hn;
    }

    /**
     * Définit la valeur de la propriété hn.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setHN(Integer value) {
        this.hn = value;
    }

    /**
     * Obtient la valeur de la propriété hnbf.
     *
     * @return possible object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Integer getHNBF() {
        return hnbf;
    }

    /**
     * Définit la valeur de la propriété hnbf.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setHNBF(Integer value) {
        this.hnbf = value;
    }

}
