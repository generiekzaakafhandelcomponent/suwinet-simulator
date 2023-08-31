
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneriekAdresBuitenland complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GeneriekAdresBuitenland">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Adresregel1Buitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
 *         <element name="Adresregel2Buitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
 *         <element name="Adresregel3Buitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
 *         <element name="Landsnaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresBuitenlandAN40" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneriekAdresBuitenland", propOrder = {
    "adresregel1Buitenland",
    "adresregel2Buitenland",
    "adresregel3Buitenland",
    "landsnaam"
})
public class GeneriekAdresBuitenland {

    @XmlElement(name = "Adresregel1Buitenland")
    protected String adresregel1Buitenland;
    @XmlElement(name = "Adresregel2Buitenland")
    protected String adresregel2Buitenland;
    @XmlElement(name = "Adresregel3Buitenland")
    protected String adresregel3Buitenland;
    @XmlElement(name = "Landsnaam")
    protected String landsnaam;

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

    /**
     * Gets the value of the landsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandsnaam() {
        return landsnaam;
    }

    /**
     * Sets the value of the landsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandsnaam(String value) {
        this.landsnaam = value;
    }

}
