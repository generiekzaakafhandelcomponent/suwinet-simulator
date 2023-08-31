
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientSuwiPersoonsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClientSuwiPersoonsInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr"/>
 *         <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
 *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *         <element name="Geslacht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Geslacht" minOccurs="0"/>
 *         <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="DomicilieAdres" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}AdresKadaster" minOccurs="0"/>
 *         <element name="Correspondentieadres" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}PostadresKadaster" minOccurs="0"/>
 *         <element name="DatToestandKadaster" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="DatFiatteringKadaster" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="Eigendom">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="IndEigendomOZVerleden" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN"/>
 *                   <element name="OnroerendeZaak" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}OnroerendeZaak" maxOccurs="unbounded"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientSuwiPersoonsInfo", propOrder = {
    "burgerservicenr",
    "voornamen",
    "voorvoegsel",
    "significantDeelVanDeAchternaam",
    "geslacht",
    "geboortedat",
    "domicilieAdres",
    "correspondentieadres",
    "datToestandKadaster",
    "datFiatteringKadaster",
    "eigendom"
})
public class ClientSuwiPersoonsInfo {

    @XmlElement(name = "Burgerservicenr", required = true)
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
    @XmlElement(name = "DomicilieAdres")
    protected AdresKadaster domicilieAdres;
    @XmlElement(name = "Correspondentieadres")
    protected PostadresKadaster correspondentieadres;
    @XmlElement(name = "DatToestandKadaster")
    protected String datToestandKadaster;
    @XmlElement(name = "DatFiatteringKadaster")
    protected String datFiatteringKadaster;
    @XmlElement(name = "Eigendom", required = true)
    protected ClientSuwiPersoonsInfo.Eigendom eigendom;

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

    /**
     * Gets the value of the domicilieAdres property.
     * 
     * @return
     *     possible object is
     *     {@link AdresKadaster }
     *     
     */
    public AdresKadaster getDomicilieAdres() {
        return domicilieAdres;
    }

    /**
     * Sets the value of the domicilieAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresKadaster }
     *     
     */
    public void setDomicilieAdres(AdresKadaster value) {
        this.domicilieAdres = value;
    }

    /**
     * Gets the value of the correspondentieadres property.
     * 
     * @return
     *     possible object is
     *     {@link PostadresKadaster }
     *     
     */
    public PostadresKadaster getCorrespondentieadres() {
        return correspondentieadres;
    }

    /**
     * Sets the value of the correspondentieadres property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostadresKadaster }
     *     
     */
    public void setCorrespondentieadres(PostadresKadaster value) {
        this.correspondentieadres = value;
    }

    /**
     * Gets the value of the datToestandKadaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatToestandKadaster() {
        return datToestandKadaster;
    }

    /**
     * Sets the value of the datToestandKadaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatToestandKadaster(String value) {
        this.datToestandKadaster = value;
    }

    /**
     * Gets the value of the datFiatteringKadaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatFiatteringKadaster() {
        return datFiatteringKadaster;
    }

    /**
     * Sets the value of the datFiatteringKadaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatFiatteringKadaster(String value) {
        this.datFiatteringKadaster = value;
    }

    /**
     * Gets the value of the eigendom property.
     * 
     * @return
     *     possible object is
     *     {@link ClientSuwiPersoonsInfo.Eigendom }
     *     
     */
    public ClientSuwiPersoonsInfo.Eigendom getEigendom() {
        return eigendom;
    }

    /**
     * Sets the value of the eigendom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientSuwiPersoonsInfo.Eigendom }
     *     
     */
    public void setEigendom(ClientSuwiPersoonsInfo.Eigendom value) {
        this.eigendom = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element name="IndEigendomOZVerleden" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN"/>
     *         <element name="OnroerendeZaak" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}OnroerendeZaak" maxOccurs="unbounded"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "indEigendomOZVerleden",
        "onroerendeZaak"
    })
    public static class Eigendom {

        @XmlElement(name = "IndEigendomOZVerleden")
        protected String indEigendomOZVerleden;
        @XmlElement(name = "OnroerendeZaak")
        protected List<OnroerendeZaak> onroerendeZaak;

        /**
         * Gets the value of the indEigendomOZVerleden property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndEigendomOZVerleden() {
            return indEigendomOZVerleden;
        }

        /**
         * Sets the value of the indEigendomOZVerleden property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndEigendomOZVerleden(String value) {
            this.indEigendomOZVerleden = value;
        }

        /**
         * Gets the value of the onroerendeZaak property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the onroerendeZaak property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnroerendeZaak().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OnroerendeZaak }
         * 
         * 
         * @return
         *     The value of the onroerendeZaak property.
         */
        public List<OnroerendeZaak> getOnroerendeZaak() {
            if (onroerendeZaak == null) {
                onroerendeZaak = new ArrayList<>();
            }
            return this.onroerendeZaak;
        }

    }

}
