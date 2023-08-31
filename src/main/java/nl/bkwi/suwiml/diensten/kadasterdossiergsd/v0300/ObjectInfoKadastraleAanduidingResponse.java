
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <sequence>
 *           <element name="OnroerendeZaak" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}KadastraalObject" maxOccurs="unbounded"/>
 *           <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}FWI" minOccurs="0"/>
 *         </sequence>
 *         <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}FWI"/>
 *         <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}NietsGevonden"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "ObjectInfoKadastraleAanduidingResponse")
public class ObjectInfoKadastraleAanduidingResponse {

    @XmlElementRefs({
        @XmlElementRef(name = "OnroerendeZaak", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FWI", namespace = "http://bkwi.nl/SuwiML/FWI/v0205", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NietsGevonden", namespace = "http://bkwi.nl/SuwiML/FWI/v0205", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "FWI" is used by two different parts of a schema. See: 
     * line 38 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyReaction.xsd
     * line 36 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyReaction.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names:Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link KadastraalObject }{@code >}
     * {@link JAXBElement }{@code <}{@link FWI }{@code >}
     * 
     * 
     * @return
     *     The value of the content property.
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

}
