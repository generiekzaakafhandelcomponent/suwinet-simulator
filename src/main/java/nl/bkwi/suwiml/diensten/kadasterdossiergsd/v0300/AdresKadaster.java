
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdresKadaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdresKadaster">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="StraatadresBag" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}StraatadresBag"/>
 *         <element name="GeneriekAdresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}GeneriekAdresBuitenland"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdresKadaster", propOrder = {
    "straatadresBag",
    "generiekAdresBuitenland"
})
public class AdresKadaster {

    @XmlElement(name = "StraatadresBag")
    protected StraatadresBag straatadresBag;
    @XmlElement(name = "GeneriekAdresBuitenland")
    protected GeneriekAdresBuitenland generiekAdresBuitenland;

    /**
     * Gets the value of the straatadresBag property.
     * 
     * @return
     *     possible object is
     *     {@link StraatadresBag }
     *     
     */
    public StraatadresBag getStraatadresBag() {
        return straatadresBag;
    }

    /**
     * Sets the value of the straatadresBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link StraatadresBag }
     *     
     */
    public void setStraatadresBag(StraatadresBag value) {
        this.straatadresBag = value;
    }

    /**
     * Gets the value of the generiekAdresBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link GeneriekAdresBuitenland }
     *     
     */
    public GeneriekAdresBuitenland getGeneriekAdresBuitenland() {
        return generiekAdresBuitenland;
    }

    /**
     * Sets the value of the generiekAdresBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneriekAdresBuitenland }
     *     
     */
    public void setGeneriekAdresBuitenland(GeneriekAdresBuitenland value) {
        this.generiekAdresBuitenland = value;
    }

}
