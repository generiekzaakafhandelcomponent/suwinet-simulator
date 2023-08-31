
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <choice>
 *           <sequence>
 *             <element name="ClientSuwi" maxOccurs="unbounded">
 *               <complexType>
 *                 <complexContent>
 *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     <sequence>
 *                       <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr" minOccurs="0"/>
 *                       <element name="Voorletters" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorletters" minOccurs="0"/>
 *                       <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
 *                       <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *                       <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                       <element name="RdwAdres" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="FeitelijkAdres" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="Correspondentieadres" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="Aansprakelijke" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="DatRegistratieAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                 <element name="TijdBAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdstip" minOccurs="0"/>
 *                                 <element name="DatEAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                 <element name="Voertuig" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
 *                                           <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
 *                                           <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
 *                                                     <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                     <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
 *                                           <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
 *                                           <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
 *                                           <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
 *                                           <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                           <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                           <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                           <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                           <element name="TellerstandVoertuig" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
 *                                                     <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
 *                                           <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
 *                                           <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
 *                                           <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </sequence>
 *                   </restriction>
 *                 </complexContent>
 *               </complexType>
 *             </element>
 *             <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}FWI" minOccurs="0"/>
 *           </sequence>
 *           <sequence>
 *             <element name="OndernemingInst" maxOccurs="unbounded">
 *               <complexType>
 *                 <complexContent>
 *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     <sequence>
 *                       <element name="Rechtspersoon" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="FiNr" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}FiNr" minOccurs="0"/>
 *                                 <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200"/>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="VestigingOndernemingInst" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="BezoekadresVestiging" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="CorrespondentieadresVestiging" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="Aansprakelijke" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="DatRegistratieAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                 <element name="DatEAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                 <element name="Voertuig" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
 *                                           <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
 *                                           <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
 *                                                     <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                     <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
 *                                           <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
 *                                           <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
 *                                           <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
 *                                           <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                           <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                           <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                           <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                           <element name="TellerstandVoertuig" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
 *                                                     <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
 *                                           <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
 *                                           <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
 *                                           <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="Handelaarskenteken" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
 *                                           <element name="StatusHandelaarskenteken" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="CdStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusHandelaarskenteken" minOccurs="0"/>
 *                                                     <element name="DatRegStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </sequence>
 *                   </restriction>
 *                 </complexContent>
 *               </complexType>
 *             </element>
 *             <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}FWI" minOccurs="0"/>
 *           </sequence>
 *           <sequence>
 *             <element name="HandelaarOndernemingInst" maxOccurs="unbounded">
 *               <complexType>
 *                 <complexContent>
 *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     <sequence>
 *                       <element name="Rechtspersoon" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200"/>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="VestigingOndernemingInst" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="RdwBedrijfsnr" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VolgnrN5" minOccurs="0"/>
 *                                 <element name="NaamOndernemingInst" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="HandelsnaamOrganisatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="ContactpersoonAfdVestiging" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="BezoekadresVestiging" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="CorrespondentieadresVestiging" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="Aansprakelijke" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="DatRegistratieAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                                 <element name="TijdBAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdstip" minOccurs="0"/>
 *                                 <element name="DatEAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                 <element name="Voertuig" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
 *                                           <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6"/>
 *                                           <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig"/>
 *                                                     <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                                                     <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
 *                                           <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
 *                                           <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
 *                                           <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
 *                                           <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                           <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                           <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                           <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                           <element name="TellerstandVoertuig" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
 *                                                     <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
 *                                           <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
 *                                           <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
 *                                           <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="Handelaarskenteken" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
 *                                           <element name="StatusHandelaarskenteken" minOccurs="0">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="CdStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusHandelaarskenteken" minOccurs="0"/>
 *                                                     <element name="DatRegStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </sequence>
 *                   </restriction>
 *                 </complexContent>
 *               </complexType>
 *             </element>
 *             <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}FWI" minOccurs="0"/>
 *           </sequence>
 *         </choice>
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
@XmlRootElement(name = "KentekenInfoResponse")
public class KentekenInfoResponse {

    @XmlElementRefs({
        @XmlElementRef(name = "ClientSuwi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FWI", namespace = "http://bkwi.nl/SuwiML/FWI/v0205", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OndernemingInst", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HandelaarOndernemingInst", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NietsGevonden", namespace = "http://bkwi.nl/SuwiML/FWI/v0205", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "FWI" is used by two different parts of a schema. See: 
     * line 334 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyReaction.xsd
     * line 230 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyReaction.xsd
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
     * {@link JAXBElement }{@code <}{@link KentekenInfoResponse.ClientSuwi }{@code >}
     * {@link JAXBElement }{@code <}{@link KentekenInfoResponse.HandelaarOndernemingInst }{@code >}
     * {@link JAXBElement }{@code <}{@link KentekenInfoResponse.OndernemingInst }{@code >}
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
     *         <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr" minOccurs="0"/>
     *         <element name="Voorletters" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorletters" minOccurs="0"/>
     *         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
     *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
     *         <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *         <element name="RdwAdres" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="FeitelijkAdres" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Correspondentieadres" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
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
     *         <element name="Aansprakelijke" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="DatRegistratieAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="TijdBAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdstip" minOccurs="0"/>
     *                   <element name="DatEAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="Voertuig" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
     *                             <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
     *                             <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
     *                                       <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                       <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
     *                             <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
     *                             <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
     *                             <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
     *                             <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="TellerstandVoertuig" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
     *                                       <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
     *                             <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
     *                             <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
     *                             <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
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
        "voorletters",
        "voorvoegsel",
        "significantDeelVanDeAchternaam",
        "geboortedat",
        "rdwAdres",
        "aansprakelijke"
    })
    public static class ClientSuwi {

        @XmlElement(name = "Burgerservicenr")
        protected String burgerservicenr;
        @XmlElement(name = "Voorletters")
        protected String voorletters;
        @XmlElement(name = "Voorvoegsel")
        protected String voorvoegsel;
        @XmlElement(name = "SignificantDeelVanDeAchternaam")
        protected String significantDeelVanDeAchternaam;
        @XmlElement(name = "Geboortedat")
        protected String geboortedat;
        @XmlElement(name = "RdwAdres")
        protected List<KentekenInfoResponse.ClientSuwi.RdwAdres> rdwAdres;
        @XmlElement(name = "Aansprakelijke")
        protected List<KentekenInfoResponse.ClientSuwi.Aansprakelijke> aansprakelijke;

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
         * Gets the value of the rdwAdres property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the rdwAdres property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRdwAdres().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KentekenInfoResponse.ClientSuwi.RdwAdres }
         * 
         * 
         * @return
         *     The value of the rdwAdres property.
         */
        public List<KentekenInfoResponse.ClientSuwi.RdwAdres> getRdwAdres() {
            if (rdwAdres == null) {
                rdwAdres = new ArrayList<>();
            }
            return this.rdwAdres;
        }

        /**
         * Gets the value of the aansprakelijke property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the aansprakelijke property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAansprakelijke().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke }
         * 
         * 
         * @return
         *     The value of the aansprakelijke property.
         */
        public List<KentekenInfoResponse.ClientSuwi.Aansprakelijke> getAansprakelijke() {
            if (aansprakelijke == null) {
                aansprakelijke = new ArrayList<>();
            }
            return this.aansprakelijke;
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
         *         <element name="DatRegistratieAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="TijdBAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdstip" minOccurs="0"/>
         *         <element name="DatEAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="Voertuig" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
         *                   <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
         *                   <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
         *                             <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                             <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
         *                   <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
         *                   <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
         *                   <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
         *                   <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="TellerstandVoertuig" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
         *                             <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
         *                   <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
         *                   <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
         *                   <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
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
            "datRegistratieAansprakelijkheid",
            "tijdBAansprakelijkheid",
            "datEAansprakelijkheid",
            "voertuig"
        })
        public static class Aansprakelijke {

            @XmlElement(name = "DatRegistratieAansprakelijkheid")
            protected String datRegistratieAansprakelijkheid;
            @XmlElement(name = "TijdBAansprakelijkheid")
            protected String tijdBAansprakelijkheid;
            @XmlElement(name = "DatEAansprakelijkheid")
            protected String datEAansprakelijkheid;
            @XmlElement(name = "Voertuig")
            protected KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig voertuig;

            /**
             * Gets the value of the datRegistratieAansprakelijkheid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatRegistratieAansprakelijkheid() {
                return datRegistratieAansprakelijkheid;
            }

            /**
             * Sets the value of the datRegistratieAansprakelijkheid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatRegistratieAansprakelijkheid(String value) {
                this.datRegistratieAansprakelijkheid = value;
            }

            /**
             * Gets the value of the tijdBAansprakelijkheid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTijdBAansprakelijkheid() {
                return tijdBAansprakelijkheid;
            }

            /**
             * Sets the value of the tijdBAansprakelijkheid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTijdBAansprakelijkheid(String value) {
                this.tijdBAansprakelijkheid = value;
            }

            /**
             * Gets the value of the datEAansprakelijkheid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatEAansprakelijkheid() {
                return datEAansprakelijkheid;
            }

            /**
             * Sets the value of the datEAansprakelijkheid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatEAansprakelijkheid(String value) {
                this.datEAansprakelijkheid = value;
            }

            /**
             * Gets the value of the voertuig property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig }
             *     
             */
            public KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig getVoertuig() {
                return voertuig;
            }

