
package nl.bkwi.suwiml.diensten.svbdossierpersoongsd.v0200;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *           <element name="ClientSuwi">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr"/>
 *                     <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *                     <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
 *                     <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *                     <element name="Geslacht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Geslacht" minOccurs="0"/>
 *                     <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                     <element name="Kind" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr" minOccurs="0"/>
 *                               <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *                               <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
 *                               <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *                               <element name="Geslacht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Geslacht" minOccurs="0"/>
 *                               <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                               <element name="IndKinderbijslag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndOnb" minOccurs="0"/>
 *                               <element name="SpecifiekeGegevensKinderbijslag" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdWoonsituatieKind" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdWoonsituatieKind" minOccurs="0"/>
 *                                         <element name="CdLandVerblijfKind" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}LandenCdIsoA2" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AanvraagUitkering" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DatAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                               <element name="SzWet">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="BeslissingOpAanvraagUitkering" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdBeslissingOpAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBeslissingOpAanvraagUitkering" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Uitkeringsverhouding" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DatBUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                               <element name="DatEUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="SzWet">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="SpecifiekeGegevensRemigratiewet" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdSrtRemigratievoorziening" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtRemigratievoorziening" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Uitkeringsperiode" maxOccurs="unbounded">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="DatBUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                                         <element name="DatEUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="SpecifiekeGegevensAow" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="IndPartnertoeslagAow" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                                                   <element name="PercToegekendeAow" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Percentage" minOccurs="0"/>
 *                                                 </sequence>
 *                                               </restriction>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                         <element name="BrutoUitkeringsbedr" maxOccurs="unbounded" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
 *                                                   <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr" minOccurs="0"/>
 *                                                   <element name="CdUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdUitkeringsperiode" minOccurs="0"/>
 *                                                   <element name="DatBBrutoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   <element name="DatEBrutoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                 </sequence>
 *                                               </restriction>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                         <element name="NettoUitkeringsbedr" maxOccurs="unbounded" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
 *                                                   <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr" minOccurs="0"/>
 *                                                   <element name="CdUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdUitkeringsperiode" minOccurs="0"/>
 *                                                   <element name="DatBNettoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   <element name="DatENettoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                 </sequence>
 *                                               </restriction>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
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
@XmlRootElement(name = "SVBPersoonsInfoResponse")
public class SVBPersoonsInfoResponse {

