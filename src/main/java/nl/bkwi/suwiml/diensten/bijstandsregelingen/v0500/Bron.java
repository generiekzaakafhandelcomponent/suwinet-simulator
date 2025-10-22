
package nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bron complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Bron">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdKolomSuwi"/>
 *         <element name="CdPartijSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdPartijSuwi"/>
 *         <element name="CdVestigingSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdVestigingSuwi" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bron", propOrder = {
    "cdKolomSuwi",
    "cdPartijSuwi",
    "cdVestigingSuwi"
})
public class Bron {

    @XmlElement(name = "CdKolomSuwi")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int cdKolomSuwi;
    @XmlElement(name = "CdPartijSuwi", required = true)
    protected String cdPartijSuwi;
    @XmlElement(name = "CdVestigingSuwi")
    protected String cdVestigingSuwi;

    /**
     * Gets the value of the cdKolomSuwi property.
     * 
     */
    public int getCdKolomSuwi() {
        return cdKolomSuwi;
    }

    /**
     * Sets the value of the cdKolomSuwi property.
     * 
     */
    public void setCdKolomSuwi(int value) {
        this.cdKolomSuwi = value;
    }

    /**
     * Gets the value of the cdPartijSuwi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPartijSuwi() {
        return cdPartijSuwi;
    }

    /**
     * Sets the value of the cdPartijSuwi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPartijSuwi(String value) {
        this.cdPartijSuwi = value;
    }

    /**
     * Gets the value of the cdVestigingSuwi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVestigingSuwi() {
        return cdVestigingSuwi;
    }

    /**
     * Sets the value of the cdVestigingSuwi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVestigingSuwi(String value) {
        this.cdVestigingSuwi = value;
    }

}
