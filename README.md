# Simulation application for suwinet

This application is a microservice simulating Suwinet services. It is developed for test purposes. The simulated service endpoints return predefined responses. Responses are uploaded as XML files to the resources folder of the repository.
The endpoint code is already generated based on Suwinet WSDLs.

## Requirements

- Java 17

## Environment variables

Basic authentication uses two environment variables:

- `SUWINET_USER`
- `SUWINET_PASSWORD`

Add them to the configuration of the `bootRun` Gradle task.

## Run the platform

Run the `bootRun` Gradle task:

```sh
./gradlew bootRun
```

## Use this simulator in a gzac project

A typical gzac project (e.g. `gzac-sd-zgw-backend`) ships with a Suwinet
simulator running as a container in its `docker-compose.yml`, exposed on host
port `8090`. Example:

```yaml
suwinet-simulator:
    container_name: gzac-suwinet-simulator
    image: ghcr.io/generiekzaakafhandelcomponent/suwinet-simulator:<tag>
    ports:
        - "8090:8090"
    environment:
        - SUWINET_USER=user
        - SUWINET_PASSWORD=pwd
```

To point gzac at your local build of this simulator instead of the dockerized one:

1. Stop the container so port `8090` is free:
   ```sh
   docker compose stop suwinet-simulator
   ```
   (or `docker stop gzac-suwinet-simulator`)
2. Match the credentials gzac uses. Set `SUWINET_USER` / `SUWINET_PASSWORD` for
   the `bootRun` task to the same values as the docker service (`user` / `pwd`
   in the example above).
3. Start this simulator with `./gradlew bootRun`. It binds to `8090`, so any
   gzac component already configured against `localhost:8090` will now hit your
   local build.

## Simulated service endpoints

The services base URL is `{simulator-url}/ws/`. The following services are supported:

| # | Endpoint | Operation |
|---|----------|-----------|
| 1 | `/ws/KadasterDossierGSD-v0300/v1` | PersoonsInfo |
| 2 | `/ws/KadasterDossierGSD-v0300/v1` | ObjectInfoKadastraleAanduiding |
| 3 | `/ws/UWVDossierInkomstenGSD-v0200/v1` | UWVPersoonsIkvInfo |
| 4 | `/ws/RDWDossierDigitaleDiensten-v0200/v1` | VoertuigbezitInfoPersoon |
| 5 | `/ws/RDWDossierDigitaleDiensten-v0200/v1` | KentekenInfo |
| 6 | `/ws/BRPDossierPersoonGSD-v0200/v1` | AanvraagPersoon |
| 7 | `/ws/DUODossierPersoonGSD-v0300/v1` | DUOPersoonsInfo |
| 8 | `/ws/Bijstandsregelingen-v0500/v1` | BijstandsregelingenInfo |

The simulator uses basic authentication. Example client requests can be found in `src/main/resources/suwinet/data/ExampleRequests`.

## Test content (with SoapUI)

Test requests are stored at `src/main/resources/suwinet/data/ExampleRequests/`.

SoapUI is an easy tool to test SOAP WS endpoints. When importing a WSDL in your SoapUI project it will generate the requests for the available endpoints.
WSDL files are stored at `src/main/resources/suwinet/Diensten/<service>/<version>/Impl/BKWI.wsdl`.

## Adding test responses

Responses live in `src/main/resources/suwinet/data/Responses/`. Based on the unique key in the request (BSN, kenteken, perceelnummer) the simulator returns the matching XML file. Naming conventions:

1. **Kadaster – PersoonsInfo**  
   `KadasterDossierGSD_PersoonsInfo_{Burgerservicenr}.xml`
2. **Kadaster – ObjectInfoKadastraleAanduiding**  
   `KadasterDossierGSD_ObjectInfoKadastraleAanduiding_{CdKadastraleGemeente}_{KadastraalPerceelnr}.xml`
3. **UWV – UWVPersoonsIkvInfo**  
   `UWVDossierInkomstenGSD_UWVPersoonsIkvInfo_{Burgerservicenr}.xml`
4. **RDW – VoertuigbezitInfoPersoon**  
   `RDWDossierGSD_VoertuigbezitInfoPersoon_{Burgerservicenr}.xml`
5. **RDW – KentekenInfo**  
   `RDWDossierGSD_KentekenInfo_{kenteken}.xml`
6. **BRP – AanvraagPersoon**  
   `BRPDossierPersoonGSD_AanvraagPersoon_{Burgerservicenr}.xml`
7. **DUO – DUOPersoonsInfo**  
   `DUODossierPersoonGSD_DUOPersoonsInfo_{Burgerservicenr}.xml`
8. **Bijstandsregelingen**  
   `BijstandsregelingenInfo_{Burgerservicenr}.xml`

## Response editor

The project includes a browser-based editor for the response XML files. After starting the simulator, the editor is available at `{simulator-url}/responses/`.

