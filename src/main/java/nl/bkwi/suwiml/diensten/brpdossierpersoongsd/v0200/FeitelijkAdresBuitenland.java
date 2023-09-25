
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeitelijkAdresBuitenland complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FeitelijkAdresBuitenland">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatBAdresBuitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="LandAdresBuitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdLandGba" minOccurs="0"/>
 *         <element name="Adresregel1Buitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
 *         <element name="Adresregel2Buitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
 *         <element name="Adresregel3Buitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeitelijkAdresBuitenland", propOrder = {
    "datBAdresBuitenland",
    "landAdresBuitenland",
    "adresregel1Buitenland",
    "adresregel2Buitenland",
    "adresregel3Buitenland"
})
public class FeitelijkAdresBuitenland {

    @XmlElement(name = "DatBAdresBuitenland")
    protected String datBAdresBuitenland;
    @XmlElement(name = "LandAdresBuitenland")
    protected String landAdresBuitenland;
    @XmlElement(name = "Adresregel1Buitenland")
    protected String adresregel1Buitenland;
    @XmlElement(name = "Adresregel2Buitenland")
    protected String adresregel2Buitenland;
    @XmlElement(name = "Adresregel3Buitenland")
    protected String adresregel3Buitenland;

    /**
     * Gets the value of the datBAdresBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatBAdresBuitenland() {
        return datBAdresBuitenland;
    }

    /**
     * Sets the value of the datBAdresBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatBAdresBuitenland(String value) {
        this.datBAdresBuitenland = value;
    }

    /**
     * Gets the value of the landAdresBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandAdresBuitenland() {
        return landAdresBuitenland;
    }

    /**
     * Sets the value of the landAdresBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandAdresBuitenland(String value) {
        this.landAdresBuitenland = value;
    }

    /**
     * Gets the value of the adresregel1Buitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresregel1Buitenland() {
        return adresregel1Buitenland;
    }

    /**
     * Sets the value of the adresregel1Buitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresregel1Buitenland(String value) {
        this.adresregel1Buitenland = value;
    }

    /**
     * Gets the value of the adresregel2Buitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresregel2Buitenland() {
        return adresregel2Buitenland;
    }

    /**
     * Sets the value of the adresregel2Buitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresregel2Buitenland(String value) {
        this.adresregel2Buitenland = value;
    }

    /**
     * Gets the value of the adresregel3Buitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresregel3Buitenland() {
        return adresregel3Buitenland;
    }

    /**
     * Sets the value of the adresregel3Buitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresregel3Buitenland(String value) {
        this.adresregel3Buitenland = value;
    }

}
