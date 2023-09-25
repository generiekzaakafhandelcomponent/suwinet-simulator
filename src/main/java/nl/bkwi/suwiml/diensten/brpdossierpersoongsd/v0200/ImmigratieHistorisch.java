
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImmigratieHistorisch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ImmigratieHistorisch">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatVestigingNederland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="LandVanwaarIngeschreven" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdLandGba" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmigratieHistorisch", propOrder = {
    "datVestigingNederland",
    "landVanwaarIngeschreven"
})
public class ImmigratieHistorisch {

    @XmlElement(name = "DatVestigingNederland")
    protected String datVestigingNederland;
    @XmlElement(name = "LandVanwaarIngeschreven")
    protected String landVanwaarIngeschreven;

    /**
     * Gets the value of the datVestigingNederland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatVestigingNederland() {
        return datVestigingNederland;
    }

    /**
     * Sets the value of the datVestigingNederland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatVestigingNederland(String value) {
        this.datVestigingNederland = value;
    }

    /**
     * Gets the value of the landVanwaarIngeschreven property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandVanwaarIngeschreven() {
        return landVanwaarIngeschreven;
    }

    /**
     * Sets the value of the landVanwaarIngeschreven property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandVanwaarIngeschreven(String value) {
        this.landVanwaarIngeschreven = value;
    }

}