    @XmlElementRefs({
        @XmlElementRef(name = "ClientSuwi", type = JAXBElement.class, required = false),
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
     * line 131 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/SVBDossierPersoonGSD/Diensten/SVBDossierPersoonGSD/v0200-b01/BodyReaction.xsd
     * line 129 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/SVBDossierPersoonGSD/Diensten/SVBDossierPersoonGSD/v0200-b01/BodyReaction.xsd
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
     * {@link JAXBElement }{@code <}{@link SVBPersoonsInfoResponse.ClientSuwi }{@code >}
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
     *         <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
     *         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
     *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
     *         <element name="Geslacht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Geslacht" minOccurs="0"/>
     *         <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *         <element name="Kind" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr" minOccurs="0"/>
     *                   <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
     *                   <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
     *                   <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
     *                   <element name="Geslacht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Geslacht" minOccurs="0"/>
     *                   <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                   <element name="IndKinderbijslag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndOnb" minOccurs="0"/>
     *                   <element name="SpecifiekeGegevensKinderbijslag" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdWoonsituatieKind" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdWoonsituatieKind" minOccurs="0"/>
     *                             <element name="CdLandVerblijfKind" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}LandenCdIsoA2" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="AanvraagUitkering" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="DatAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                   <element name="SzWet">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="BeslissingOpAanvraagUitkering" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdBeslissingOpAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBeslissingOpAanvraagUitkering" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Uitkeringsverhouding" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="DatBUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                   <element name="DatEUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="SzWet">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="SpecifiekeGegevensRemigratiewet" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdSrtRemigratievoorziening" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtRemigratievoorziening" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Uitkeringsperiode" maxOccurs="unbounded">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="DatBUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                             <element name="DatEUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="SpecifiekeGegevensAow" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="IndPartnertoeslagAow" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                                       <element name="PercToegekendeAow" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Percentage" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="BrutoUitkeringsbedr" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
     *                                       <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr" minOccurs="0"/>
     *                                       <element name="CdUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdUitkeringsperiode" minOccurs="0"/>
     *                                       <element name="DatBBrutoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                       <element name="DatEBrutoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="NettoUitkeringsbedr" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
     *                                       <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr" minOccurs="0"/>
     *                                       <element name="CdUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdUitkeringsperiode" minOccurs="0"/>
     *                                       <element name="DatBNettoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                       <element name="DatENettoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
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
    @XmlType(name = "", propOrder = {
        "burgerservicenr",
        "voornamen",
        "voorvoegsel",
        "significantDeelVanDeAchternaam",
        "geslacht",
        "geboortedat",
        "kind",
        "aanvraagUitkering",
        "uitkeringsverhouding"
    })
    public static class ClientSuwi {

        @XmlElement(name = "Burgerservicenr", required = true)
        protected String burgerservicenr;
        @XmlElement(name = "Voornamen")
        protected String voornamen;
        @XmlElement(name = "Voorvoegsel")
        protected String voorvoegsel;
        @XmlElement(name = "SignificantDeelVanDeAchternaam")
        protected String significantDeelVanDeAchternaam;
        @XmlElement(name = "Geslacht")
        protected String geslacht;
        @XmlElement(name = "Geboortedat")
        protected String geboortedat;
        @XmlElement(name = "Kind")
        protected List<SVBPersoonsInfoResponse.ClientSuwi.Kind> kind;
        @XmlElement(name = "AanvraagUitkering")
        protected List<SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering> aanvraagUitkering;
        @XmlElement(name = "Uitkeringsverhouding")
        protected List<SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding> uitkeringsverhouding;

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

        /**
         * Gets the value of the voornamen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVoornamen() {
            return voornamen;
        }

        /**
         * Sets the value of the voornamen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVoornamen(String value) {
            this.voornamen = value;
        }

        /**
         * Gets the value of the voorvoegsel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVoorvoegsel() {
            return voorvoegsel;
        }

        /**
         * Sets the value of the voorvoegsel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVoorvoegsel(String value) {
            this.voorvoegsel = value;
        }

        /**
         * Gets the value of the significantDeelVanDeAchternaam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignificantDeelVanDeAchternaam() {
            return significantDeelVanDeAchternaam;
        }

        /**
         * Sets the value of the significantDeelVanDeAchternaam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignificantDeelVanDeAchternaam(String value) {
            this.significantDeelVanDeAchternaam = value;
        }

        /**
         * Gets the value of the geslacht property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeslacht() {
            return geslacht;
        }

        /**
         * Sets the value of the geslacht property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeslacht(String value) {
            this.geslacht = value;
        }

        /**
         * Gets the value of the geboortedat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeboortedat() {
            return geboortedat;
        }

        /**
         * Sets the value of the geboortedat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeboortedat(String value) {
            this.geboortedat = value;
        }

        /**
         * Gets the value of the kind property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the kind property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKind().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SVBPersoonsInfoResponse.ClientSuwi.Kind }
         * 
         * 
         * @return
         *     The value of the kind property.
         */
        public List<SVBPersoonsInfoResponse.ClientSuwi.Kind> getKind() {
            if (kind == null) {
                kind = new ArrayList<>();
            }
            return this.kind;
        }

        /**
         * Gets the value of the aanvraagUitkering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the aanvraagUitkering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAanvraagUitkering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering }
         * 
         * 
         * @return
         *     The value of the aanvraagUitkering property.
         */
        public List<SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering> getAanvraagUitkering() {
            if (aanvraagUitkering == null) {
                aanvraagUitkering = new ArrayList<>();
            }
            return this.aanvraagUitkering;
        }

        /**
         * Gets the value of the uitkeringsverhouding property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the uitkeringsverhouding property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUitkeringsverhouding().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding }
         * 
         * 
         * @return
         *     The value of the uitkeringsverhouding property.
         */
        public List<SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding> getUitkeringsverhouding() {
            if (uitkeringsverhouding == null) {
                uitkeringsverhouding = new ArrayList<>();
            }
            return this.uitkeringsverhouding;
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
         *         <element name="DatAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *         <element name="SzWet">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="BeslissingOpAanvraagUitkering" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdBeslissingOpAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBeslissingOpAanvraagUitkering" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "datAanvraagUitkering",
            "szWet",
            "beslissingOpAanvraagUitkering"
        })
        public static class AanvraagUitkering {

            @XmlElement(name = "DatAanvraagUitkering", required = true)
            protected String datAanvraagUitkering;
            @XmlElement(name = "SzWet", required = true)
            protected SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.SzWet szWet;
            @XmlElement(name = "BeslissingOpAanvraagUitkering")
            protected SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering beslissingOpAanvraagUitkering;

            /**
             * Gets the value of the datAanvraagUitkering property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatAanvraagUitkering() {
                return datAanvraagUitkering;
            }

            /**
             * Sets the value of the datAanvraagUitkering property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatAanvraagUitkering(String value) {
                this.datAanvraagUitkering = value;
            }

            /**
             * Gets the value of the szWet property.
             * 
             * @return
             *     possible object is
             *     {@link SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
             *     
             */
            public SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.SzWet getSzWet() {
                return szWet;
            }

            /**
             * Sets the value of the szWet property.
             * 
             * @param value
             *     allowed object is
             *     {@link SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
             *     
             */
            public void setSzWet(SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.SzWet value) {
                this.szWet = value;
            }

            /**
             * Gets the value of the beslissingOpAanvraagUitkering property.
             * 
             * @return
             *     possible object is
             *     {@link SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering }
             *     
             */
            public SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering getBeslissingOpAanvraagUitkering() {
                return beslissingOpAanvraagUitkering;
            }

            /**
             * Sets the value of the beslissingOpAanvraagUitkering property.
             * 
             * @param value
             *     allowed object is
             *     {@link SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering }
             *     
             */
            public void setBeslissingOpAanvraagUitkering(SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering value) {
                this.beslissingOpAanvraagUitkering = value;
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
             *         <element name="CdBeslissingOpAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBeslissingOpAanvraagUitkering" minOccurs="0"/>
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
                "cdBeslissingOpAanvraagUitkering"
            })
            public static class BeslissingOpAanvraagUitkering {

                @XmlElement(name = "CdBeslissingOpAanvraagUitkering")
                protected String cdBeslissingOpAanvraagUitkering;

                /**
                 * Gets the value of the cdBeslissingOpAanvraagUitkering property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdBeslissingOpAanvraagUitkering() {
                    return cdBeslissingOpAanvraagUitkering;
                }

                /**
                 * Sets the value of the cdBeslissingOpAanvraagUitkering property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdBeslissingOpAanvraagUitkering(String value) {
                    this.cdBeslissingOpAanvraagUitkering = value;
                }

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
             *         <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet"/>
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
                "cdSzWet"
            })
            public static class SzWet {

                @XmlElement(name = "CdSzWet", required = true)
                protected String cdSzWet;

                /**
                 * Gets the value of the cdSzWet property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdSzWet() {
                    return cdSzWet;
                }

                /**
                 * Sets the value of the cdSzWet property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdSzWet(String value) {
                    this.cdSzWet = value;
                }

            }

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
         *         <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr" minOccurs="0"/>
         *         <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
         *         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
         *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
         *         <element name="Geslacht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Geslacht" minOccurs="0"/>
         *         <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *         <element name="IndKinderbijslag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndOnb" minOccurs="0"/>
         *         <element name="SpecifiekeGegevensKinderbijslag" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdWoonsituatieKind" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdWoonsituatieKind" minOccurs="0"/>
         *                   <element name="CdLandVerblijfKind" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}LandenCdIsoA2" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "burgerservicenr",
            "voornamen",
            "voorvoegsel",
            "significantDeelVanDeAchternaam",
            "geslacht",
            "geboortedat",
            "indKinderbijslag",
            "specifiekeGegevensKinderbijslag"
        })
        public static class Kind {

            @XmlElement(name = "Burgerservicenr")
            protected String burgerservicenr;
            @XmlElement(name = "Voornamen")
            protected String voornamen;
            @XmlElement(name = "Voorvoegsel")
            protected String voorvoegsel;
            @XmlElement(name = "SignificantDeelVanDeAchternaam")
            protected String significantDeelVanDeAchternaam;
            @XmlElement(name = "Geslacht")
            protected String geslacht;
            @XmlElement(name = "Geboortedat", required = true)
            protected String geboortedat;
            @XmlElement(name = "IndKinderbijslag")
            protected String indKinderbijslag;
            @XmlElement(name = "SpecifiekeGegevensKinderbijslag")
            protected SVBPersoonsInfoResponse.ClientSuwi.Kind.SpecifiekeGegevensKinderbijslag specifiekeGegevensKinderbijslag;

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

            /**
             * Gets the value of the voornamen property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVoornamen() {
                return voornamen;
            }

            /**
             * Sets the value of the voornamen property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVoornamen(String value) {
                this.voornamen = value;
            }

            /**
             * Gets the value of the voorvoegsel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVoorvoegsel() {
                return voorvoegsel;
            }

            /**
             * Sets the value of the voorvoegsel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVoorvoegsel(String value) {
                this.voorvoegsel = value;
            }

            /**
             * Gets the value of the significantDeelVanDeAchternaam property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignificantDeelVanDeAchternaam() {
                return significantDeelVanDeAchternaam;
            }

            /**
             * Sets the value of the significantDeelVanDeAchternaam property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignificantDeelVanDeAchternaam(String value) {
                this.significantDeelVanDeAchternaam = value;
            }

            /**
             * Gets the value of the geslacht property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeslacht() {
                return geslacht;
            }

            /**
             * Sets the value of the geslacht property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeslacht(String value) {
                this.geslacht = value;
            }

            /**
             * Gets the value of the geboortedat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeboortedat() {
                return geboortedat;
            }

            /**
             * Sets the value of the geboortedat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeboortedat(String value) {
                this.geboortedat = value;
            }

            /**
             * Gets the value of the indKinderbijslag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndKinderbijslag() {
                return indKinderbijslag;
            }

            /**
             * Sets the value of the indKinderbijslag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndKinderbijslag(String value) {
                this.indKinderbijslag = value;
            }

            /**
             * Gets the value of the specifiekeGegevensKinderbijslag property.
             * 
             * @return
             *     possible object is
             *     {@link SVBPersoonsInfoResponse.ClientSuwi.Kind.SpecifiekeGegevensKinderbijslag }
             *     
             */
            public SVBPersoonsInfoResponse.ClientSuwi.Kind.SpecifiekeGegevensKinderbijslag getSpecifiekeGegevensKinderbijslag() {
                return specifiekeGegevensKinderbijslag;
            }

            /**
             * Sets the value of the specifiekeGegevensKinderbijslag property.
             * 
             * @param value
             *     allowed object is
             *     {@link SVBPersoonsInfoResponse.ClientSuwi.Kind.SpecifiekeGegevensKinderbijslag }
             *     
             */
            public void setSpecifiekeGegevensKinderbijslag(SVBPersoonsInfoResponse.ClientSuwi.Kind.SpecifiekeGegevensKinderbijslag value) {
                this.specifiekeGegevensKinderbijslag = value;
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
             *         <element name="CdWoonsituatieKind" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdWoonsituatieKind" minOccurs="0"/>
             *         <element name="CdLandVerblijfKind" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}LandenCdIsoA2" minOccurs="0"/>
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
                "cdWoonsituatieKind",
                "cdLandVerblijfKind"
            })
            public static class SpecifiekeGegevensKinderbijslag {

