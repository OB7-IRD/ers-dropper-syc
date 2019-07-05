//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.04 à 06:18:33 PM MUT 
//
package fr.ird.dropper.ers.sez.business;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour ProDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="ProDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FF" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FishFreshnessType" /&gt;
 *       &lt;attribute name="PS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FishStateType" /&gt;
 *       &lt;attribute name="PR" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FishPresentationType" /&gt;
 *       &lt;attribute name="TY" type="{http://ec.europa.eu/fisheries/schema/ers/v3}FishPackagingType" /&gt;
 *       &lt;attribute name="NN" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="AW" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="CF" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProDeclarationType")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class ProDeclarationType {

    @XmlAttribute(name = "FF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ff;
    @XmlAttribute(name = "PS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ps;
    @XmlAttribute(name = "PR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String pr;
    @XmlAttribute(name = "TY")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String ty;
    @XmlAttribute(name = "NN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger nn;
    @XmlAttribute(name = "AW")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal aw;
    @XmlAttribute(name = "CF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal cf;

    /**
     * Obtient la valeur de la propriété ff.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getFF() {
        return ff;
    }

    /**
     * Définit la valeur de la propriété ff.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFF(String value) {
        this.ff = value;
    }

    /**
     * Obtient la valeur de la propriété ps.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getPS() {
        return ps;
    }

    /**
     * Définit la valeur de la propriété ps.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setPS(String value) {
        this.ps = value;
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
     * Obtient la valeur de la propriété nn.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigInteger getNN() {
        return nn;
    }

    /**
     * Définit la valeur de la propriété nn.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setNN(BigInteger value) {
        this.nn = value;
    }

    /**
     * Obtient la valeur de la propriété aw.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getAW() {
        return aw;
    }

    /**
     * Définit la valeur de la propriété aw.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setAW(BigDecimal value) {
        this.aw = value;
    }

    /**
     * Obtient la valeur de la propriété cf.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getCF() {
        return cf;
    }

    /**
     * Définit la valeur de la propriété cf.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setCF(BigDecimal value) {
        this.cf = value;
    }

}
