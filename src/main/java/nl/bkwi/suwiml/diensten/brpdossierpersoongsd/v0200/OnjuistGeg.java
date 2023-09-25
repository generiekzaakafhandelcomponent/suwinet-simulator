
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnjuistGeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OnjuistGeg">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdOnjuistStrijdigMetOpenbareOrde" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}CdOnjuistStrijdigMetOpenbareOrde" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnjuistGeg", propOrder = {
    "cdOnjuistStrijdigMetOpenbareOrde"
})
public class OnjuistGeg {

    @XmlElement(name = "CdOnjuistStrijdigMetOpenbareOrde")
    protected String cdOnjuistStrijdigMetOpenbareOrde;

    /**
     * Gets the value of the cdOnjuistStrijdigMetOpenbareOrde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdOnjuistStrijdigMetOpenbareOrde() {
        return cdOnjuistStrijdigMetOpenbareOrde;
    }

    /**
     * Sets the value of the cdOnjuistStrijdigMetOpenbareOrde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdOnjuistStrijdigMetOpenbareOrde(String value) {
        this.cdOnjuistStrijdigMetOpenbareOrde = value;
    }

}