                @XmlElement(name = "CdWoonsituatieKind")
                protected String cdWoonsituatieKind;
                @XmlElement(name = "CdLandVerblijfKind")
                protected String cdLandVerblijfKind;

                /**
                 * Gets the value of the cdWoonsituatieKind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdWoonsituatieKind() {
                    return cdWoonsituatieKind;
                }

                /**
                 * Sets the value of the cdWoonsituatieKind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdWoonsituatieKind(String value) {
                    this.cdWoonsituatieKind = value;
                }

                /**
                 * Gets the value of the cdLandVerblijfKind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdLandVerblijfKind() {
                    return cdLandVerblijfKind;
                }

                /**
                 * Sets the value of the cdLandVerblijfKind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdLandVerblijfKind(String value) {
                    this.cdLandVerblijfKind = value;
                }

            }

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
         *         <element name="DatBUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *         <element name="DatEUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="SzWet">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="SpecifiekeGegevensRemigratiewet" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdSrtRemigratievoorziening" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtRemigratievoorziening" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Uitkeringsperiode" maxOccurs="unbounded">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DatBUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *                   <element name="DatEUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="SpecifiekeGegevensAow" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="IndPartnertoeslagAow" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *                             <element name="PercToegekendeAow" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Percentage" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="BrutoUitkeringsbedr" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
         *                             <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr" minOccurs="0"/>
         *                             <element name="CdUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdUitkeringsperiode" minOccurs="0"/>
         *                             <element name="DatBBrutoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                             <element name="DatEBrutoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="NettoUitkeringsbedr" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
         *                             <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr" minOccurs="0"/>
         *                             <element name="CdUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdUitkeringsperiode" minOccurs="0"/>
         *                             <element name="DatBNettoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                             <element name="DatENettoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
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
        @XmlType(name = "", propOrder = {
            "datBUitkeringsverhouding",
            "datEUitkeringsverhouding",
            "szWet",
            "specifiekeGegevensRemigratiewet",
            "uitkeringsperiode"
        })
        public static class Uitkeringsverhouding {

            @XmlElement(name = "DatBUitkeringsverhouding", required = true)
            protected String datBUitkeringsverhouding;
            @XmlElement(name = "DatEUitkeringsverhouding")
            protected String datEUitkeringsverhouding;
            @XmlElement(name = "SzWet", required = true)
            protected SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet szWet;
            @XmlElement(name = "SpecifiekeGegevensRemigratiewet")
            protected List<SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensRemigratiewet> specifiekeGegevensRemigratiewet;
            @XmlElement(name = "Uitkeringsperiode", required = true)
            protected List<SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode> uitkeringsperiode;

            /**
             * Gets the value of the datBUitkeringsverhouding property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatBUitkeringsverhouding() {
                return datBUitkeringsverhouding;
            }

            /**
             * Sets the value of the datBUitkeringsverhouding property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatBUitkeringsverhouding(String value) {
                this.datBUitkeringsverhouding = value;
            }

            /**
             * Gets the value of the datEUitkeringsverhouding property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatEUitkeringsverhouding() {
                return datEUitkeringsverhouding;
            }

            /**
             * Sets the value of the datEUitkeringsverhouding property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatEUitkeringsverhouding(String value) {
                this.datEUitkeringsverhouding = value;
            }

            /**
             * Gets the value of the szWet property.
             * 
             * @return
             *     possible object is
             *     {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
             *     
             */
            public SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet getSzWet() {
                return szWet;
            }

