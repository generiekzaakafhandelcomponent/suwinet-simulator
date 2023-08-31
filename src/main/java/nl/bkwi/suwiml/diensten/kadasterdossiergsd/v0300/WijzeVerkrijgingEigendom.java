
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WijzeVerkrijgingEigendom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="WijzeVerkrijgingEigendom">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdWijzeVerkrijgingEigendom" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}CdWijzeVerkrijgingEigendom" minOccurs="0"/>
 *         <element name="DatVerkrijgingEigendom" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="DatToestandKadaster" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WijzeVerkrijgingEigendom", propOrder = {
    "cdWijzeVerkrijgingEigendom",
    "datVerkrijgingEigendom",
    "datToestandKadaster"
})
public class WijzeVerkrijgingEigendom {

    @XmlElement(name = "CdWijzeVerkrijgingEigendom")
    @XmlSchemaType(name = "string")
    protected CdWijzeVerkrijgingEigendom cdWijzeVerkrijgingEigendom;
    @XmlElement(name = "DatVerkrijgingEigendom")
    protected String datVerkrijgingEigendom;
    @XmlElement(name = "DatToestandKadaster")
    protected String datToestandKadaster;

    /**
     * Gets the value of the cdWijzeVerkrijgingEigendom property.
     * 
     * @return
     *     possible object is
     *     {@link CdWijzeVerkrijgingEigendom }
     *     
     */
    public CdWijzeVerkrijgingEigendom getCdWijzeVerkrijgingEigendom() {
        return cdWijzeVerkrijgingEigendom;
    }

    /**
     * Sets the value of the cdWijzeVerkrijgingEigendom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdWijzeVerkrijgingEigendom }
     *     
     */
    public void setCdWijzeVerkrijgingEigendom(CdWijzeVerkrijgingEigendom value) {
        this.cdWijzeVerkrijgingEigendom = value;
    }

    /**
     * Gets the value of the datVerkrijgingEigendom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatVerkrijgingEigendom() {
        return datVerkrijgingEigendom;
    }

    /**
     * Sets the value of the datVerkrijgingEigendom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatVerkrijgingEigendom(String value) {
        this.datVerkrijgingEigendom = value;
    }

    /**
     * Gets the value of the datToestandKadaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatToestandKadaster() {
        return datToestandKadaster;
    }

    /**
     * Sets the value of the datToestandKadaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatToestandKadaster(String value) {
        this.datToestandKadaster = value;
    }

}
