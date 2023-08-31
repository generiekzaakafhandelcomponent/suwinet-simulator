
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZakelijkRecht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ZakelijkRecht">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OmsZakelijkRecht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN200" minOccurs="0"/>
 *         <element name="DatEZakelijkRecht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZakelijkRecht", propOrder = {
    "omsZakelijkRecht",
    "datEZakelijkRecht"
})
public class ZakelijkRecht {

    @XmlElement(name = "OmsZakelijkRecht")
    protected String omsZakelijkRecht;
    @XmlElement(name = "DatEZakelijkRecht")
    protected String datEZakelijkRecht;

    /**
     * Gets the value of the omsZakelijkRecht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmsZakelijkRecht() {
        return omsZakelijkRecht;
    }

    /**
     * Sets the value of the omsZakelijkRecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmsZakelijkRecht(String value) {
        this.omsZakelijkRecht = value;
    }

    /**
     * Gets the value of the datEZakelijkRecht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatEZakelijkRecht() {
        return datEZakelijkRecht;
    }

    /**
     * Sets the value of the datEZakelijkRecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatEZakelijkRecht(String value) {
        this.datEZakelijkRecht = value;
    }

}
