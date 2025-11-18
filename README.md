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