            /**
             * Sets the value of the szWet property.
             * 
             * @param value
             *     allowed object is
             *     {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
             *     
             */
            public void setSzWet(SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet value) {
                this.szWet = value;
            }

            /**
             * Gets the value of the specifiekeGegevensRemigratiewet property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the specifiekeGegevensRemigratiewet property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSpecifiekeGegevensRemigratiewet().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensRemigratiewet }
             * 
             * 
             * @return
             *     The value of the specifiekeGegevensRemigratiewet property.
             */
            public List<SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensRemigratiewet> getSpecifiekeGegevensRemigratiewet() {
                if (specifiekeGegevensRemigratiewet == null) {
                    specifiekeGegevensRemigratiewet = new ArrayList<>();
                }
                return this.specifiekeGegevensRemigratiewet;
            }

            /**
             * Gets the value of the uitkeringsperiode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the uitkeringsperiode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUitkeringsperiode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode }
             * 
             * 
             * @return
             *     The value of the uitkeringsperiode property.
             */
            public List<SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode> getUitkeringsperiode() {
                if (uitkeringsperiode == null) {
                    uitkeringsperiode = new ArrayList<>();
                }
                return this.uitkeringsperiode;
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
             *         <element name="CdSrtRemigratievoorziening" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtRemigratievoorziening" minOccurs="0"/>
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
                "cdSrtRemigratievoorziening"
            })
            public static class SpecifiekeGegevensRemigratiewet {