            /**
             * Sets the value of the voertuig property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig }
             *     
             */
            public void setVoertuig(KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig value) {
                this.voertuig = value;
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
             *         <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
             *         <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
             *         <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
             *                   <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                   <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
             *         <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
             *         <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
             *         <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
             *         <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="TellerstandVoertuig" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
             *                   <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
             *         <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
             *         <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
             *         <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
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
                "cdSrtVoertuig",
                "kentekenVoertuig",
                "statusVoertuig",
                "merkVoertuig",
                "typeVoertuig",
                "hoofdkleurVoertuig",
                "nevenkleurVoertuig",
                "datEersteInschrijvingVoertuigNat",
                "datEersteInschrijvingVoertuigInt",
                "bedrBpm",
                "bedrCatalogusVoertuig",
                "tellerstandVoertuig",
                "keuring",
                "verstrekkingsvoorbehoudVoertuig",
                "voertuigverplichtingen",
                "voertuigverplichtingennemer",
                "verzekering"
            })
            public static class Voertuig {

                @XmlElement(name = "CdSrtVoertuig")
                protected String cdSrtVoertuig;
                @XmlElement(name = "KentekenVoertuig")
                protected String kentekenVoertuig;
                @XmlElement(name = "StatusVoertuig")
                protected List<KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.StatusVoertuig> statusVoertuig;
                @XmlElement(name = "MerkVoertuig")
                protected String merkVoertuig;
                @XmlElement(name = "TypeVoertuig")
                protected String typeVoertuig;
                @XmlElement(name = "HoofdkleurVoertuig")
                protected String hoofdkleurVoertuig;
                @XmlElement(name = "NevenkleurVoertuig")
                protected String nevenkleurVoertuig;
                @XmlElement(name = "DatEersteInschrijvingVoertuigNat")
                protected String datEersteInschrijvingVoertuigNat;
                @XmlElement(name = "DatEersteInschrijvingVoertuigInt")
                protected String datEersteInschrijvingVoertuigInt;
                @XmlElement(name = "BedrBpm")
                protected StandaardBedr bedrBpm;
                @XmlElement(name = "BedrCatalogusVoertuig")
                protected StandaardBedr bedrCatalogusVoertuig;
                @XmlElement(name = "TellerstandVoertuig")
                protected KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.TellerstandVoertuig tellerstandVoertuig;
                @XmlElement(name = "Keuring")
                protected List<KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.Keuring> keuring;
                @XmlElement(name = "VerstrekkingsvoorbehoudVoertuig")
                protected VerstrekkingsvoorbehoudVoertuig verstrekkingsvoorbehoudVoertuig;
                @XmlElement(name = "Voertuigverplichtingen")
                protected Voertuigverplichtingen voertuigverplichtingen;
                @XmlElement(name = "Voertuigverplichtingennemer")
                protected Voertuigverplichtingennemer voertuigverplichtingennemer;
                @XmlElement(name = "Verzekering")
                protected Verzekering verzekering;

                /**
                 * Gets the value of the cdSrtVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdSrtVoertuig() {
                    return cdSrtVoertuig;
                }

                /**
                 * Sets the value of the cdSrtVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdSrtVoertuig(String value) {
                    this.cdSrtVoertuig = value;
                }

                /**
                 * Gets the value of the kentekenVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKentekenVoertuig() {
                    return kentekenVoertuig;
                }

                /**
                 * Sets the value of the kentekenVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKentekenVoertuig(String value) {
                    this.kentekenVoertuig = value;
                }

                /**
                 * Gets the value of the statusVoertuig property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the statusVoertuig property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStatusVoertuig().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.StatusVoertuig }
                 * 
                 * 
                 * @return
                 *     The value of the statusVoertuig property.
                 */
                public List<KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.StatusVoertuig> getStatusVoertuig() {
                    if (statusVoertuig == null) {
                        statusVoertuig = new ArrayList<>();
                    }
                    return this.statusVoertuig;
                }

                /**
                 * Gets the value of the merkVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMerkVoertuig() {
                    return merkVoertuig;
                }

                /**
                 * Sets the value of the merkVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMerkVoertuig(String value) {
                    this.merkVoertuig = value;
                }

                /**
                 * Gets the value of the typeVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeVoertuig() {
                    return typeVoertuig;
                }

                /**
                 * Sets the value of the typeVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeVoertuig(String value) {
                    this.typeVoertuig = value;
                }

                /**
                 * Gets the value of the hoofdkleurVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHoofdkleurVoertuig() {
                    return hoofdkleurVoertuig;
                }

                /**
                 * Sets the value of the hoofdkleurVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHoofdkleurVoertuig(String value) {
                    this.hoofdkleurVoertuig = value;
                }

                /**
                 * Gets the value of the nevenkleurVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNevenkleurVoertuig() {
                    return nevenkleurVoertuig;
                }

                /**
                 * Sets the value of the nevenkleurVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNevenkleurVoertuig(String value) {
                    this.nevenkleurVoertuig = value;
                }

                /**
                 * Gets the value of the datEersteInschrijvingVoertuigNat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEersteInschrijvingVoertuigNat() {
                    return datEersteInschrijvingVoertuigNat;
                }

                /**
                 * Sets the value of the datEersteInschrijvingVoertuigNat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEersteInschrijvingVoertuigNat(String value) {
                    this.datEersteInschrijvingVoertuigNat = value;
                }

                /**
                 * Gets the value of the datEersteInschrijvingVoertuigInt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEersteInschrijvingVoertuigInt() {
                    return datEersteInschrijvingVoertuigInt;
                }

                /**
                 * Sets the value of the datEersteInschrijvingVoertuigInt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEersteInschrijvingVoertuigInt(String value) {
                    this.datEersteInschrijvingVoertuigInt = value;
                }

                /**
                 * Gets the value of the bedrBpm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrBpm() {
                    return bedrBpm;
                }

                /**
                 * Sets the value of the bedrBpm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrBpm(StandaardBedr value) {
                    this.bedrBpm = value;
                }

                /**
                 * Gets the value of the bedrCatalogusVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrCatalogusVoertuig() {
                    return bedrCatalogusVoertuig;
                }

                /**
                 * Sets the value of the bedrCatalogusVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrCatalogusVoertuig(StandaardBedr value) {
                    this.bedrCatalogusVoertuig = value;
                }

                /**
                 * Gets the value of the tellerstandVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.TellerstandVoertuig }
                 *     
                 */
                public KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.TellerstandVoertuig getTellerstandVoertuig() {
                    return tellerstandVoertuig;
                }

                /**
                 * Sets the value of the tellerstandVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.TellerstandVoertuig }
                 *     
                 */
                public void setTellerstandVoertuig(KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.TellerstandVoertuig value) {
                    this.tellerstandVoertuig = value;
                }

                /**
                 * Gets the value of the keuring property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the keuring property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getKeuring().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.Keuring }
                 * 
                 * 
                 * @return
                 *     The value of the keuring property.
                 */
                public List<KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.Keuring> getKeuring() {
                    if (keuring == null) {
                        keuring = new ArrayList<>();
                    }
                    return this.keuring;
                }

                /**
                 * Gets the value of the verstrekkingsvoorbehoudVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link VerstrekkingsvoorbehoudVoertuig }
                 *     
                 */
                public VerstrekkingsvoorbehoudVoertuig getVerstrekkingsvoorbehoudVoertuig() {
                    return verstrekkingsvoorbehoudVoertuig;
                }

                /**
                 * Sets the value of the verstrekkingsvoorbehoudVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link VerstrekkingsvoorbehoudVoertuig }
                 *     
                 */
                public void setVerstrekkingsvoorbehoudVoertuig(VerstrekkingsvoorbehoudVoertuig value) {
                    this.verstrekkingsvoorbehoudVoertuig = value;
                }

                /**
                 * Gets the value of the voertuigverplichtingen property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Voertuigverplichtingen }
                 *     
                 */
                public Voertuigverplichtingen getVoertuigverplichtingen() {
                    return voertuigverplichtingen;
                }

                /**
                 * Sets the value of the voertuigverplichtingen property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Voertuigverplichtingen }
                 *     
                 */
                public void setVoertuigverplichtingen(Voertuigverplichtingen value) {
                    this.voertuigverplichtingen = value;
                }

                /**
                 * Gets the value of the voertuigverplichtingennemer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Voertuigverplichtingennemer }
                 *     
                 */
                public Voertuigverplichtingennemer getVoertuigverplichtingennemer() {
                    return voertuigverplichtingennemer;
                }

                /**
                 * Sets the value of the voertuigverplichtingennemer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Voertuigverplichtingennemer }
                 *     
                 */
                public void setVoertuigverplichtingennemer(Voertuigverplichtingennemer value) {
                    this.voertuigverplichtingennemer = value;
                }

                /**
                 * Gets the value of the verzekering property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Verzekering }
                 *     
                 */
                public Verzekering getVerzekering() {
                    return verzekering;
                }

