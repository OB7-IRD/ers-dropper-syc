//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.04 à 06:18:33 PM MUT 
//
package fr.ird.dropper.ers.sez.business;

import java.math.BigInteger;
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
 * Fishing Activity Report declaration. 2.0-3.0: Allowed more than one PFP
 * subdeclaration. 1.1-2.0: Merged FAR's FO and DU into the GEA subdeclaration.
 * Added PFP. Added ICCAT reporting features.
 *
 *
 * <p>
 * Classe Java pour FarDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="FarDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PFP" type="{http://ec.europa.eu/fisheries/schema/ers/v3}PfpDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RAS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RasDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="POS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}PosDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="GEA" type="{http://ec.europa.eu/fisheries/schema/ers/v3}GeaDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="GLS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}GlsDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="SPE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}SpeDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CVT" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CvtDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="CVO" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CvoDeclarationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JCI" type="{http://ec.europa.eu/fisheries/schema/ers/v3}JciDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="FAD" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FadDeclarationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}BooleanType" /&gt;
 *       &lt;attribute name="IS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}BooleanType" /&gt;
 *       &lt;attribute name="DA" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcDateType" /&gt;
 *       &lt;attribute name="TI" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcTimeType" /&gt;
 *       &lt;attribute name="JF" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NF" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="CM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SZ" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WS" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="NC" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="SU" type="{http://ec.europa.eu/fisheries/schema/ers/v3}BooleanType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarDeclarationType", propOrder = {
    "pfp",
    "ras",
    "pos",
    "gea",
    "gls",
    "spe",
    "cvt",
    "cvo",
    "jci",
    "fad"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class FarDeclarationType {

    @XmlElement(name = "PFP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<PfpDeclarationType> pfp;
    @XmlElement(name = "RAS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected RasDeclarationType ras;
    @XmlElement(name = "POS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected PosDeclarationType pos;
    @XmlElement(name = "GEA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected GeaDeclarationType gea;
    @XmlElement(name = "GLS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected GlsDeclarationType gls;
    @XmlElement(name = "SPE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<SpeDeclarationType> spe;
    @XmlElement(name = "CVT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected CvtDeclarationType cvt;
    @XmlElement(name = "CVO")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected List<CvoDeclarationType> cvo;
    @XmlElement(name = "JCI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected JciDeclarationType jci;
    @XmlElement(name = "FAD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected FadDeclarationType fad;
    @XmlAttribute(name = "LR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger lr;
    @XmlAttribute(name = "IS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger is;
    @XmlAttribute(name = "DA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected XMLGregorianCalendar da;
    @XmlAttribute(name = "TI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ti;
    @XmlAttribute(name = "JF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String jf;
    @XmlAttribute(name = "RS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String rs;
    @XmlAttribute(name = "RP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String rp;
    @XmlAttribute(name = "NF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger nf;
    @XmlAttribute(name = "CM")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String cm;
    @XmlAttribute(name = "SZ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String sz;
    @XmlAttribute(name = "WS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger ws;
    @XmlAttribute(name = "NC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger nc;
    @XmlAttribute(name = "SU")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger su;

    /**
     * Gets the value of the pfp property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the pfp property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFP().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PfpDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<PfpDeclarationType> getPFP() {
        if (pfp == null) {
            pfp = new ArrayList<PfpDeclarationType>();
        }
        return this.pfp;
    }

    /**
     * Obtient la valeur de la propriété ras.
     *
     * @return possible object is {@link RasDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public RasDeclarationType getRAS() {
        return ras;
    }

    /**
     * Définit la valeur de la propriété ras.
     *
     * @param value allowed object is {@link RasDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRAS(RasDeclarationType value) {
        this.ras = value;
    }

    /**
     * Obtient la valeur de la propriété pos.
     *
     * @return possible object is {@link PosDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public PosDeclarationType getPOS() {
        return pos;
    }

    /**
     * Définit la valeur de la propriété pos.
     *
     * @param value allowed object is {@link PosDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setPOS(PosDeclarationType value) {
        this.pos = value;
    }

    /**
     * Obtient la valeur de la propriété gea.
     *
     * @return possible object is {@link GeaDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public GeaDeclarationType getGEA() {
        return gea;
    }

    /**
     * Définit la valeur de la propriété gea.
     *
     * @param value allowed object is {@link GeaDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setGEA(GeaDeclarationType value) {
        this.gea = value;
    }

    /**
     * Obtient la valeur de la propriété gls.
     *
     * @return possible object is {@link GlsDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public GlsDeclarationType getGLS() {
        return gls;
    }

    /**
     * Définit la valeur de la propriété gls.
     *
     * @param value allowed object is {@link GlsDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setGLS(GlsDeclarationType value) {
        this.gls = value;
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
     * {@link SpeDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<SpeDeclarationType> getSPE() {
        if (spe == null) {
            spe = new ArrayList<SpeDeclarationType>();
        }
        return this.spe;
    }

    /**
     * Obtient la valeur de la propriété cvt.
     *
     * @return possible object is {@link CvtDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public CvtDeclarationType getCVT() {
        return cvt;
    }

    /**
     * Définit la valeur de la propriété cvt.
     *
     * @param value allowed object is {@link CvtDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setCVT(CvtDeclarationType value) {
        this.cvt = value;
    }

    /**
     * Gets the value of the cvo property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the cvo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCVO().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvoDeclarationType }
     *
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public List<CvoDeclarationType> getCVO() {
        if (cvo == null) {
            cvo = new ArrayList<CvoDeclarationType>();
        }
        return this.cvo;
    }

    /**
     * Obtient la valeur de la propriété jci.
     *
     * @return possible object is {@link JciDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public JciDeclarationType getJCI() {
        return jci;
    }

    /**
     * Définit la valeur de la propriété jci.
     *
     * @param value allowed object is {@link JciDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setJCI(JciDeclarationType value) {
        this.jci = value;
    }

    /**
     * Obtient la valeur de la propriété fad.
     *
     * @return possible object is {@link FadDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public FadDeclarationType getFAD() {
        return fad;
    }

    /**
     * Définit la valeur de la propriété fad.
     *
     * @param value allowed object is {@link FadDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFAD(FadDeclarationType value) {
        this.fad = value;
    }

    /**
     * Obtient la valeur de la propriété lr.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigInteger getLR() {
        return lr;
    }

    /**
     * Définit la valeur de la propriété lr.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setLR(BigInteger value) {
        this.lr = value;
    }

    /**
     * Obtient la valeur de la propriété is.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigInteger getIS() {
        return is;
    }

    /**
     * Définit la valeur de la propriété is.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setIS(BigInteger value) {
        this.is = value;
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
     * Obtient la valeur de la propriété jf.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getJF() {
        return jf;
    }

    /**
     * Définit la valeur de la propriété jf.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setJF(String value) {
        this.jf = value;
    }

    /**
     * Obtient la valeur de la propriété rs.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getRS() {
        return rs;
    }

    /**
     * Définit la valeur de la propriété rs.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRS(String value) {
        this.rs = value;
    }

    /**
     * Obtient la valeur de la propriété rp.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getRP() {
        return rp;
    }

    /**
     * Définit la valeur de la propriété rp.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRP(String value) {
        this.rp = value;
    }

    /**
     * Obtient la valeur de la propriété nf.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigInteger getNF() {
        return nf;
    }

    /**
     * Définit la valeur de la propriété nf.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setNF(BigInteger value) {
        this.nf = value;
    }

    /**
     * Obtient la valeur de la propriété cm.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getCM() {
        return cm;
    }

    /**
     * Définit la valeur de la propriété cm.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setCM(String value) {
        this.cm = value;
    }

    /**
     * Obtient la valeur de la propriété sz.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getSZ() {
        return sz;
    }

    /**
     * Définit la valeur de la propriété sz.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setSZ(String value) {
        this.sz = value;
    }

    /**
     * Obtient la valeur de la propriété ws.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigInteger getWS() {
        return ws;
    }

    /**
     * Définit la valeur de la propriété ws.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setWS(BigInteger value) {
        this.ws = value;
    }

    /**
     * Obtient la valeur de la propriété nc.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigInteger getNC() {
        return nc;
    }

    /**
     * Définit la valeur de la propriété nc.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setNC(BigInteger value) {
        this.nc = value;
    }

    /**
     * Obtient la valeur de la propriété su.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigInteger getSU() {
        return su;
    }

    /**
     * Définit la valeur de la propriété su.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setSU(BigInteger value) {
        this.su = value;
    }

}