                @XmlElement(name = "CdSrtRemigratievoorziening")
                protected String cdSrtRemigratievoorziening;

                /**
                 * Gets the value of the cdSrtRemigratievoorziening property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdSrtRemigratievoorziening() {
                    return cdSrtRemigratievoorziening;
                }

                /**
                 * Sets the value of the cdSrtRemigratievoorziening property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdSrtRemigratievoorziening(String value) {
                    this.cdSrtRemigratievoorziening = value;
                }

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
             *         <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet"/>
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
                "cdSzWet"
            })
            public static class SzWet {

                @XmlElement(name = "CdSzWet", required = true)
                protected String cdSzWet;

                /**
                 * Gets the value of the cdSzWet property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdSzWet() {
                    return cdSzWet;
                }

                /**
                 * Sets the value of the cdSzWet property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdSzWet(String value) {
                    this.cdSzWet = value;
                }

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
             *         <element name="DatBUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
             *         <element name="DatEUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="SpecifiekeGegevensAow" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="IndPartnertoeslagAow" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
             *                   <element name="PercToegekendeAow" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Percentage" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="BrutoUitkeringsbedr" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
             *                   <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr" minOccurs="0"/>
             *                   <element name="CdUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdUitkeringsperiode" minOccurs="0"/>
             *                   <element name="DatBBrutoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                   <element name="DatEBrutoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="NettoUitkeringsbedr" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
             *                   <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr" minOccurs="0"/>
             *                   <element name="CdUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdUitkeringsperiode" minOccurs="0"/>
             *                   <element name="DatBNettoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                   <element name="DatENettoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
            @XmlType(name = "", propOrder = {
                "datBUitkeringsperiode",
                "datEUitkeringsperiode",
                "specifiekeGegevensAow",
                "brutoUitkeringsbedr",
                "nettoUitkeringsbedr"
            })
            public static class Uitkeringsperiode {

                @XmlElement(name = "DatBUitkeringsperiode", required = true)
                protected String datBUitkeringsperiode;
                @XmlElement(name = "DatEUitkeringsperiode")
                protected String datEUitkeringsperiode;
                @XmlElement(name = "SpecifiekeGegevensAow")
                protected SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.SpecifiekeGegevensAow specifiekeGegevensAow;
                @XmlElement(name = "BrutoUitkeringsbedr")
                protected List<SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedr> brutoUitkeringsbedr;
                @XmlElement(name = "NettoUitkeringsbedr")
                protected List<SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.NettoUitkeringsbedr> nettoUitkeringsbedr;

                /**
                 * Gets the value of the datBUitkeringsperiode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatBUitkeringsperiode() {
                    return datBUitkeringsperiode;
                }

                /**
                 * Sets the value of the datBUitkeringsperiode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatBUitkeringsperiode(String value) {
                    this.datBUitkeringsperiode = value;
                }

                /**
                 * Gets the value of the datEUitkeringsperiode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEUitkeringsperiode() {
                    return datEUitkeringsperiode;
                }

                /**
                 * Sets the value of the datEUitkeringsperiode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEUitkeringsperiode(String value) {
                    this.datEUitkeringsperiode = value;
                }

                /**
                 * Gets the value of the specifiekeGegevensAow property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.SpecifiekeGegevensAow }
                 *     
                 */
                public SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.SpecifiekeGegevensAow getSpecifiekeGegevensAow() {
                    return specifiekeGegevensAow;
                }