                /**
                 * Sets the value of the verzekering property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Verzekering }
                 *     
                 */
                public void setVerzekering(Verzekering value) {
                    this.verzekering = value;
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
                 *         <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                    "datEGeldigheidApk"
                })
                public static class Keuring {

                    @XmlElement(name = "DatEGeldigheidApk")
                    protected String datEGeldigheidApk;

                    /**
                     * Gets the value of the datEGeldigheidApk property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatEGeldigheidApk() {
                        return datEGeldigheidApk;
                    }

                    /**
                     * Sets the value of the datEGeldigheidApk property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatEGeldigheidApk(String value) {
                        this.datEGeldigheidApk = value;
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
                 *         <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
                 *         <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *         <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                    "cdStatusVoertuig",
                    "datBStatusVoertuig",
                    "datEStatusVoertuig"
                })
                public static class StatusVoertuig {

                    @XmlElement(name = "CdStatusVoertuig")
                    protected String cdStatusVoertuig;
                    @XmlElement(name = "DatBStatusVoertuig")
                    protected String datBStatusVoertuig;
                    @XmlElement(name = "DatEStatusVoertuig")
                    protected String datEStatusVoertuig;

                    /**
                     * Gets the value of the cdStatusVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdStatusVoertuig() {
                        return cdStatusVoertuig;
                    }

                    /**
                     * Sets the value of the cdStatusVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdStatusVoertuig(String value) {
                        this.cdStatusVoertuig = value;
                    }

                    /**
                     * Gets the value of the datBStatusVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatBStatusVoertuig() {
                        return datBStatusVoertuig;
                    }

                    /**
                     * Sets the value of the datBStatusVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatBStatusVoertuig(String value) {
                        this.datBStatusVoertuig = value;
                    }

                    /**
                     * Gets the value of the datEStatusVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatEStatusVoertuig() {
                        return datEStatusVoertuig;
                    }

                    /**
                     * Sets the value of the datEStatusVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatEStatusVoertuig(String value) {
                        this.datEStatusVoertuig = value;
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
                 *         <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
                 *         <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
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
                    "tellerstandVoertuig",
                    "cdTellerstandeenheidVoertuig"
                })
                public static class TellerstandVoertuig {

                    @XmlElement(name = "TellerstandVoertuig")
                    protected String tellerstandVoertuig;
                    @XmlElement(name = "CdTellerstandeenheidVoertuig")
                    protected String cdTellerstandeenheidVoertuig;

                    /**
                     * Gets the value of the tellerstandVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTellerstandVoertuig() {
                        return tellerstandVoertuig;
                    }

                    /**
                     * Sets the value of the tellerstandVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTellerstandVoertuig(String value) {
                        this.tellerstandVoertuig = value;
                    }

                    /**
                     * Gets the value of the cdTellerstandeenheidVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdTellerstandeenheidVoertuig() {
                        return cdTellerstandeenheidVoertuig;
                    }

                    /**
                     * Sets the value of the cdTellerstandeenheidVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdTellerstandeenheidVoertuig(String value) {
                        this.cdTellerstandeenheidVoertuig = value;
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
         *         <element name="FeitelijkAdres" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Correspondentieadres" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
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
            "feitelijkAdres",
            "correspondentieadres"
        })
        public static class RdwAdres {

            @XmlElement(name = "FeitelijkAdres")
            protected KentekenInfoResponse.ClientSuwi.RdwAdres.FeitelijkAdres feitelijkAdres;
            @XmlElement(name = "Correspondentieadres")
            protected KentekenInfoResponse.ClientSuwi.RdwAdres.Correspondentieadres correspondentieadres;

            /**
             * Gets the value of the feitelijkAdres property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.ClientSuwi.RdwAdres.FeitelijkAdres }
             *     
             */
            public KentekenInfoResponse.ClientSuwi.RdwAdres.FeitelijkAdres getFeitelijkAdres() {
                return feitelijkAdres;
            }

            /**
             * Sets the value of the feitelijkAdres property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.ClientSuwi.RdwAdres.FeitelijkAdres }
             *     
             */
            public void setFeitelijkAdres(KentekenInfoResponse.ClientSuwi.RdwAdres.FeitelijkAdres value) {
                this.feitelijkAdres = value;
            }

            /**
             * Gets the value of the correspondentieadres property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.ClientSuwi.RdwAdres.Correspondentieadres }
             *     
             */
            public KentekenInfoResponse.ClientSuwi.RdwAdres.Correspondentieadres getCorrespondentieadres() {
                return correspondentieadres;
            }

            /**
             * Sets the value of the correspondentieadres property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.ClientSuwi.RdwAdres.Correspondentieadres }
             *     
             */
            public void setCorrespondentieadres(KentekenInfoResponse.ClientSuwi.RdwAdres.Correspondentieadres value) {
                this.correspondentieadres = value;
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
             *         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
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
                "straatadres"
            })
            public static class Correspondentieadres {

                @XmlElement(name = "Straatadres")
                protected Straatadres straatadres;

                /**
                 * Gets the value of the straatadres property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Straatadres }
                 *     
                 */
                public Straatadres getStraatadres() {
                    return straatadres;
                }

                /**
                 * Sets the value of the straatadres property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Straatadres }
                 *     
                 */
                public void setStraatadres(Straatadres value) {
                    this.straatadres = value;
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
             *         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
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
                "straatadres"
            })
            public static class FeitelijkAdres {

                @XmlElement(name = "Straatadres")
                protected Straatadres straatadres;

                /**
                 * Gets the value of the straatadres property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Straatadres }
                 *     
                 */
                public Straatadres getStraatadres() {
                    return straatadres;
                }

                /**
                 * Sets the value of the straatadres property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Straatadres }
                 *     
                 */
                public void setStraatadres(Straatadres value) {
                    this.straatadres = value;
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
     *         <element name="Rechtspersoon" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="VestigingOndernemingInst" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="RdwBedrijfsnr" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VolgnrN5" minOccurs="0"/>
     *                   <element name="NaamOndernemingInst" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="HandelsnaamOrganisatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="ContactpersoonAfdVestiging" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="BezoekadresVestiging" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="CorrespondentieadresVestiging" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
     *         <element name="Aansprakelijke" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="DatRegistratieAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                   <element name="TijdBAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdstip" minOccurs="0"/>
     *                   <element name="DatEAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="Voertuig" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
     *                             <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6"/>
     *                             <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig"/>
     *                                       <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                                       <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
     *                             <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
     *                             <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
     *                             <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
     *                             <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="TellerstandVoertuig" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
     *                                       <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
     *                             <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
     *                             <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
     *                             <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Handelaarskenteken" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
     *                             <element name="StatusHandelaarskenteken" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="CdStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusHandelaarskenteken" minOccurs="0"/>
     *                                       <element name="DatRegStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
        "rechtspersoon",
        "vestigingOndernemingInst",
        "aansprakelijke"
    })
    public static class HandelaarOndernemingInst {

        @XmlElement(name = "Rechtspersoon")
        protected KentekenInfoResponse.HandelaarOndernemingInst.Rechtspersoon rechtspersoon;
        @XmlElement(name = "VestigingOndernemingInst")
        protected KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst vestigingOndernemingInst;
        @XmlElement(name = "Aansprakelijke")
        protected List<KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke> aansprakelijke;

        /**
         * Gets the value of the rechtspersoon property.
         * 
         * @return
         *     possible object is
         *     {@link KentekenInfoResponse.HandelaarOndernemingInst.Rechtspersoon }
         *     
         */
        public KentekenInfoResponse.HandelaarOndernemingInst.Rechtspersoon getRechtspersoon() {
            return rechtspersoon;
        }

        /**
         * Sets the value of the rechtspersoon property.
         * 
         * @param value
         *     allowed object is
         *     {@link KentekenInfoResponse.HandelaarOndernemingInst.Rechtspersoon }
         *     
         */
        public void setRechtspersoon(KentekenInfoResponse.HandelaarOndernemingInst.Rechtspersoon value) {
            this.rechtspersoon = value;
        }

        /**
         * Gets the value of the vestigingOndernemingInst property.
         * 
         * @return
         *     possible object is
         *     {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst }
         *     
         */
        public KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst getVestigingOndernemingInst() {
            return vestigingOndernemingInst;
        }

        /**
         * Sets the value of the vestigingOndernemingInst property.
         * 
         * @param value
         *     allowed object is
         *     {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst }
         *     
         */
        public void setVestigingOndernemingInst(KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst value) {
            this.vestigingOndernemingInst = value;
        }

        /**
         * Gets the value of the aansprakelijke property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the aansprakelijke property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAansprakelijke().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke }
         * 
         * 
         * @return
         *     The value of the aansprakelijke property.
         */
        public List<KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke> getAansprakelijke() {
            if (aansprakelijke == null) {
                aansprakelijke = new ArrayList<>();
            }
            return this.aansprakelijke;
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
         *         <element name="DatRegistratieAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *         <element name="TijdBAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdstip" minOccurs="0"/>
         *         <element name="DatEAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="Voertuig" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
         *                   <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6"/>
         *                   <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig"/>
         *                             <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *                             <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
         *                   <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
         *                   <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
         *                   <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
         *                   <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="TellerstandVoertuig" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
         *                             <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
         *                   <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
         *                   <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
         *                   <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Handelaarskenteken" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
         *                   <element name="StatusHandelaarskenteken" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="CdStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusHandelaarskenteken" minOccurs="0"/>
         *                             <element name="DatRegStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
            "datRegistratieAansprakelijkheid",
            "tijdBAansprakelijkheid",
            "datEAansprakelijkheid",
            "voertuig",
            "handelaarskenteken"
        })
        public static class Aansprakelijke {

