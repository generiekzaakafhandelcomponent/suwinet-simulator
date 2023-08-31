
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Locatie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Locatie">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StraatadresBag" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}StraatadresBag"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Locatie", propOrder = {
    "straatadresBag"
})
public class Locatie {

    @XmlElement(name = "StraatadresBag", required = true)
    protected StraatadresBag straatadresBag;

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

}
