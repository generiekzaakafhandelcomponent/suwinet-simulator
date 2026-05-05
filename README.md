# Simulation application for suwinet

This application is a microservice simulating Suwinet services. It is developed for test purposes.  The simulated service endpoints return predefined responses. Responses are uploaded as xml files to the resources folder of the repository. 
The endpoint code is already generated based on Suwinet WSDLs.

### Requirements

- Java version 17  

### Environment variables

* Basic authentication used 2 Environment variables:
  * SUWINET_PASSWORD
  * SUWINET_USER
* add them to the configuration of the bootRun gradle task

### Run the platform

* run the `bootRun` gradle task

### Simulated service endpoints:

The services baseurl is \<simulator-url\>/ws/, the following services are supported: 
  1. \<simulator-url\>/ws/KadasterDossierGSD-v0300/v1 - PersoonsInfo 
  2. \<simulator-url\>/ws/KadasterDossierGSD-v0300/v1 - ObjectInfoKadastraleAanduiding
  3. \<simulator-url\>/ws/UWVDossierInkomstenGSD-v0200/v1 - UWVPersoonsIkvInfo
  4. \<simulator-url\>/ws/RDWDossierDigitaleDiensten-v0200/v1 - VoertuigbezitInfoPersoon
  5. \<simulator-url\>/ws/RDWDossierDigitaleDiensten-v0200/v1 - KentekenInfo
  6. \<simulator-url\>/ws/BRPDossierPersoonGSD-v0200/v1 - AanvraagPersoon
  7. \<simulator-url\>/ws/DUODossierPersoonGSD-v0300/v1 - DUOPersoonsInfo 
  8. \<simulator-url\>/ws/Bijstandsregelingen-v0500/v1 - BijstandsregelingenInfo

You can find example client requests in src/main/resources/suwinet/data/ExampleRequests
The simulator uses basic authentication.

### Test content (with SoapUI)

Test requests are stored at src/main/resources/suwinet/data/ExampleRequests/

SoapUI is an easy tool to test SOAP WS endpoints. When importing a WSDL in your SoapUI Project it will generate the requests for the available endpoints. 
The WSDL files are stored at src/main/resources/suwinet/Diensten/\<service\>/\<version\>/Impl/BKWI.wsdl

### Adding test responses

The location of the responses is src/main/resources/suwinet/data/Responses/<BR>
Based on the unique keys as **bsn**, **kenteken**, **Perceelnummer** in the request a xml response file is returned.
The naming convention of the response files are:
1. Kadaster - PersoonsInfo:<BR>KadasterDossierGSD_PersoonsInfo_\<Burgerservicenr\>.xml
2. Kadaster - ObjectInfoKadastraleAanduiding:<BR>KadasterDossierGSD_ObjectInfoKadastraleAanduiding_\<CdKadastraleGemeente\>_\<KadastraalPerceelnr\>.xml
3. UWV - UWVPersoonsIkvInfo:<BR>UWVDossierInkomstenGSD_UWVPersoonsIkvInfo_\<Burgerservicenr\>.xml
4. RDW - VoertuigbezitInfoPersoon:<BR>RDWDossierGSD_VoertuigbezitInfoPersoon_\<Burgerservicenr\>.xml
5. RDW - KentekenInfo:<BR>RDWDossierGSD_KentekenInfo_\<kenteken\>.xml
6. BRP - AanvraagPersoon:<BR>BRPDossierPersoonGSD_AanvraagPersoon_\<Burgerservicenr\>.xml
7. DUO - DUOPersoonsInfo:<BR>DUODossierPersoonGSD_DUOPersoonsInfo_\<Burgerservicenr\>.xml
8. Bijstandsregelingen - Bijstandsregelingen:<BR>BijstandsregelingenInfo_\<Burgerservicenr\>.xml

### Response editor

The project also includes a browser-based editor for the response XML files. After starting the simulator, the editor is available at `<simulator-url>/responses/`.

* Backend: `src/main/java/com/ritense/suwitense/webservice/responseeditor/`
* Frontend: `src/main/resources/static/responses/`
* Files written by the editor land in the path configured by `simulator.responses.path` in `application.properties` (defaults to `src/main/resources/suwinet/data/Responses`).

#### Validation checks (UWV-inkomsten files only)

When you open a `UWVDossierInkomstenGSD_UWVPersoonsIkvInfo_*.xml` file, the editor inspects it and shows a warning banner above the form when one of these is true:

* Two or more `<Inkomstenverhouding>` records share the same `<VolgnrIkv>`. In GZAC every record from the first duplicate onwards may be silently dropped (records are indexed on this value).
* `<PeriodeGegevensleveringIko>` is missing.
* `<DatBPeriode>` lies after the earliest `<DatBIko>` / `<DatBIkp>` in the file, or `<DatEPeriode>` lies before the last `<DatEIko>` / `<DatEIkp>`.

The **"Automatisch oplossen"** button:

* Renumbers `VolgnrIkv` sequentially `1..N` in document order.
* Creates or updates `<PeriodeGegevensleveringIko>` so that `DatBPeriode` matches the earliest data date and `DatEPeriode` matches the latest, capped to today. `99991231`-style open-ended markers are ignored.

Changes are pushed into the raw editor + form but not saved — review and click **Opslaan** to persist.

#### Auto-updates on edit

Adding a "Recente inkomsten" block via the person-detail panel automatically recomputes `<PeriodeGegevensleveringIko>` so the newly added months fall inside the delivery period.

These rules are UWV-inkomsten-only because `<PeriodeGegevensleveringIko>` is only defined in the UWV `BodyReaction.xsd` (see Ontology below) — there is no equivalent in SVB / DUO / BRP / Bijstandsregelingen / Kadaster / RDW.

### Ontology / SuwiML basisschema

The "ontology" Suwinet works against is the BKWI SuwiML basisschema, distributed as XSD files inside this repo:

* Per service: `src/main/resources/suwinet/<Dienst>/Basisschema/v0801-b01/` (SimpleTypes, ComplexTypes, TypedXsd) — defines reusable types like `BSN`, `Datum`, `VolgnrIkv`, `Loonheffingennr`, `SofiNr`.
* Per service body / response: `src/main/resources/suwinet/<Dienst>/Diensten/<Dienst>/<version>/BodyReaction.xsd` — defines the response shape for that service, including service-specific elements like UWV's `<PeriodeGegevensleveringIko>`.
* Generated JAXB classes (do not edit): `src/main/java/nl/bkwi/suwiml/...`

When you wonder *"is this element name a general SuwiML thing or service-specific?"*, check the basisschema first — anything defined there is shared across services.

### New WSDL endpoints

Add other WSDLs to add additional endpoints, a wsimport task defined in the build.gradle.kts e.g. **RDWWsImport** will generate the code.
A small adjustment needs to be made to 2 files. Move the following code block from *src/main/java/nl/bkwi/suwiml/fwi/\<version\>/ObjectFactory.java* to *src/main/java/nl/bkwi/suwiml/diensten/\<SuwinetService\>/\<version\>/ObjectFactory.java* after the **wsimport** task

```java
   private static final QName _FWI_QNAME = new QName("http://bkwi.nl/SuwiML/FWI/v0205", "FWI");
   @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "FWI")
   public JAXBElement<FWI> createFWI(FWI value) {
       return new JAXBElement<>(_FWI_QNAME, FWI.class, null, value);
   }
```

