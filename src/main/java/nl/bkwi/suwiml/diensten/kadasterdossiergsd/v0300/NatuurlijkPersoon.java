
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NatuurlijkPersoon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NatuurlijkPersoon">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr" minOccurs="0"/>
 *         <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
 *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *         <element name="Geslacht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Geslacht" minOccurs="0"/>
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
@XmlType(name = "NatuurlijkPersoon", propOrder = {
    "burgerservicenr",
    "voornamen",
    "voorvoegsel",
    "significantDeelVanDeAchternaam",
    "geslacht",
    "geboortedat"
})
public class NatuurlijkPersoon {

    @XmlElement(name = "Burgerservicenr")
    protected String burgerservicenr;
    @XmlElement(name = "Voornamen")
    protected String voornamen;
    @XmlElement(name = "Voorvoegsel")
    protected String voorvoegsel;
    @XmlElement(name = "SignificantDeelVanDeAchternaam")
    protected String significantDeelVanDeAchternaam;
    @XmlElement(name = "Geslacht")
    protected String geslacht;
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
     * Gets the value of the voornamen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoornamen() {
        return voornamen;
    }

    /**
     * Sets the value of the voornamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoornamen(String value) {
        this.voornamen = value;
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
     * Gets the value of the geslacht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeslacht() {
        return geslacht;
    }

    /**
     * Sets the value of the geslacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeslacht(String value) {
        this.geslacht = value;
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
