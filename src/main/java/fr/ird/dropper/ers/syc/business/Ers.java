//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.04 à 06:18:33 PM MUT 
//
package fr.ird.dropper.ers.syc.business;

import fr.ird.common.DateTimeUtils;
import fr.ird.common.OTUtils;
import java.util.Date;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.joda.time.DateTime;

/**
 * <p>
 * Classe Java pour anonymous complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="LOG" type="{http://ec.europa.eu/fisheries/schema/ers/v3}LogDeclarationType"/&gt;
 *         &lt;element name="SAL" type="{http://ec.europa.eu/fisheries/schema/ers/v3}SalDeclarationType"/&gt;
 *         &lt;element name="TRN" type="{http://ec.europa.eu/fisheries/schema/ers/v3}TrnDeclarationType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="RN" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RecordNumberType" /&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RD" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcDateType" /&gt;
 *       &lt;attribute name="RT" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcTimeType" /&gt;
 *       &lt;attribute name="DC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ST"&gt;
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
@XmlType(name = "", propOrder = {
    "log",
    "sal",
    "trn"
})
@XmlRootElement(name = "ERS")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class Ers {

    @XmlElement(name = "LOG")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Log log;
    @XmlElement(name = "SAL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Sal sal;
    @XmlElement(name = "TRN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Trn trn;
    @XmlAttribute(name = "RN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String rn;
    @XmlAttribute(name = "ID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String id;
    @XmlAttribute(name = "RD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected XMLGregorianCalendar rd;
    @XmlAttribute(name = "RT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String rt;
    @XmlAttribute(name = "DC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String dc;
    @XmlAttribute(name = "DP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String dp;
    @XmlAttribute(name = "ST")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String st;
    @XmlAttribute(name = "CN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String cn;

    /**
     * Obtient la valeur de la propriété log.
     *
     * @return possible object is {@link Log }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Log getLOG() {
        return log;
    }

    /**
     * Définit la valeur de la propriété log.
     *
     * @param value allowed object is {@link Log }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setLOG(Log value) {
        this.log = value;
    }

    /**
     * Obtient la valeur de la propriété sal.
     *
     * @return possible object is {@link Sal }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Sal getSAL() {
        return sal;
    }

    /**
     * Définit la valeur de la propriété sal.
     *
     * @param value allowed object is {@link Sal }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setSAL(Sal value) {
        this.sal = value;
    }

    /**
     * Obtient la valeur de la propriété trn.
     *
     * @return possible object is {@link Trn }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Trn getTRN() {
        return trn;
    }

    /**
     * Définit la valeur de la propriété trn.
     *
     * @param value allowed object is {@link Trn }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTRN(Trn value) {
        this.trn = value;
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
     * Obtient la valeur de la propriété id.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setID(String value) {
        this.id = value;
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
     * Obtient la valeur de la propriété dc.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getDC() {
        return dc;
    }

    /**
     * Définit la valeur de la propriété dc.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setDC(String value) {
        this.dc = value;
    }

    /**
     * Obtient la valeur de la propriété dp.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getDP() {
        return dp;
    }

    /**
     * Définit la valeur de la propriété dp.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setDP(String value) {
        this.dp = value;
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

    public String getErsRtLb() {
        return rt;
    }

    public Date getErsRdtDt() {
        return DateTimeUtils.createDateTime(getErsRdDt(), rt).toDate();
    }

    public Date getErsRdDt() {
        return rd.toGregorianCalendar().getTime();
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public Sal getSal() {
        return sal;
    }

    public void setSal(Sal sal) {
        this.sal = sal;
    }

    public Trn getTrn() {
        return trn;
    }

    public void setTrn(Trn trn) {
        this.trn = trn;
    }

    public String getRn() {
        return rn;
    }

    public void setRn(String rn) {
        this.rn = rn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public XMLGregorianCalendar getRd() {
        return rd;
    }

    public void setRd(XMLGregorianCalendar rd) {
        this.rd = rd;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    
    
}
