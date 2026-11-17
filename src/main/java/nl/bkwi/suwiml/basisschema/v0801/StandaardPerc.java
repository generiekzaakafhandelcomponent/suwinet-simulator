
package nl.bkwi.suwiml.basisschema.v0801;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandaardPerc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandaardPerc">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdPositiefNegatief" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdPositiefNegatief" minOccurs="0"/>
 *         <element name="Percentage" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Percentage" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandaardPerc", propOrder = {
    "cdPositiefNegatief",
    "percentage"
})
public class StandaardPerc {

    @XmlElement(name = "CdPositiefNegatief")
    protected String cdPositiefNegatief;
    @XmlElement(name = "Percentage")
    protected String percentage;

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
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage(String value) {
        this.percentage = value;
    }

}
