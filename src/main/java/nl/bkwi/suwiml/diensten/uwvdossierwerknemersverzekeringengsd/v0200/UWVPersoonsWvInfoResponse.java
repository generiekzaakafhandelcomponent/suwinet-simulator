
package nl.bkwi.suwiml.diensten.uwvdossierwerknemersverzekeringengsd.v0200;

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
import nl.bkwi.suwiml.basisschema.v0801.StandaardPerc;
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
 *                     <element name="ArbeidsgeschiktheidClient" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="CdArbeidsongeschiktheidsklasse" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAoKlasse" minOccurs="0"/>
 *                               <element name="DatBAoKlasse" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="DatEersteAoDag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="WerkloosheidClient" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DatEersteWerkloosheidsdag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="OmsRedenWerkloosheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
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
 *                               <element name="DatAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="SzWet">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="AanvraagWw" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="DatAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="BeslissingOpAanvraagUitkering" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdBeslissingOpAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBeslissingOpAanvraagUitkering"/>
 *                                         <element name="DatDagtekeningBeslisOpAanvrUitk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
 *                               <element name="DatBUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="DatEUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="OmsRedenEindeUitkeringsverh" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
 *                               <element name="DatEMaximaleUitkeringsduur" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="AantWerkurenPerWeekGrondslagUitk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdsduur" minOccurs="0"/>
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
 *                               <element name="SectorBeroepsEnBedrijfsleven" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorOsv" minOccurs="0"/>
 *                                         <element name="NaamSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
 *                                         <element name="PartijSuwi">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="CdPartijSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdPartijSuwi" minOccurs="0"/>
 *                                                   <element name="NaamPartijSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
 *                                                   <element name="KolomSuwi">
 *                                                     <complexType>
 *                                                       <complexContent>
 *                                                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           <sequence>
 *                                                             <element name="CdKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdKolomSuwi" minOccurs="0"/>
 *                                                             <element name="NaamKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
 *                                                             <element name="NaamKolomSuwiVerkort" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
 *                                                           </sequence>
 *                                                         </restriction>
 *                                                       </complexContent>
 *                                                     </complexType>
 *                                                   </element>
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
 *                               <element name="SpecifiekeGegevensWwUitkering" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="DatELoongerelateerdeUitkeringWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="DatEVervolguitkeringWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Uitkeringsperiode" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="DatBUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="DatEUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="RedenMaatregelMbtUitkeringUwv" maxOccurs="unbounded" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="DatBMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   <element name="DatEMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   <element name="PercKortingUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardPerc" minOccurs="0"/>
 *                                                   <element name="CdRedenMaatregelMbtUitkeringUwv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRedenMaatregelMbtUitkeringUwv" minOccurs="0"/>
 *                                                 </sequence>
 *                                               </restriction>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                         <element name="BrutoUitkeringsbedrag" maxOccurs="unbounded" minOccurs="0">
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
@XmlRootElement(name = "UWVPersoonsWvInfoResponse")
public class UWVPersoonsWvInfoResponse {

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
     * line 151 of file:/Users/lrnspprs/Projects/plugins/suwinet-simulator/src/main/resources/suwinet/UWVDossierWerknemersverzekeringenGSD/Diensten/UWVDossierWerknemersverzekeringenGSD/v0200-b01/BodyReaction.xsd
     * line 149 of file:/Users/lrnspprs/Projects/plugins/suwinet-simulator/src/main/resources/suwinet/UWVDossierWerknemersverzekeringenGSD/Diensten/UWVDossierWerknemersverzekeringenGSD/v0200-b01/BodyReaction.xsd
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
     * {@link JAXBElement }{@code <}{@link UWVPersoonsWvInfoResponse.ClientSuwi }{@code >}
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
     *         <element name="ArbeidsgeschiktheidClient" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="CdArbeidsongeschiktheidsklasse" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAoKlasse" minOccurs="0"/>
     *                   <element name="DatBAoKlasse" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="DatEersteAoDag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="WerkloosheidClient" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="DatEersteWerkloosheidsdag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="OmsRedenWerkloosheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
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
     *                   <element name="DatAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="SzWet">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="AanvraagWw" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="DatAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="BeslissingOpAanvraagUitkering" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdBeslissingOpAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBeslissingOpAanvraagUitkering"/>
     *                             <element name="DatDagtekeningBeslisOpAanvrUitk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
     *                   <element name="DatBUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="DatEUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="OmsRedenEindeUitkeringsverh" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
     *                   <element name="DatEMaximaleUitkeringsduur" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="AantWerkurenPerWeekGrondslagUitk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdsduur" minOccurs="0"/>
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
     *                   <element name="SectorBeroepsEnBedrijfsleven" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorOsv" minOccurs="0"/>
     *                             <element name="NaamSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
     *                             <element name="PartijSuwi">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="CdPartijSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdPartijSuwi" minOccurs="0"/>
     *                                       <element name="NaamPartijSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
     *                                       <element name="KolomSuwi">
     *                                         <complexType>
     *                                           <complexContent>
     *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               <sequence>
     *                                                 <element name="CdKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdKolomSuwi" minOccurs="0"/>
     *                                                 <element name="NaamKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
     *                                                 <element name="NaamKolomSuwiVerkort" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
     *                                               </sequence>
     *                                             </restriction>
     *                                           </complexContent>
     *                                         </complexType>
     *                                       </element>
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
     *                   <element name="SpecifiekeGegevensWwUitkering" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="DatELoongerelateerdeUitkeringWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="DatEVervolguitkeringWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Uitkeringsperiode" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="DatBUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="DatEUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="RedenMaatregelMbtUitkeringUwv" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="DatBMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                       <element name="DatEMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                       <element name="PercKortingUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardPerc" minOccurs="0"/>
     *                                       <element name="CdRedenMaatregelMbtUitkeringUwv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRedenMaatregelMbtUitkeringUwv" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="BrutoUitkeringsbedrag" maxOccurs="unbounded" minOccurs="0">
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
        "arbeidsgeschiktheidClient",
        "werkloosheidClient",
        "aanvraagUitkering",
        "uitkeringsverhouding"
    })
    public static class ClientSuwi {

        @XmlElement(name = "Burgerservicenr", required = true)
        protected String burgerservicenr;
        @XmlElement(name = "ArbeidsgeschiktheidClient")
        protected List<UWVPersoonsWvInfoResponse.ClientSuwi.ArbeidsgeschiktheidClient> arbeidsgeschiktheidClient;
        @XmlElement(name = "WerkloosheidClient")
        protected List<UWVPersoonsWvInfoResponse.ClientSuwi.WerkloosheidClient> werkloosheidClient;
        @XmlElement(name = "AanvraagUitkering")
        protected List<UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering> aanvraagUitkering;
        @XmlElement(name = "Uitkeringsverhouding")
        protected List<UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding> uitkeringsverhouding;

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
         * Gets the value of the arbeidsgeschiktheidClient property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the arbeidsgeschiktheidClient property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArbeidsgeschiktheidClient().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UWVPersoonsWvInfoResponse.ClientSuwi.ArbeidsgeschiktheidClient }
         * 
         * 
         * @return
         *     The value of the arbeidsgeschiktheidClient property.
         */
        public List<UWVPersoonsWvInfoResponse.ClientSuwi.ArbeidsgeschiktheidClient> getArbeidsgeschiktheidClient() {
            if (arbeidsgeschiktheidClient == null) {
                arbeidsgeschiktheidClient = new ArrayList<>();
            }
            return this.arbeidsgeschiktheidClient;
        }

        /**
         * Gets the value of the werkloosheidClient property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the werkloosheidClient property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWerkloosheidClient().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UWVPersoonsWvInfoResponse.ClientSuwi.WerkloosheidClient }
         * 
         * 
         * @return
         *     The value of the werkloosheidClient property.
         */
        public List<UWVPersoonsWvInfoResponse.ClientSuwi.WerkloosheidClient> getWerkloosheidClient() {
            if (werkloosheidClient == null) {
                werkloosheidClient = new ArrayList<>();
            }
            return this.werkloosheidClient;
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
         * {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering }
         * 
         * 
         * @return
         *     The value of the aanvraagUitkering property.
         */
        public List<UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering> getAanvraagUitkering() {
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
         * {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding }
         * 
         * 
         * @return
         *     The value of the uitkeringsverhouding property.
         */
        public List<UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding> getUitkeringsverhouding() {
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
         *         <element name="DatAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="SzWet">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="AanvraagWw" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DatAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="BeslissingOpAanvraagUitkering" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdBeslissingOpAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBeslissingOpAanvraagUitkering"/>
         *                   <element name="DatDagtekeningBeslisOpAanvrUitk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
            "aanvraagWw",
            "beslissingOpAanvraagUitkering"
        })
        public static class AanvraagUitkering {

            @XmlElement(name = "DatAanvraagUitkering")
            protected String datAanvraagUitkering;
            @XmlElement(name = "SzWet", required = true)
            protected UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.SzWet szWet;
            @XmlElement(name = "AanvraagWw")
            protected UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.AanvraagWw aanvraagWw;
            @XmlElement(name = "BeslissingOpAanvraagUitkering")
            protected List<UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering> beslissingOpAanvraagUitkering;

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
             *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
             *     
             */
            public UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.SzWet getSzWet() {
                return szWet;
            }

            /**
             * Sets the value of the szWet property.
             * 
             * @param value
             *     allowed object is
             *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
             *     
             */
            public void setSzWet(UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.SzWet value) {
                this.szWet = value;
            }

            /**
             * Gets the value of the aanvraagWw property.
             * 
             * @return
             *     possible object is
             *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.AanvraagWw }
             *     
             */
            public UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.AanvraagWw getAanvraagWw() {
                return aanvraagWw;
            }

            /**
             * Sets the value of the aanvraagWw property.
             * 
             * @param value
             *     allowed object is
             *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.AanvraagWw }
             *     
             */
            public void setAanvraagWw(UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.AanvraagWw value) {
                this.aanvraagWw = value;
            }

            /**
             * Gets the value of the beslissingOpAanvraagUitkering property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the beslissingOpAanvraagUitkering property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBeslissingOpAanvraagUitkering().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering }
             * 
             * 
             * @return
             *     The value of the beslissingOpAanvraagUitkering property.
             */
            public List<UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering> getBeslissingOpAanvraagUitkering() {
                if (beslissingOpAanvraagUitkering == null) {
                    beslissingOpAanvraagUitkering = new ArrayList<>();
                }
                return this.beslissingOpAanvraagUitkering;
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
             *         <element name="DatAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                "datAanvraagUitkering"
            })
            public static class AanvraagWw {

                @XmlElement(name = "DatAanvraagUitkering")
                protected String datAanvraagUitkering;

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
             *         <element name="CdBeslissingOpAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBeslissingOpAanvraagUitkering"/>
             *         <element name="DatDagtekeningBeslisOpAanvrUitk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                "cdBeslissingOpAanvraagUitkering",
                "datDagtekeningBeslisOpAanvrUitk"
            })
            public static class BeslissingOpAanvraagUitkering {

                @XmlElement(name = "CdBeslissingOpAanvraagUitkering", required = true)
                protected String cdBeslissingOpAanvraagUitkering;
                @XmlElement(name = "DatDagtekeningBeslisOpAanvrUitk")
                protected String datDagtekeningBeslisOpAanvrUitk;

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

                /**
                 * Gets the value of the datDagtekeningBeslisOpAanvrUitk property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatDagtekeningBeslisOpAanvrUitk() {
                    return datDagtekeningBeslisOpAanvrUitk;
                }

                /**
                 * Sets the value of the datDagtekeningBeslisOpAanvrUitk property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatDagtekeningBeslisOpAanvrUitk(String value) {
                    this.datDagtekeningBeslisOpAanvrUitk = value;
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
             *         <element name="CdSzWet" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSzWet" minOccurs="0"/>
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

                @XmlElement(name = "CdSzWet")
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
         *         <element name="CdArbeidsongeschiktheidsklasse" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAoKlasse" minOccurs="0"/>
         *         <element name="DatBAoKlasse" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="DatEersteAoDag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
            "cdArbeidsongeschiktheidsklasse",
            "datBAoKlasse",
            "datEersteAoDag"
        })
        public static class ArbeidsgeschiktheidClient {

            @XmlElement(name = "CdArbeidsongeschiktheidsklasse")
            protected String cdArbeidsongeschiktheidsklasse;
            @XmlElement(name = "DatBAoKlasse")
            protected String datBAoKlasse;
            @XmlElement(name = "DatEersteAoDag")
            protected String datEersteAoDag;

            /**
             * Gets the value of the cdArbeidsongeschiktheidsklasse property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdArbeidsongeschiktheidsklasse() {
                return cdArbeidsongeschiktheidsklasse;
            }

            /**
             * Sets the value of the cdArbeidsongeschiktheidsklasse property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdArbeidsongeschiktheidsklasse(String value) {
                this.cdArbeidsongeschiktheidsklasse = value;
            }

            /**
             * Gets the value of the datBAoKlasse property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatBAoKlasse() {
                return datBAoKlasse;
            }

            /**
             * Sets the value of the datBAoKlasse property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatBAoKlasse(String value) {
                this.datBAoKlasse = value;
            }

            /**
             * Gets the value of the datEersteAoDag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatEersteAoDag() {
                return datEersteAoDag;
            }

            /**
             * Sets the value of the datEersteAoDag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatEersteAoDag(String value) {
                this.datEersteAoDag = value;
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
         *         <element name="DatBUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="DatEUitkeringsverhouding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="OmsRedenEindeUitkeringsverh" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
         *         <element name="DatEMaximaleUitkeringsduur" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="AantWerkurenPerWeekGrondslagUitk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdsduur" minOccurs="0"/>
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
         *         <element name="SectorBeroepsEnBedrijfsleven" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorOsv" minOccurs="0"/>
         *                   <element name="NaamSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
         *                   <element name="PartijSuwi">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="CdPartijSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdPartijSuwi" minOccurs="0"/>
         *                             <element name="NaamPartijSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
         *                             <element name="KolomSuwi">
         *                               <complexType>
         *                                 <complexContent>
         *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     <sequence>
         *                                       <element name="CdKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdKolomSuwi" minOccurs="0"/>
         *                                       <element name="NaamKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
         *                                       <element name="NaamKolomSuwiVerkort" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
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
         *         <element name="SpecifiekeGegevensWwUitkering" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DatELoongerelateerdeUitkeringWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="DatEVervolguitkeringWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Uitkeringsperiode" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DatBUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="DatEUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="RedenMaatregelMbtUitkeringUwv" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="DatBMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                             <element name="DatEMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                             <element name="PercKortingUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardPerc" minOccurs="0"/>
         *                             <element name="CdRedenMaatregelMbtUitkeringUwv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRedenMaatregelMbtUitkeringUwv" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="BrutoUitkeringsbedrag" maxOccurs="unbounded" minOccurs="0">
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
            "omsRedenEindeUitkeringsverh",
            "datEMaximaleUitkeringsduur",
            "aantWerkurenPerWeekGrondslagUitk",
            "szWet",
            "sectorBeroepsEnBedrijfsleven",
            "specifiekeGegevensWwUitkering",
            "uitkeringsperiode"
        })
        public static class Uitkeringsverhouding {

            @XmlElement(name = "DatBUitkeringsverhouding")
            protected String datBUitkeringsverhouding;
            @XmlElement(name = "DatEUitkeringsverhouding")
            protected String datEUitkeringsverhouding;
            @XmlElement(name = "OmsRedenEindeUitkeringsverh")
            protected String omsRedenEindeUitkeringsverh;
            @XmlElement(name = "DatEMaximaleUitkeringsduur")
            protected String datEMaximaleUitkeringsduur;
            @XmlElement(name = "AantWerkurenPerWeekGrondslagUitk")
            protected String aantWerkurenPerWeekGrondslagUitk;
            @XmlElement(name = "SzWet", required = true)
            protected UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet szWet;
            @XmlElement(name = "SectorBeroepsEnBedrijfsleven")
            protected List<UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven> sectorBeroepsEnBedrijfsleven;
            @XmlElement(name = "SpecifiekeGegevensWwUitkering")
            protected UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensWwUitkering specifiekeGegevensWwUitkering;
            @XmlElement(name = "Uitkeringsperiode")
            protected List<UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode> uitkeringsperiode;

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
             * Gets the value of the omsRedenEindeUitkeringsverh property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOmsRedenEindeUitkeringsverh() {
                return omsRedenEindeUitkeringsverh;
            }

            /**
             * Sets the value of the omsRedenEindeUitkeringsverh property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOmsRedenEindeUitkeringsverh(String value) {
                this.omsRedenEindeUitkeringsverh = value;
            }

            /**
             * Gets the value of the datEMaximaleUitkeringsduur property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatEMaximaleUitkeringsduur() {
                return datEMaximaleUitkeringsduur;
            }

            /**
             * Sets the value of the datEMaximaleUitkeringsduur property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatEMaximaleUitkeringsduur(String value) {
                this.datEMaximaleUitkeringsduur = value;
            }

            /**
             * Gets the value of the aantWerkurenPerWeekGrondslagUitk property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAantWerkurenPerWeekGrondslagUitk() {
                return aantWerkurenPerWeekGrondslagUitk;
            }

            /**
             * Sets the value of the aantWerkurenPerWeekGrondslagUitk property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAantWerkurenPerWeekGrondslagUitk(String value) {
                this.aantWerkurenPerWeekGrondslagUitk = value;
            }

            /**
             * Gets the value of the szWet property.
             * 
             * @return
             *     possible object is
             *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
             *     
             */
            public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet getSzWet() {
                return szWet;
            }

            /**
             * Sets the value of the szWet property.
             * 
             * @param value
             *     allowed object is
             *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
             *     
             */
            public void setSzWet(UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet value) {
                this.szWet = value;
            }

            /**
             * Gets the value of the sectorBeroepsEnBedrijfsleven property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the sectorBeroepsEnBedrijfsleven property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSectorBeroepsEnBedrijfsleven().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven }
             * 
             * 
             * @return
             *     The value of the sectorBeroepsEnBedrijfsleven property.
             */
            public List<UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven> getSectorBeroepsEnBedrijfsleven() {
                if (sectorBeroepsEnBedrijfsleven == null) {
                    sectorBeroepsEnBedrijfsleven = new ArrayList<>();
                }
                return this.sectorBeroepsEnBedrijfsleven;
            }

            /**
             * Gets the value of the specifiekeGegevensWwUitkering property.
             * 
             * @return
             *     possible object is
             *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensWwUitkering }
             *     
             */
            public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensWwUitkering getSpecifiekeGegevensWwUitkering() {
                return specifiekeGegevensWwUitkering;
            }

            /**
             * Sets the value of the specifiekeGegevensWwUitkering property.
             * 
             * @param value
             *     allowed object is
             *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensWwUitkering }
             *     
             */
            public void setSpecifiekeGegevensWwUitkering(UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensWwUitkering value) {
                this.specifiekeGegevensWwUitkering = value;
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
             * {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode }
             * 
             * 
             * @return
             *     The value of the uitkeringsperiode property.
             */
            public List<UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode> getUitkeringsperiode() {
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
             *         <element name="CdSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorOsv" minOccurs="0"/>
             *         <element name="NaamSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
             *         <element name="PartijSuwi">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="CdPartijSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdPartijSuwi" minOccurs="0"/>
             *                   <element name="NaamPartijSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
             *                   <element name="KolomSuwi">
             *                     <complexType>
             *                       <complexContent>
             *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           <sequence>
             *                             <element name="CdKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdKolomSuwi" minOccurs="0"/>
             *                             <element name="NaamKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
             *                             <element name="NaamKolomSuwiVerkort" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
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
                "cdSector",
                "naamSector",
                "partijSuwi"
            })
            public static class SectorBeroepsEnBedrijfsleven {

                @XmlElement(name = "CdSector")
                protected String cdSector;
                @XmlElement(name = "NaamSector")
                protected String naamSector;
                @XmlElement(name = "PartijSuwi", required = true)
                protected UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi partijSuwi;

                /**
                 * Gets the value of the cdSector property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdSector() {
                    return cdSector;
                }

                /**
                 * Sets the value of the cdSector property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdSector(String value) {
                    this.cdSector = value;
                }

                /**
                 * Gets the value of the naamSector property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNaamSector() {
                    return naamSector;
                }

                /**
                 * Sets the value of the naamSector property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNaamSector(String value) {
                    this.naamSector = value;
                }

                /**
                 * Gets the value of the partijSuwi property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi }
                 *     
                 */
                public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi getPartijSuwi() {
                    return partijSuwi;
                }

                /**
                 * Sets the value of the partijSuwi property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi }
                 *     
                 */
                public void setPartijSuwi(UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi value) {
                    this.partijSuwi = value;
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
                 *         <element name="CdPartijSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdPartijSuwi" minOccurs="0"/>
                 *         <element name="NaamPartijSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
                 *         <element name="KolomSuwi">
                 *           <complexType>
                 *             <complexContent>
                 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 <sequence>
                 *                   <element name="CdKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdKolomSuwi" minOccurs="0"/>
                 *                   <element name="NaamKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
                 *                   <element name="NaamKolomSuwiVerkort" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
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
                    "cdPartijSuwi",
                    "naamPartijSuwi",
                    "kolomSuwi"
                })
                public static class PartijSuwi {

                    @XmlElement(name = "CdPartijSuwi")
                    protected String cdPartijSuwi;
                    @XmlElement(name = "NaamPartijSuwi")
                    protected String naamPartijSuwi;
                    @XmlElement(name = "KolomSuwi", required = true)
                    protected UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi.KolomSuwi kolomSuwi;

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
                     * Gets the value of the naamPartijSuwi property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNaamPartijSuwi() {
                        return naamPartijSuwi;
                    }

                    /**
                     * Sets the value of the naamPartijSuwi property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNaamPartijSuwi(String value) {
                        this.naamPartijSuwi = value;
                    }

                    /**
                     * Gets the value of the kolomSuwi property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi.KolomSuwi }
                     *     
                     */
                    public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi.KolomSuwi getKolomSuwi() {
                        return kolomSuwi;
                    }

                    /**
                     * Sets the value of the kolomSuwi property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi.KolomSuwi }
                     *     
                     */
                    public void setKolomSuwi(UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi.KolomSuwi value) {
                        this.kolomSuwi = value;
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
                     *         <element name="CdKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdKolomSuwi" minOccurs="0"/>
                     *         <element name="NaamKolomSuwi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
                     *         <element name="NaamKolomSuwiVerkort" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN35" minOccurs="0"/>
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
                        "cdKolomSuwi",
                        "naamKolomSuwi",
                        "naamKolomSuwiVerkort"
                    })
                    public static class KolomSuwi {

                        @XmlElement(name = "CdKolomSuwi")
                        @XmlSchemaType(name = "nonNegativeInteger")
                        protected Integer cdKolomSuwi;
                        @XmlElement(name = "NaamKolomSuwi")
                        protected String naamKolomSuwi;
                        @XmlElement(name = "NaamKolomSuwiVerkort")
                        protected String naamKolomSuwiVerkort;

                        /**
                         * Gets the value of the cdKolomSuwi property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getCdKolomSuwi() {
                            return cdKolomSuwi;
                        }

                        /**
                         * Sets the value of the cdKolomSuwi property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setCdKolomSuwi(Integer value) {
                            this.cdKolomSuwi = value;
                        }

                        /**
                         * Gets the value of the naamKolomSuwi property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNaamKolomSuwi() {
                            return naamKolomSuwi;
                        }

                        /**
                         * Sets the value of the naamKolomSuwi property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNaamKolomSuwi(String value) {
                            this.naamKolomSuwi = value;
                        }

                        /**
                         * Gets the value of the naamKolomSuwiVerkort property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNaamKolomSuwiVerkort() {
                            return naamKolomSuwiVerkort;
                        }

                        /**
                         * Sets the value of the naamKolomSuwiVerkort property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNaamKolomSuwiVerkort(String value) {
                            this.naamKolomSuwiVerkort = value;
                        }

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
             *         <element name="DatELoongerelateerdeUitkeringWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="DatEVervolguitkeringWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                "datELoongerelateerdeUitkeringWw",
                "datEVervolguitkeringWw"
            })
            public static class SpecifiekeGegevensWwUitkering {

                @XmlElement(name = "DatELoongerelateerdeUitkeringWw")
                protected String datELoongerelateerdeUitkeringWw;
                @XmlElement(name = "DatEVervolguitkeringWw")
                protected String datEVervolguitkeringWw;

                /**
                 * Gets the value of the datELoongerelateerdeUitkeringWw property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatELoongerelateerdeUitkeringWw() {
                    return datELoongerelateerdeUitkeringWw;
                }

                /**
                 * Sets the value of the datELoongerelateerdeUitkeringWw property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatELoongerelateerdeUitkeringWw(String value) {
                    this.datELoongerelateerdeUitkeringWw = value;
                }

                /**
                 * Gets the value of the datEVervolguitkeringWw property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEVervolguitkeringWw() {
                    return datEVervolguitkeringWw;
                }

                /**
                 * Sets the value of the datEVervolguitkeringWw property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEVervolguitkeringWw(String value) {
                    this.datEVervolguitkeringWw = value;
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
             *         <element name="DatBUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="DatEUitkeringsperiode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="RedenMaatregelMbtUitkeringUwv" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="DatBMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                   <element name="DatEMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                   <element name="PercKortingUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardPerc" minOccurs="0"/>
             *                   <element name="CdRedenMaatregelMbtUitkeringUwv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRedenMaatregelMbtUitkeringUwv" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="BrutoUitkeringsbedrag" maxOccurs="unbounded" minOccurs="0">
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
                "redenMaatregelMbtUitkeringUwv",
                "brutoUitkeringsbedrag"
            })
            public static class Uitkeringsperiode {

                @XmlElement(name = "DatBUitkeringsperiode")
                protected String datBUitkeringsperiode;
                @XmlElement(name = "DatEUitkeringsperiode")
                protected String datEUitkeringsperiode;
                @XmlElement(name = "RedenMaatregelMbtUitkeringUwv")
                protected List<UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.RedenMaatregelMbtUitkeringUwv> redenMaatregelMbtUitkeringUwv;
                @XmlElement(name = "BrutoUitkeringsbedrag")
                protected List<UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedrag> brutoUitkeringsbedrag;

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
                 * Gets the value of the redenMaatregelMbtUitkeringUwv property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the redenMaatregelMbtUitkeringUwv property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRedenMaatregelMbtUitkeringUwv().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.RedenMaatregelMbtUitkeringUwv }
                 * 
                 * 
                 * @return
                 *     The value of the redenMaatregelMbtUitkeringUwv property.
                 */
                public List<UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.RedenMaatregelMbtUitkeringUwv> getRedenMaatregelMbtUitkeringUwv() {
                    if (redenMaatregelMbtUitkeringUwv == null) {
                        redenMaatregelMbtUitkeringUwv = new ArrayList<>();
                    }
                    return this.redenMaatregelMbtUitkeringUwv;
                }

                /**
                 * Gets the value of the brutoUitkeringsbedrag property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the brutoUitkeringsbedrag property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBrutoUitkeringsbedrag().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedrag }
                 * 
                 * 
                 * @return
                 *     The value of the brutoUitkeringsbedrag property.
                 */
                public List<UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedrag> getBrutoUitkeringsbedrag() {
                    if (brutoUitkeringsbedrag == null) {
                        brutoUitkeringsbedrag = new ArrayList<>();
                    }
                    return this.brutoUitkeringsbedrag;
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
                public static class BrutoUitkeringsbedrag {

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
                 *         <element name="DatBMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *         <element name="DatEMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *         <element name="PercKortingUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardPerc" minOccurs="0"/>
                 *         <element name="CdRedenMaatregelMbtUitkeringUwv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRedenMaatregelMbtUitkeringUwv" minOccurs="0"/>
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
                    "datBMaatregelMbtUitkering",
                    "datEMaatregelMbtUitkering",
                    "percKortingUitkering",
                    "cdRedenMaatregelMbtUitkeringUwv"
                })
                public static class RedenMaatregelMbtUitkeringUwv {

                    @XmlElement(name = "DatBMaatregelMbtUitkering")
                    protected String datBMaatregelMbtUitkering;
                    @XmlElement(name = "DatEMaatregelMbtUitkering")
                    protected String datEMaatregelMbtUitkering;
                    @XmlElement(name = "PercKortingUitkering")
                    protected StandaardPerc percKortingUitkering;
                    @XmlElement(name = "CdRedenMaatregelMbtUitkeringUwv")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected Integer cdRedenMaatregelMbtUitkeringUwv;

                    /**
                     * Gets the value of the datBMaatregelMbtUitkering property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatBMaatregelMbtUitkering() {
                        return datBMaatregelMbtUitkering;
                    }

                    /**
                     * Sets the value of the datBMaatregelMbtUitkering property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatBMaatregelMbtUitkering(String value) {
                        this.datBMaatregelMbtUitkering = value;
                    }

                    /**
                     * Gets the value of the datEMaatregelMbtUitkering property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatEMaatregelMbtUitkering() {
                        return datEMaatregelMbtUitkering;
                    }

                    /**
                     * Sets the value of the datEMaatregelMbtUitkering property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatEMaatregelMbtUitkering(String value) {
                        this.datEMaatregelMbtUitkering = value;
                    }

                    /**
                     * Gets the value of the percKortingUitkering property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link StandaardPerc }
                     *     
                     */
                    public StandaardPerc getPercKortingUitkering() {
                        return percKortingUitkering;
                    }

                    /**
                     * Sets the value of the percKortingUitkering property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link StandaardPerc }
                     *     
                     */
                    public void setPercKortingUitkering(StandaardPerc value) {
                        this.percKortingUitkering = value;
                    }

                    /**
                     * Gets the value of the cdRedenMaatregelMbtUitkeringUwv property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getCdRedenMaatregelMbtUitkeringUwv() {
                        return cdRedenMaatregelMbtUitkeringUwv;
                    }

                    /**
                     * Sets the value of the cdRedenMaatregelMbtUitkeringUwv property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setCdRedenMaatregelMbtUitkeringUwv(Integer value) {
                        this.cdRedenMaatregelMbtUitkeringUwv = value;
                    }

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
         *         <element name="DatEersteWerkloosheidsdag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="OmsRedenWerkloosheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
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
            "datEersteWerkloosheidsdag",
            "omsRedenWerkloosheid"
        })
        public static class WerkloosheidClient {

            @XmlElement(name = "DatEersteWerkloosheidsdag")
            protected String datEersteWerkloosheidsdag;
            @XmlElement(name = "OmsRedenWerkloosheid")
            protected String omsRedenWerkloosheid;

            /**
             * Gets the value of the datEersteWerkloosheidsdag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatEersteWerkloosheidsdag() {
                return datEersteWerkloosheidsdag;
            }

            /**
             * Sets the value of the datEersteWerkloosheidsdag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatEersteWerkloosheidsdag(String value) {
                this.datEersteWerkloosheidsdag = value;
            }

            /**
             * Gets the value of the omsRedenWerkloosheid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOmsRedenWerkloosheid() {
                return omsRedenWerkloosheid;
            }

            /**
             * Sets the value of the omsRedenWerkloosheid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOmsRedenWerkloosheid(String value) {
                this.omsRedenWerkloosheid = value;
            }

        }

    }

}
