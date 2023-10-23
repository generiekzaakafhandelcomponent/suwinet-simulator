
package nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultaatExamen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResultaatExamen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdResultaatExamen" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdResultaatExamen"/>
 *         <element name="DatResultaatExamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="JaarAfgelegdExamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}JaartalN4"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultaatExamen", propOrder = {
    "cdResultaatExamen",
    "datResultaatExamen",
    "jaarAfgelegdExamen"
})
public class ResultaatExamen {

    @XmlElement(name = "CdResultaatExamen", required = true)
    protected String cdResultaatExamen;
    @XmlElement(name = "DatResultaatExamen")
    protected String datResultaatExamen;
    @XmlElement(name = "JaarAfgelegdExamen", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger jaarAfgelegdExamen;

    /**
     * Gets the value of the cdResultaatExamen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdResultaatExamen() {
        return cdResultaatExamen;
    }

    /**
     * Sets the value of the cdResultaatExamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdResultaatExamen(String value) {
        this.cdResultaatExamen = value;
    }

    /**
     * Gets the value of the datResultaatExamen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatResultaatExamen() {
        return datResultaatExamen;
    }

    /**
     * Sets the value of the datResultaatExamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatResultaatExamen(String value) {
        this.datResultaatExamen = value;
    }

    /**
     * Gets the value of the jaarAfgelegdExamen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJaarAfgelegdExamen() {
        return jaarAfgelegdExamen;
    }

    /**
     * Sets the value of the jaarAfgelegdExamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJaarAfgelegdExamen(BigInteger value) {
        this.jaarAfgelegdExamen = value;
    }

}
