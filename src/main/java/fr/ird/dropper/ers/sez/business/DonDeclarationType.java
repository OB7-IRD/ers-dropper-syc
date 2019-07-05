//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.04 à 06:18:33 PM MUT 
//
package fr.ird.dropper.ers.sez.business;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Donor Vessel(s): Donor vessel(s) identification. For transfer under BFT
 * rules, fill out BTI instead. 1.1-2.0: Donor vessel(s). One of REC or DON must
 * be referring to "this vessel", meaning the one identified in the LOG
 * super-element. Required unless reporting under ICCAT BFT rules.
 *
 *
 * <p>
 * Classe Java pour DonDeclarationType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="DonDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PFP" type="{http://ec.europa.eu/fisheries/schema/ers/v3}PfpDeclarationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DonDeclarationType", propOrder = {
    "pfp"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
public class DonDeclarationType {

    @XmlElement(name = "PFP", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    protected PfpDeclarationType pfp;

    /**
     * Obtient la valeur de la propriété pfp.
     *
     * @return possible object is {@link PfpDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public PfpDeclarationType getPFP() {
        return pfp;
    }

    /**
     * Définit la valeur de la propriété pfp.
     *
     * @param value allowed object is {@link PfpDeclarationType }
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-04T06:18:33+04:00", comments = "JAXB RI v2.3.0")
    public void setPFP(PfpDeclarationType value) {
        this.pfp = value;
    }

}
