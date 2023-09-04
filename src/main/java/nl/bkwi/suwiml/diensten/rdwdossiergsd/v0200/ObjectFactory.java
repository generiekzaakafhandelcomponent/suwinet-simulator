
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _FWI_QNAME = new QName("http://bkwi.nl/SuwiML/FWI/v0205", "FWI");
    private static final QName _VoertuigbezitInfoOrgResponseOndernemingInst_QNAME = new QName("", "OndernemingInst");
    private static final QName _KentekenInfoResponseClientSuwi_QNAME = new QName("", "ClientSuwi");
    private static final QName _KentekenInfoResponseHandelaarOndernemingInst_QNAME = new QName("", "HandelaarOndernemingInst");

    @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "FWI")
    public JAXBElement<FWI> createFWI(FWI value) {
        return new JAXBElement<>(_FWI_QNAME, FWI.class, null, value);
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoPersoonResponse }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoPersoonResponse }
     */
    public VoertuigbezitInfoPersoonResponse createVoertuigbezitInfoPersoonResponse() {
        return new VoertuigbezitInfoPersoonResponse();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoOrgResponse }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoOrgResponse }
     */
    public VoertuigbezitInfoOrgResponse createVoertuigbezitInfoOrgResponse() {
        return new VoertuigbezitInfoOrgResponse();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse }
     */
    public KentekenInfoResponse createKentekenInfoResponse() {
        return new KentekenInfoResponse();
    }

    /**
     * Create an instance of {@link Verzekering }
     * 
     * @return
     *     the new instance of {@link Verzekering }
     */
    public Verzekering createVerzekering() {
        return new Verzekering();
    }

    /**
     * Create an instance of {@link Verzekering.Verzekeringsmaatschappij }
     * 
     * @return
     *     the new instance of {@link Verzekering.Verzekeringsmaatschappij }
     */
    public Verzekering.Verzekeringsmaatschappij createVerzekeringVerzekeringsmaatschappij() {
        return new Verzekering.Verzekeringsmaatschappij();
    }

    /**
     * Create an instance of {@link Verzekering.Verzekeringsmaatschappij.Gevolmachtigde }
     * 
     * @return
     *     the new instance of {@link Verzekering.Verzekeringsmaatschappij.Gevolmachtigde }
     */
    public Verzekering.Verzekeringsmaatschappij.Gevolmachtigde createVerzekeringVerzekeringsmaatschappijGevolmachtigde() {
        return new Verzekering.Verzekeringsmaatschappij.Gevolmachtigde();
    }

    /**
     * Create an instance of {@link Voertuigverplichtingennemer }
     * 
     * @return
     *     the new instance of {@link Voertuigverplichtingennemer }
     */
    public Voertuigverplichtingennemer createVoertuigverplichtingennemer() {
        return new Voertuigverplichtingennemer();
    }

    /**
     * Create an instance of {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer }
     * 
     * @return
     *     the new instance of {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer }
     */
    public Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer createVoertuigverplichtingennemerAdresVoertuigverplichtingennemer() {
        return new Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer();
    }

    /**
     * Create an instance of {@link AansprakelijkeVerkort }
     * 
     * @return
     *     the new instance of {@link AansprakelijkeVerkort }
     */
    public AansprakelijkeVerkort createAansprakelijkeVerkort() {
        return new AansprakelijkeVerkort();
    }

    /**
     * Create an instance of {@link AansprakelijkeVerkort.Voertuig }
     * 
     * @return
     *     the new instance of {@link AansprakelijkeVerkort.Voertuig }
     */
    public AansprakelijkeVerkort.Voertuig createAansprakelijkeVerkortVoertuig() {
        return new AansprakelijkeVerkort.Voertuig();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst createKentekenInfoResponseHandelaarOndernemingInst() {
        return new KentekenInfoResponse.HandelaarOndernemingInst();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke createKentekenInfoResponseHandelaarOndernemingInstAansprakelijke() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken createKentekenInfoResponseHandelaarOndernemingInstAansprakelijkeHandelaarskenteken() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig createKentekenInfoResponseHandelaarOndernemingInstAansprakelijkeVoertuig() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst createKentekenInfoResponseHandelaarOndernemingInstVestigingOndernemingInst() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst }
     */
    public KentekenInfoResponse.OndernemingInst createKentekenInfoResponseOndernemingInst() {
        return new KentekenInfoResponse.OndernemingInst();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke }
     */
    public KentekenInfoResponse.OndernemingInst.Aansprakelijke createKentekenInfoResponseOndernemingInstAansprakelijke() {
        return new KentekenInfoResponse.OndernemingInst.Aansprakelijke();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken }
     */
    public KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken createKentekenInfoResponseOndernemingInstAansprakelijkeHandelaarskenteken() {
        return new KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig }
     */
    public KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig createKentekenInfoResponseOndernemingInstAansprakelijkeVoertuig() {
        return new KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst }
     */
    public KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst createKentekenInfoResponseOndernemingInstVestigingOndernemingInst() {
        return new KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.ClientSuwi }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.ClientSuwi }
     */
    public KentekenInfoResponse.ClientSuwi createKentekenInfoResponseClientSuwi() {
        return new KentekenInfoResponse.ClientSuwi();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke }
     */
    public KentekenInfoResponse.ClientSuwi.Aansprakelijke createKentekenInfoResponseClientSuwiAansprakelijke() {
        return new KentekenInfoResponse.ClientSuwi.Aansprakelijke();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig }
     */
    public KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig createKentekenInfoResponseClientSuwiAansprakelijkeVoertuig() {
        return new KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.ClientSuwi.RdwAdres }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.ClientSuwi.RdwAdres }
     */
    public KentekenInfoResponse.ClientSuwi.RdwAdres createKentekenInfoResponseClientSuwiRdwAdres() {
        return new KentekenInfoResponse.ClientSuwi.RdwAdres();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoOrgResponse.OndernemingInst }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoOrgResponse.OndernemingInst }
     */
    public VoertuigbezitInfoOrgResponse.OndernemingInst createVoertuigbezitInfoOrgResponseOndernemingInst() {
        return new VoertuigbezitInfoOrgResponse.OndernemingInst();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst }
     */
    public VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst createVoertuigbezitInfoOrgResponseOndernemingInstVestigingOndernemingInst() {
        return new VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoPersoonResponse.OndernemingInst }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoPersoonResponse.OndernemingInst }
     */
    public VoertuigbezitInfoPersoonResponse.OndernemingInst createVoertuigbezitInfoPersoonResponseOndernemingInst() {
        return new VoertuigbezitInfoPersoonResponse.OndernemingInst();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst }
     */
    public VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst createVoertuigbezitInfoPersoonResponseOndernemingInstVestigingOndernemingInst() {
        return new VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoPersoonResponse.ClientSuwi }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoPersoonResponse.ClientSuwi }
     */
    public VoertuigbezitInfoPersoonResponse.ClientSuwi createVoertuigbezitInfoPersoonResponseClientSuwi() {
        return new VoertuigbezitInfoPersoonResponse.ClientSuwi();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres }
     */
    public VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres createVoertuigbezitInfoPersoonResponseClientSuwiRdwAdres() {
        return new VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoPersoon }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoPersoon }
     */
    public VoertuigbezitInfoPersoon createVoertuigbezitInfoPersoon() {
        return new VoertuigbezitInfoPersoon();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoOrg }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoOrg }
     */
    public VoertuigbezitInfoOrg createVoertuigbezitInfoOrg() {
        return new VoertuigbezitInfoOrg();
    }

    /**
     * Create an instance of {@link KentekenInfo }
     * 
     * @return
     *     the new instance of {@link KentekenInfo }
     */
    public KentekenInfo createKentekenInfo() {
        return new KentekenInfo();
    }

    /**
     * Create an instance of {@link Straatadres }
     * 
     * @return
     *     the new instance of {@link Straatadres }
     */
    public Straatadres createStraatadres() {
        return new Straatadres();
    }

    /**
     * Create an instance of {@link StraatadresVerkort }
     * 
     * @return
     *     the new instance of {@link StraatadresVerkort }
     */
    public StraatadresVerkort createStraatadresVerkort() {
        return new StraatadresVerkort();
    }

    /**
     * Create an instance of {@link Voertuigverplichtingen }
     * 
     * @return
     *     the new instance of {@link Voertuigverplichtingen }
     */
    public Voertuigverplichtingen createVoertuigverplichtingen() {
        return new Voertuigverplichtingen();
    }

    /**
     * Create an instance of {@link VerstrekkingsvoorbehoudVoertuig }
     * 
     * @return
     *     the new instance of {@link VerstrekkingsvoorbehoudVoertuig }
     */
    public VerstrekkingsvoorbehoudVoertuig createVerstrekkingsvoorbehoudVoertuig() {
        return new VerstrekkingsvoorbehoudVoertuig();
    }

    /**
     * Create an instance of {@link Verzekering.Verzekeringsmaatschappij.AdresVerzekeringsmaatschappijRdw }
     * 
     * @return
     *     the new instance of {@link Verzekering.Verzekeringsmaatschappij.AdresVerzekeringsmaatschappijRdw }
     */
    public Verzekering.Verzekeringsmaatschappij.AdresVerzekeringsmaatschappijRdw createVerzekeringVerzekeringsmaatschappijAdresVerzekeringsmaatschappijRdw() {
        return new Verzekering.Verzekeringsmaatschappij.AdresVerzekeringsmaatschappijRdw();
    }

    /**
     * Create an instance of {@link Verzekering.Verzekeringsmaatschappij.Gevolmachtigde.AdresGevolmachtigde }
     * 
     * @return
     *     the new instance of {@link Verzekering.Verzekeringsmaatschappij.Gevolmachtigde.AdresGevolmachtigde }
     */
    public Verzekering.Verzekeringsmaatschappij.Gevolmachtigde.AdresGevolmachtigde createVerzekeringVerzekeringsmaatschappijGevolmachtigdeAdresGevolmachtigde() {
        return new Verzekering.Verzekeringsmaatschappij.Gevolmachtigde.AdresGevolmachtigde();
    }

    /**
     * Create an instance of {@link Voertuigverplichtingennemer.Rechtspersoon }
     * 
     * @return
     *     the new instance of {@link Voertuigverplichtingennemer.Rechtspersoon }
     */
    public Voertuigverplichtingennemer.Rechtspersoon createVoertuigverplichtingennemerRechtspersoon() {
        return new Voertuigverplichtingennemer.Rechtspersoon();
    }

    /**
     * Create an instance of {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.FeitelijkAdres }
     * 
     * @return
     *     the new instance of {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.FeitelijkAdres }
     */
    public Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.FeitelijkAdres createVoertuigverplichtingennemerAdresVoertuigverplichtingennemerFeitelijkAdres() {
        return new Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.FeitelijkAdres();
    }

    /**
     * Create an instance of {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.Correspondentieadres }
     * 
     * @return
     *     the new instance of {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.Correspondentieadres }
     */
    public Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.Correspondentieadres createVoertuigverplichtingennemerAdresVoertuigverplichtingennemerCorrespondentieadres() {
        return new Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.Correspondentieadres();
    }

    /**
     * Create an instance of {@link AansprakelijkeVerkort.Voertuig.StatusVoertuig }
     * 
     * @return
     *     the new instance of {@link AansprakelijkeVerkort.Voertuig.StatusVoertuig }
     */
    public AansprakelijkeVerkort.Voertuig.StatusVoertuig createAansprakelijkeVerkortVoertuigStatusVoertuig() {
        return new AansprakelijkeVerkort.Voertuig.StatusVoertuig();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Rechtspersoon }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Rechtspersoon }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.Rechtspersoon createKentekenInfoResponseHandelaarOndernemingInstRechtspersoon() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.Rechtspersoon();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken createKentekenInfoResponseHandelaarOndernemingInstAansprakelijkeHandelaarskentekenStatusHandelaarskenteken() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig createKentekenInfoResponseHandelaarOndernemingInstAansprakelijkeVoertuigStatusVoertuig() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig createKentekenInfoResponseHandelaarOndernemingInstAansprakelijkeVoertuigTellerstandVoertuig() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.Keuring }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.Keuring }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.Keuring createKentekenInfoResponseHandelaarOndernemingInstAansprakelijkeVoertuigKeuring() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.Aansprakelijke.Voertuig.Keuring();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.NaamOndernemingInst }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.NaamOndernemingInst }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.NaamOndernemingInst createKentekenInfoResponseHandelaarOndernemingInstVestigingOndernemingInstNaamOndernemingInst() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.NaamOndernemingInst();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.ContactpersoonAfdVestiging }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.ContactpersoonAfdVestiging }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.ContactpersoonAfdVestiging createKentekenInfoResponseHandelaarOndernemingInstVestigingOndernemingInstContactpersoonAfdVestiging() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.ContactpersoonAfdVestiging();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.BezoekadresVestiging createKentekenInfoResponseHandelaarOndernemingInstVestigingOndernemingInstBezoekadresVestiging() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.BezoekadresVestiging();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
     */
    public KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging createKentekenInfoResponseHandelaarOndernemingInstVestigingOndernemingInstCorrespondentieadresVestiging() {
        return new KentekenInfoResponse.HandelaarOndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst.Rechtspersoon }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst.Rechtspersoon }
     */
    public KentekenInfoResponse.OndernemingInst.Rechtspersoon createKentekenInfoResponseOndernemingInstRechtspersoon() {
        return new KentekenInfoResponse.OndernemingInst.Rechtspersoon();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken }
     */
    public KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken createKentekenInfoResponseOndernemingInstAansprakelijkeHandelaarskentekenStatusHandelaarskenteken() {
        return new KentekenInfoResponse.OndernemingInst.Aansprakelijke.Handelaarskenteken.StatusHandelaarskenteken();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig }
     */
    public KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig createKentekenInfoResponseOndernemingInstAansprakelijkeVoertuigStatusVoertuig() {
        return new KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.StatusVoertuig();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig }
     */
    public KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig createKentekenInfoResponseOndernemingInstAansprakelijkeVoertuigTellerstandVoertuig() {
        return new KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.TellerstandVoertuig();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.Keuring }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.Keuring }
     */
    public KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.Keuring createKentekenInfoResponseOndernemingInstAansprakelijkeVoertuigKeuring() {
        return new KentekenInfoResponse.OndernemingInst.Aansprakelijke.Voertuig.Keuring();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
     */
    public KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging createKentekenInfoResponseOndernemingInstVestigingOndernemingInstBezoekadresVestiging() {
        return new KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
     */
    public KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging createKentekenInfoResponseOndernemingInstVestigingOndernemingInstCorrespondentieadresVestiging() {
        return new KentekenInfoResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.StatusVoertuig }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.StatusVoertuig }
     */
    public KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.StatusVoertuig createKentekenInfoResponseClientSuwiAansprakelijkeVoertuigStatusVoertuig() {
        return new KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.StatusVoertuig();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.TellerstandVoertuig }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.TellerstandVoertuig }
     */
    public KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.TellerstandVoertuig createKentekenInfoResponseClientSuwiAansprakelijkeVoertuigTellerstandVoertuig() {
        return new KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.TellerstandVoertuig();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.Keuring }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.Keuring }
     */
    public KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.Keuring createKentekenInfoResponseClientSuwiAansprakelijkeVoertuigKeuring() {
        return new KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.Keuring();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.ClientSuwi.RdwAdres.FeitelijkAdres }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.ClientSuwi.RdwAdres.FeitelijkAdres }
     */
    public KentekenInfoResponse.ClientSuwi.RdwAdres.FeitelijkAdres createKentekenInfoResponseClientSuwiRdwAdresFeitelijkAdres() {
        return new KentekenInfoResponse.ClientSuwi.RdwAdres.FeitelijkAdres();
    }

    /**
     * Create an instance of {@link KentekenInfoResponse.ClientSuwi.RdwAdres.Correspondentieadres }
     * 
     * @return
     *     the new instance of {@link KentekenInfoResponse.ClientSuwi.RdwAdres.Correspondentieadres }
     */
    public KentekenInfoResponse.ClientSuwi.RdwAdres.Correspondentieadres createKentekenInfoResponseClientSuwiRdwAdresCorrespondentieadres() {
        return new KentekenInfoResponse.ClientSuwi.RdwAdres.Correspondentieadres();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoOrgResponse.OndernemingInst.Rechtspersoon }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoOrgResponse.OndernemingInst.Rechtspersoon }
     */
    public VoertuigbezitInfoOrgResponse.OndernemingInst.Rechtspersoon createVoertuigbezitInfoOrgResponseOndernemingInstRechtspersoon() {
        return new VoertuigbezitInfoOrgResponse.OndernemingInst.Rechtspersoon();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
     */
    public VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging createVoertuigbezitInfoOrgResponseOndernemingInstVestigingOndernemingInstBezoekadresVestiging() {
        return new VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
     */
    public VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging createVoertuigbezitInfoOrgResponseOndernemingInstVestigingOndernemingInstCorrespondentieadresVestiging() {
        return new VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.Rechtspersoon }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.Rechtspersoon }
     */
    public VoertuigbezitInfoPersoonResponse.OndernemingInst.Rechtspersoon createVoertuigbezitInfoPersoonResponseOndernemingInstRechtspersoon() {
        return new VoertuigbezitInfoPersoonResponse.OndernemingInst.Rechtspersoon();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
     */
    public VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging createVoertuigbezitInfoPersoonResponseOndernemingInstVestigingOndernemingInstBezoekadresVestiging() {
        return new VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
     */
    public VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging createVoertuigbezitInfoPersoonResponseOndernemingInstVestigingOndernemingInstCorrespondentieadresVestiging() {
        return new VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging();
    }

    /**
     * Create an instance of {@link VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres.FeitelijkAdres }
     * 
     * @return
     *     the new instance of {@link VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres.FeitelijkAdres }
     */
    public VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres.FeitelijkAdres createVoertuigbezitInfoPersoonResponseClientSuwiRdwAdresFeitelijkAdres() {
        return new VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres.FeitelijkAdres();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoertuigbezitInfoOrgResponse.OndernemingInst }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VoertuigbezitInfoOrgResponse.OndernemingInst }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "OndernemingInst", scope = VoertuigbezitInfoOrgResponse.class)
    public JAXBElement<VoertuigbezitInfoOrgResponse.OndernemingInst> createVoertuigbezitInfoOrgResponseOndernemingInst(VoertuigbezitInfoOrgResponse.OndernemingInst value) {
        return new JAXBElement<>(_VoertuigbezitInfoOrgResponseOndernemingInst_QNAME, VoertuigbezitInfoOrgResponse.OndernemingInst.class, VoertuigbezitInfoOrgResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KentekenInfoResponse.ClientSuwi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KentekenInfoResponse.ClientSuwi }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ClientSuwi", scope = KentekenInfoResponse.class)
    public JAXBElement<KentekenInfoResponse.ClientSuwi> createKentekenInfoResponseClientSuwi(KentekenInfoResponse.ClientSuwi value) {
        return new JAXBElement<>(_KentekenInfoResponseClientSuwi_QNAME, KentekenInfoResponse.ClientSuwi.class, KentekenInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KentekenInfoResponse.OndernemingInst }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KentekenInfoResponse.OndernemingInst }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "OndernemingInst", scope = KentekenInfoResponse.class)
    public JAXBElement<KentekenInfoResponse.OndernemingInst> createKentekenInfoResponseOndernemingInst(KentekenInfoResponse.OndernemingInst value) {
        return new JAXBElement<>(_VoertuigbezitInfoOrgResponseOndernemingInst_QNAME, KentekenInfoResponse.OndernemingInst.class, KentekenInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KentekenInfoResponse.HandelaarOndernemingInst }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KentekenInfoResponse.HandelaarOndernemingInst }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "HandelaarOndernemingInst", scope = KentekenInfoResponse.class)
    public JAXBElement<KentekenInfoResponse.HandelaarOndernemingInst> createKentekenInfoResponseHandelaarOndernemingInst(KentekenInfoResponse.HandelaarOndernemingInst value) {
        return new JAXBElement<>(_KentekenInfoResponseHandelaarOndernemingInst_QNAME, KentekenInfoResponse.HandelaarOndernemingInst.class, KentekenInfoResponse.class, value);
    }

}