- Backend: `src/main/java/com/ritense/suwitense/webservice/responseeditor/`
- Frontend: `src/main/resources/static/responses/`
- Files written by the editor land in the path configured by `simulator.responses.path` in `application.properties` (defaults to `src/main/resources/suwinet/data/Responses`).

### Validation checks (UWV-inkomsten files only)

When you open a `UWVDossierInkomstenGSD_UWVPersoonsIkvInfo_*.xml` file, the editor inspects it and shows a warning banner above the form when one of these is true:

- Two or more `<Inkomstenverhouding>` records share the same `<VolgnrIkv>`. In GZAC every record from the first duplicate onwards may be silently dropped (records are indexed on this value).
- `<PeriodeGegevensleveringIko>` is missing.
- `<DatBPeriode>` lies after the earliest `<DatBIko>` / `<DatBIkp>` in the file, or `<DatEPeriode>` lies before the last `<DatEIko>` / `<DatEIkp>`.

The **"Automatisch oplossen"** button:

- Renumbers `VolgnrIkv` sequentially `1..N` in document order.
- Creates or updates `<PeriodeGegevensleveringIko>` so that `DatBPeriode` matches the earliest data date and `DatEPeriode` matches the latest, capped to today. `99991231`-style open-ended markers are ignored.

Changes are pushed into the raw editor and form but not saved — review and click **Opslaan** to persist.

### Auto-updates on edit

Adding a "Recente inkomsten" block via the person-detail panel automatically recomputes `<PeriodeGegevensleveringIko>` so the newly added months fall inside the delivery period.

These rules are UWV-inkomsten-only because `<PeriodeGegevensleveringIko>` is only defined in the UWV `BodyReaction.xsd` (see Ontology below) — there is no equivalent in SVB / DUO / BRP / Bijstandsregelingen / Kadaster / RDW.

## Ontology / SuwiML basisschema

The "ontology" Suwinet works against is the BKWI SuwiML basisschema, distributed as XSD files inside this repo:

- Per service: `src/main/resources/suwinet/<Dienst>/Basisschema/v0801-b01/` (SimpleTypes, ComplexTypes, TypedXsd) — defines reusable types like `BSN`, `Datum`, `VolgnrIkv`, `Loonheffingennr`, `SofiNr`.
- Per service body / response: `src/main/resources/suwinet/<Dienst>/Diensten/<Dienst>/<version>/BodyReaction.xsd` — defines the response shape for that service, including service-specific elements like UWV's `<PeriodeGegevensleveringIko>`.
- Generated JAXB classes (do not edit): `src/main/java/nl/bkwi/suwiml/...`

When you wonder _"is this element name a general SuwiML thing or service-specific?"_, check the basisschema first — anything defined there is shared across services.

## Dynamic dates in responses

For test scenarios where you want a response to keep showing dates relative to "today" (e.g. always include income from the last 3 months), mark a date with a `DynamicDate` comment. At request time the simulator substitutes the value of the element directly after the comment with `today + offset`. The file on disk is **not** rewritten — only the in-memory copy used to serve that one response.

Place the comment directly before the element whose value should be replaced:

```xml
<!-- DynamicDate: today - 2 months -->
<DatEIkv>20240131</DatEIkv>
```

The date inside the element acts as documentation (handy when reviewing diffs); it gets overwritten at request time.

Supported syntax:

```xml
<!-- DynamicDate: today -->                     <!-- vandaag -->
<!-- DynamicDate: today - 90 days -->           <!-- 90 dagen geleden -->
<!-- DynamicDate: today - 2 months -->          <!-- 2 maanden geleden -->
<!-- DynamicDate: today + 1 year -->            <!-- over een jaar -->
```

Units: `day(s)`, `week(s)`, `month(s)`, `year(s)`. The keyword `DynamicDate` and the units are case-insensitive.

Both date formats found in Suwinet responses are supported and preserved on substitution:

- `YYYYMMDD` (compact, e.g. `20260304`)
- `YYYY-MM-DD` (ISO-dashed, e.g. `2026-03-04`)

Files (and elements) without a `DynamicDate` comment pass through untouched, so the feature is fully opt-in.

## New WSDL endpoints

Add other WSDLs to add additional endpoints. A `wsimport` task defined in `build.gradle.kts` (e.g. **RDWWsImport**) will generate the code.
A small adjustment needs to be made to two files: move the following code block from `src/main/java/nl/bkwi/suwiml/fwi/<version>/ObjectFactory.java` to `src/main/java/nl/bkwi/suwiml/diensten/<SuwinetService>/<version>/ObjectFactory.java` after the `wsimport` task:

```java
private static final QName _FWI_QNAME = new QName("http://bkwi.nl/SuwiML/FWI/v0205", "FWI");

@XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "FWI")
public JAXBElement<FWI> createFWI(FWI value) {
    return new JAXBElement<>(_FWI_QNAME, FWI.class, null, value);
}
```