            @XmlElement(name = "DatRegistratieAansprakelijkheid", required = true)
            protected String datRegistratieAansprakelijkheid;
            @XmlElement(name = "TijdBAansprakelijkheid")
            protected String tijdBAansprakelijkheid;
            @XmlElement(name = "DatEAansprakelijkheid")
            protected String datEAansprakelijkheid;
            @XmlElement(name = "Voertuig")
            protected KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig voertuig;
            @XmlElement(name = "Handelaarskenteken")
            protected KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken handelaarskenteken;

            /**
             * Gets the value of the datRegistratieAansprakelijkheid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatRegistratieAansprakelijkheid() {
                return datRegistratieAansprakelijkheid;
            }

            /**
             * Sets the value of the datRegistratieAansprakelijkheid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatRegistratieAansprakelijkheid(String value) {
                this.datRegistratieAansprakelijkheid = value;
            }

            /**
             * Gets the value of the tijdBAansprakelijkheid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTijdBAansprakelijkheid() {
                return tijdBAansprakelijkheid;
            }

            /**
             * Sets the value of the tijdBAansprakelijkheid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTijdBAansprakelijkheid(String value) {
                this.tijdBAansprakelijkheid = value;
            }

            /**
             * Gets the value of the datEAansprakelijkheid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatEAansprakelijkheid() {
                return datEAansprakelijkheid;
            }

            /**
             * Sets the value of the datEAansprakelijkheid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatEAansprakelijkheid(String value) {
                this.datEAansprakelijkheid = value;
            }

            /**
             * Gets the value of the voertuig property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig }
             *     
             */
            public KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig getVoertuig() {
                return voertuig;
            }

            /**
             * Sets the value of the voertuig property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig }
             *     
             */
            public void setVoertuig(KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig value) {
                this.voertuig = value;
            }

            /**
             * Gets the value of the handelaarskenteken property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken }
             *     
             */
            public KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken getHandelaarskenteken() {
                return handelaarskenteken;
            }

            /**
             * Sets the value of the handelaarskenteken property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken }
             *     
             */
            public void setHandelaarskenteken(KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken value) {
                this.handelaarskenteken = value;
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
             *         <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
             *         <element name="StatusHandelaarskenteken" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="CdStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusHandelaarskenteken" minOccurs="0"/>
             *                   <element name="DatRegStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                "kentekenVoertuig",
                "statusHandelaarskenteken"
            })
            public static class Handelaarskenteken {

                @XmlElement(name = "KentekenVoertuig")
                protected String kentekenVoertuig;
                @XmlElement(name = "StatusHandelaarskenteken")
                protected KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken statusHandelaarskenteken;

                /**
                 * Gets the value of the kentekenVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKentekenVoertuig() {
                    return kentekenVoertuig;
                }

                /**
                 * Sets the value of the kentekenVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKentekenVoertuig(String value) {
                    this.kentekenVoertuig = value;
                }

                /**
                 * Gets the value of the statusHandelaarskenteken property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken }
                 *     
                 */
                public KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken getStatusHandelaarskenteken() {
                    return statusHandelaarskenteken;
                }

                /**
                 * Sets the value of the statusHandelaarskenteken property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken }
                 *     
                 */
                public void setStatusHandelaarskenteken(KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken value) {
                    this.statusHandelaarskenteken = value;
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
                 *         <element name="CdStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusHandelaarskenteken" minOccurs="0"/>
                 *         <element name="DatRegStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                    "cdStatusHandelaarskenteken",
                    "datRegStatusHandelaarskenteken"
                })
                public static class StatusHandelaarskenteken {

                    @XmlElement(name = "CdStatusHandelaarskenteken")
                    protected String cdStatusHandelaarskenteken;
                    @XmlElement(name = "DatRegStatusHandelaarskenteken")
                    protected String datRegStatusHandelaarskenteken;

                    /**
                     * Gets the value of the cdStatusHandelaarskenteken property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdStatusHandelaarskenteken() {
                        return cdStatusHandelaarskenteken;
                    }

                    /**
                     * Sets the value of the cdStatusHandelaarskenteken property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdStatusHandelaarskenteken(String value) {
                        this.cdStatusHandelaarskenteken = value;
                    }

                    /**
                     * Gets the value of the datRegStatusHandelaarskenteken property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatRegStatusHandelaarskenteken() {
                        return datRegStatusHandelaarskenteken;
                    }

                    /**
                     * Sets the value of the datRegStatusHandelaarskenteken property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatRegStatusHandelaarskenteken(String value) {
                        this.datRegStatusHandelaarskenteken = value;
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
             *         <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
             *         <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6"/>
             *         <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig"/>
             *                   <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
             *                   <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
             *         <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
             *         <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
             *         <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
             *         <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="TellerstandVoertuig" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
             *                   <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
             *         <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
             *         <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
             *         <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
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
                "cdSrtVoertuig",
                "kentekenVoertuig",
                "statusVoertuig",
                "merkVoertuig",
                "typeVoertuig",
                "hoofdkleurVoertuig",
                "nevenkleurVoertuig",
                "datEersteInschrijvingVoertuigNat",
                "datEersteInschrijvingVoertuigInt",
                "bedrBpm",
                "bedrCatalogusVoertuig",
                "tellerstandVoertuig",
                "keuring",
                "verstrekkingsvoorbehoudVoertuig",
                "voertuigverplichtingen",
                "voertuigverplichtingennemer",
                "verzekering"
            })
            public static class Voertuig {

                @XmlElement(name = "CdSrtVoertuig")
                protected String cdSrtVoertuig;
                @XmlElement(name = "KentekenVoertuig", required = true)
                protected String kentekenVoertuig;
                @XmlElement(name = "StatusVoertuig")
                protected List<KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig> statusVoertuig;
                @XmlElement(name = "MerkVoertuig")
                protected String merkVoertuig;
                @XmlElement(name = "TypeVoertuig")
                protected String typeVoertuig;
                @XmlElement(name = "HoofdkleurVoertuig")
                protected String hoofdkleurVoertuig;
                @XmlElement(name = "NevenkleurVoertuig")
                protected String nevenkleurVoertuig;
                @XmlElement(name = "DatEersteInschrijvingVoertuigNat")
                protected String datEersteInschrijvingVoertuigNat;
                @XmlElement(name = "DatEersteInschrijvingVoertuigInt")
                protected String datEersteInschrijvingVoertuigInt;
                @XmlElement(name = "BedrBpm")
                protected StandaardBedr bedrBpm;
                @XmlElement(name = "BedrCatalogusVoertuig")
                protected StandaardBedr bedrCatalogusVoertuig;
                @XmlElement(name = "TellerstandVoertuig")
                protected KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig tellerstandVoertuig;
                @XmlElement(name = "Keuring")
                protected List<KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.Keuring> keuring;
                @XmlElement(name = "VerstrekkingsvoorbehoudVoertuig")
                protected VerstrekkingsvoorbehoudVoertuig verstrekkingsvoorbehoudVoertuig;
                @XmlElement(name = "Voertuigverplichtingen")
                protected Voertuigverplichtingen voertuigverplichtingen;
                @XmlElement(name = "Voertuigverplichtingennemer")
                protected Voertuigverplichtingennemer voertuigverplichtingennemer;
                @XmlElement(name = "Verzekering")
                protected Verzekering verzekering;

                /**
                 * Gets the value of the cdSrtVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdSrtVoertuig() {
                    return cdSrtVoertuig;
                }

                /**
                 * Sets the value of the cdSrtVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdSrtVoertuig(String value) {
                    this.cdSrtVoertuig = value;
                }

                /**
                 * Gets the value of the kentekenVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKentekenVoertuig() {
                    return kentekenVoertuig;
                }

                /**
                 * Sets the value of the kentekenVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKentekenVoertuig(String value) {
                    this.kentekenVoertuig = value;
                }

                /**
                 * Gets the value of the statusVoertuig property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the statusVoertuig property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStatusVoertuig().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig }
                 * 
                 * 
                 * @return
                 *     The value of the statusVoertuig property.
                 */
                public List<KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig> getStatusVoertuig() {
                    if (statusVoertuig == null) {
                        statusVoertuig = new ArrayList<>();
                    }
                    return this.statusVoertuig;
                }

