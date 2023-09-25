
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Geldigheid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Geldigheid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatGeldigheidGegevens" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geldigheid", propOrder = {
    "datGeldigheidGegevens"
})
public class Geldigheid {

    @XmlElement(name = "DatGeldigheidGegevens", required = true)
    protected String datGeldigheidGegevens;

    /**
     * Gets the value of the datGeldigheidGegevens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatGeldigheidGegevens() {
        return datGeldigheidGegevens;
    }

    /**
     * Sets the value of the datGeldigheidGegevens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatGeldigheidGegevens(String value) {
        this.datGeldigheidGegevens = value;
    }

}
