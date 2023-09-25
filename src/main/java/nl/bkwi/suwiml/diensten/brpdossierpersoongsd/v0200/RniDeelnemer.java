
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RniDeelnemer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RniDeelnemer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdRniDeelnemer" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}CdRniDeelnemer" minOccurs="0"/>
 *         <element name="OmsVerdragRniDeelnemer" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RniDeelnemer", propOrder = {
    "cdRniDeelnemer",
    "omsVerdragRniDeelnemer"
})
public class RniDeelnemer {

    @XmlElement(name = "CdRniDeelnemer")
    protected String cdRniDeelnemer;
    @XmlElement(name = "OmsVerdragRniDeelnemer")
    protected String omsVerdragRniDeelnemer;

    /**
     * Gets the value of the cdRniDeelnemer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdRniDeelnemer() {
        return cdRniDeelnemer;
    }

    /**
     * Sets the value of the cdRniDeelnemer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdRniDeelnemer(String value) {
        this.cdRniDeelnemer = value;
    }

    /**
     * Gets the value of the omsVerdragRniDeelnemer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmsVerdragRniDeelnemer() {
        return omsVerdragRniDeelnemer;
    }

    /**
     * Sets the value of the omsVerdragRniDeelnemer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmsVerdragRniDeelnemer(String value) {
        this.omsVerdragRniDeelnemer = value;
    }

}