                /**
                 * Gets the value of the merkVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMerkVoertuig() {
                    return merkVoertuig;
                }

                /**
                 * Sets the value of the merkVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMerkVoertuig(String value) {
                    this.merkVoertuig = value;
                }

                /**
                 * Gets the value of the typeVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeVoertuig() {
                    return typeVoertuig;
                }

                /**
                 * Sets the value of the typeVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeVoertuig(String value) {
                    this.typeVoertuig = value;
                }

                /**
                 * Gets the value of the hoofdkleurVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHoofdkleurVoertuig() {
                    return hoofdkleurVoertuig;
                }

                /**
                 * Sets the value of the hoofdkleurVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHoofdkleurVoertuig(String value) {
                    this.hoofdkleurVoertuig = value;
                }

                /**
                 * Gets the value of the nevenkleurVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNevenkleurVoertuig() {
                    return nevenkleurVoertuig;
                }

                /**
                 * Sets the value of the nevenkleurVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNevenkleurVoertuig(String value) {
                    this.nevenkleurVoertuig = value;
                }

                /**
                 * Gets the value of the datEersteInschrijvingVoertuigNat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEersteInschrijvingVoertuigNat() {
                    return datEersteInschrijvingVoertuigNat;
                }

                /**
                 * Sets the value of the datEersteInschrijvingVoertuigNat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEersteInschrijvingVoertuigNat(String value) {
                    this.datEersteInschrijvingVoertuigNat = value;
                }

                /**
                 * Gets the value of the datEersteInschrijvingVoertuigInt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEersteInschrijvingVoertuigInt() {
                    return datEersteInschrijvingVoertuigInt;
                }

                /**
                 * Sets the value of the datEersteInschrijvingVoertuigInt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEersteInschrijvingVoertuigInt(String value) {
                    this.datEersteInschrijvingVoertuigInt = value;
                }

                /**
                 * Gets the value of the bedrBpm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrBpm() {
                    return bedrBpm;
                }

                /**
                 * Sets the value of the bedrBpm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrBpm(StandaardBedr value) {
                    this.bedrBpm = value;
                }

                /**
                 * Gets the value of the bedrCatalogusVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrCatalogusVoertuig() {
                    return bedrCatalogusVoertuig;
                }

                /**
                 * Sets the value of the bedrCatalogusVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrCatalogusVoertuig(StandaardBedr value) {
                    this.bedrCatalogusVoertuig = value;
                }

                /**
                 * Gets the value of the tellerstandVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig }
                 *     
                 */
                public KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig getTellerstandVoertuig() {
                    return tellerstandVoertuig;
                }

                /**
                 * Sets the value of the tellerstandVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig }
                 *     
                 */
                public void setTellerstandVoertuig(KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig value) {
                    this.tellerstandVoertuig = value;
                }

                /**
                 * Gets the value of the keuring property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the keuring property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getKeuring().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.Keuring }
                 * 
                 * 
                 * @return
                 *     The value of the keuring property.
                 */
                public List<KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.Keuring> getKeuring() {
                    if (keuring == null) {
                        keuring = new ArrayList<>();
                    }
                    return this.keuring;
                }

                /**
                 * Gets the value of the verstrekkingsvoorbehoudVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link VerstrekkingsvoorbehoudVoertuig }
                 *     
                 */
                public VerstrekkingsvoorbehoudVoertuig getVerstrekkingsvoorbehoudVoertuig() {
                    return verstrekkingsvoorbehoudVoertuig;
                }

                /**
                 * Sets the value of the verstrekkingsvoorbehoudVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link VerstrekkingsvoorbehoudVoertuig }
                 *     
                 */
                public void setVerstrekkingsvoorbehoudVoertuig(VerstrekkingsvoorbehoudVoertuig value) {
                    this.verstrekkingsvoorbehoudVoertuig = value;
                }

                /**
                 * Gets the value of the voertuigverplichtingen property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Voertuigverplichtingen }
                 *     
                 */
                public Voertuigverplichtingen getVoertuigverplichtingen() {
                    return voertuigverplichtingen;
                }

                /**
                 * Sets the value of the voertuigverplichtingen property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Voertuigverplichtingen }
                 *     
                 */
                public void setVoertuigverplichtingen(Voertuigverplichtingen value) {
                    this.voertuigverplichtingen = value;
                }

                /**
                 * Gets the value of the voertuigverplichtingennemer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Voertuigverplichtingennemer }
                 *     
                 */
                public Voertuigverplichtingennemer getVoertuigverplichtingennemer() {
                    return voertuigverplichtingennemer;
                }

                /**
                 * Sets the value of the voertuigverplichtingennemer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Voertuigverplichtingennemer }
                 *     
                 */
                public void setVoertuigverplichtingennemer(Voertuigverplichtingennemer value) {
                    this.voertuigverplichtingennemer = value;
                }

                /**
                 * Gets the value of the verzekering property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Verzekering }
                 *     
                 */
                public Verzekering getVerzekering() {
                    return verzekering;
                }

                /**
                 * Sets the value of the verzekering property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Verzekering }
                 *     
                 */
                public void setVerzekering(Verzekering value) {
                    this.verzekering = value;
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
                 *         <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
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
                    "datEGeldigheidApk"
                })
                public static class Keuring {

                    @XmlElement(name = "DatEGeldigheidApk", required = true)
                    protected String datEGeldigheidApk;

                    /**
                     * Gets the value of the datEGeldigheidApk property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatEGeldigheidApk() {
                        return datEGeldigheidApk;
                    }

                    /**
                     * Sets the value of the datEGeldigheidApk property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatEGeldigheidApk(String value) {
                        this.datEGeldigheidApk = value;
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
                 *         <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig"/>
                 *         <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
                 *         <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                    "cdStatusVoertuig",
                    "datBStatusVoertuig",
                    "datEStatusVoertuig"
                })
                public static class StatusVoertuig {

                    @XmlElement(name = "CdStatusVoertuig", required = true)
                    protected String cdStatusVoertuig;
                    @XmlElement(name = "DatBStatusVoertuig", required = true)
                    protected String datBStatusVoertuig;
                    @XmlElement(name = "DatEStatusVoertuig")
                    protected String datEStatusVoertuig;

                    /**
                     * Gets the value of the cdStatusVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdStatusVoertuig() {
                        return cdStatusVoertuig;
                    }

                    /**
                     * Sets the value of the cdStatusVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdStatusVoertuig(String value) {
                        this.cdStatusVoertuig = value;
                    }

                    /**
                     * Gets the value of the datBStatusVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatBStatusVoertuig() {
                        return datBStatusVoertuig;
                    }

                    /**
                     * Sets the value of the datBStatusVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatBStatusVoertuig(String value) {
                        this.datBStatusVoertuig = value;
                    }

                    /**
                     * Gets the value of the datEStatusVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatEStatusVoertuig() {
                        return datEStatusVoertuig;
                    }

                    /**
                     * Sets the value of the datEStatusVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatEStatusVoertuig(String value) {
                        this.datEStatusVoertuig = value;
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
                 *         <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
                 *         <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
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
                    "tellerstandVoertuig",
                    "cdTellerstandeenheidVoertuig"
                })
                public static class TellerstandVoertuig {

                    @XmlElement(name = "TellerstandVoertuig")
                    protected String tellerstandVoertuig;
                    @XmlElement(name = "CdTellerstandeenheidVoertuig")
                    protected String cdTellerstandeenheidVoertuig;

                    /**
                     * Gets the value of the tellerstandVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTellerstandVoertuig() {
                        return tellerstandVoertuig;
                    }

                    /**
                     * Sets the value of the tellerstandVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTellerstandVoertuig(String value) {
                        this.tellerstandVoertuig = value;
                    }

                    /**
                     * Gets the value of the cdTellerstandeenheidVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdTellerstandeenheidVoertuig() {
                        return cdTellerstandeenheidVoertuig;
                    }

                    /**
                     * Sets the value of the cdTellerstandeenheidVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdTellerstandeenheidVoertuig(String value) {
                        this.cdTellerstandeenheidVoertuig = value;
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
         *         <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200"/>
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
            "naamRechtspersoon"
        })
        public static class Rechtspersoon {

            @XmlElement(name = "NaamRechtspersoon", required = true)
            protected String naamRechtspersoon;

            /**
             * Gets the value of the naamRechtspersoon property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNaamRechtspersoon() {
                return naamRechtspersoon;
            }

            /**
             * Sets the value of the naamRechtspersoon property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNaamRechtspersoon(String value) {
                this.naamRechtspersoon = value;
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
         *         <element name="RdwBedrijfsnr" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VolgnrN5" minOccurs="0"/>
         *         <element name="NaamOndernemingInst" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="HandelsnaamOrganisatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ContactpersoonAfdVestiging" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="BezoekadresVestiging" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="CorrespondentieadresVestiging" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
            "rdwBedrijfsnr",
            "naamOndernemingInst",
            "contactpersoonAfdVestiging",
            "bezoekadresVestiging",
            "correspondentieadresVestiging"
        })
        public static class VestigingOndernemingInst {

            @XmlElement(name = "RdwBedrijfsnr")
            protected String rdwBedrijfsnr;
            @XmlElement(name = "NaamOndernemingInst")
            protected KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.NaamOndernemingInst naamOndernemingInst;
            @XmlElement(name = "ContactpersoonAfdVestiging")
            protected KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.ContactpersoonAfdVestiging contactpersoonAfdVestiging;
            @XmlElement(name = "BezoekadresVestiging")
            protected KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.BezoekadresVestiging bezoekadresVestiging;
            @XmlElement(name = "CorrespondentieadresVestiging")
            protected KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging correspondentieadresVestiging;

            /**
             * Gets the value of the rdwBedrijfsnr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRdwBedrijfsnr() {
                return rdwBedrijfsnr;
            }

            /**
             * Sets the value of the rdwBedrijfsnr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRdwBedrijfsnr(String value) {
                this.rdwBedrijfsnr = value;
            }

            /**
             * Gets the value of the naamOndernemingInst property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.NaamOndernemingInst }
             *     
             */
            public KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.NaamOndernemingInst getNaamOndernemingInst() {
                return naamOndernemingInst;
            }

