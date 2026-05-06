# Bekende inhoudsproblemen in de suwinet-simulator response XML-bestanden

Dit document beschrijft structurele en inhoudelijke afwijkingen die zijn aangetroffen in de response XML-bestanden van de suwinet-simulator. De meeste zijn inmiddels gecorrigeerd; dit overzicht dient als referentie voor toekomstig beheer.

---

## 1. Verkeerde elementvolgorde (XSD sequence)

De simulator parsed en serialiseert XML op basis van de XSD-volgorde. Bestanden met de verkeerde volgorde geven false-positive diffs in het verschil-rapport, ook als de data-inhoud correct is.

### BRP AanvraagPersoon — vijf patronen aangetroffen in 13 bestanden

| # | Beschrijving |
|---|---|
| 1 | `<Verblijfstitel>` stond ná `<InschrijvingsgegevensBrp>` — moet ná `<Nationaliteit>` en vóór `<VerblijfplaatsHistorisch>` |
| 2 | Binnen `<DomicilieAdres>`: `<IdentificatiecdVerblijfplaats>` en `<IdentificatiecdNraanduiding>` stonden vóór `<Huisletter>`/`<Huisnrtoevoeging>` — moet andersom |
| 3 | Top-level `<DomicilieAdres>` en `<AangifteAdreshoudingBrp>` stonden ná `<VerblijfplaatsHistorisch>`-blokken — moeten ervóór |
| 4 | `<Locatieoms>` binnen `<VerblijfplaatsHistorisch><DomicilieAdres>` stond niet als eerste child |
| 5 | `<InschrijvingsgegevensBrp/>` stond vóór `<Kind>` en `<Huwelijk>` — moet helemaal aan het einde van `ClientSuwi` |

Getroffen bestanden (BSN): 123456782, 111111110, 999997051, 999991954, 999991322, 999992879, 999993355, 999990238, 010002546, 080000071, 243000017, 243000157, 999990160

Correcte volgorde in `ClientSuwi`: persoonsgegevens → Nationaliteit → Verblijfstitel → DomicilieAdres → AangifteAdreshoudingBrp → VerblijfplaatsHistorisch* → Ouder1/2 → Huwelijk → Kind → InschrijvingsgegevensBrp

### SVB SVBPersoonsInfo — Geboortedat vóór Geslacht

`<Geboortedat>` stond vóór `<Geslacht>` in `ClientSuwi`. Correcte volgorde: Geslacht eerst, daarna Geboortedat.

Getroffen bestanden (BSN): 022264541, 111111110, 444444440, 689735273, 999993549, 999997051, 999998493, 999990111

### DUO — twee patronen

| # | Beschrijving |
|---|---|
| 1 | `ResultaatExamen`: `DatResultaatExamen` stond vóór `CdResultaatExamen` — moet andersom. Geldt in zowel `DUODossierPersoonGSD` als `DUODossierStudiefinancieringGSD` |
| 2 | `Studiefinanciering`: `IndToekenningWtosVo18` stond vóór de `CdStatus*`-velden — moet erna |

Getroffen bestanden (BSN): 999991954, 022264541, 689735273, 999993549, 999998493

---

## 2. Onjuiste waardecoderingen (Bijstandsregelingen)

De XSD schrijft specifieke typen voor; de simulator-bestanden gebruikten leesbare afkortingen die in productie niet voorkomen.

| Veld | Was | Moet zijn | Reden |
|---|---|---|---|
| `Geslacht` | `v` / `m` | `2` / `1` | XSD-patroon `\d*`, lengte 1; BRP-standaard: 1=man, 2=vrouw, 9=onbekend |
| `Voorletters` | `C.` | `C` | XSD-patroon staat geen combinatie van letters en punt toe |
| `StdIndJN`-velden (`IndRecidive` etc.) | `J` / `N` | `1` / `0` | Type `StdIndJN`, lengte 1, patroon `\d*` |
| Eencijfer-codes (`CdSrtSanctie` etc.) | `01` | `1` | Lengte 1; twee tekens is ongeldig |
| `CdKolomSuwi` | `K401`, `K402` etc. | `401`, `402` etc. | Type `nonNegativeInteger`; letter-prefix maakt de waarde ongeldig en veroorzaakt JAXB-cascadefouten |
| `CdPartijSuwi` | `P401` | `0401` | Type string, lengte 4, patroon `\d*`; letter-prefix ongeldig |
| `CdVestigingSuwi` | `V401` | `0401` | Idem |

Getroffen bestanden (BSN): 999990238, 689735273, 022264541, 999991954, 999991322, 999993549, 999998493

---

## 3. Onjuiste notatie voor bedragen (`StandaardBedr`)

