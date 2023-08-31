
package nl.bkwi.suwiml.fwi.v0205;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FWI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FWI">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice maxOccurs="unbounded">
 *           <element name="Fout" type="{http://bkwi.nl/SuwiML/FWI/v0205}Melding"/>
 *           <element name="Waarschuwing" type="{http://bkwi.nl/SuwiML/FWI/v0205}Melding"/>
 *           <element name="Informatie" type="{http://bkwi.nl/SuwiML/FWI/v0205}Melding"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FWI", propOrder = {
    "foutOrWaarschuwingOrInformatie"
})
public class FWI {

    @XmlElementRefs({
        @XmlElementRef(name = "Fout", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Waarschuwing", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Informatie", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<Melding>> foutOrWaarschuwingOrInformatie;

    /**
     * Gets the value of the foutOrWaarschuwingOrInformatie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the foutOrWaarschuwingOrInformatie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoutOrWaarschuwingOrInformatie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Melding }{@code >}
     * {@link JAXBElement }{@code <}{@link Melding }{@code >}
     * {@link JAXBElement }{@code <}{@link Melding }{@code >}
     * 
     * 
     * @return
     *     The value of the foutOrWaarschuwingOrInformatie property.
     */
    public List<JAXBElement<Melding>> getFoutOrWaarschuwingOrInformatie() {
        if (foutOrWaarschuwingOrInformatie == null) {
            foutOrWaarschuwingOrInformatie = new ArrayList<>();
        }
        return this.foutOrWaarschuwingOrInformatie;
    }

}