            /**
             * Sets the value of the naamOndernemingInst property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.NaamOndernemingInst }
             *     
             */
            public void setNaamOndernemingInst(KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.NaamOndernemingInst value) {
                this.naamOndernemingInst = value;
            }

            /**
             * Gets the value of the contactpersoonAfdVestiging property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.ContactpersoonAfdVestiging }
             *     
             */
            public KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.ContactpersoonAfdVestiging getContactpersoonAfdVestiging() {
                return contactpersoonAfdVestiging;
            }

            /**
             * Sets the value of the contactpersoonAfdVestiging property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.ContactpersoonAfdVestiging }
             *     
             */
            public void setContactpersoonAfdVestiging(KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.ContactpersoonAfdVestiging value) {
                this.contactpersoonAfdVestiging = value;
            }

            /**
             * Gets the value of the bezoekadresVestiging property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
             *     
             */
            public KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.BezoekadresVestiging getBezoekadresVestiging() {
                return bezoekadresVestiging;
            }

            /**
             * Sets the value of the bezoekadresVestiging property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
             *     
             */
            public void setBezoekadresVestiging(KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.BezoekadresVestiging value) {
                this.bezoekadresVestiging = value;
            }

            /**
             * Gets the value of the correspondentieadresVestiging property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
             *     
             */
            public KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging getCorrespondentieadresVestiging() {
                return correspondentieadresVestiging;
            }

            /**
             * Sets the value of the correspondentieadresVestiging property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
             *     
             */
            public void setCorrespondentieadresVestiging(KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging value) {
                this.correspondentieadresVestiging = value;
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
             *         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
                "straatadres"
            })
            public static class BezoekadresVestiging {

                @XmlElement(name = "Straatadres")
                protected StraatadresVerkort straatadres;

                /**
                 * Gets the value of the straatadres property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StraatadresVerkort }
                 *     
                 */
                public StraatadresVerkort getStraatadres() {
                    return straatadres;
                }

                /**
                 * Sets the value of the straatadres property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StraatadresVerkort }
                 *     
                 */
                public void setStraatadres(StraatadresVerkort value) {
                    this.straatadres = value;
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
             *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
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
                "significantDeelVanDeAchternaam"
            })
            public static class ContactpersoonAfdVestiging {

