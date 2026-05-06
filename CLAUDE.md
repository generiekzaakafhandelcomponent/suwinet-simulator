# Response editor

Deze branch (`feature/response-editor`) voegt een browser-based editor toe voor de response XML files. Niet gemerged naar `main`.

## Locaties

- Backend: `src/main/java/com/ritense/suwitense/webservice/responseeditor/`
- Frontend: `src/main/resources/static/responses/`

## Editor starten

```sh
./gradlew bootRun
```

UI: <http://localhost:8090/responses/> · API: `/admin/responses`

XML-bestanden worden geschreven naar het pad in `simulator.responses.path` (default: `src/main/resources/suwinet/data/Responses`).

## XML aanpassen op een andere branch

Wil je XML-wijzigingen op een aparte branch zonder de editor-code mee te slepen? Maak een tweede worktree op die branch en draai de editor met een override op `simulator.responses.path` die naar de Responses-dir van die worktree wijst:

```sh
git worktree add ../<andere-checkout> <andere-branch>
./gradlew bootRun --args='--simulator.responses.path=<absoluut pad naar de Responses-dir in ../<andere-checkout>>'
```

De editor schrijft dan XML in die andere worktree, klaar om daar te committen.

## Content fixes documenteren

Wanneer je een inhoudelijk of structureel probleem in een response XML-bestand ontdekt en corrigeert, voeg je het altijd toe aan [`content-issues.md`](content-issues.md) in dezelfde repo. Dit geldt voor:

- verkeerde elementvolgorde (XSD sequence)
- ongeldige elementen voor het betreffende service-type
- onjuiste waardecoderingen of datatypes
- elk ander patroon dat leidt tot een afwijking tussen de opgeslagen file en de daadwerkelijke SOAP-response

Beschrijf het patroon, de reden (wat doet JAXB ermee?), en de getroffen bestanden.
