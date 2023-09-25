
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientSuwiHistorisch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClientSuwiHistorisch">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
 *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *         <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr" minOccurs="0"/>
 *         <element name="ANr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}ANr" minOccurs="0"/>
 *         <element name="OnderzoekGegPersoon" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnderzoekGeg" minOccurs="0"/>
 *         <element name="OnjuistGegPersoon" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnjuistGeg" minOccurs="0"/>
 *         <element name="GeldigheidGegevensPersoon" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Geldigheid" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientSuwiHistorisch", propOrder = {
    "voornamen",
    "voorvoegsel",
    "significantDeelVanDeAchternaam",
    "geboortedat",
    "burgerservicenr",
    "aNr",
    "onderzoekGegPersoon",
    "onjuistGegPersoon",
    "geldigheidGegevensPersoon"
})
public class ClientSuwiHistorisch {

    @XmlElement(name = "Voornamen")
    protected String voornamen;
    @XmlElement(name = "Voorvoegsel")
    protected String voorvoegsel;
    @XmlElement(name = "SignificantDeelVanDeAchternaam")
    protected String significantDeelVanDeAchternaam;
    @XmlElement(name = "Geboortedat")
    protected String geboortedat;
    @XmlElement(name = "Burgerservicenr")
    protected String burgerservicenr;
    @XmlElement(name = "ANr")
    protected String aNr;
    @XmlElement(name = "OnderzoekGegPersoon")
    protected OnderzoekGeg onderzoekGegPersoon;
    @XmlElement(name = "OnjuistGegPersoon")
    protected OnjuistGeg onjuistGegPersoon;
    @XmlElement(name = "GeldigheidGegevensPersoon")
    protected Geldigheid geldigheidGegevensPersoon;

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
     * Gets the value of the aNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANr() {
        return aNr;
    }

    /**
     * Sets the value of the aNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANr(String value) {
        this.aNr = value;
    }

    /**
     * Gets the value of the onderzoekGegPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link OnderzoekGeg }
     *     
     */
    public OnderzoekGeg getOnderzoekGegPersoon() {
        return onderzoekGegPersoon;
    }

    /**
     * Sets the value of the onderzoekGegPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnderzoekGeg }
     *     
     */
    public void setOnderzoekGegPersoon(OnderzoekGeg value) {
        this.onderzoekGegPersoon = value;
    }

    /**
     * Gets the value of the onjuistGegPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link OnjuistGeg }
     *     
     */
    public OnjuistGeg getOnjuistGegPersoon() {
        return onjuistGegPersoon;
    }

    /**
     * Sets the value of the onjuistGegPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnjuistGeg }
     *     
     */
    public void setOnjuistGegPersoon(OnjuistGeg value) {
        this.onjuistGegPersoon = value;
    }

    /**
     * Gets the value of the geldigheidGegevensPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link Geldigheid }
     *     
     */
    public Geldigheid getGeldigheidGegevensPersoon() {
        return geldigheidGegevensPersoon;
    }

    /**
     * Sets the value of the geldigheidGegevensPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geldigheid }
     *     
     */
    public void setGeldigheidGegevensPersoon(Geldigheid value) {
        this.geldigheidGegevensPersoon = value;
    }

}
