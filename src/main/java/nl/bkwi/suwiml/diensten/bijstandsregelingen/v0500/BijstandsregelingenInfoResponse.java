
package nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500;

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
import nl.bkwi.suwiml.basisschema.v0801.StandaardBedr;
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
 *                     <element name="Voorletters" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorletters" minOccurs="0"/>
 *                     <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
 *                     <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *                     <element name="Geslacht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Geslacht" minOccurs="0"/>
 *                     <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                     <element name="CdLeefvorm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdLeefvorm" minOccurs="0"/>
 *                     <element name="DomicilieAdres" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Straatadres" minOccurs="0"/>
 *                     <element name="Huisvesting" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="CdRelatieBewonerHuisvesting" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRelatieBewonerHuisvesting"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="SchendingInlichtingenplicht" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DatWaarschSchendInlichtingplicht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="DossierGsd" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Dossiercd" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN40" minOccurs="0"/>
 *                               <element name="DatOpnameGegevensInIbSysteem" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron" minOccurs="0"/>
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
 *                                         <element name="CdBeslissingOpAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBeslissingOpAanvraagUitkering"/>
 *                                         <element name="DatDagtekeningBeslisOpAanvrUitk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="PartnerAanvraagUitkering" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Vordering" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="IdentificatienrVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerN15" minOccurs="0"/>
 *                               <element name="DatBesluitVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="CdRedenVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRedenVordering" minOccurs="0"/>
 *                               <element name="BedrAanvangVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                               <element name="CdStatusVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVordering" minOccurs="0"/>
 *                               <element name="BedrSaldoVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                               <element name="DatOnherroepelijkVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
 *                               <element name="PartnerVordering" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Partner">
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Fraude" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="IndRecidive" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                                         <element name="IndRobuusteIncassoToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                                         <element name="CdHoogteBestuurlijkeBoete" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdHoogteBestuurlijkeBoete" minOccurs="0"/>
 *                                         <element name="CdSrtSanctie" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdSrtSanctie" minOccurs="0"/>
 *                                         <element name="ParketnrJustitie" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}ParketnrJustitie" minOccurs="0"/>
 *                                         <element name="CdRecidivetermijn" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRecidivetermijn" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="SpecifiekeGegevensBijzBijstand" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="CdClusterBijzBijstand" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdClusterBijzBijstand" minOccurs="0"/>
 *                               <element name="OmsSrtKostenBijzBijstand" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
 *                               <element name="DatBetaalbaarBijzBijstand" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
 *                               <element name="PartnerBijzBijstand" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
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
 *                               <element name="SpecifiekeGegevensBijstandUitk" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdAanleidingEindeBijstandUitk" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdAanleidingEindeBijstandUitk" minOccurs="0"/>
 *                                         <element name="CdClassificatieBbz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdClassificatieBbz" minOccurs="0"/>
 *                                         <element name="AantKostendelers" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AantalN2" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="InkomstenInvloedOpBijstandUitk" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdSrtOverigeInkomsten" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtOverigeInkomsten" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="VrijstellingArbeidsplicht" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdVrijstellingArbeidsplichtBijst" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdVrijstellingArbeidsplichtBijst"/>
 *                                         <element name="DatEVrijstellingArbeidsplicht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="CdRedenEVrijstArbeidsplichtBijst" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRedenEVrijstArbeidsplichtBijst" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="PartnerUitkeringsverhouding" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
 *                                     </extension>
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
 *                                         <element name="MaatregelMbtUitkering" maxOccurs="unbounded" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="DatBMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                                                   <element name="DatEMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   <element name="RedenMaatregelMbtBijstandUitk" minOccurs="0">
 *                                                     <complexType>
 *                                                       <complexContent>
 *                                                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           <sequence>
 *                                                             <element name="CdRedenMaatregelMbtBijstandUitk" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRedenMaatregelMbtBijstandUitk" minOccurs="0"/>
 *                                                             <element name="GevolgenMaatregelMbtBijstandUitk" minOccurs="0">
 *                                                               <complexType>
 *                                                                 <complexContent>
 *                                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     <sequence>
 *                                                                       <element name="BedrVerminderingUitkMbtMaatregel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr"/>
 *                                                                     </sequence>
 *                                                                   </restriction>
 *                                                                 </complexContent>
 *                                                               </complexType>
 *                                                             </element>
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
 *                                         <element name="InkomstenBijstandUitkering" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="BedrTotaalInkomstenUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                                   <element name="BedrBetaalbaarGesteldeUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                                 </sequence>
 *                                               </restriction>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                         <element name="Normbedrag" maxOccurs="unbounded" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="CdSrtNormbedrag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtNormbedrag"/>
 *                                                   <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
 *                                                   <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr"/>
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
 *                               <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
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
@XmlRootElement(name = "BijstandsregelingenInfoResponse")
public class BijstandsregelingenInfoResponse {

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
     * line 274 of file:/Users/haiko/IdeaProjects/suwinet-simulator-ritense/src/main/resources/suwinet/Bijstandsregelingen/Diensten/Bijstandsregelingen/v0500-b04/BodyReaction.xsd
     * line 272 of file:/Users/haiko/IdeaProjects/suwinet-simulator-ritense/src/main/resources/suwinet/Bijstandsregelingen/Diensten/Bijstandsregelingen/v0500-b04/BodyReaction.xsd
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
     * {@link JAXBElement }{@code <}{@link BijstandsregelingenInfoResponse.ClientSuwi }{@code >}
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
     *         <element name="Voorletters" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorletters" minOccurs="0"/>
     *         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
     *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
     *         <element name="Geslacht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Geslacht" minOccurs="0"/>
     *         <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *         <element name="CdLeefvorm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdLeefvorm" minOccurs="0"/>
     *         <element name="DomicilieAdres" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Straatadres" minOccurs="0"/>
     *         <element name="Huisvesting" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="CdRelatieBewonerHuisvesting" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRelatieBewonerHuisvesting"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="SchendingInlichtingenplicht" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="DatWaarschSchendInlichtingplicht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="DossierGsd" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Dossiercd" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN40" minOccurs="0"/>
     *                   <element name="DatOpnameGegevensInIbSysteem" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron" minOccurs="0"/>
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
     *                             <element name="CdBeslissingOpAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBeslissingOpAanvraagUitkering"/>
     *                             <element name="DatDagtekeningBeslisOpAanvrUitk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="PartnerAanvraagUitkering" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Vordering" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="IdentificatienrVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerN15" minOccurs="0"/>
     *                   <element name="DatBesluitVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="CdRedenVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRedenVordering" minOccurs="0"/>
     *                   <element name="BedrAanvangVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                   <element name="CdStatusVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVordering" minOccurs="0"/>
     *                   <element name="BedrSaldoVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                   <element name="DatOnherroepelijkVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
     *                   <element name="PartnerVordering" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Partner">
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Fraude" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="IndRecidive" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                             <element name="IndRobuusteIncassoToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                             <element name="CdHoogteBestuurlijkeBoete" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdHoogteBestuurlijkeBoete" minOccurs="0"/>
     *                             <element name="CdSrtSanctie" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdSrtSanctie" minOccurs="0"/>
     *                             <element name="ParketnrJustitie" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}ParketnrJustitie" minOccurs="0"/>
     *                             <element name="CdRecidivetermijn" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRecidivetermijn" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="SpecifiekeGegevensBijzBijstand" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="CdClusterBijzBijstand" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdClusterBijzBijstand" minOccurs="0"/>
     *                   <element name="OmsSrtKostenBijzBijstand" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
     *                   <element name="DatBetaalbaarBijzBijstand" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
     *                   <element name="PartnerBijzBijstand" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
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
     *                   <element name="SpecifiekeGegevensBijstandUitk" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdAanleidingEindeBijstandUitk" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdAanleidingEindeBijstandUitk" minOccurs="0"/>
     *                             <element name="CdClassificatieBbz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdClassificatieBbz" minOccurs="0"/>
     *                             <element name="AantKostendelers" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AantalN2" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="InkomstenInvloedOpBijstandUitk" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdSrtOverigeInkomsten" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtOverigeInkomsten" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="VrijstellingArbeidsplicht" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdVrijstellingArbeidsplichtBijst" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdVrijstellingArbeidsplichtBijst"/>
     *                             <element name="DatEVrijstellingArbeidsplicht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="CdRedenEVrijstArbeidsplichtBijst" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRedenEVrijstArbeidsplichtBijst" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="PartnerUitkeringsverhouding" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
     *                         </extension>
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
     *                             <element name="MaatregelMbtUitkering" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="DatBMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                                       <element name="DatEMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                       <element name="RedenMaatregelMbtBijstandUitk" minOccurs="0">
     *                                         <complexType>
     *                                           <complexContent>
     *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               <sequence>
     *                                                 <element name="CdRedenMaatregelMbtBijstandUitk" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRedenMaatregelMbtBijstandUitk" minOccurs="0"/>
     *                                                 <element name="GevolgenMaatregelMbtBijstandUitk" minOccurs="0">
     *                                                   <complexType>
     *                                                     <complexContent>
     *                                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         <sequence>
     *                                                           <element name="BedrVerminderingUitkMbtMaatregel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr"/>
     *                                                         </sequence>
     *                                                       </restriction>
     *                                                     </complexContent>
     *                                                   </complexType>
     *                                                 </element>
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
     *                             <element name="InkomstenBijstandUitkering" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="BedrTotaalInkomstenUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                                       <element name="BedrBetaalbaarGesteldeUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="Normbedrag" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="CdSrtNormbedrag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtNormbedrag"/>
     *                                       <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
     *                                       <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr"/>
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
     *                   <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
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
        "voorletters",
        "voorvoegsel",
        "significantDeelVanDeAchternaam",
        "geslacht",
        "geboortedat",
        "cdLeefvorm",
        "domicilieAdres",
        "huisvesting",
        "schendingInlichtingenplicht",
        "dossierGsd",
        "bron",
        "aanvraagUitkering",
        "vordering",
        "specifiekeGegevensBijzBijstand",
        "uitkeringsverhouding"
    })
    public static class ClientSuwi {

        @XmlElement(name = "Burgerservicenr", required = true)
        protected String burgerservicenr;
        @XmlElement(name = "Voornamen")
        protected String voornamen;
        @XmlElement(name = "Voorletters")
        protected String voorletters;
        @XmlElement(name = "Voorvoegsel")
        protected String voorvoegsel;
        @XmlElement(name = "SignificantDeelVanDeAchternaam")
        protected String significantDeelVanDeAchternaam;
        @XmlElement(name = "Geslacht")
        protected String geslacht;
        @XmlElement(name = "Geboortedat")
        protected String geboortedat;
        @XmlElement(name = "CdLeefvorm")
        protected String cdLeefvorm;
        @XmlElement(name = "DomicilieAdres")
        protected Straatadres domicilieAdres;
        @XmlElement(name = "Huisvesting")
        protected BijstandsregelingenInfoResponse.ClientSuwi.Huisvesting huisvesting;
        @XmlElement(name = "SchendingInlichtingenplicht")
        protected BijstandsregelingenInfoResponse.ClientSuwi.SchendingInlichtingenplicht schendingInlichtingenplicht;
        @XmlElement(name = "DossierGsd")
        protected BijstandsregelingenInfoResponse.ClientSuwi.DossierGsd dossierGsd;
        @XmlElement(name = "Bron")
        protected Bron bron;
        @XmlElement(name = "AanvraagUitkering")
        protected List<BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering> aanvraagUitkering;
        @XmlElement(name = "Vordering")
        protected List<BijstandsregelingenInfoResponse.ClientSuwi.Vordering> vordering;
        @XmlElement(name = "SpecifiekeGegevensBijzBijstand")
        protected List<BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand> specifiekeGegevensBijzBijstand;
        @XmlElement(name = "Uitkeringsverhouding")
        protected List<BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding> uitkeringsverhouding;

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
         * Gets the value of the voorletters property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVoorletters() {
            return voorletters;
        }

        /**
         * Sets the value of the voorletters property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVoorletters(String value) {
            this.voorletters = value;
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
         * Gets the value of the cdLeefvorm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdLeefvorm() {
            return cdLeefvorm;
        }

        /**
         * Sets the value of the cdLeefvorm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdLeefvorm(String value) {
            this.cdLeefvorm = value;
        }

        /**
         * Gets the value of the domicilieAdres property.
         * 
         * @return
         *     possible object is
         *     {@link Straatadres }
         *     
         */
        public Straatadres getDomicilieAdres() {
            return domicilieAdres;
        }

        /**
         * Sets the value of the domicilieAdres property.
         * 
         * @param value
         *     allowed object is
         *     {@link Straatadres }
         *     
         */
        public void setDomicilieAdres(Straatadres value) {
            this.domicilieAdres = value;
        }

        /**
         * Gets the value of the huisvesting property.
         * 
         * @return
         *     possible object is
         *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Huisvesting }
         *     
         */
        public BijstandsregelingenInfoResponse.ClientSuwi.Huisvesting getHuisvesting() {
            return huisvesting;
        }

        /**
         * Sets the value of the huisvesting property.
         * 
         * @param value
         *     allowed object is
         *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Huisvesting }
         *     
         */
        public void setHuisvesting(BijstandsregelingenInfoResponse.ClientSuwi.Huisvesting value) {
            this.huisvesting = value;
        }

        /**
         * Gets the value of the schendingInlichtingenplicht property.
         * 
         * @return
         *     possible object is
         *     {@link BijstandsregelingenInfoResponse.ClientSuwi.SchendingInlichtingenplicht }
         *     
         */
        public BijstandsregelingenInfoResponse.ClientSuwi.SchendingInlichtingenplicht getSchendingInlichtingenplicht() {
            return schendingInlichtingenplicht;
        }

        /**
         * Sets the value of the schendingInlichtingenplicht property.
         * 
         * @param value
         *     allowed object is
         *     {@link BijstandsregelingenInfoResponse.ClientSuwi.SchendingInlichtingenplicht }
         *     
         */
        public void setSchendingInlichtingenplicht(BijstandsregelingenInfoResponse.ClientSuwi.SchendingInlichtingenplicht value) {
            this.schendingInlichtingenplicht = value;
        }

        /**
         * Gets the value of the dossierGsd property.
         * 
         * @return
         *     possible object is
         *     {@link BijstandsregelingenInfoResponse.ClientSuwi.DossierGsd }
         *     
         */
        public BijstandsregelingenInfoResponse.ClientSuwi.DossierGsd getDossierGsd() {
            return dossierGsd;
        }

        /**
         * Sets the value of the dossierGsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BijstandsregelingenInfoResponse.ClientSuwi.DossierGsd }
         *     
         */
        public void setDossierGsd(BijstandsregelingenInfoResponse.ClientSuwi.DossierGsd value) {
            this.dossierGsd = value;
        }

        /**
         * Gets the value of the bron property.
         * 
         * @return
         *     possible object is
         *     {@link Bron }
         *     
         */
        public Bron getBron() {
            return bron;
        }

        /**
         * Sets the value of the bron property.
         * 
         * @param value
         *     allowed object is
         *     {@link Bron }
         *     
         */
        public void setBron(Bron value) {
            this.bron = value;
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
         * {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering }
         * 
         * 
         * @return
         *     The value of the aanvraagUitkering property.
         */
        public List<BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering> getAanvraagUitkering() {
            if (aanvraagUitkering == null) {
                aanvraagUitkering = new ArrayList<>();
            }
            return this.aanvraagUitkering;
        }

        /**
         * Gets the value of the vordering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the vordering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVordering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering }
         * 
         * 
         * @return
         *     The value of the vordering property.
         */
        public List<BijstandsregelingenInfoResponse.ClientSuwi.Vordering> getVordering() {
            if (vordering == null) {
                vordering = new ArrayList<>();
            }
            return this.vordering;
        }

        /**
         * Gets the value of the specifiekeGegevensBijzBijstand property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the specifiekeGegevensBijzBijstand property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecifiekeGegevensBijzBijstand().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand }
         * 
         * 
         * @return
         *     The value of the specifiekeGegevensBijzBijstand property.
         */
        public List<BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand> getSpecifiekeGegevensBijzBijstand() {
            if (specifiekeGegevensBijzBijstand == null) {
                specifiekeGegevensBijzBijstand = new ArrayList<>();
            }
            return this.specifiekeGegevensBijzBijstand;
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
         * {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding }
         * 
         * 
         * @return
         *     The value of the uitkeringsverhouding property.
         */
        public List<BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding> getUitkeringsverhouding() {
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
         *                   <element name="CdBeslissingOpAanvraagUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBeslissingOpAanvraagUitkering"/>
         *                   <element name="DatDagtekeningBeslisOpAanvrUitk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="PartnerAanvraagUitkering" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
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
            "beslissingOpAanvraagUitkering",
            "partnerAanvraagUitkering",
            "bron"
        })
        public static class AanvraagUitkering {

            @XmlElement(name = "DatAanvraagUitkering")
            protected String datAanvraagUitkering;
            @XmlElement(name = "SzWet", required = true)
            protected BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.SzWet szWet;
            @XmlElement(name = "BeslissingOpAanvraagUitkering")
            protected BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering beslissingOpAanvraagUitkering;
            @XmlElement(name = "PartnerAanvraagUitkering")
            protected BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.PartnerAanvraagUitkering partnerAanvraagUitkering;
            @XmlElement(name = "Bron", required = true)
            protected Bron bron;

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
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
             *     
             */
            public BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.SzWet getSzWet() {
                return szWet;
            }

            /**
             * Sets the value of the szWet property.
             * 
             * @param value
             *     allowed object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
             *     
             */
            public void setSzWet(BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.SzWet value) {
                this.szWet = value;
            }

            /**
             * Gets the value of the beslissingOpAanvraagUitkering property.
             * 
             * @return
             *     possible object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering }
             *     
             */
            public BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering getBeslissingOpAanvraagUitkering() {
                return beslissingOpAanvraagUitkering;
            }

            /**
             * Sets the value of the beslissingOpAanvraagUitkering property.
             * 
             * @param value
             *     allowed object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering }
             *     
             */
            public void setBeslissingOpAanvraagUitkering(BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering value) {
                this.beslissingOpAanvraagUitkering = value;
            }

            /**
             * Gets the value of the partnerAanvraagUitkering property.
             * 
             * @return
             *     possible object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.PartnerAanvraagUitkering }
             *     
             */
            public BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.PartnerAanvraagUitkering getPartnerAanvraagUitkering() {
                return partnerAanvraagUitkering;
            }

            /**
             * Sets the value of the partnerAanvraagUitkering property.
             * 
             * @param value
             *     allowed object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.PartnerAanvraagUitkering }
             *     
             */
            public void setPartnerAanvraagUitkering(BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.PartnerAanvraagUitkering value) {
                this.partnerAanvraagUitkering = value;
            }

            /**
             * Gets the value of the bron property.
             * 
             * @return
             *     possible object is
             *     {@link Bron }
             *     
             */
            public Bron getBron() {
                return bron;
            }

            /**
             * Sets the value of the bron property.
             * 
             * @param value
             *     allowed object is
             *     {@link Bron }
             *     
             */
            public void setBron(Bron value) {
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
             *     <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PartnerAanvraagUitkering
                extends PartnerBijstand
            {


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
         *         <element name="Dossiercd" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN40" minOccurs="0"/>
         *         <element name="DatOpnameGegevensInIbSysteem" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
            "dossiercd",
            "datOpnameGegevensInIbSysteem"
        })
        public static class DossierGsd {

            @XmlElement(name = "Dossiercd")
            protected String dossiercd;
            @XmlElement(name = "DatOpnameGegevensInIbSysteem")
            protected String datOpnameGegevensInIbSysteem;

            /**
             * Gets the value of the dossiercd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDossiercd() {
                return dossiercd;
            }

            /**
             * Sets the value of the dossiercd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDossiercd(String value) {
                this.dossiercd = value;
            }

            /**
             * Gets the value of the datOpnameGegevensInIbSysteem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatOpnameGegevensInIbSysteem() {
                return datOpnameGegevensInIbSysteem;
            }

            /**
             * Sets the value of the datOpnameGegevensInIbSysteem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatOpnameGegevensInIbSysteem(String value) {
                this.datOpnameGegevensInIbSysteem = value;
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
         *         <element name="CdRelatieBewonerHuisvesting" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRelatieBewonerHuisvesting"/>
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
            "cdRelatieBewonerHuisvesting"
        })
        public static class Huisvesting {

            @XmlElement(name = "CdRelatieBewonerHuisvesting")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected int cdRelatieBewonerHuisvesting;

            /**
             * Gets the value of the cdRelatieBewonerHuisvesting property.
             * 
             */
            public int getCdRelatieBewonerHuisvesting() {
                return cdRelatieBewonerHuisvesting;
            }

            /**
             * Sets the value of the cdRelatieBewonerHuisvesting property.
             * 
             */
            public void setCdRelatieBewonerHuisvesting(int value) {
                this.cdRelatieBewonerHuisvesting = value;
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
         *         <element name="DatWaarschSchendInlichtingplicht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
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
            "datWaarschSchendInlichtingplicht"
        })
        public static class SchendingInlichtingenplicht {

            @XmlElement(name = "DatWaarschSchendInlichtingplicht", required = true)
            protected String datWaarschSchendInlichtingplicht;

            /**
             * Gets the value of the datWaarschSchendInlichtingplicht property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatWaarschSchendInlichtingplicht() {
                return datWaarschSchendInlichtingplicht;
            }

            /**
             * Sets the value of the datWaarschSchendInlichtingplicht property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatWaarschSchendInlichtingplicht(String value) {
                this.datWaarschSchendInlichtingplicht = value;
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
         *         <element name="CdClusterBijzBijstand" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdClusterBijzBijstand" minOccurs="0"/>
         *         <element name="OmsSrtKostenBijzBijstand" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN100" minOccurs="0"/>
         *         <element name="DatBetaalbaarBijzBijstand" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
         *         <element name="PartnerBijzBijstand" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
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
            "cdClusterBijzBijstand",
            "omsSrtKostenBijzBijstand",
            "datBetaalbaarBijzBijstand",
            "szWet",
            "partnerBijzBijstand",
            "bron"
        })
        public static class SpecifiekeGegevensBijzBijstand {

            @XmlElement(name = "CdClusterBijzBijstand")
            protected String cdClusterBijzBijstand;
            @XmlElement(name = "OmsSrtKostenBijzBijstand")
            protected String omsSrtKostenBijzBijstand;
            @XmlElement(name = "DatBetaalbaarBijzBijstand")
            protected String datBetaalbaarBijzBijstand;
            @XmlElement(name = "SzWet", required = true)
            protected BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.SzWet szWet;
            @XmlElement(name = "PartnerBijzBijstand")
            protected BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.PartnerBijzBijstand partnerBijzBijstand;
            @XmlElement(name = "Bron", required = true)
            protected Bron bron;

            /**
             * Gets the value of the cdClusterBijzBijstand property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdClusterBijzBijstand() {
                return cdClusterBijzBijstand;
            }

            /**
             * Sets the value of the cdClusterBijzBijstand property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdClusterBijzBijstand(String value) {
                this.cdClusterBijzBijstand = value;
            }

            /**
             * Gets the value of the omsSrtKostenBijzBijstand property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOmsSrtKostenBijzBijstand() {
                return omsSrtKostenBijzBijstand;
            }

            /**
             * Sets the value of the omsSrtKostenBijzBijstand property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOmsSrtKostenBijzBijstand(String value) {
                this.omsSrtKostenBijzBijstand = value;
            }

            /**
             * Gets the value of the datBetaalbaarBijzBijstand property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatBetaalbaarBijzBijstand() {
                return datBetaalbaarBijzBijstand;
            }

            /**
             * Sets the value of the datBetaalbaarBijzBijstand property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatBetaalbaarBijzBijstand(String value) {
                this.datBetaalbaarBijzBijstand = value;
            }

            /**
             * Gets the value of the szWet property.
             * 
             * @return
             *     possible object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.SzWet }
             *     
             */
            public BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.SzWet getSzWet() {
                return szWet;
            }

            /**
             * Sets the value of the szWet property.
             * 
             * @param value
             *     allowed object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.SzWet }
             *     
             */
            public void setSzWet(BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.SzWet value) {
                this.szWet = value;
            }

            /**
             * Gets the value of the partnerBijzBijstand property.
             * 
             * @return
             *     possible object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.PartnerBijzBijstand }
             *     
             */
            public BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.PartnerBijzBijstand getPartnerBijzBijstand() {
                return partnerBijzBijstand;
            }

            /**
             * Sets the value of the partnerBijzBijstand property.
             * 
             * @param value
             *     allowed object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.PartnerBijzBijstand }
             *     
             */
            public void setPartnerBijzBijstand(BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.PartnerBijzBijstand value) {
                this.partnerBijzBijstand = value;
            }

            /**
             * Gets the value of the bron property.
             * 
             * @return
             *     possible object is
             *     {@link Bron }
             *     
             */
            public Bron getBron() {
                return bron;
            }

            /**
             * Sets the value of the bron property.
             * 
             * @param value
             *     allowed object is
             *     {@link Bron }
             *     
             */
            public void setBron(Bron value) {
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
             *     <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PartnerBijzBijstand
                extends PartnerBijstand
            {


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
         *         <element name="SpecifiekeGegevensBijstandUitk" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdAanleidingEindeBijstandUitk" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdAanleidingEindeBijstandUitk" minOccurs="0"/>
         *                   <element name="CdClassificatieBbz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdClassificatieBbz" minOccurs="0"/>
         *                   <element name="AantKostendelers" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AantalN2" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="InkomstenInvloedOpBijstandUitk" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdSrtOverigeInkomsten" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtOverigeInkomsten" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="VrijstellingArbeidsplicht" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdVrijstellingArbeidsplichtBijst" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdVrijstellingArbeidsplichtBijst"/>
         *                   <element name="DatEVrijstellingArbeidsplicht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="CdRedenEVrijstArbeidsplichtBijst" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRedenEVrijstArbeidsplichtBijst" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="PartnerUitkeringsverhouding" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
         *               </extension>
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
         *                   <element name="MaatregelMbtUitkering" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="DatBMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *                             <element name="DatEMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                             <element name="RedenMaatregelMbtBijstandUitk" minOccurs="0">
         *                               <complexType>
         *                                 <complexContent>
         *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     <sequence>
         *                                       <element name="CdRedenMaatregelMbtBijstandUitk" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRedenMaatregelMbtBijstandUitk" minOccurs="0"/>
         *                                       <element name="GevolgenMaatregelMbtBijstandUitk" minOccurs="0">
         *                                         <complexType>
         *                                           <complexContent>
         *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               <sequence>
         *                                                 <element name="BedrVerminderingUitkMbtMaatregel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr"/>
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
         *                   <element name="InkomstenBijstandUitkering" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="BedrTotaalInkomstenUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                             <element name="BedrBetaalbaarGesteldeUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="Normbedrag" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="CdSrtNormbedrag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtNormbedrag"/>
         *                             <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
         *                             <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr"/>
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
         *         <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
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
            "specifiekeGegevensBijstandUitk",
            "inkomstenInvloedOpBijstandUitk",
            "vrijstellingArbeidsplicht",
            "partnerUitkeringsverhouding",
            "uitkeringsperiode",
            "bron"
        })
        public static class Uitkeringsverhouding {

            @XmlElement(name = "DatBUitkeringsverhouding", required = true)
            protected String datBUitkeringsverhouding;
            @XmlElement(name = "DatEUitkeringsverhouding")
            protected String datEUitkeringsverhouding;
            @XmlElement(name = "SzWet", required = true)
            protected BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet szWet;
            @XmlElement(name = "SpecifiekeGegevensBijstandUitk")
            protected BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensBijstandUitk specifiekeGegevensBijstandUitk;
            @XmlElement(name = "InkomstenInvloedOpBijstandUitk")
            protected List<BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.InkomstenInvloedOpBijstandUitk> inkomstenInvloedOpBijstandUitk;
            @XmlElement(name = "VrijstellingArbeidsplicht")
            protected BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.VrijstellingArbeidsplicht vrijstellingArbeidsplicht;
            @XmlElement(name = "PartnerUitkeringsverhouding")
            protected BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.PartnerUitkeringsverhouding partnerUitkeringsverhouding;
            @XmlElement(name = "Uitkeringsperiode", required = true)
            protected List<BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode> uitkeringsperiode;
            @XmlElement(name = "Bron", required = true)
            protected Bron bron;

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
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
             *     
             */
            public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet getSzWet() {
                return szWet;
            }

            /**
             * Sets the value of the szWet property.
             * 
             * @param value
             *     allowed object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
             *     
             */
            public void setSzWet(BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet value) {
                this.szWet = value;
            }

            /**
             * Gets the value of the specifiekeGegevensBijstandUitk property.
             * 
             * @return
             *     possible object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensBijstandUitk }
             *     
             */
            public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensBijstandUitk getSpecifiekeGegevensBijstandUitk() {
                return specifiekeGegevensBijstandUitk;
            }

            /**
             * Sets the value of the specifiekeGegevensBijstandUitk property.
             * 
             * @param value
             *     allowed object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensBijstandUitk }
             *     
             */
            public void setSpecifiekeGegevensBijstandUitk(BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensBijstandUitk value) {
                this.specifiekeGegevensBijstandUitk = value;
            }

            /**
             * Gets the value of the inkomstenInvloedOpBijstandUitk property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the inkomstenInvloedOpBijstandUitk property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInkomstenInvloedOpBijstandUitk().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.InkomstenInvloedOpBijstandUitk }
             * 
             * 
             * @return
             *     The value of the inkomstenInvloedOpBijstandUitk property.
             */
            public List<BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.InkomstenInvloedOpBijstandUitk> getInkomstenInvloedOpBijstandUitk() {
                if (inkomstenInvloedOpBijstandUitk == null) {
                    inkomstenInvloedOpBijstandUitk = new ArrayList<>();
                }
                return this.inkomstenInvloedOpBijstandUitk;
            }

            /**
             * Gets the value of the vrijstellingArbeidsplicht property.
             * 
             * @return
             *     possible object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.VrijstellingArbeidsplicht }
             *     
             */
            public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.VrijstellingArbeidsplicht getVrijstellingArbeidsplicht() {
                return vrijstellingArbeidsplicht;
            }

            /**
             * Sets the value of the vrijstellingArbeidsplicht property.
             * 
             * @param value
             *     allowed object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.VrijstellingArbeidsplicht }
             *     
             */
            public void setVrijstellingArbeidsplicht(BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.VrijstellingArbeidsplicht value) {
                this.vrijstellingArbeidsplicht = value;
            }

            /**
             * Gets the value of the partnerUitkeringsverhouding property.
             * 
             * @return
             *     possible object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.PartnerUitkeringsverhouding }
             *     
             */
            public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.PartnerUitkeringsverhouding getPartnerUitkeringsverhouding() {
                return partnerUitkeringsverhouding;
            }

            /**
             * Sets the value of the partnerUitkeringsverhouding property.
             * 
             * @param value
             *     allowed object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.PartnerUitkeringsverhouding }
             *     
             */
            public void setPartnerUitkeringsverhouding(BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.PartnerUitkeringsverhouding value) {
                this.partnerUitkeringsverhouding = value;
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
             * {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode }
             * 
             * 
             * @return
             *     The value of the uitkeringsperiode property.
             */
            public List<BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode> getUitkeringsperiode() {
                if (uitkeringsperiode == null) {
                    uitkeringsperiode = new ArrayList<>();
                }
                return this.uitkeringsperiode;
            }

            /**
             * Gets the value of the bron property.
             * 
             * @return
             *     possible object is
             *     {@link Bron }
             *     
             */
            public Bron getBron() {
                return bron;
            }

            /**
             * Sets the value of the bron property.
             * 
             * @param value
             *     allowed object is
             *     {@link Bron }
             *     
             */
            public void setBron(Bron value) {
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
             *         <element name="CdSrtOverigeInkomsten" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtOverigeInkomsten" minOccurs="0"/>
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
                "cdSrtOverigeInkomsten"
            })
            public static class InkomstenInvloedOpBijstandUitk {

                @XmlElement(name = "CdSrtOverigeInkomsten")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected Integer cdSrtOverigeInkomsten;

                /**
                 * Gets the value of the cdSrtOverigeInkomsten property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getCdSrtOverigeInkomsten() {
                    return cdSrtOverigeInkomsten;
                }

                /**
                 * Sets the value of the cdSrtOverigeInkomsten property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setCdSrtOverigeInkomsten(Integer value) {
                    this.cdSrtOverigeInkomsten = value;
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
             *     <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}PartnerBijstand">
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PartnerUitkeringsverhouding
                extends PartnerBijstand
            {


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
             *         <element name="CdAanleidingEindeBijstandUitk" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdAanleidingEindeBijstandUitk" minOccurs="0"/>
             *         <element name="CdClassificatieBbz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdClassificatieBbz" minOccurs="0"/>
             *         <element name="AantKostendelers" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AantalN2" minOccurs="0"/>
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
                "cdAanleidingEindeBijstandUitk",
                "cdClassificatieBbz",
                "aantKostendelers"
            })
            public static class SpecifiekeGegevensBijstandUitk {

                @XmlElement(name = "CdAanleidingEindeBijstandUitk")
                protected String cdAanleidingEindeBijstandUitk;
                @XmlElement(name = "CdClassificatieBbz")
                protected String cdClassificatieBbz;
                @XmlElement(name = "AantKostendelers")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected Integer aantKostendelers;

                /**
                 * Gets the value of the cdAanleidingEindeBijstandUitk property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdAanleidingEindeBijstandUitk() {
                    return cdAanleidingEindeBijstandUitk;
                }

                /**
                 * Sets the value of the cdAanleidingEindeBijstandUitk property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdAanleidingEindeBijstandUitk(String value) {
                    this.cdAanleidingEindeBijstandUitk = value;
                }

                /**
                 * Gets the value of the cdClassificatieBbz property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdClassificatieBbz() {
                    return cdClassificatieBbz;
                }

                /**
                 * Sets the value of the cdClassificatieBbz property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdClassificatieBbz(String value) {
                    this.cdClassificatieBbz = value;
                }

                /**
                 * Gets the value of the aantKostendelers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAantKostendelers() {
                    return aantKostendelers;
                }

                /**
                 * Sets the value of the aantKostendelers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAantKostendelers(Integer value) {
                    this.aantKostendelers = value;
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
             *         <element name="MaatregelMbtUitkering" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="DatBMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
             *                   <element name="DatEMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                   <element name="RedenMaatregelMbtBijstandUitk" minOccurs="0">
             *                     <complexType>
             *                       <complexContent>
             *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           <sequence>
             *                             <element name="CdRedenMaatregelMbtBijstandUitk" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRedenMaatregelMbtBijstandUitk" minOccurs="0"/>
             *                             <element name="GevolgenMaatregelMbtBijstandUitk" minOccurs="0">
             *                               <complexType>
             *                                 <complexContent>
             *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     <sequence>
             *                                       <element name="BedrVerminderingUitkMbtMaatregel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr"/>
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
             *         <element name="InkomstenBijstandUitkering" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="BedrTotaalInkomstenUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *                   <element name="BedrBetaalbaarGesteldeUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="Normbedrag" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="CdSrtNormbedrag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtNormbedrag"/>
             *                   <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
             *                   <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr"/>
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
                "maatregelMbtUitkering",
                "inkomstenBijstandUitkering",
                "normbedrag"
            })
            public static class Uitkeringsperiode {

                @XmlElement(name = "DatBUitkeringsperiode", required = true)
                protected String datBUitkeringsperiode;
                @XmlElement(name = "DatEUitkeringsperiode")
                protected String datEUitkeringsperiode;
                @XmlElement(name = "MaatregelMbtUitkering")
                protected List<BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering> maatregelMbtUitkering;
                @XmlElement(name = "InkomstenBijstandUitkering")
                protected BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.InkomstenBijstandUitkering inkomstenBijstandUitkering;
                @XmlElement(name = "Normbedrag")
                protected List<BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.Normbedrag> normbedrag;

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
                 * Gets the value of the maatregelMbtUitkering property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the maatregelMbtUitkering property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMaatregelMbtUitkering().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering }
                 * 
                 * 
                 * @return
                 *     The value of the maatregelMbtUitkering property.
                 */
                public List<BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering> getMaatregelMbtUitkering() {
                    if (maatregelMbtUitkering == null) {
                        maatregelMbtUitkering = new ArrayList<>();
                    }
                    return this.maatregelMbtUitkering;
                }

                /**
                 * Gets the value of the inkomstenBijstandUitkering property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.InkomstenBijstandUitkering }
                 *     
                 */
                public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.InkomstenBijstandUitkering getInkomstenBijstandUitkering() {
                    return inkomstenBijstandUitkering;
                }

                /**
                 * Sets the value of the inkomstenBijstandUitkering property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.InkomstenBijstandUitkering }
                 *     
                 */
                public void setInkomstenBijstandUitkering(BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.InkomstenBijstandUitkering value) {
                    this.inkomstenBijstandUitkering = value;
                }

                /**
                 * Gets the value of the normbedrag property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the normbedrag property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNormbedrag().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.Normbedrag }
                 * 
                 * 
                 * @return
                 *     The value of the normbedrag property.
                 */
                public List<BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.Normbedrag> getNormbedrag() {
                    if (normbedrag == null) {
                        normbedrag = new ArrayList<>();
                    }
                    return this.normbedrag;
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
                 *         <element name="BedrTotaalInkomstenUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
                 *         <element name="BedrBetaalbaarGesteldeUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
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
                    "bedrTotaalInkomstenUitkering",
                    "bedrBetaalbaarGesteldeUitkering"
                })
                public static class InkomstenBijstandUitkering {

                    @XmlElement(name = "BedrTotaalInkomstenUitkering")
                    protected StandaardBedr bedrTotaalInkomstenUitkering;
                    @XmlElement(name = "BedrBetaalbaarGesteldeUitkering")
                    protected StandaardBedr bedrBetaalbaarGesteldeUitkering;

                    /**
                     * Gets the value of the bedrTotaalInkomstenUitkering property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link StandaardBedr }
                     *     
                     */
                    public StandaardBedr getBedrTotaalInkomstenUitkering() {
                        return bedrTotaalInkomstenUitkering;
                    }

                    /**
                     * Sets the value of the bedrTotaalInkomstenUitkering property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link StandaardBedr }
                     *     
                     */
                    public void setBedrTotaalInkomstenUitkering(StandaardBedr value) {
                        this.bedrTotaalInkomstenUitkering = value;
                    }

                    /**
                     * Gets the value of the bedrBetaalbaarGesteldeUitkering property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link StandaardBedr }
                     *     
                     */
                    public StandaardBedr getBedrBetaalbaarGesteldeUitkering() {
                        return bedrBetaalbaarGesteldeUitkering;
                    }

                    /**
                     * Sets the value of the bedrBetaalbaarGesteldeUitkering property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link StandaardBedr }
                     *     
                     */
                    public void setBedrBetaalbaarGesteldeUitkering(StandaardBedr value) {
                        this.bedrBetaalbaarGesteldeUitkering = value;
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
                 *         <element name="DatBMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
                 *         <element name="DatEMaatregelMbtUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *         <element name="RedenMaatregelMbtBijstandUitk" minOccurs="0">
                 *           <complexType>
                 *             <complexContent>
                 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 <sequence>
                 *                   <element name="CdRedenMaatregelMbtBijstandUitk" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRedenMaatregelMbtBijstandUitk" minOccurs="0"/>
                 *                   <element name="GevolgenMaatregelMbtBijstandUitk" minOccurs="0">
                 *                     <complexType>
                 *                       <complexContent>
                 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           <sequence>
                 *                             <element name="BedrVerminderingUitkMbtMaatregel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr"/>
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
                    "datBMaatregelMbtUitkering",
                    "datEMaatregelMbtUitkering",
                    "redenMaatregelMbtBijstandUitk"
                })
                public static class MaatregelMbtUitkering {

                    @XmlElement(name = "DatBMaatregelMbtUitkering", required = true)
                    protected String datBMaatregelMbtUitkering;
                    @XmlElement(name = "DatEMaatregelMbtUitkering")
                    protected String datEMaatregelMbtUitkering;
                    @XmlElement(name = "RedenMaatregelMbtBijstandUitk")
                    protected BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk redenMaatregelMbtBijstandUitk;

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
                     * Gets the value of the redenMaatregelMbtBijstandUitk property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk }
                     *     
                     */
                    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk getRedenMaatregelMbtBijstandUitk() {
                        return redenMaatregelMbtBijstandUitk;
                    }

                    /**
                     * Sets the value of the redenMaatregelMbtBijstandUitk property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk }
                     *     
                     */
                    public void setRedenMaatregelMbtBijstandUitk(BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk value) {
                        this.redenMaatregelMbtBijstandUitk = value;
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
                     *         <element name="CdRedenMaatregelMbtBijstandUitk" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRedenMaatregelMbtBijstandUitk" minOccurs="0"/>
                     *         <element name="GevolgenMaatregelMbtBijstandUitk" minOccurs="0">
                     *           <complexType>
                     *             <complexContent>
                     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 <sequence>
                     *                   <element name="BedrVerminderingUitkMbtMaatregel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr"/>
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
                        "cdRedenMaatregelMbtBijstandUitk",
                        "gevolgenMaatregelMbtBijstandUitk"
                    })
                    public static class RedenMaatregelMbtBijstandUitk {

                        @XmlElement(name = "CdRedenMaatregelMbtBijstandUitk")
                        protected String cdRedenMaatregelMbtBijstandUitk;
                        @XmlElement(name = "GevolgenMaatregelMbtBijstandUitk")
                        protected BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk.GevolgenMaatregelMbtBijstandUitk gevolgenMaatregelMbtBijstandUitk;

                        /**
                         * Gets the value of the cdRedenMaatregelMbtBijstandUitk property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCdRedenMaatregelMbtBijstandUitk() {
                            return cdRedenMaatregelMbtBijstandUitk;
                        }

                        /**
                         * Sets the value of the cdRedenMaatregelMbtBijstandUitk property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCdRedenMaatregelMbtBijstandUitk(String value) {
                            this.cdRedenMaatregelMbtBijstandUitk = value;
                        }

                        /**
                         * Gets the value of the gevolgenMaatregelMbtBijstandUitk property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk.GevolgenMaatregelMbtBijstandUitk }
                         *     
                         */
                        public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk.GevolgenMaatregelMbtBijstandUitk getGevolgenMaatregelMbtBijstandUitk() {
                            return gevolgenMaatregelMbtBijstandUitk;
                        }

                        /**
                         * Sets the value of the gevolgenMaatregelMbtBijstandUitk property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk.GevolgenMaatregelMbtBijstandUitk }
                         *     
                         */
                        public void setGevolgenMaatregelMbtBijstandUitk(BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk.GevolgenMaatregelMbtBijstandUitk value) {
                            this.gevolgenMaatregelMbtBijstandUitk = value;
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
                         *         <element name="BedrVerminderingUitkMbtMaatregel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr"/>
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
                            "bedrVerminderingUitkMbtMaatregel"
                        })
                        public static class GevolgenMaatregelMbtBijstandUitk {

                            @XmlElement(name = "BedrVerminderingUitkMbtMaatregel", required = true)
                            protected StandaardBedr bedrVerminderingUitkMbtMaatregel;

                            /**
                             * Gets the value of the bedrVerminderingUitkMbtMaatregel property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link StandaardBedr }
                             *     
                             */
                            public StandaardBedr getBedrVerminderingUitkMbtMaatregel() {
                                return bedrVerminderingUitkMbtMaatregel;
                            }

                            /**
                             * Sets the value of the bedrVerminderingUitkMbtMaatregel property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link StandaardBedr }
                             *     
                             */
                            public void setBedrVerminderingUitkMbtMaatregel(StandaardBedr value) {
                                this.bedrVerminderingUitkMbtMaatregel = value;
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
                 *         <element name="CdSrtNormbedrag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtNormbedrag"/>
                 *         <element name="CdMunteenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdMunteenheid" minOccurs="0"/>
                 *         <element name="WaardeBedr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}WaardeBedr"/>
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
                    "cdSrtNormbedrag",
                    "cdMunteenheid",
                    "waardeBedr"
                })
                public static class Normbedrag {

                    @XmlElement(name = "CdSrtNormbedrag", required = true)
                    protected String cdSrtNormbedrag;
                    @XmlElement(name = "CdMunteenheid")
                    protected String cdMunteenheid;
                    @XmlElement(name = "WaardeBedr", required = true)
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger waardeBedr;

                    /**
                     * Gets the value of the cdSrtNormbedrag property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdSrtNormbedrag() {
                        return cdSrtNormbedrag;
                    }

                    /**
                     * Sets the value of the cdSrtNormbedrag property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdSrtNormbedrag(String value) {
                        this.cdSrtNormbedrag = value;
                    }

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
             *         <element name="CdVrijstellingArbeidsplichtBijst" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdVrijstellingArbeidsplichtBijst"/>
             *         <element name="DatEVrijstellingArbeidsplicht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="CdRedenEVrijstArbeidsplichtBijst" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRedenEVrijstArbeidsplichtBijst" minOccurs="0"/>
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
                "cdVrijstellingArbeidsplichtBijst",
                "datEVrijstellingArbeidsplicht",
                "cdRedenEVrijstArbeidsplichtBijst"
            })
            public static class VrijstellingArbeidsplicht {

                @XmlElement(name = "CdVrijstellingArbeidsplichtBijst", required = true)
                protected String cdVrijstellingArbeidsplichtBijst;
                @XmlElement(name = "DatEVrijstellingArbeidsplicht")
                protected String datEVrijstellingArbeidsplicht;
                @XmlElement(name = "CdRedenEVrijstArbeidsplichtBijst")
                protected String cdRedenEVrijstArbeidsplichtBijst;

                /**
                 * Gets the value of the cdVrijstellingArbeidsplichtBijst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdVrijstellingArbeidsplichtBijst() {
                    return cdVrijstellingArbeidsplichtBijst;
                }

                /**
                 * Sets the value of the cdVrijstellingArbeidsplichtBijst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdVrijstellingArbeidsplichtBijst(String value) {
                    this.cdVrijstellingArbeidsplichtBijst = value;
                }

                /**
                 * Gets the value of the datEVrijstellingArbeidsplicht property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEVrijstellingArbeidsplicht() {
                    return datEVrijstellingArbeidsplicht;
                }

                /**
                 * Sets the value of the datEVrijstellingArbeidsplicht property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEVrijstellingArbeidsplicht(String value) {
                    this.datEVrijstellingArbeidsplicht = value;
                }

                /**
                 * Gets the value of the cdRedenEVrijstArbeidsplichtBijst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdRedenEVrijstArbeidsplichtBijst() {
                    return cdRedenEVrijstArbeidsplichtBijst;
                }

                /**
                 * Sets the value of the cdRedenEVrijstArbeidsplichtBijst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdRedenEVrijstArbeidsplichtBijst(String value) {
                    this.cdRedenEVrijstArbeidsplichtBijst = value;
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
         *         <element name="IdentificatienrVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerN15" minOccurs="0"/>
         *         <element name="DatBesluitVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="CdRedenVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRedenVordering" minOccurs="0"/>
         *         <element name="BedrAanvangVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *         <element name="CdStatusVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVordering" minOccurs="0"/>
         *         <element name="BedrSaldoVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *         <element name="DatOnherroepelijkVordering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
         *         <element name="PartnerVordering" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Partner">
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Fraude" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="IndRecidive" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *                   <element name="IndRobuusteIncassoToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *                   <element name="CdHoogteBestuurlijkeBoete" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdHoogteBestuurlijkeBoete" minOccurs="0"/>
         *                   <element name="CdSrtSanctie" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdSrtSanctie" minOccurs="0"/>
         *                   <element name="ParketnrJustitie" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}ParketnrJustitie" minOccurs="0"/>
         *                   <element name="CdRecidivetermijn" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRecidivetermijn" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Bron" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Bron"/>
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
            "identificatienrVordering",
            "datBesluitVordering",
            "cdRedenVordering",
            "bedrAanvangVordering",
            "cdStatusVordering",
            "bedrSaldoVordering",
            "datOnherroepelijkVordering",
            "szWet",
            "partnerVordering",
            "fraude",
            "bron"
        })
        public static class Vordering {

            @XmlElement(name = "IdentificatienrVordering")
            protected String identificatienrVordering;
            @XmlElement(name = "DatBesluitVordering")
            protected String datBesluitVordering;
            @XmlElement(name = "CdRedenVordering")
            protected String cdRedenVordering;
            @XmlElement(name = "BedrAanvangVordering")
            protected StandaardBedr bedrAanvangVordering;
            @XmlElement(name = "CdStatusVordering")
            protected String cdStatusVordering;
            @XmlElement(name = "BedrSaldoVordering")
            protected StandaardBedr bedrSaldoVordering;
            @XmlElement(name = "DatOnherroepelijkVordering")
            protected String datOnherroepelijkVordering;
            @XmlElement(name = "SzWet", required = true)
            protected BijstandsregelingenInfoResponse.ClientSuwi.Vordering.SzWet szWet;
            @XmlElement(name = "PartnerVordering")
            protected List<BijstandsregelingenInfoResponse.ClientSuwi.Vordering.PartnerVordering> partnerVordering;
            @XmlElement(name = "Fraude")
            protected BijstandsregelingenInfoResponse.ClientSuwi.Vordering.Fraude fraude;
            @XmlElement(name = "Bron", required = true)
            protected Bron bron;

            /**
             * Gets the value of the identificatienrVordering property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentificatienrVordering() {
                return identificatienrVordering;
            }

            /**
             * Sets the value of the identificatienrVordering property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentificatienrVordering(String value) {
                this.identificatienrVordering = value;
            }

            /**
             * Gets the value of the datBesluitVordering property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatBesluitVordering() {
                return datBesluitVordering;
            }

            /**
             * Sets the value of the datBesluitVordering property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatBesluitVordering(String value) {
                this.datBesluitVordering = value;
            }

            /**
             * Gets the value of the cdRedenVordering property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdRedenVordering() {
                return cdRedenVordering;
            }

            /**
             * Sets the value of the cdRedenVordering property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdRedenVordering(String value) {
                this.cdRedenVordering = value;
            }

            /**
             * Gets the value of the bedrAanvangVordering property.
             * 
             * @return
             *     possible object is
             *     {@link StandaardBedr }
             *     
             */
            public StandaardBedr getBedrAanvangVordering() {
                return bedrAanvangVordering;
            }

            /**
             * Sets the value of the bedrAanvangVordering property.
             * 
             * @param value
             *     allowed object is
             *     {@link StandaardBedr }
             *     
             */
            public void setBedrAanvangVordering(StandaardBedr value) {
                this.bedrAanvangVordering = value;
            }

            /**
             * Gets the value of the cdStatusVordering property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdStatusVordering() {
                return cdStatusVordering;
            }

            /**
             * Sets the value of the cdStatusVordering property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdStatusVordering(String value) {
                this.cdStatusVordering = value;
            }

            /**
             * Gets the value of the bedrSaldoVordering property.
             * 
             * @return
             *     possible object is
             *     {@link StandaardBedr }
             *     
             */
            public StandaardBedr getBedrSaldoVordering() {
                return bedrSaldoVordering;
            }

            /**
             * Sets the value of the bedrSaldoVordering property.
             * 
             * @param value
             *     allowed object is
             *     {@link StandaardBedr }
             *     
             */
            public void setBedrSaldoVordering(StandaardBedr value) {
                this.bedrSaldoVordering = value;
            }

            /**
             * Gets the value of the datOnherroepelijkVordering property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatOnherroepelijkVordering() {
                return datOnherroepelijkVordering;
            }

            /**
             * Sets the value of the datOnherroepelijkVordering property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatOnherroepelijkVordering(String value) {
                this.datOnherroepelijkVordering = value;
            }

            /**
             * Gets the value of the szWet property.
             * 
             * @return
             *     possible object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering.SzWet }
             *     
             */
            public BijstandsregelingenInfoResponse.ClientSuwi.Vordering.SzWet getSzWet() {
                return szWet;
            }

            /**
             * Sets the value of the szWet property.
             * 
             * @param value
             *     allowed object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering.SzWet }
             *     
             */
            public void setSzWet(BijstandsregelingenInfoResponse.ClientSuwi.Vordering.SzWet value) {
                this.szWet = value;
            }

            /**
             * Gets the value of the partnerVordering property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the partnerVordering property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPartnerVordering().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering.PartnerVordering }
             * 
             * 
             * @return
             *     The value of the partnerVordering property.
             */
            public List<BijstandsregelingenInfoResponse.ClientSuwi.Vordering.PartnerVordering> getPartnerVordering() {
                if (partnerVordering == null) {
                    partnerVordering = new ArrayList<>();
                }
                return this.partnerVordering;
            }

            /**
             * Gets the value of the fraude property.
             * 
             * @return
             *     possible object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering.Fraude }
             *     
             */
            public BijstandsregelingenInfoResponse.ClientSuwi.Vordering.Fraude getFraude() {
                return fraude;
            }

            /**
             * Sets the value of the fraude property.
             * 
             * @param value
             *     allowed object is
             *     {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering.Fraude }
             *     
             */
            public void setFraude(BijstandsregelingenInfoResponse.ClientSuwi.Vordering.Fraude value) {
                this.fraude = value;
            }

            /**
             * Gets the value of the bron property.
             * 
             * @return
             *     possible object is
             *     {@link Bron }
             *     
             */
            public Bron getBron() {
                return bron;
            }

            /**
             * Sets the value of the bron property.
             * 
             * @param value
             *     allowed object is
             *     {@link Bron }
             *     
             */
            public void setBron(Bron value) {
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
             *         <element name="IndRecidive" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
             *         <element name="IndRobuusteIncassoToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
             *         <element name="CdHoogteBestuurlijkeBoete" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdHoogteBestuurlijkeBoete" minOccurs="0"/>
             *         <element name="CdSrtSanctie" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdSrtSanctie" minOccurs="0"/>
             *         <element name="ParketnrJustitie" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}ParketnrJustitie" minOccurs="0"/>
             *         <element name="CdRecidivetermijn" type="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}CdRecidivetermijn" minOccurs="0"/>
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
                "indRecidive",
                "indRobuusteIncassoToegepast",
                "cdHoogteBestuurlijkeBoete",
                "cdSrtSanctie",
                "parketnrJustitie",
                "cdRecidivetermijn"
            })
            public static class Fraude {

                @XmlElement(name = "IndRecidive")
                protected String indRecidive;
                @XmlElement(name = "IndRobuusteIncassoToegepast")
                protected String indRobuusteIncassoToegepast;
                @XmlElement(name = "CdHoogteBestuurlijkeBoete")
                protected String cdHoogteBestuurlijkeBoete;
                @XmlElement(name = "CdSrtSanctie")
                protected String cdSrtSanctie;
                @XmlElement(name = "ParketnrJustitie")
                protected String parketnrJustitie;
                @XmlElement(name = "CdRecidivetermijn")
                protected String cdRecidivetermijn;

                /**
                 * Gets the value of the indRecidive property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndRecidive() {
                    return indRecidive;
                }

                /**
                 * Sets the value of the indRecidive property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndRecidive(String value) {
                    this.indRecidive = value;
                }

                /**
                 * Gets the value of the indRobuusteIncassoToegepast property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndRobuusteIncassoToegepast() {
                    return indRobuusteIncassoToegepast;
                }

                /**
                 * Sets the value of the indRobuusteIncassoToegepast property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndRobuusteIncassoToegepast(String value) {
                    this.indRobuusteIncassoToegepast = value;
                }

                /**
                 * Gets the value of the cdHoogteBestuurlijkeBoete property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdHoogteBestuurlijkeBoete() {
                    return cdHoogteBestuurlijkeBoete;
                }

                /**
                 * Sets the value of the cdHoogteBestuurlijkeBoete property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdHoogteBestuurlijkeBoete(String value) {
                    this.cdHoogteBestuurlijkeBoete = value;
                }

                /**
                 * Gets the value of the cdSrtSanctie property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdSrtSanctie() {
                    return cdSrtSanctie;
                }

                /**
                 * Sets the value of the cdSrtSanctie property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdSrtSanctie(String value) {
                    this.cdSrtSanctie = value;
                }

                /**
                 * Gets the value of the parketnrJustitie property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParketnrJustitie() {
                    return parketnrJustitie;
                }

                /**
                 * Sets the value of the parketnrJustitie property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParketnrJustitie(String value) {
                    this.parketnrJustitie = value;
                }

                /**
                 * Gets the value of the cdRecidivetermijn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdRecidivetermijn() {
                    return cdRecidivetermijn;
                }

                /**
                 * Sets the value of the cdRecidivetermijn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdRecidivetermijn(String value) {
                    this.cdRecidivetermijn = value;
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
             *     <extension base="{http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500}Partner">
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PartnerVordering
                extends Partner
            {


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

    }

}
