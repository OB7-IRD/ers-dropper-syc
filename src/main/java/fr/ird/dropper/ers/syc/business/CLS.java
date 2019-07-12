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
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="OPS"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="DAT" type="{http://ec.europa.eu/fisheries/schema/ers/v3}DatElementType"/&gt;
 *                   &lt;element name="RET" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RetElementType"/&gt;
 *                   &lt;element name="DEL" type="{http://ec.europa.eu/fisheries/schema/ers/v3}DelElementType"/&gt;
 *                   &lt;element name="COR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CorElementType"/&gt;
 *                   &lt;element name="QUE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}QueElementType"/&gt;
 *                   &lt;element name="RSP" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RspElementType"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="AD" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CountryType" /&gt;
 *                 &lt;attribute name="FR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CountryType" /&gt;
 *                 &lt;attribute name="ON" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RecordNumberType" /&gt;
 *                 &lt;attribute name="OD" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcDateType" /&gt;
 *                 &lt;attribute name="OT" type="{http://ec.europa.eu/fisheries/schema/ers/v3}UtcTimeType" /&gt;
 *                 &lt;attribute name="TS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="TY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID" type="{http://ec.europa.eu/fisheries/schema/ers/v3}RecordNumberType" /&gt;
 *       &lt;attribute name="ST" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ops"
})
@XmlRootElement(name = "CLS")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class CLS {

    @XmlElement(name = "OPS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected OPS ops;
    @XmlAttribute(name = "TY")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ty;
    @XmlAttribute(name = "ID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String id;
    @XmlAttribute(name = "ST")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String st;

    /**
     * Obtient la valeur de la propriété ops.
     *
     * @return possible object is {@link CLS.OPS }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public OPS getOPS() {
        return ops;
    }

    /**
     * Définit la valeur de la propriété ops.
     *
     * @param value allowed object is {@link CLS.OPS }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setOPS(OPS value) {
        this.ops = value;
    }

    /**
     * Obtient la valeur de la propriété ty.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getTY() {
        return ty;
    }

    /**
     * Définit la valeur de la propriété ty.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTY(String value) {
        this.ty = value;
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

    @Override
    public String toString() {
        return "CLS{" + "ops=" + ops + ", ty=" + ty + ", id=" + id + ", st=" + st + '}';
    }
}
