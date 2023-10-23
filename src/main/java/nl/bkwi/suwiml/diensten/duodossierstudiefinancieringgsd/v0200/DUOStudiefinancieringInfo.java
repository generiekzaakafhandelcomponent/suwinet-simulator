
package nl.bkwi.suwiml.diensten.duodossierstudiefinancieringgsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "burgerservicenr"
})
@XmlRootElement(name = "DUOStudiefinancieringInfo")
public class DUOStudiefinancieringInfo {

    @XmlElement(name = "Burgerservicenr", required = true)
    protected String burgerservicenr;

    /**
     * Gets the value of the burgerservicenr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBurgerservicenr() {
        return burgerservicenr;
    }

    /**
     * Sets the value of the burgerservicenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBurgerservicenr(String value) {
        this.burgerservicenr = value;
    }

}
