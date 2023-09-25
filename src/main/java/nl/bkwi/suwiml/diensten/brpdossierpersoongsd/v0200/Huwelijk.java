
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Huwelijk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Huwelijk">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatHuwelijkssluiting" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="OnderzoekGegHuwelijk" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnderzoekGeg" minOccurs="0"/>
 *         <element name="Partner" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Partner" minOccurs="0"/>
 *         <element name="CdGemeenteHuwelijkssluiting" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdGemeenteGba" minOccurs="0"/>
 *         <element name="PlaatsHuwelijkssluiting" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN40" minOccurs="0"/>
 *         <element name="LandHuwelijkssluiting" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdLandGba" minOccurs="0"/>
 *         <element name="DatOntbindingHuwelijk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="CdGemeenteOntbindingHuwelijk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdGemeenteGba" minOccurs="0"/>
 *         <element name="PlaatsOntbindingHuwelijk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN40" minOccurs="0"/>
 *         <element name="LandOntbindingHuwelijk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdLandGba" minOccurs="0"/>
 *         <element name="CdRedenOntbindingHuwelijk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRedenOntbindingHuwelijk" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Huwelijk", propOrder = {
    "datHuwelijkssluiting",
    "onderzoekGegHuwelijk",
    "partner",
    "cdGemeenteHuwelijkssluiting",
    "plaatsHuwelijkssluiting",
    "landHuwelijkssluiting",
    "datOntbindingHuwelijk",
    "cdGemeenteOntbindingHuwelijk",
    "plaatsOntbindingHuwelijk",
    "landOntbindingHuwelijk",
    "cdRedenOntbindingHuwelijk"
})
public class Huwelijk {

    @XmlElement(name = "DatHuwelijkssluiting")
    protected String datHuwelijkssluiting;
    @XmlElement(name = "OnderzoekGegHuwelijk")
    protected OnderzoekGeg onderzoekGegHuwelijk;
    @XmlElement(name = "Partner")
    protected Partner partner;
    @XmlElement(name = "CdGemeenteHuwelijkssluiting")
    protected String cdGemeenteHuwelijkssluiting;
    @XmlElement(name = "PlaatsHuwelijkssluiting")
    protected String plaatsHuwelijkssluiting;
    @XmlElement(name = "LandHuwelijkssluiting")
    protected String landHuwelijkssluiting;
    @XmlElement(name = "DatOntbindingHuwelijk")
    protected String datOntbindingHuwelijk;
    @XmlElement(name = "CdGemeenteOntbindingHuwelijk")
    protected String cdGemeenteOntbindingHuwelijk;
    @XmlElement(name = "PlaatsOntbindingHuwelijk")
    protected String plaatsOntbindingHuwelijk;
    @XmlElement(name = "LandOntbindingHuwelijk")
    protected String landOntbindingHuwelijk;
    @XmlElement(name = "CdRedenOntbindingHuwelijk")
    protected String cdRedenOntbindingHuwelijk;

    /**
     * Gets the value of the datHuwelijkssluiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatHuwelijkssluiting() {
        return datHuwelijkssluiting;
    }

    /**
     * Sets the value of the datHuwelijkssluiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatHuwelijkssluiting(String value) {
        this.datHuwelijkssluiting = value;
    }

    /**
     * Gets the value of the onderzoekGegHuwelijk property.
     * 
     * @return
     *     possible object is
     *     {@link OnderzoekGeg }
     *     
     */
    public OnderzoekGeg getOnderzoekGegHuwelijk() {
        return onderzoekGegHuwelijk;
    }

    /**
     * Sets the value of the onderzoekGegHuwelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnderzoekGeg }
     *     
     */
    public void setOnderzoekGegHuwelijk(OnderzoekGeg value) {
        this.onderzoekGegHuwelijk = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link Partner }
     *     
     */
    public Partner getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Partner }
     *     
     */
    public void setPartner(Partner value) {
        this.partner = value;
    }

    /**
     * Gets the value of the cdGemeenteHuwelijkssluiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGemeenteHuwelijkssluiting() {
        return cdGemeenteHuwelijkssluiting;
    }

    /**
     * Sets the value of the cdGemeenteHuwelijkssluiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGemeenteHuwelijkssluiting(String value) {
        this.cdGemeenteHuwelijkssluiting = value;
    }

    /**
     * Gets the value of the plaatsHuwelijkssluiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaatsHuwelijkssluiting() {
        return plaatsHuwelijkssluiting;
    }

    /**
     * Sets the value of the plaatsHuwelijkssluiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaatsHuwelijkssluiting(String value) {
        this.plaatsHuwelijkssluiting = value;
    }

    /**
     * Gets the value of the landHuwelijkssluiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandHuwelijkssluiting() {
        return landHuwelijkssluiting;
    }

    /**
     * Sets the value of the landHuwelijkssluiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandHuwelijkssluiting(String value) {
        this.landHuwelijkssluiting = value;
    }

    /**
     * Gets the value of the datOntbindingHuwelijk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatOntbindingHuwelijk() {
        return datOntbindingHuwelijk;
    }

    /**
     * Sets the value of the datOntbindingHuwelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatOntbindingHuwelijk(String value) {
        this.datOntbindingHuwelijk = value;
    }

    /**
     * Gets the value of the cdGemeenteOntbindingHuwelijk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGemeenteOntbindingHuwelijk() {
        return cdGemeenteOntbindingHuwelijk;
    }

    /**
     * Sets the value of the cdGemeenteOntbindingHuwelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGemeenteOntbindingHuwelijk(String value) {
        this.cdGemeenteOntbindingHuwelijk = value;
    }

    /**
     * Gets the value of the plaatsOntbindingHuwelijk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaatsOntbindingHuwelijk() {
        return plaatsOntbindingHuwelijk;
    }

    /**
     * Sets the value of the plaatsOntbindingHuwelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaatsOntbindingHuwelijk(String value) {
        this.plaatsOntbindingHuwelijk = value;
    }

    /**
     * Gets the value of the landOntbindingHuwelijk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandOntbindingHuwelijk() {
        return landOntbindingHuwelijk;
    }

    /**
     * Sets the value of the landOntbindingHuwelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandOntbindingHuwelijk(String value) {
        this.landOntbindingHuwelijk = value;
    }

    /**
     * Gets the value of the cdRedenOntbindingHuwelijk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdRedenOntbindingHuwelijk() {
        return cdRedenOntbindingHuwelijk;
    }

    /**
     * Sets the value of the cdRedenOntbindingHuwelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdRedenOntbindingHuwelijk(String value) {
        this.cdRedenOntbindingHuwelijk = value;
    }

}
