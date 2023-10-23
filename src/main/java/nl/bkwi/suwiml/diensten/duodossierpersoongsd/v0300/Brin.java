
package nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Brin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Brin">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BrinNr" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}BrinNr"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Brin", propOrder = {
    "brinNr"
})
public class Brin {

    @XmlElement(name = "BrinNr", required = true)
    protected String brinNr;

    /**
     * Gets the value of the brinNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrinNr() {
        return brinNr;
    }

    /**
     * Sets the value of the brinNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrinNr(String value) {
        this.brinNr = value;
    }

}
