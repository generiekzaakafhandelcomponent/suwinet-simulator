
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificatieRni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VerificatieRni">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatVerificatieRni" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="OmsVerificatieRni" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificatieRni", propOrder = {
    "datVerificatieRni",
    "omsVerificatieRni"
})
public class VerificatieRni {

    @XmlElement(name = "DatVerificatieRni")
    protected String datVerificatieRni;
    @XmlElement(name = "OmsVerificatieRni")
    protected String omsVerificatieRni;

    /**
     * Gets the value of the datVerificatieRni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatVerificatieRni() {
        return datVerificatieRni;
    }

    /**
     * Sets the value of the datVerificatieRni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatVerificatieRni(String value) {
        this.datVerificatieRni = value;
    }

    /**
     * Gets the value of the omsVerificatieRni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmsVerificatieRni() {
        return omsVerificatieRni;
    }

    /**
     * Sets the value of the omsVerificatieRni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmsVerificatieRni(String value) {
        this.omsVerificatieRni = value;
    }

}
