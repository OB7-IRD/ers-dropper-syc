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

/**
 * Consignment Sold sub-declaration.
 *
 *
 * <p>
 * Classe Java pour CssDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="CssDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SPE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}SpeDeclarationType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FP" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="TP" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="CR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}CurrencyType" /&gt;
 *       &lt;attribute name="SF" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FishSizeType" /&gt;
 *       &lt;attribute name="PP" type="{http://ec.europa.eu/fisheries/schema/ers/v3}ProductDestinationType" /&gt;
 *       &lt;attribute name="WD" type="{http://ec.europa.eu/fisheries/schema/ers/v3}WithdrawnStateType" /&gt;
 *       &lt;attribute name="OP" type="{http://ec.europa.eu/fisheries/schema/ers/v3}ProducerOrganizationUseType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CssDeclarationType", propOrder = {
    "spe"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class CssDeclarationType {

    @XmlElement(name = "SPE", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected SpeDeclarationType spe;
    @XmlAttribute(name = "FP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Double fp;
    @XmlAttribute(name = "TP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected Double tp;
    @XmlAttribute(name = "CR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String cr;
    @XmlAttribute(name = "SF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String sf;
    @XmlAttribute(name = "PP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String pp;
    @XmlAttribute(name = "WD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String wd;
    @XmlAttribute(name = "OP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String op;

    /**
     * Obtient la valeur de la propriété spe.
     *
     * @return possible object is {@link SpeDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public SpeDeclarationType getSPE() {
        return spe;
    }

    /**
     * Définit la valeur de la propriété spe.
     *
     * @param value allowed object is {@link SpeDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setSPE(SpeDeclarationType value) {
        this.spe = value;
    }

    /**
     * Obtient la valeur de la propriété fp.
     *
     * @return possible object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Double getFP() {
        return fp;
    }

    /**
     * Définit la valeur de la propriété fp.
     *
     * @param value allowed object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFP(Double value) {
        this.fp = value;
    }

    /**
     * Obtient la valeur de la propriété tp.
     *
     * @return possible object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public Double getTP() {
        return tp;
    }

    /**
     * Définit la valeur de la propriété tp.
     *
     * @param value allowed object is {@link Double }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setTP(Double value) {
        this.tp = value;
    }

    /**
     * Obtient la valeur de la propriété cr.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getCR() {
        return cr;
    }

    /**
     * Définit la valeur de la propriété cr.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setCR(String value) {
        this.cr = value;
    }

    /**
     * Obtient la valeur de la propriété sf.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getSF() {
        return sf;
    }

    /**
     * Définit la valeur de la propriété sf.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setSF(String value) {
        this.sf = value;
    }

    /**
     * Obtient la valeur de la propriété pp.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getPP() {
        return pp;
    }

    /**
     * Définit la valeur de la propriété pp.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setPP(String value) {
        this.pp = value;
    }

    /**
     * Obtient la valeur de la propriété wd.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getWD() {
        return wd;
    }

    /**
     * Définit la valeur de la propriété wd.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setWD(String value) {
        this.wd = value;
    }

    /**
     * Obtient la valeur de la propriété op.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getOP() {
        return op;
    }

    /**
     * Définit la valeur de la propriété op.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setOP(String value) {
        this.op = value;
    }

}
