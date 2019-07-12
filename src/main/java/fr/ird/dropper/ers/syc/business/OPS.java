package fr.ird.dropper.ers.syc.business;

import fr.ird.dropper.ers.syc.business.CorElementType;
import fr.ird.dropper.ers.syc.business.DatElementType;
import fr.ird.dropper.ers.syc.business.DelElementType;
import fr.ird.dropper.ers.syc.business.QueElementType;
import fr.ird.dropper.ers.syc.business.RetElementType;
import fr.ird.dropper.ers.syc.business.RspElementType;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

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
 *         &lt;element name="DAT" type="{http://ec.europa.eu/fisheries/schema/ers/v3}DatElementType"/&gt;
 *         &lt;element name="RET" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RetElementType"/&gt;
 *         &lt;element name="DEL" type="{http://ec.europa.eu/fisheries/schema/ers/v3}DelElementType"/&gt;
 *         &lt;element name="COR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CorElementType"/&gt;
 *         &lt;element name="QUE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}QueElementType"/&gt;
 *         &lt;element name="RSP" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RspElementType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="AD" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CountryType" /&gt;
 *       &lt;attribute name="FR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CountryType" /&gt;
 *       &lt;attribute name="ON" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RecordNumberType" /&gt;
 *       &lt;attribute name="OD" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcDateType" /&gt;
 *       &lt;attribute name="OT" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcTimeType" /&gt;
 *       &lt;attribute name="TS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dat",
    "ret",
    "del",
    "cor",
    "que",
    "rsp"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class OPS {

    @XmlElement(name = "DAT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected DatElementType dat;
    @XmlElement(name = "RET")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected RetElementType ret;
    @XmlElement(name = "DEL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected DelElementType del;
    @XmlElement(name = "COR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected CorElementType cor;
    @XmlElement(name = "QUE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected QueElementType que;
    @XmlElement(name = "RSP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected RspElementType rsp;
    @XmlAttribute(name = "AD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ad;
    @XmlAttribute(name = "FR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String fr;
    @XmlAttribute(name = "ON")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String on;
    @XmlAttribute(name = "OD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected XMLGregorianCalendar od;
    @XmlAttribute(name = "OT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ot;
    @XmlAttribute(name = "TS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ts;

    /**
     * Obtient la valeur de la propriété dat.
     *
     * @return possible object is {@link DatElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public DatElementType getDAT() {
        return dat;
    }

    /**
     * Définit la valeur de la propriété dat.
     *
     * @param value allowed object is {@link DatElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setDAT(DatElementType value) {
        this.dat = value;
    }

    /**
     * Obtient la valeur de la propriété ret.
     *
     * @return possible object is {@link RetElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public RetElementType getRET() {
        return ret;
    }

    /**
     * Définit la valeur de la propriété ret.
     *
     * @param value allowed object is {@link RetElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRET(RetElementType value) {
        this.ret = value;
    }

    /**
     * Obtient la valeur de la propriété del.
     *
     * @return possible object is {@link DelElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public DelElementType getDEL() {
        return del;
    }

    /**
     * Définit la valeur de la propriété del.
     *
     * @param value allowed object is {@link DelElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setDEL(DelElementType value) {
        this.del = value;
    }

    /**
     * Obtient la valeur de la propriété cor.
     *
     * @return possible object is {@link CorElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public CorElementType getCOR() {
        return cor;
    }

    /**
     * Définit la valeur de la propriété cor.
     *
     * @param value allowed object is {@link CorElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setCOR(CorElementType value) {
        this.cor = value;
    }

    /**
     * Obtient la valeur de la propriété que.
     *
     * @return possible object is {@link QueElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public QueElementType getQUE() {
        return que;
    }

    /**
     * Définit la valeur de la propriété que.
     *
     * @param value allowed object is {@link QueElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setQUE(QueElementType value) {
        this.que = value;
    }

    /**
     * Obtient la valeur de la propriété rsp.
     *
     * @return possible object is {@link RspElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public RspElementType getRSP() {
        return rsp;
    }

    /**
     * Définit la valeur de la propriété rsp.
     *
     * @param value allowed object is {@link RspElementType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setRSP(RspElementType value) {
        this.rsp = value;
    }

    /**
     * Obtient la valeur de la propriété ad.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getAD() {
        return ad;
    }

    /**
     * Définit la valeur de la propriété ad.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setAD(String value) {
        this.ad = value;
    }

    /**
     * Obtient la valeur de la propriété fr.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getFR() {
        return fr;
    }

    /**
     * Définit la valeur de la propriété fr.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFR(String value) {
        this.fr = value;
    }

    /**
     * Obtient la valeur de la propriété on.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getON() {
        return on;
    }

    /**
     * Définit la valeur de la propriété on.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setON(String value) {
        this.on = value;
    }

    /**
     * Obtient la valeur de la propriété od.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public XMLGregorianCalendar getOD() {
        return od;
    }

    /**
     * Définit la valeur de la propriété od.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setOD(XMLGregorianCalendar value) {
        this.od = value;
    }

    /**
     * Obtient la valeur de la propriété ot.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getOT() {
        return ot;
    }

    /**
     * Définit la valeur de la propriété ot.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setOT(String value) {
        this.ot = value;
    }

    /**
     * Obtient la valeur de la propriété ts.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getTS() {
        return ts;
    }

    /**
     * Définit la valeur de la propriété ts.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTS(String value) {
        this.ts = value;
    }

    @Override
    public String toString() {
        return "OPS{" + "dat=" + dat + ", ret=" + ret + ", del=" + del + ", cor=" + cor + ", que=" + que + ", rsp=" + rsp + ", ad=" + ad + ", fr=" + fr + ", on=" + on + ", od=" + od + ", ot=" + ot + ", ts=" + ts + '}';
    }

}