`BedrAanvangVordering` en `BedrSaldoVordering` zijn complex types. JAXB negeert tekst direct in een complex element — zowel `1250.00` als `1250` leveren altijd een leeg element (`<BedrAanvangVordering/>`).

Correcte notatie:
```xml
<BedrAanvangVordering>
    <WaardeBedr>125000</WaardeBedr>
</BedrAanvangVordering>
```

`WaardeBedr` is `xs:nonNegativeInteger` in **centen** (€1250 → 125000).

Getroffen bestanden (BSN): 022264541, 689735273, 111111110, 999991322, 999991954, 999993549, 999998493

---

## 4. Ongeldig element in RDW Straatadres

`<Huisletter>` bestaat niet in het RDW XSD-schema voor `Straatadres`. De simulator strippte het element bij serialiseren, waardoor de opgeslagen file afweek van de daadwerkelijke response.

Getroffen bestand: `RDWDossierGSD_VoertuigbezitInfoPersoon_999990238.xml`

Het element is wél geldig in BRP `DomicilieAdres`.

---

## 5. SOAP envelope in response-bestanden

Response XML-bestanden mogen **geen** SOAP envelope bevatten. De simulator's `SuwinetEndpoint.unmarshal()` verwacht een bare response-element (bijv. `<ns3:PersoonsInfoResponse xmlns:ns3="...">`). Een `<soapenv:Envelope>` als root geeft een stille JAXB-fout, waarna de simulator HTTP 500 teruggeeft met `obj parameter must not be null`.

---

## 6. Ongeldige elementen in `<Ouder>`-blokken (BRP)

`<CdGeboortegemeente>` en `<Geboorteland>` zijn niet gedefinieerd in het XSD-type voor Ouder. JAXB strips ze bij serialiseren, waardoor de opgeslagen file afwijkt van de daadwerkelijke response.

Getroffen bestand: `BRPDossierPersoonGSD_AanvraagPersoon_999993203.xml`

Deze velden zijn wél geldig op persoonsniveau (top-level `ClientSuwi`), maar niet binnen `<Ouder1>` of `<Ouder2>`.

---

## 7. Verkeerd elementtype in DUODossierStudiefinancieringGSD

`DUODossierStudiefinancieringGSD` verwacht `<Studiefinanciering>`-blokken met de subelementen `DatBToekenningsperiodeStufi`, `DatEToekenningsperiodeStufi`, `CdToekenningBasisbeursStufi`, `IndAanvullendeBeursStufi`. Elementen als `<IndStartkwalificatieDuo>`, `<Onderwijsovereenkomst>` en `<ResultaatOpleidingGeregistrDuo>` horen bij een ander DUO-service en worden door JAXB genegeerd, waarna de response alleen `<Burgerservicenr>` bevat.

Getroffen bestand: `DUODossierStudiefinancieringGSD_DUOStudiefinancieringInfo_999998493.xml`

---

## 8. Verkeerde volgorde `<PubliekrechtelijkeBeperking>` in Kadaster

`<PubliekrechtelijkeBeperking>` stond vóór `<LocatieOZ>` maar moet erna komen (na `</LocatieOZ>`). JAXB serialiseert op XSD-volgorde waardoor de beperking anders gepositioneerd wordt dan in de opgeslagen file.

Getroffen bestanden (perceelcode): 0277_12051, 0344_12873, 0344_13902, 0344_41562, 0344_41563, 0363_12846, 0363_21845, 0363_23110, 0363_23111, 0518_2545, 0518_38217, 0518_39218, 0633_2535, 1189_11482, 1189_43970, 1189_43980

---

## 9. Lowercase adressubelementen in `PersoonAdministratieveEenheid` (UWV)

Binnen `<FeitelijkAdresPersoonAeh>` en `<CorrespondentieadresPersoonAeh>` moeten adressubelementen gekapitaliseerd zijn (`<Straatnaam>`, `<Huisnummer>`, `<Huisletter>`, `<Postcode>`, `<Woonplaats>`, `<Gemeente>`, `<Land>`, `<Postbusnummer>`). Lowercase varianten worden door JAXB niet herkend; de containers worden leeg geretourneerd.

Getroffen bestand: `UWVDossierInkomstenGSD_UWVPersoonsIkvInfo_444444440.xml`

---

## Algemeen advies voor nieuwe bestanden

- Volg de XSD-elementvolgorde strikt — afwijkingen zijn niet zichtbaar als fout maar geven false-positive diffs.
- Gebruik cijfercodes, niet leesbare afkortingen (`1`/`0`/`2`, niet `J`/`N`/`v`/`m`).
- Bedragen altijd als `<WaardeBedr>` in centen.
- Begin elk bestand met het bare response-element, nooit met een SOAP envelope.
- Gebruik `Huisletter` niet in RDW `Straatadres`-blokken.
