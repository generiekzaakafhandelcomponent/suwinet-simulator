
package nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartnerBijstand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartnerBijstand">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr"/>
 *         <element name="Voorletters" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorletters" minOccurs="0"/>
 *         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
 *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *         <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerBijstand", propOrder = {
    "burgerservicenr",
    "voorletters",
    "voorvoegsel",
    "significantDeelVanDeAchternaam",
    "geboortedat"
})
@XmlSeeAlso({
    nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500.BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.PartnerAanvraagUitkering.class,
    nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500.BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.PartnerBijzBijstand.class,
    nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500.BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.PartnerUitkeringsverhouding.class
})
public class PartnerBijstand {

    @XmlElement(name = "Burgerservicenr", required = true)
    protected String burgerservicenr;
    @XmlElement(name = "Voorletters")
    protected String voorletters;
    @XmlElement(name = "Voorvoegsel")
    protected String voorvoegsel;
    @XmlElement(name = "SignificantDeelVanDeAchternaam")
    protected String significantDeelVanDeAchternaam;
    @XmlElement(name = "Geboortedat")
    protected String geboortedat;

    /**
     * Gets the value of the burgerservicenr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBurgerservicenr() {
        return burgerservicenr;
    }

    /**
     * Sets the value of the burgerservicenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBurgerservicenr(String value) {
        this.burgerservicenr = value;
    }

    /**
     * Gets the value of the voorletters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoorletters() {
        return voorletters;
    }

    /**
     * Sets the value of the voorletters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoorletters(String value) {
        this.voorletters = value;
    }

    /**
     * Gets the value of the voorvoegsel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoorvoegsel() {
        return voorvoegsel;
    }

    /**
     * Sets the value of the voorvoegsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoorvoegsel(String value) {
        this.voorvoegsel = value;
    }

    /**
     * Gets the value of the significantDeelVanDeAchternaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificantDeelVanDeAchternaam() {
        return significantDeelVanDeAchternaam;
    }

    /**
     * Sets the value of the significantDeelVanDeAchternaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificantDeelVanDeAchternaam(String value) {
        this.significantDeelVanDeAchternaam = value;
    }

    /**
     * Gets the value of the geboortedat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeboortedat() {
        return geboortedat;
    }

    /**
     * Sets the value of the geboortedat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeboortedat(String value) {
        this.geboortedat = value;
    }

}
