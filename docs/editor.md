# Suwinet Sim — Response Editor

Browser-gebaseerde editor voor de response XML-bestanden van de Suwinet Simulator. Alleen op de branch `feature/response-editor`, niet gemerged naar `main`.

---

## Inhoudsopgave

1. [Overzicht](#overzicht)
2. [Starten](#starten)
3. [Architectuur](#architectuur)
4. [REST API](#rest-api)
5. [Frontend structuur](#frontend-structuur)
6. [Styleguide](#styleguide)

---

## Overzicht

De editor laat je Suwinet response XML-bestanden bekijken, aanpassen, testen en kopiëren via een webinterface. De simulator blijft gewoon draaien terwijl je bewerkt — bestanden worden direct weggeschreven naar de geconfigureerde responses-map.

Twee weergaven:

- **Personen** — groepeert bestanden per BSN; toont persoonsgegevens in een tabel
- **Bestanden** — flat overzicht van alle XML-bestanden met filterkolommen

---

## Starten

```sh
./gradlew bootRun
```

UI: <http://localhost:8090/responses/>  
API: `/admin/responses`

### Andere worktree als doel

Wil je de editor gebruiken terwijl de XML-wijzigingen op een andere branch landen? Maak een worktree en wijs de responses-map daar naartoe:

```sh
git worktree add ../<andere-checkout> <andere-branch>
./gradlew bootRun --args='--simulator.responses.path=<absoluut pad naar Responses-dir>'
```

---

## Architectuur

```
src/main/
├── java/…/webservice/responseeditor/   ← Spring Boot backend
│   ├── ResponseEditorController.java   ← REST endpoints
│   ├── ResponseFileService.java        ← lees/schrijf XML op disk
│   ├── PersonCloneService.java         ← persoon kopiëren (BSN-swap)
│   ├── GitService.java                 ← git status + diff
│   ├── ResponseTestService.java        ← SOAP roundtrip testen
│   ├── XsdValidationService.java       ← XSD-validatie per dienst
│   ├── ServiceCatalog.java             ← bekende operaties + sleutelschema's
│   └── SecureXml.java / XmlCanonicalizer.java / BsnUtil.java / …
└── resources/static/responses/        ← frontend (plain HTML/CSS/JS)
    ├── index.html
    ├── app.js
    ├── style.css
    └── cities.js                       ← autocomplete-lijst steden
```

De backend is een Spring Boot `@RestController` op `/admin/responses`. De frontend is statische HTML zonder bouwstap — geen bundler, geen framework. Interactie verloopt via `fetch()`.

XML-bestanden worden gelezen en geschreven op het pad in de property `simulator.responses.path` (default: `src/main/resources/suwinet/data/Responses`).

---

## REST API

Alle endpoints leven onder `/admin/responses`.

| Methode | Pad | Beschrijving |
|---|---|---|
| `GET` | `/` | Lijst van alle response-bestanden + `baseDir` |
| `GET` | `/{filename}` | Inhoud van één bestand (XML) |
| `PUT` | `/{filename}` | Bestaand bestand overschrijven |
| `POST` | `/{filename}` | Nieuw bestand aanmaken (→ 201) |
| `GET` | `/{filename}/schema-issues` | XSD-validatieproblemen voor dit bestand |
| `POST` | `/{filename}/accept-actual` | Opgeslagen response vervangen door de actuele SOAP-response |
| `POST` | `/clone` | Persoon kopiëren naar nieuw BSN |
| `GET` | `/git-status` | Git-status van de responses-map |
| `GET` | `/git-diff/{filename}` | Unified diff t.o.v. HEAD voor één bestand |
| `GET` | `/test-bsn` | Genereer een geldig test-BSN |
| `GET` | `/test/catalog` | Beschikbare operaties en sleutelschema's |
| `POST` | `/test` | Voer één SOAP roundtrip uit |
| `POST` | `/test/person` | Test alle BSN-operaties voor één persoon |
| `POST` | `/test/all` | Test alle bestanden op disk |
| `GET` | `/test/all/stream` | Zelfde als `/test/all`, maar als Server-Sent Events stream |

---

## Frontend structuur

| Bestand | Verantwoordelijkheid |
|---|---|
| `index.html` | Markup: layout, twee tabellen, modals, templates |
| `app.js` | Alle logica: data fetching, renderen, CodeMirror-integratie, test-UI, kopieer-flow |
| `style.css` | Alle stijlen (geen externe CSS behalve CodeMirror via CDN) |
| `cities.js` | Statische lijst van Nederlandse steden voor autocomplete in de kopieer-modal |

De editor gebruikt **CodeMirror 5** (v5.65.16) voor XML-bewerking, geladen via CDN. Er is geen buildstap — `app.js` is één groot vanilla JS-bestand.

---

## Styleguide

De editor volgt een GitHub-achtig design system: compacte typografie, neutrale grijzen, één blauwe accentkleur.

### Kleurpalet

| Token | Waarde | Gebruik |
|---|---|---|
| Topbar / brand | `#1d3a6b` | Topbalk achtergrond |
| Achtergrond | `#f6f8fa` | Pagina-achtergrond, tabel-headers |
| Wit oppervlak | `#fff` | Panelen, kaarten, modals |
| Border | `#d0d7de` | Randen van invoervelden, tabel, scheidingslijnen |
| Tekst primair | `#1f2328` | Lopende tekst, labels |
| Tekst muted | `#656d76` | Subtekst, breadcrumbs, lege toestand |
| Accent / link | `#0969da` | Knoppen, geselecteerde items, hover-states |
| Actief highlight | `#ddf4ff` | Geselecteerde tabelrij, actieve filtercel |
| Succes | `#1a7f37` | Status "opgeslagen", test geslaagd |
| Fout | `#cf222e` | Status-fout, validatiemelding |
| Waarschuwing | `#fef3c7` / `#92400e` | "gewijzigd"-badge, validatiebanner |

### Dienst-kleuren

Elke Suwinet-dienst krijgt een eigen pastelkleur — als achtergrond van pills en autocomplete-hints.

| Dienst | Kleur |
|---|---|
| BRP | `#f4e8fc` (paars) |
| UWV | `#e0effd` (blauw) |
| DUO | `#defaea` (groen) |
| Kadaster | `#fde7cd` (oranje) |
| RDW | `#fde7e5` (rood) |
| SVB | `#d8edf1` (teal) |
| Bijstand | `#fdf3c8` (geel) |

### Typografie

- **Body**: `-apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, Arial, sans-serif` — 13px, `#1f2328`
- **Monospace** (bestandsnamen, XML, basedir): `"SF Mono", Menlo, Consolas, monospace` — 13px
- **Klein** (badges, hints, subtekst): 10–11px, `#656d76`

### Knoppen

```html
<!-- Primaire actie (opslaan, kopiëren, bevestigen) -->
<button class="primary-btn">Opslaan</button>

<!-- Secundaire actie (annuleren, toggle, extra opties) -->
<button class="secondary-btn">Annuleren</button>

<!-- Gesegmenteerde toggle (XML / Lijst / Diff) -->
<div class="btn-group">
  <button class="active">Lijst</button>
  <button>XML</button>
  <button>Diff</button>
</div>
```

`.primary-btn`: blauw (`#0969da`), wit tekst, 4px radius, 12px font, semi-bold.  
`.secondary-btn`: lichtgrijs achtergrond, `#d0d7de` border, dezelfde geometrie.  
`.btn-group`: alle borders ingetrokken zodat knoppen aaneensluiten; actieve knop via `.active`-klasse.

### Dienst-pill

```html
<span class="dienst-pill dienst-uwv">UWV</span>
```

Gebruik: in tabelcellen en autocomplete voor het benoemen van de dienst. Klasse `dienst-{naam}` voegt de pastelkleur toe.

### Modals

Modals gebruiken `.modal-backdrop` (full-screen overlay) + `.modal` (gecentreerd paneel). Breed variant: `.modal.modal-wide`.

```html
<div class="modal-backdrop" id="my-modal" hidden>
  <div class="modal">
    <div class="modal-header">
      <h2>Titel</h2>
      <button class="modal-close" type="button">×</button>
    </div>
    <div class="modal-body">…</div>
    <div class="modal-footer">
      <button class="secondary-btn">Annuleren</button>
      <button class="primary-btn">Bevestigen</button>
    </div>
  </div>
</div>
```

Toon/verberg via het `hidden`-attribuut. Sluit op Escape of klik op backdrop.

---

## Icoontjes — gebruik in andere projecten

Dit project gebruikt twee soorten icoontjes:

1. **Lucide** — algemene UI-iconen (regel, knop, nav, badges)
2. **Brand SVGs** — logo's van externe diensten (GitHub, Jira, Hotfusion)

### 1. Lucide (v1.14.0)

#### Bestand

`static/lucide.min.js` — lokaal opgeslagen, geen CDN.

Download dezelfde versie via: https://lucide.dev (kies "Download" → minified bundle), of pak het bestand direct uit dit project.

#### Laden in HTML

```html
<script src="{{ url_for('static', filename='lucide.min.js') }}" defer></script>
```

#### Initialiseren

Zet dit onderaan de pagina (of in een `DOMContentLoaded`-handler):

```js
lucide.createIcons();
```

Bij HTMX: herinitialiseer na elke swap zodat dynamisch geladen fragmenten ook icoontjes krijgen:

```js
document.body.addEventListener('htmx:afterSwap', function() {
  lucide.createIcons();
});
```

Bij dynamisch toegevoegde HTML via JS (bijv. `innerHTML`):

```js
if (window.lucide) lucide.createIcons();
```

#### Gebruik in HTML

```html
<i data-lucide="clock" width="16" height="16" stroke-width="2" style="display:block"></i>
```

- `data-lucide` — naam van het icoon (zie lijst hieronder)
- `width` / `height` — grootte in pixels (typisch 14–26)
- `stroke-width` — lijndikte (typisch 1.75 of 2)
- `style="display:block"` — voorkomt ongewenste baseline-ruimte onder het icoon

#### Iconen gebruikt in dit project

| Naam | Gebruik |
|---|---|
| `alarm-clock-check` | Navigatie Uren |
| `activity` | Activiteit/dashboard |
| `bar-chart-2`, `bar-chart-3`, `chart-no-axes-combined` | Rapporten/statistieken |
| `bell-ring` | Notificaties |
| `briefcase` | Klanten/accounts |
| `calendar-days` | Kalender |
| `check-circle`, `circle-check`, `badge-check` | Goedkeuring/status |
| `chevron-left`, `chevron-right`, `chevron-down`, `chevrons-down-up` | Navigatie/accordeon |
| `circle-help` | Help |
| `clock` | Tijd |
| `code-2`, `terminal` | Developer-functies |
| `cog`, `user-cog` | Instellingen |
| `download` | Exporteren |
| `external-link` | Extern link |
| `eye` | Bekijken |
| `file-text`, `file-signature`, `file-spreadsheet` | Documenten/aanvragen |
| `flask-conical` | Sandbox/demo |
| `folder-kanban`, `folder-open` | Projecten |
| `inbox` | Inbox |
| `kanban` | Kanban-weergave |
| `key-round` | Authenticatie/tokens |
| `log-out` | Uitloggen |
| `message-circle`, `message-square`, `message-square-heart` | Berichten/feedback |
| `moon`, `sun` | Thema-toggle |
| `pencil`, `square-pen` | Bewerken |
| `play` | Starten |
| `plug` | Integraties |
| `printer` | Afdrukken |
| `refresh-cw` | Vernieuwen |
| `rocket` | Onboarding/tour |
| `scroll`, `scroll-text` | Logs/overzichten |
| `search` | Zoeken |
| `shield` | Beveiliging |
| `tag` | Labels/tags |
| `timer` | Timer |
| `trash-2` | Verwijderen |
| `triangle-alert` | Waarschuwing |
| `unlink` | Ontkoppelen |
| `user`, `users`, `users-round` | Gebruikers/teams |

Volledige icon-bibliotheek: https://lucide.dev/icons/

---

### 2. Brand SVGs

#### Locatie

`static/icons/brands/` — elk een losstaand `.svg`-bestand:

| Bestand | Dienst |
|---|---|
| `github.svg` | GitHub |
| `jira.svg` | Jira |
| `hotfusion-extension.svg` | Hotfusion Chrome-extensie |

Bron: `github.svg` en `jira.svg` komen van [Simple Icons](https://simpleicons.org/) — MIT-licentie. `hotfusion-extension.svg` is eigen werk.

#### Gebruik in HTML (Jinja)

```html
<img src="{{ url_for('static', filename='icons/brands/github.svg') }}"
     width="16" height="16" alt="GitHub">
```

Of als inline SVG voor kleurcontrole via CSS:

```html
{% include 'icons/brands/github.svg' %}
```

#### Kleuren

De Simple Icons SVGs bevatten geen `fill`-kleur — ze erven van de CSS. Stijl via:

```css
.brand-icon { fill: currentColor; width: 16px; height: 16px; }
```

---

### Checklist nieuw project

- [ ] Kopieer `static/lucide.min.js` naar het nieuwe project
- [ ] Kopieer `static/icons/brands/*.svg` die je nodig hebt
- [ ] Laad `lucide.min.js` via `<script defer>`
- [ ] Roep `lucide.createIcons()` aan na DOMContentLoaded
- [ ] Voeg bij HTMX een `htmx:afterSwap` listener toe die `createIcons()` herroept
- [ ] Gebruik `<i data-lucide="naam" width="16" height="16" stroke-width="2" style="display:block"></i>`