                /**
                 * Sets the value of the specifiekeGegevensAow property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.SpecifiekeGegevensAow }
                 *     
                 */
                public void setSpecifiekeGegevensAow(SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.SpecifiekeGegevensAow value) {
                    this.specifiekeGegevensAow = value;
                }

                /**
                 * Gets the value of the brutoUitkeringsbedr property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the brutoUitkeringsbedr property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBrutoUitkeringsbedr().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedr }
                 * 
                 * 
                 * @return
                 *     The value of the brutoUitkeringsbedr property.
                 */
                public List<SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedr> getBrutoUitkeringsbedr() {
                    if (brutoUitkeringsbedr == null) {
                        brutoUitkeringsbedr = new ArrayList<>();
                    }
                    return this.brutoUitkeringsbedr;
                }

                /**
                 * Gets the value of the nettoUitkeringsbedr property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the nettoUitkeringsbedr property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNettoUitkeringsbedr().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.NettoUitkeringsbedr }
                 * 
                 * 
                 * @return
                 *     The value of the nettoUitkeringsbedr property.
                 */
                public List<SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.NettoUitkeringsbedr> getNettoUitkeringsbedr() {
                    if (nettoUitkeringsbedr == null) {
                        nettoUitkeringsbedr = new ArrayList<>();
                    }
                    return this.nettoUitkeringsbedr;
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
                 *         <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
                 *         <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr" minOccurs="0"/>
                 *         <element name="CdUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdUitkeringsperiode" minOccurs="0"/>
                 *         <element name="DatBBrutoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *         <element name="DatEBrutoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                    "cdMunteenheid",
                    "waardeBedr",
                    "cdUitkeringsperiode",
                    "datBBrutoUitkeringsbedr",
                    "datEBrutoUitkeringsbedr"
                })
                public static class BrutoUitkeringsbedr {

