
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Documentindicatie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Documentindicatie">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdAanvullendDocument" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAanvullendDocument" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documentindicatie", propOrder = {
    "cdAanvullendDocument"
})
public class Documentindicatie {

    @XmlElement(name = "CdAanvullendDocument")
    protected String cdAanvullendDocument;

    /**
     * Gets the value of the cdAanvullendDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAanvullendDocument() {
        return cdAanvullendDocument;
    }

    /**
     * Sets the value of the cdAanvullendDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAanvullendDocument(String value) {
        this.cdAanvullendDocument = value;
    }

}
