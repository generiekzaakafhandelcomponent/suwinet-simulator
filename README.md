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
  9. \<simulator-url\>/ws/UWVDossierWerknemersverzekeringenGSD-v0200/v1 - UWVPersoonsWvInfo

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
9. UWV - UWVPersoonsWvInfo:<BR>UWVDossierWerknemersverzekeringenGSD_UWVPersoonsWvInfo_\<Burgerservicenr\>.xml

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


### Existing test data

Abbreviations: IKV = UWV Inkomsten, WV = UWV Werknemersverzekeringen, Stufi = DUO Studiefinanciering.

#### Households and persons with data in several services

| BSN | Person | Services with data | Notes |
|---|---|---|---|
| 111111110 | Henk de Jansen (Amsterdam) | BRP, Bijstand, DUO, Stufi, Kadaster (4 objects), RDW (MH74DZ, 16ZDLX), SVB (AOW, AIO), IKV, WV (WW) | Most complete person. Bijstand includes claims (vorderingen) and fraud. Partner 999991954, children 243000157, 243000017, 010002546, 080000071 |
| 999991954 | Sierra Kooyman | BRP, Bijstand, DUO, Stufi, Kadaster, RDW (0118SK oldtimer, 0541AB), IKV | Same address as applicant (partner of 111111110) |
| 222222220 | Jack de Ruijter | BRP | Copy of 111111110 **without nationality** (`Nationaliteit` absent) |
| 999991322 | Celeste Avion | BRP, Bijstand, RDW (32PNL1), IKV | Secret data (`CdBrpGegevensGeheim` 7), **no residential address (domicile), only a correspondence address**, 5 children |
| 010002546 / 080000071 / 243000017 / 243000157 | Children of the De Jansen household | BRP | 010002546 is a **deceased** child; 243000017 "no longer lives at home" |
| 689735273 | Lars Terphuis (Den Haag) | BRP, Bijstand (fraud), DUO, Stufi, Kadaster (incl. garage), RDW (LS89KP, MT12GH), SVB (WLZ), IKV | Partner 022264541, children 061692165, 077400434, 556163771 |
| 022264541 | Nora van Wollingen (Den Haag) | BRP, Bijstand, DUO (HAVO), Stufi, Kadaster, RDW (NK45TR), SVB (AOW, WLZ), IKV | Partner of 689735273 |
| 999993549 | Johan Maren (Utrecht) | BRP, Bijstand, DUO, Stufi, Kadaster, RDW (PR90TS), SVB (WLZ), IKV | Partner 999998493, children 999993069, 999993173, 999993203 (all Stadsplateau 1) |
| 999998493 | Elise Schouten (Utrecht) | BRP, Bijstand (fraud), DUO, Kadaster, RDW (FR23QW), SVB (WLZ), IKV | Partner of 999993549 |
| 347910099 / 377549733 | Anna and Kees Jansen (Den Haag) | BRP, Kadaster (apartment), RDW (HK12HK / LL11LL), IKV | Married couple, both employed by a gemeente |
| 444444440 | Martin de Visser (born 1944) | BRP, Stufi, Kadaster, RDW (MH74DZ), SVB (AOW), IKV | **No residential address (domicile)** in BRP |
| 999997051 | Alma Milena de Lata Vishwanathan lyer | BRP, DUO, Stufi, Kadaster, SVB (AOW, AIO), IKV | Long name, residence permit (verblijfstitel) |
| 999992879 / 999993355 | Lonneke Smit / Jan-Kees Brouwers (Utrecht) | 999992879: BRP, DUO (university), Stufi, RDW (PL986X, B758LZ); 999993355: BRP | Couple, both with **secret data** (geheim 7), child 999994487 |
| 999990238 | Stephanie Bruinhard (Utrecht) | BRP, Bijstand, RDW (853PML2), IKV | One child |
| 999999990 | Willeke de Bruijn | BRP, Bijstand | Bijstand returns an **FWI error** (`FWI0001` technical error); BRP has secret data (geheim 7) |
| 123456782 | Antoine van der Aa | BRP, RDW (MH74DZ) | |

#### BRP-only persons and edge cases