                    @XmlElement(name = "CdMunteenheid")
                    protected String cdMunteenheid;
                    @XmlElement(name = "WaardeBedr")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger waardeBedr;
                    @XmlElement(name = "CdUitkeringsperiode")
                    protected String cdUitkeringsperiode;
                    @XmlElement(name = "DatBBrutoUitkeringsbedr")
                    protected String datBBrutoUitkeringsbedr;
                    @XmlElement(name = "DatEBrutoUitkeringsbedr")
                    protected String datEBrutoUitkeringsbedr;

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
                     * Gets the value of the cdUitkeringsperiode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdUitkeringsperiode() {
                        return cdUitkeringsperiode;
                    }

                    /**
                     * Sets the value of the cdUitkeringsperiode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdUitkeringsperiode(String value) {
                        this.cdUitkeringsperiode = value;
                    }

                    /**
                     * Gets the value of the datBBrutoUitkeringsbedr property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatBBrutoUitkeringsbedr() {
                        return datBBrutoUitkeringsbedr;
                    }

                    /**
                     * Sets the value of the datBBrutoUitkeringsbedr property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatBBrutoUitkeringsbedr(String value) {
                        this.datBBrutoUitkeringsbedr = value;
                    }

                    /**
                     * Gets the value of the datEBrutoUitkeringsbedr property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatEBrutoUitkeringsbedr() {
                        return datEBrutoUitkeringsbedr;
                    }

                    /**
                     * Sets the value of the datEBrutoUitkeringsbedr property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatEBrutoUitkeringsbedr(String value) {
                        this.datEBrutoUitkeringsbedr = value;
                    }

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
                 *         <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
                 *         <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr" minOccurs="0"/>
                 *         <element name="CdUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdUitkeringsperiode" minOccurs="0"/>
                 *         <element name="DatBNettoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *         <element name="DatENettoUitkeringsbedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                    "cdMunteenheid",
                    "waardeBedr",
                    "cdUitkeringsperiode",
                    "datBNettoUitkeringsbedr",
                    "datENettoUitkeringsbedr"
                })
                public static class NettoUitkeringsbedr {

                    @XmlElement(name = "CdMunteenheid")
                    protected String cdMunteenheid;
                    @XmlElement(name = "WaardeBedr")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger waardeBedr;
                    @XmlElement(name = "CdUitkeringsperiode")
                    protected String cdUitkeringsperiode;
                    @XmlElement(name = "DatBNettoUitkeringsbedr")
                    protected String datBNettoUitkeringsbedr;
                    @XmlElement(name = "DatENettoUitkeringsbedr")
                    protected String datENettoUitkeringsbedr;

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
                     * Gets the value of the cdUitkeringsperiode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdUitkeringsperiode() {
                        return cdUitkeringsperiode;
                    }

                    /**
                     * Sets the value of the cdUitkeringsperiode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdUitkeringsperiode(String value) {
                        this.cdUitkeringsperiode = value;
                    }

                    /**
                     * Gets the value of the datBNettoUitkeringsbedr property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatBNettoUitkeringsbedr() {
                        return datBNettoUitkeringsbedr;
                    }

                    /**
                     * Sets the value of the datBNettoUitkeringsbedr property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatBNettoUitkeringsbedr(String value) {
                        this.datBNettoUitkeringsbedr = value;
                    }

                    /**
                     * Gets the value of the datENettoUitkeringsbedr property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatENettoUitkeringsbedr() {
                        return datENettoUitkeringsbedr;
                    }

                    /**
                     * Sets the value of the datENettoUitkeringsbedr property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatENettoUitkeringsbedr(String value) {
                        this.datENettoUitkeringsbedr = value;
                    }

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
                 *         <element name="IndPartnertoeslagAow" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
                 *         <element name="PercToegekendeAow" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Percentage" minOccurs="0"/>
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
                    "indPartnertoeslagAow",
                    "percToegekendeAow"
                })
                public static class SpecifiekeGegevensAow {

                    @XmlElement(name = "IndPartnertoeslagAow")
                    protected String indPartnertoeslagAow;
                    @XmlElement(name = "PercToegekendeAow")
                    protected String percToegekendeAow;

                    /**
                     * Gets the value of the indPartnertoeslagAow property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIndPartnertoeslagAow() {
                        return indPartnertoeslagAow;
                    }

                    /**
                     * Sets the value of the indPartnertoeslagAow property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIndPartnertoeslagAow(String value) {
                        this.indPartnertoeslagAow = value;
                    }

                    /**
                     * Gets the value of the percToegekendeAow property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPercToegekendeAow() {
                        return percToegekendeAow;
                    }

                    /**
                     * Sets the value of the percToegekendeAow property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPercToegekendeAow(String value) {
                        this.percToegekendeAow = value;
                    }

                }

            }

        }

    }

}
