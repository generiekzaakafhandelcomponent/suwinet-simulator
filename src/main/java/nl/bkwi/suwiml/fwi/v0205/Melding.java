
package nl.bkwi.suwiml.fwi.v0205;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Melding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Melding">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Tekst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Detail" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Bron">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="DN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Melding", propOrder = {
    "code",
    "tekst",
    "detail",
    "bron"
})
public class Melding {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Tekst", required = true)
    protected String tekst;
    @XmlElement(name = "Detail")
    protected List<String> detail;
    @XmlElement(name = "Bron", required = true)
    protected Melding.Bron bron;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the tekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTekst() {
        return tekst;
    }

    /**
     * Sets the value of the tekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTekst(String value) {
        this.tekst = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the detail property.
     */
    public List<String> getDetail() {
        if (detail == null) {
            detail = new ArrayList<>();
        }
        return this.detail;
    }

    /**
     * Gets the value of the bron property.
     * 
     * @return
     *     possible object is
     *     {@link Melding.Bron }
     *     
     */
    public Melding.Bron getBron() {
        return bron;
    }

    /**
     * Sets the value of the bron property.
     * 
     * @param value
     *     allowed object is
     *     {@link Melding.Bron }
     *     
     */
    public void setBron(Melding.Bron value) {
        this.bron = value;
    }


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
     *         <element name="DN" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "dn"
    })
    public static class Bron {

        @XmlElement(name = "DN", required = true)
        protected String dn;

        /**
         * Gets the value of the dn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDN() {
            return dn;
        }

        /**
         * Sets the value of the dn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDN(String value) {
            this.dn = value;
        }

    }

}
