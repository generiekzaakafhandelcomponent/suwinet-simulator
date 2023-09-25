
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitulatuurKind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TitulatuurKind">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdAdellijkeTitelPredikaat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAdellijkeTitelPredikaatNed"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitulatuurKind", propOrder = {
    "cdAdellijkeTitelPredikaat"
})
public class TitulatuurKind {

    @XmlElement(name = "CdAdellijkeTitelPredikaat", required = true)
    protected String cdAdellijkeTitelPredikaat;

    /**
     * Gets the value of the cdAdellijkeTitelPredikaat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAdellijkeTitelPredikaat() {
        return cdAdellijkeTitelPredikaat;
    }

    /**
     * Sets the value of the cdAdellijkeTitelPredikaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAdellijkeTitelPredikaat(String value) {
        this.cdAdellijkeTitelPredikaat = value;
    }

}
