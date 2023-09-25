
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeitelijkAdresBuitenlandHistorisch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FeitelijkAdresBuitenlandHistorisch">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatBAdresBuitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="LandAdresBuitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdLandGba" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeitelijkAdresBuitenlandHistorisch", propOrder = {
    "datBAdresBuitenland",
    "landAdresBuitenland"
})
public class FeitelijkAdresBuitenlandHistorisch {

    @XmlElement(name = "DatBAdresBuitenland")
    protected String datBAdresBuitenland;
    @XmlElement(name = "LandAdresBuitenland")
    protected String landAdresBuitenland;

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

}
