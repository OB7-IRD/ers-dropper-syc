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
import javax.xml.bind.annotation.XmlType;

/**
 * Relevant area depending on the relevant reporting requirement - at least one
 * field should be filled in. If FA is given, SA, ID and SD are expected (except
 * if reporting COD in the Baltic).
 *
 *
 * <p>
 * Classe Java pour RasDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="RasDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FA" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FaoAreaType" /&gt;
 *       &lt;attribute name="SA" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FaoSubAreaType" /&gt;
 *       &lt;attribute name="ID" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FaoDivisionType" /&gt;
 *       &lt;attribute name="SD" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FaoSubDivisionType" /&gt;
 *       &lt;attribute name="OT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UI" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FaoUnitType" /&gt;
 *       &lt;attribute name="EZ" type="{http://ec.europa.eu/fisheries/schema/ers/v3}EconomicZoneType" /&gt;
 *       &lt;attribute name="SR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}StatisticalRectangleType" /&gt;
 *       &lt;attribute name="FE" type="{http://ec.europa.eu/fisheries/schema/ers/v3}EffortZoneType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RasDeclarationType")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class Ras {

    @XmlAttribute(name = "FA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String fa;
    @XmlAttribute(name = "SA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String sa;
    @XmlAttribute(name = "ID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String id;
    @XmlAttribute(name = "SD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String sd;
    @XmlAttribute(name = "OT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ot;
    @XmlAttribute(name = "UI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ui;
    @XmlAttribute(name = "EZ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ez;
    @XmlAttribute(name = "SR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String sr;
    @XmlAttribute(name = "FE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String fe;

    /**
     * Obtient la valeur de la propriété fa.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getFA() {
        return fa;
    }

    /**
     * Définit la valeur de la propriété fa.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFA(String value) {
        this.fa = value;
    }

    /**
     * Obtient la valeur de la propriété sa.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getSA() {
        return sa;
    }

    /**
     * Définit la valeur de la propriété sa.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setSA(String value) {
        this.sa = value;
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
     * Obtient la valeur de la propriété sd.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getSD() {
        return sd;
    }

    /**
     * Définit la valeur de la propriété sd.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setSD(String value) {
        this.sd = value;
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
     * Obtient la valeur de la propriété ui.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getUI() {
        return ui;
    }

    /**
     * Définit la valeur de la propriété ui.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setUI(String value) {
        this.ui = value;
    }

    /**
     * Obtient la valeur de la propriété ez.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getEZ() {
        return ez;
    }

    /**
     * Définit la valeur de la propriété ez.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setEZ(String value) {
        this.ez = value;
    }

    /**
     * Obtient la valeur de la propriété sr.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getSR() {
        return sr;
    }

    /**
     * Définit la valeur de la propriété sr.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setSR(String value) {
        this.sr = value;
    }

    /**
     * Obtient la valeur de la propriété fe.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getFE() {
        return fe;
    }

    /**
     * Définit la valeur de la propriété fe.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFE(String value) {
        this.fe = value;
    }

    public String getRasFeLb() {
        return fe;
    }

    public String getRasEzLb() {
        return ez;
    }

}
