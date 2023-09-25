
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Overlijden complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Overlijden">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatOverlijden" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="OnderzoekGegOverlijden" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnderzoekGeg" minOccurs="0"/>
 *         <element name="CdGemeenteOverlijden" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdGemeenteGba" minOccurs="0"/>
 *         <element name="PlaatsOverlijden" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN40" minOccurs="0"/>
 *         <element name="LandOverlijden" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdLandGba" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Overlijden", propOrder = {
    "datOverlijden",
    "onderzoekGegOverlijden",
    "cdGemeenteOverlijden",
    "plaatsOverlijden",
    "landOverlijden"
})
public class Overlijden {

    @XmlElement(name = "DatOverlijden")
    protected String datOverlijden;
    @XmlElement(name = "OnderzoekGegOverlijden")
    protected OnderzoekGeg onderzoekGegOverlijden;
    @XmlElement(name = "CdGemeenteOverlijden")
    protected String cdGemeenteOverlijden;
    @XmlElement(name = "PlaatsOverlijden")
    protected String plaatsOverlijden;
    @XmlElement(name = "LandOverlijden")
    protected String landOverlijden;

    /**
     * Gets the value of the datOverlijden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatOverlijden() {
        return datOverlijden;
    }

    /**
     * Sets the value of the datOverlijden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatOverlijden(String value) {
        this.datOverlijden = value;
    }

    /**
     * Gets the value of the onderzoekGegOverlijden property.
     * 
     * @return
     *     possible object is
     *     {@link OnderzoekGeg }
     *     
     */
    public OnderzoekGeg getOnderzoekGegOverlijden() {
        return onderzoekGegOverlijden;
    }

    /**
     * Sets the value of the onderzoekGegOverlijden property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnderzoekGeg }
     *     
     */
    public void setOnderzoekGegOverlijden(OnderzoekGeg value) {
        this.onderzoekGegOverlijden = value;
    }

    /**
     * Gets the value of the cdGemeenteOverlijden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGemeenteOverlijden() {
        return cdGemeenteOverlijden;
    }

    /**
     * Sets the value of the cdGemeenteOverlijden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGemeenteOverlijden(String value) {
        this.cdGemeenteOverlijden = value;
    }

    /**
     * Gets the value of the plaatsOverlijden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaatsOverlijden() {
        return plaatsOverlijden;
    }

    /**
     * Sets the value of the plaatsOverlijden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaatsOverlijden(String value) {
        this.plaatsOverlijden = value;
    }

    /**
     * Gets the value of the landOverlijden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandOverlijden() {
        return landOverlijden;
    }

    /**
     * Sets the value of the landOverlijden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandOverlijden(String value) {
        this.landOverlijden = value;
    }

}