                @XmlElement(name = "SignificantDeelVanDeAchternaam")
                protected String significantDeelVanDeAchternaam;

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
             *         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
                "straatadres"
            })
            public static class CorrespondentieadresVestiging {

                @XmlElement(name = "Straatadres")
                protected StraatadresVerkort straatadres;

                /**
                 * Gets the value of the straatadres property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StraatadresVerkort }
                 *     
                 */
                public StraatadresVerkort getStraatadres() {
                    return straatadres;
                }

                /**
                 * Sets the value of the straatadres property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StraatadresVerkort }
                 *     
                 */
                public void setStraatadres(StraatadresVerkort value) {
                    this.straatadres = value;
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
             *         <element name="HandelsnaamOrganisatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
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
                "handelsnaamOrganisatie"
            })
            public static class NaamOndernemingInst {

                @XmlElement(name = "HandelsnaamOrganisatie")
                protected String handelsnaamOrganisatie;

                /**
                 * Gets the value of the handelsnaamOrganisatie property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHandelsnaamOrganisatie() {
                    return handelsnaamOrganisatie;
                }

                /**
                 * Sets the value of the handelsnaamOrganisatie property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHandelsnaamOrganisatie(String value) {
                    this.handelsnaamOrganisatie = value;
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
     *         <element name="Rechtspersoon" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="FiNr" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}FiNr" minOccurs="0"/>
     *                   <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="VestigingOndernemingInst" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="BezoekadresVestiging" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="CorrespondentieadresVestiging" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
     *         <element name="Aansprakelijke" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="DatRegistratieAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="DatEAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="Voertuig" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
     *                             <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
     *                             <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
     *                                       <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                       <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
     *                             <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
     *                             <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
     *                             <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
     *                             <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="TellerstandVoertuig" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
     *                                       <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
     *                             <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
     *                             <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
     *                             <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Handelaarskenteken" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
     *                             <element name="StatusHandelaarskenteken" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="CdStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusHandelaarskenteken" minOccurs="0"/>
     *                                       <element name="DatRegStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
        "rechtspersoon",
        "vestigingOndernemingInst",
        "aansprakelijke"
    })
    public static class OndernemingInst {

        @XmlElement(name = "Rechtspersoon")
        protected KentekenInfoResponse.OndernemingInst.Rechtspersoon rechtspersoon;
        @XmlElement(name = "VestigingOndernemingInst")
        protected KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst vestigingOndernemingInst;
        @XmlElement(name = "Aansprakelijke")
        protected List<KentekenInfoResponse.OndernemingInst.Aansprakelijke> aansprakelijke;

        /**
         * Gets the value of the rechtspersoon property.
         * 
         * @return
         *     possible object is
         *     {@link KentekenInfoResponse.OndernemingInst.Rechtspersoon }
         *     
         */
        public KentekenInfoResponse.OndernemingInst.Rechtspersoon getRechtspersoon() {
            return rechtspersoon;
        }

        /**
         * Sets the value of the rechtspersoon property.
         * 
         * @param value
         *     allowed object is
         *     {@link KentekenInfoResponse.OndernemingInst.Rechtspersoon }
         *     
         */
        public void setRechtspersoon(KentekenInfoResponse.OndernemingInst.Rechtspersoon value) {
            this.rechtspersoon = value;
        }

        /**
         * Gets the value of the vestigingOndernemingInst property.
         * 
         * @return
         *     possible object is
         *     {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst }
         *     
         */
        public KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst getVestigingOndernemingInst() {
            return vestigingOndernemingInst;
        }

        /**
         * Sets the value of the vestigingOndernemingInst property.
         * 
         * @param value
         *     allowed object is
         *     {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst }
         *     
         */
        public void setVestigingOndernemingInst(KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst value) {
            this.vestigingOndernemingInst = value;
        }

        /**
         * Gets the value of the aansprakelijke property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the aansprakelijke property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAansprakelijke().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke }
         * 
         * 
         * @return
         *     The value of the aansprakelijke property.
         */
        public List<KentekenInfoResponse.OndernemingInst.Aansprakelijke> getAansprakelijke() {
            if (aansprakelijke == null) {
                aansprakelijke = new ArrayList<>();
            }
            return this.aansprakelijke;
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
         *         <element name="DatRegistratieAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="DatEAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="Voertuig" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
         *                   <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
         *                   <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
         *                             <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                             <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
         *                   <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
         *                   <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
         *                   <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
         *                   <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="TellerstandVoertuig" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
         *                             <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
         *                   <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
         *                   <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
         *                   <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Handelaarskenteken" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
         *                   <element name="StatusHandelaarskenteken" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="CdStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusHandelaarskenteken" minOccurs="0"/>
         *                             <element name="DatRegStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
            "datRegistratieAansprakelijkheid",
            "datEAansprakelijkheid",
            "voertuig",
            "handelaarskenteken"
        })
        public static class Aansprakelijke {

            @XmlElement(name = "DatRegistratieAansprakelijkheid")
            protected String datRegistratieAansprakelijkheid;
            @XmlElement(name = "DatEAansprakelijkheid")
            protected String datEAansprakelijkheid;
            @XmlElement(name = "Voertuig")
            protected KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig voertuig;
            @XmlElement(name = "Handelaarskenteken")
            protected KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken handelaarskenteken;

            /**
             * Gets the value of the datRegistratieAansprakelijkheid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatRegistratieAansprakelijkheid() {
                return datRegistratieAansprakelijkheid;
            }

            /**
             * Sets the value of the datRegistratieAansprakelijkheid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatRegistratieAansprakelijkheid(String value) {
                this.datRegistratieAansprakelijkheid = value;
            }

            /**
             * Gets the value of the datEAansprakelijkheid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatEAansprakelijkheid() {
                return datEAansprakelijkheid;
            }

            /**
             * Sets the value of the datEAansprakelijkheid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatEAansprakelijkheid(String value) {
                this.datEAansprakelijkheid = value;
            }

            /**
             * Gets the value of the voertuig property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig }
             *     
             */
            public KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig getVoertuig() {
                return voertuig;
            }

            /**
             * Sets the value of the voertuig property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig }
             *     
             */
            public void setVoertuig(KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig value) {
                this.voertuig = value;
            }

            /**
             * Gets the value of the handelaarskenteken property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken }
             *     
             */
            public KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken getHandelaarskenteken() {
                return handelaarskenteken;
            }

            /**
             * Sets the value of the handelaarskenteken property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken }
             *     
             */
            public void setHandelaarskenteken(KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken value) {
                this.handelaarskenteken = value;
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
             *         <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
             *         <element name="StatusHandelaarskenteken" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="CdStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusHandelaarskenteken" minOccurs="0"/>
             *                   <element name="DatRegStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                "kentekenVoertuig",
                "statusHandelaarskenteken"
            })
            public static class Handelaarskenteken {

                @XmlElement(name = "KentekenVoertuig")
                protected String kentekenVoertuig;
                @XmlElement(name = "StatusHandelaarskenteken")
                protected KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken statusHandelaarskenteken;

                /**
                 * Gets the value of the kentekenVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKentekenVoertuig() {
                    return kentekenVoertuig;
                }

                /**
                 * Sets the value of the kentekenVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKentekenVoertuig(String value) {
                    this.kentekenVoertuig = value;
                }

                /**
                 * Gets the value of the statusHandelaarskenteken property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken }
                 *     
                 */
                public KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken getStatusHandelaarskenteken() {
                    return statusHandelaarskenteken;
                }

                /**
                 * Sets the value of the statusHandelaarskenteken property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken }
                 *     
                 */
                public void setStatusHandelaarskenteken(KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken value) {
                    this.statusHandelaarskenteken = value;
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
                 *         <element name="CdStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusHandelaarskenteken" minOccurs="0"/>
                 *         <element name="DatRegStatusHandelaarskenteken" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                    "cdStatusHandelaarskenteken",
                    "datRegStatusHandelaarskenteken"
                })
                public static class StatusHandelaarskenteken {

                    @XmlElement(name = "CdStatusHandelaarskenteken")
                    protected String cdStatusHandelaarskenteken;
                    @XmlElement(name = "DatRegStatusHandelaarskenteken")
                    protected String datRegStatusHandelaarskenteken;

                    /**
                     * Gets the value of the cdStatusHandelaarskenteken property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdStatusHandelaarskenteken() {
                        return cdStatusHandelaarskenteken;
                    }

                    /**
                     * Sets the value of the cdStatusHandelaarskenteken property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdStatusHandelaarskenteken(String value) {
                        this.cdStatusHandelaarskenteken = value;
                    }

                    /**
                     * Gets the value of the datRegStatusHandelaarskenteken property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatRegStatusHandelaarskenteken() {
                        return datRegStatusHandelaarskenteken;
                    }

                    /**
                     * Sets the value of the datRegStatusHandelaarskenteken property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatRegStatusHandelaarskenteken(String value) {
                        this.datRegStatusHandelaarskenteken = value;
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
             *         <element name="CdSrtVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtVoertuig" minOccurs="0"/>
             *         <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6" minOccurs="0"/>
             *         <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
             *                   <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                   <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="MerkVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN35" minOccurs="0"/>
             *         <element name="TypeVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN50" minOccurs="0"/>
             *         <element name="HoofdkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
             *         <element name="NevenkleurVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}KleurVoertuig" minOccurs="0"/>
             *         <element name="DatEersteInschrijvingVoertuigNat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="DatEersteInschrijvingVoertuigInt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="BedrBpm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrCatalogusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="TellerstandVoertuig" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
             *                   <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="Keuring" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="VerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VerstrekkingsvoorbehoudVoertuig" minOccurs="0"/>
             *         <element name="Voertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingen" minOccurs="0"/>
             *         <element name="Voertuigverplichtingennemer" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Voertuigverplichtingennemer" minOccurs="0"/>
             *         <element name="Verzekering" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Verzekering" minOccurs="0"/>
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
                "cdSrtVoertuig",
                "kentekenVoertuig",
                "statusVoertuig",
                "merkVoertuig",
                "typeVoertuig",
                "hoofdkleurVoertuig",
                "nevenkleurVoertuig",
                "datEersteInschrijvingVoertuigNat",
                "datEersteInschrijvingVoertuigInt",
                "bedrBpm",
                "bedrCatalogusVoertuig",
                "tellerstandVoertuig",
                "keuring",
                "verstrekkingsvoorbehoudVoertuig",
                "voertuigverplichtingen",
                "voertuigverplichtingennemer",
                "verzekering"
            })
            public static class Voertuig {

                @XmlElement(name = "CdSrtVoertuig")
                protected String cdSrtVoertuig;
                @XmlElement(name = "KentekenVoertuig")
                protected String kentekenVoertuig;
                @XmlElement(name = "StatusVoertuig")
                protected List<KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig> statusVoertuig;
                @XmlElement(name = "MerkVoertuig")
                protected String merkVoertuig;
                @XmlElement(name = "TypeVoertuig")
                protected String typeVoertuig;
                @XmlElement(name = "HoofdkleurVoertuig")
                protected String hoofdkleurVoertuig;
                @XmlElement(name = "NevenkleurVoertuig")
                protected String nevenkleurVoertuig;
                @XmlElement(name = "DatEersteInschrijvingVoertuigNat")
                protected String datEersteInschrijvingVoertuigNat;
                @XmlElement(name = "DatEersteInschrijvingVoertuigInt")
                protected String datEersteInschrijvingVoertuigInt;
                @XmlElement(name = "BedrBpm")
                protected StandaardBedr bedrBpm;
                @XmlElement(name = "BedrCatalogusVoertuig")
                protected StandaardBedr bedrCatalogusVoertuig;
                @XmlElement(name = "TellerstandVoertuig")
                protected KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig tellerstandVoertuig;
                @XmlElement(name = "Keuring")
                protected List<KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.Keuring> keuring;
                @XmlElement(name = "VerstrekkingsvoorbehoudVoertuig")
                protected VerstrekkingsvoorbehoudVoertuig verstrekkingsvoorbehoudVoertuig;
                @XmlElement(name = "Voertuigverplichtingen")
                protected Voertuigverplichtingen voertuigverplichtingen;
                @XmlElement(name = "Voertuigverplichtingennemer")
                protected Voertuigverplichtingennemer voertuigverplichtingennemer;
                @XmlElement(name = "Verzekering")
                protected Verzekering verzekering;

                /**
                 * Gets the value of the cdSrtVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdSrtVoertuig() {
                    return cdSrtVoertuig;
                }

                /**
                 * Sets the value of the cdSrtVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdSrtVoertuig(String value) {
                    this.cdSrtVoertuig = value;
                }

                /**
                 * Gets the value of the kentekenVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKentekenVoertuig() {
                    return kentekenVoertuig;
                }

                /**
                 * Sets the value of the kentekenVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKentekenVoertuig(String value) {
                    this.kentekenVoertuig = value;
                }

                /**
                 * Gets the value of the statusVoertuig property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the statusVoertuig property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStatusVoertuig().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig }
                 * 
                 * 
                 * @return
                 *     The value of the statusVoertuig property.
                 */
                public List<KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig> getStatusVoertuig() {
                    if (statusVoertuig == null) {
                        statusVoertuig = new ArrayList<>();
                    }
                    return this.statusVoertuig;
                }

                /**
                 * Gets the value of the merkVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMerkVoertuig() {
                    return merkVoertuig;
                }

                /**
                 * Sets the value of the merkVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMerkVoertuig(String value) {
                    this.merkVoertuig = value;
                }

                /**
                 * Gets the value of the typeVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeVoertuig() {
                    return typeVoertuig;
                }

                /**
                 * Sets the value of the typeVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeVoertuig(String value) {
                    this.typeVoertuig = value;
                }

                /**
                 * Gets the value of the hoofdkleurVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHoofdkleurVoertuig() {
                    return hoofdkleurVoertuig;
                }

                /**
                 * Sets the value of the hoofdkleurVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHoofdkleurVoertuig(String value) {
                    this.hoofdkleurVoertuig = value;
                }

                /**
                 * Gets the value of the nevenkleurVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNevenkleurVoertuig() {
                    return nevenkleurVoertuig;
                }

                /**
                 * Sets the value of the nevenkleurVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNevenkleurVoertuig(String value) {
                    this.nevenkleurVoertuig = value;
                }

                /**
                 * Gets the value of the datEersteInschrijvingVoertuigNat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEersteInschrijvingVoertuigNat() {
                    return datEersteInschrijvingVoertuigNat;
                }

                /**
                 * Sets the value of the datEersteInschrijvingVoertuigNat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEersteInschrijvingVoertuigNat(String value) {
                    this.datEersteInschrijvingVoertuigNat = value;
                }

                /**
                 * Gets the value of the datEersteInschrijvingVoertuigInt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEersteInschrijvingVoertuigInt() {
                    return datEersteInschrijvingVoertuigInt;
                }

                /**
                 * Sets the value of the datEersteInschrijvingVoertuigInt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEersteInschrijvingVoertuigInt(String value) {
                    this.datEersteInschrijvingVoertuigInt = value;
                }

                /**
                 * Gets the value of the bedrBpm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrBpm() {
                    return bedrBpm;
                }

                /**
                 * Sets the value of the bedrBpm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrBpm(StandaardBedr value) {
                    this.bedrBpm = value;
                }

                /**
                 * Gets the value of the bedrCatalogusVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrCatalogusVoertuig() {
                    return bedrCatalogusVoertuig;
                }

                /**
                 * Sets the value of the bedrCatalogusVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrCatalogusVoertuig(StandaardBedr value) {
                    this.bedrCatalogusVoertuig = value;
                }

                /**
                 * Gets the value of the tellerstandVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig }
                 *     
                 */
                public KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig getTellerstandVoertuig() {
                    return tellerstandVoertuig;
                }

                /**
                 * Sets the value of the tellerstandVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig }
                 *     
                 */
                public void setTellerstandVoertuig(KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig value) {
                    this.tellerstandVoertuig = value;
                }

                /**
                 * Gets the value of the keuring property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the keuring property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getKeuring().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.Keuring }
                 * 
                 * 
                 * @return
                 *     The value of the keuring property.
                 */
                public List<KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.Keuring> getKeuring() {
                    if (keuring == null) {
                        keuring = new ArrayList<>();
                    }
                    return this.keuring;
                }

                /**
                 * Gets the value of the verstrekkingsvoorbehoudVoertuig property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link VerstrekkingsvoorbehoudVoertuig }
                 *     
                 */
                public VerstrekkingsvoorbehoudVoertuig getVerstrekkingsvoorbehoudVoertuig() {
                    return verstrekkingsvoorbehoudVoertuig;
                }

                /**
                 * Sets the value of the verstrekkingsvoorbehoudVoertuig property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link VerstrekkingsvoorbehoudVoertuig }
                 *     
                 */
                public void setVerstrekkingsvoorbehoudVoertuig(VerstrekkingsvoorbehoudVoertuig value) {
                    this.verstrekkingsvoorbehoudVoertuig = value;
                }

                /**
                 * Gets the value of the voertuigverplichtingen property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Voertuigverplichtingen }
                 *     
                 */
                public Voertuigverplichtingen getVoertuigverplichtingen() {
                    return voertuigverplichtingen;
                }

                /**
                 * Sets the value of the voertuigverplichtingen property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Voertuigverplichtingen }
                 *     
                 */
                public void setVoertuigverplichtingen(Voertuigverplichtingen value) {
                    this.voertuigverplichtingen = value;
                }

                /**
                 * Gets the value of the voertuigverplichtingennemer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Voertuigverplichtingennemer }
                 *     
                 */
                public Voertuigverplichtingennemer getVoertuigverplichtingennemer() {
                    return voertuigverplichtingennemer;
                }

                /**
                 * Sets the value of the voertuigverplichtingennemer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Voertuigverplichtingennemer }
                 *     
                 */
                public void setVoertuigverplichtingennemer(Voertuigverplichtingennemer value) {
                    this.voertuigverplichtingennemer = value;
                }

                /**
                 * Gets the value of the verzekering property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Verzekering }
                 *     
                 */
                public Verzekering getVerzekering() {
                    return verzekering;
                }

                /**
                 * Sets the value of the verzekering property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Verzekering }
                 *     
                 */
                public void setVerzekering(Verzekering value) {
                    this.verzekering = value;
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
                 *         <element name="DatEGeldigheidApk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                    "datEGeldigheidApk"
                })
                public static class Keuring {

                    @XmlElement(name = "DatEGeldigheidApk")
                    protected String datEGeldigheidApk;

                    /**
                     * Gets the value of the datEGeldigheidApk property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatEGeldigheidApk() {
                        return datEGeldigheidApk;
                    }

                    /**
                     * Sets the value of the datEGeldigheidApk property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatEGeldigheidApk(String value) {
                        this.datEGeldigheidApk = value;
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
                 *         <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
                 *         <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *         <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
                    "cdStatusVoertuig",
                    "datBStatusVoertuig",
                    "datEStatusVoertuig"
                })
                public static class StatusVoertuig {

                    @XmlElement(name = "CdStatusVoertuig")
                    protected String cdStatusVoertuig;
                    @XmlElement(name = "DatBStatusVoertuig")
                    protected String datBStatusVoertuig;
                    @XmlElement(name = "DatEStatusVoertuig")
                    protected String datEStatusVoertuig;

                    /**
                     * Gets the value of the cdStatusVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdStatusVoertuig() {
                        return cdStatusVoertuig;
                    }

                    /**
                     * Sets the value of the cdStatusVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdStatusVoertuig(String value) {
                        this.cdStatusVoertuig = value;
                    }

                    /**
                     * Gets the value of the datBStatusVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatBStatusVoertuig() {
                        return datBStatusVoertuig;
                    }

                    /**
                     * Sets the value of the datBStatusVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatBStatusVoertuig(String value) {
                        this.datBStatusVoertuig = value;
                    }

                    /**
                     * Gets the value of the datEStatusVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatEStatusVoertuig() {
                        return datEStatusVoertuig;
                    }

                    /**
                     * Sets the value of the datEStatusVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatEStatusVoertuig(String value) {
                        this.datEStatusVoertuig = value;
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
                 *         <element name="TellerstandVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}TellerstandVoertuig" minOccurs="0"/>
                 *         <element name="CdTellerstandeenheidVoertuig" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdTellerstandeenheidVoertuig" minOccurs="0"/>
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
                    "tellerstandVoertuig",
                    "cdTellerstandeenheidVoertuig"
                })
                public static class TellerstandVoertuig {

                    @XmlElement(name = "TellerstandVoertuig")
                    protected String tellerstandVoertuig;
                    @XmlElement(name = "CdTellerstandeenheidVoertuig")
                    protected String cdTellerstandeenheidVoertuig;

                    /**
                     * Gets the value of the tellerstandVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTellerstandVoertuig() {
                        return tellerstandVoertuig;
                    }

                    /**
                     * Sets the value of the tellerstandVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTellerstandVoertuig(String value) {
                        this.tellerstandVoertuig = value;
                    }

                    /**
                     * Gets the value of the cdTellerstandeenheidVoertuig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdTellerstandeenheidVoertuig() {
                        return cdTellerstandeenheidVoertuig;
                    }

                    /**
                     * Sets the value of the cdTellerstandeenheidVoertuig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdTellerstandeenheidVoertuig(String value) {
                        this.cdTellerstandeenheidVoertuig = value;
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
         *         <element name="FiNr" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}FiNr" minOccurs="0"/>
         *         <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200"/>
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
            "fiNr",
            "naamRechtspersoon"
        })
        public static class Rechtspersoon {

            @XmlElement(name = "FiNr")
            protected String fiNr;
            @XmlElement(name = "NaamRechtspersoon", required = true)
            protected String naamRechtspersoon;

            /**
             * Gets the value of the fiNr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFiNr() {
                return fiNr;
            }

            /**
             * Sets the value of the fiNr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFiNr(String value) {
                this.fiNr = value;
            }

            /**
             * Gets the value of the naamRechtspersoon property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNaamRechtspersoon() {
                return naamRechtspersoon;
            }

            /**
             * Sets the value of the naamRechtspersoon property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNaamRechtspersoon(String value) {
                this.naamRechtspersoon = value;
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
         *         <element name="BezoekadresVestiging" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="CorrespondentieadresVestiging" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
            "bezoekadresVestiging",
            "correspondentieadresVestiging"
        })
        public static class VestigingOndernemingInst {

            @XmlElement(name = "BezoekadresVestiging")
            protected KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging bezoekadresVestiging;
            @XmlElement(name = "CorrespondentieadresVestiging")
            protected KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging correspondentieadresVestiging;

            /**
             * Gets the value of the bezoekadresVestiging property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
             *     
             */
            public KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging getBezoekadresVestiging() {
                return bezoekadresVestiging;
            }

            /**
             * Sets the value of the bezoekadresVestiging property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
             *     
             */
            public void setBezoekadresVestiging(KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging value) {
                this.bezoekadresVestiging = value;
            }

            /**
             * Gets the value of the correspondentieadresVestiging property.
             * 
             * @return
             *     possible object is
             *     {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
             *     
             */
            public KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging getCorrespondentieadresVestiging() {
                return correspondentieadresVestiging;
            }

            /**
             * Sets the value of the correspondentieadresVestiging property.
             * 
             * @param value
             *     allowed object is
             *     {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
             *     
             */
            public void setCorrespondentieadresVestiging(KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging value) {
                this.correspondentieadresVestiging = value;
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
             *         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
                "straatadres"
            })
            public static class BezoekadresVestiging {

                @XmlElement(name = "Straatadres")
                protected StraatadresVerkort straatadres;

                /**
                 * Gets the value of the straatadres property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StraatadresVerkort }
                 *     
                 */
                public StraatadresVerkort getStraatadres() {
                    return straatadres;
                }

                /**
                 * Sets the value of the straatadres property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StraatadresVerkort }
                 *     
                 */
                public void setStraatadres(StraatadresVerkort value) {
                    this.straatadres = value;
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
             *         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
                "straatadres"
            })
            public static class CorrespondentieadresVestiging {

                @XmlElement(name = "Straatadres")
                protected StraatadresVerkort straatadres;

                /**
                 * Gets the value of the straatadres property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StraatadresVerkort }
                 *     
                 */
                public StraatadresVerkort getStraatadres() {
                    return straatadres;
                }

                /**
                 * Sets the value of the straatadres property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StraatadresVerkort }
                 *     
                 */
                public void setStraatadres(StraatadresVerkort value) {
                    this.straatadres = value;
                }

            }

        }

    }

}