| BSN | What it tests |
|---|---|
| 999971827 | Person **without first names or initials** (`Voornamen` empty) |
| 999971839 | Empty `Correspondentieadres` element |
| 999971840 | `Correspondentieadres` with empty child elements |
| 888884187 | **Street name containing digits** |
| 231001320 | Complex history: several immigrations, address abroad, dissolved marriage, data under investigation (onderzoek), historical nationality |
| 241001420 | Several (historical) partners, data under investigation (onderzoek), historical nationality |
| 999991425 | Born 1899, secret data (geheim 7), several children and historical addresses |
| 999997646 | Elderly person (born 1935) |
| 999990081, 999992302, 999993951, 999994086 | Residence (bewoning) test set; 999990081 immigrated with a residence permit, 999994086 immigrated and under investigation (onderzoek) |
| 999971207 / 999996551 / 999996599 | Couple (Meerman / Veekers) with child |
| 999993562 / 999990937 / 999992697 | Couple (Lapzwans / Bultenaar) with child |
| 888888880, 999990160, 999992168, 999993975, 999994189 | Plain individual persons (888888880 has the same name as 999999990, with a different date of birth) |

#### Other keys

| Service | Keys | Notes |
|---|---|---|
| IKV only | 768510338, 777777770, 999996769 | Income histories without other data |
| UWV Inkomsten DigitaleDiensten | 112233454 | |
| RDW KentekenInfo | 0118SK (oldtimer), 7TPR98 (code vehicle absent), 0541AB, 16ZDLX, 32PNL1, 853PML2, B758LZ, FR23QW, HK12HK, LL11LL, LS89KP, MH74DZ, MT12GH, NK45TR, NU11LL, PL986X, PR90TS | |
| Kadaster ObjectInfo | 0277/12051, 0344/12873, 0344/13902, 0344/41562, 0344/41563, 0363/12846, 0363/21845, 0363/21846, 0363/23110, 0363/23111, 0518/2545, 0518/38217, 0518/39218, 0633/2535, 1189/11482, 1189/43970, 1189/43980 | 0881/2839 contains a stored SOAP Fault envelope |

Files ending in `-request.xml`, `_old.xml` or `_20240710.xml` are not served by a BSN lookup. They are example requests or old versions.

### Life-situation test scenarios (BSN 7000xxxxx)

Each scenario gives a consistent picture across services for the same person. Reference date: 2026-11-23.
A service without a file for that BSN returns `NietsGevonden` (that's intentional, e.g. no UWV income).

| # | Scenario | BSN(s) | Services with data |
|---|---|---|---|
| 1 | Single parent with 2 young children, bijstand + kinderbijslag | 700000008 (children 700000148, 700000288) | BRP, SVB (AKW), Bijstand |
| 2 | Couple, partner works flex/0-hour contract, varying income | 700000434 (partner 700000574) | BRP, Bijstand (application pending); UWV-IKV for partner |
| 3 | Several employers at once (main job + side job, one ended) | 700000719 | BRP, UWV-IKV |
| 4 | Dismissed, WW ends 2027-01-31 | 700000859 | BRP, UWV-WV, UWV-IKV |
| 5 | WIA/WGA with partial work | 700000999 | BRP, UWV-WV, UWV-IKV |
| 6 | Widow with AOW, ANW history (husband died 2015) | 700001141 (husband 700001281) | BRP, SVB |
| 7 | Student with stufi + aanvullende beurs, dropped out 2026 | 700001426 | BRP, DUO-Persoon, DUO-Stufi |
| 8 | Owner of a mortgage-free house (1/2 share), applying for bijstand | 700001566 (partner 700001712) | BRP, Kadaster (perceel 0344/60411), Bijstand |
| 9 | Recently divorced, still co-owner of former marital home | 700001852 (ex 700001992) | BRP, Kadaster (perceel 0344/60521) |
| 10 | Adult children at home (kostendelersnorm) | 700002133 (700002273, 700002418, 700002558) | BRP, Bijstand, UWV-IKV for the children |
| 11 | 18–21 on bijstand, no basic qualification (startkwalificatie), part-time job | 700002698 | BRP, DUO-Persoon, UWV-IKV, Bijstand |
| 12 | Wajong with job at sheltered employer | 700002844 | BRP, UWV-WV, UWV-IKV |
| 13 | Ziektewet after temporary contract ended | 700002984 | BRP, UWV-WV, UWV-IKV |
| 14 | Partial AOW (immigrated 1992) + AIO | 700003125 | BRP, SVB, Bijstand |
| 15 | Back from Australia, only old Dutch income (up to 2014) | 700003265 | BRP, UWV-IKV |
| 16 | Self-employed (zzp) with delivery van, no paid employment | 700003411 | BRP, RDW (kenteken VND82S) |
| 17 | Bought a car while on bijstand | 700003551 | BRP, Bijstand, RDW (kenteken TKZ34G) |
| 18 | Student with partner and child, partnertoeslag + part-time job | 700003691 (partner 700003836, child 700003976) | BRP, DUO-Persoon, DUO-Stufi, UWV-IKV |
| 19 | WW with sanction (25% reduction) | 700004117 | BRP, UWV-WV, UWV-IKV |
