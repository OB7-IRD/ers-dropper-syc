//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.04 à 06:18:33 PM MUT 
//
package fr.ird.dropper.ers.sez.business;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Gillnet deployment sub-declaration.
 *
 *
 * <p>
 * Classe Java pour GilDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="GilDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}PosDeclarationType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NL" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="NN" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="FL" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="FD" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ST" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="GS" type="{http://ec.europa.eu/fisheries/schema/ers/v3}GearShotIdentifierType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GilDeclarationType", propOrder = {
    "pos"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class GilDeclarationType {

    @XmlElement(name = "POS", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected PosDeclarationType pos;
    @XmlAttribute(name = "NL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger nl;
    @XmlAttribute(name = "NN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger nn;
    @XmlAttribute(name = "FL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger fl;
    @XmlAttribute(name = "FD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger fd;
    @XmlAttribute(name = "ST")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected BigInteger st;
    @XmlAttribute(name = "GS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected String gs;

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
     * Obtient la valeur de la propriété nl.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigInteger getNL() {
        return nl;
    }

    /**
     * Définit la valeur de la propriété nl.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setNL(BigInteger value) {
        this.nl = value;
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
     * Obtient la valeur de la propriété fl.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigInteger getFL() {
        return fl;
    }

    /**
     * Définit la valeur de la propriété fl.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFL(BigInteger value) {
        this.fl = value;
    }

    /**
     * Obtient la valeur de la propriété fd.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigInteger getFD() {
        return fd;
    }

    /**
     * Définit la valeur de la propriété fd.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setFD(BigInteger value) {
        this.fd = value;
    }

    /**
     * Obtient la valeur de la propriété st.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public BigInteger getST() {
        return st;
    }

    /**
     * Définit la valeur de la propriété st.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setST(BigInteger value) {
        this.st = value;
    }

    /**
     * Obtient la valeur de la propriété gs.
     *
     * @return possible object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public String getGS() {
        return gs;
    }

    /**
     * Définit la valeur de la propriété gs.
     *
     * @param value allowed object is {@link String }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setGS(String value) {
        this.gs = value;
    }

}
