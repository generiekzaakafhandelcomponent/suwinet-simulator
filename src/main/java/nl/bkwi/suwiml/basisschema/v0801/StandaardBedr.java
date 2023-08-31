
package nl.bkwi.suwiml.basisschema.v0801;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandaardBedr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandaardBedr">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
 *         <element name="CdPositiefNegatief" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdPositiefNegatief" minOccurs="0"/>
 *         <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr" minOccurs="0"/>
 *         <element name="CdPeriodeEenheidGeldigheidBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdPeriode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandaardBedr", propOrder = {
    "cdMunteenheid",
    "cdPositiefNegatief",
    "waardeBedr",
    "cdPeriodeEenheidGeldigheidBedr"
})
public class StandaardBedr {

    @XmlElement(name = "CdMunteenheid")
    protected String cdMunteenheid;
    @XmlElement(name = "CdPositiefNegatief")
    protected String cdPositiefNegatief;
    @XmlElement(name = "WaardeBedr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger waardeBedr;
    @XmlElement(name = "CdPeriodeEenheidGeldigheidBedr")
    protected String cdPeriodeEenheidGeldigheidBedr;

    /**
     * Gets the value of the cdMunteenheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdMunteenheid() {
        return cdMunteenheid;
    }

    /**
     * Sets the value of the cdMunteenheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdMunteenheid(String value) {
        this.cdMunteenheid = value;
    }

    /**
     * Gets the value of the cdPositiefNegatief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPositiefNegatief() {
        return cdPositiefNegatief;
    }

    /**
     * Sets the value of the cdPositiefNegatief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPositiefNegatief(String value) {
        this.cdPositiefNegatief = value;
    }

    /**
     * Gets the value of the waardeBedr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaardeBedr() {
        return waardeBedr;
    }

    /**
     * Sets the value of the waardeBedr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaardeBedr(BigInteger value) {
        this.waardeBedr = value;
    }

    /**
     * Gets the value of the cdPeriodeEenheidGeldigheidBedr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPeriodeEenheidGeldigheidBedr() {
        return cdPeriodeEenheidGeldigheidBedr;
    }

    /**
     * Sets the value of the cdPeriodeEenheidGeldigheidBedr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPeriodeEenheidGeldigheidBedr(String value) {
        this.cdPeriodeEenheidGeldigheidBedr = value;
    }

}
