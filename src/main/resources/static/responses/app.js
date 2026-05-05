(function () {
    'use strict';

    const API = '/admin/responses';

    /** Friendly labels for known XML element names. Unknown names fall back to the raw element name. */
    const FRIENDLY_LABELS = {
        Burgerservicenr: 'BSN',
        Voornamen: 'Voornamen',
        Voorletters: 'Voorletters',
        Voorvoegsel: 'Voorvoegsel',
        SignificantDeelVanDeAchternaam: 'Achternaam',
        AanduidingNaamgebruik: 'Naamgebruik',
        Geboortedat: 'Geboortedatum',
        Geslacht: 'Geslacht',
        Postcd: 'Postcode',
        Woonplaatsnaam: 'Woonplaats',
        Straatnaam: 'Straat',
        NaamOpenbareRuimte: 'Openbare ruimte',
        Huisnr: 'Huisnummer',
        Huisletter: 'Huisletter',
        HuisnrToevoeging: 'Huisnr toevoeging',
        Gemeentenaam: 'Gemeente',
        Land: 'Land',
        ANr: 'A-nummer',
        CdNationaliteit: 'Nationaliteit (cd)',
        CdGeboortegemeente: 'Geboortegemeente (cd)',
        Geboorteland: 'Geboorteland (cd)',
        CdGemeenteVanInschrijving: 'Gemeente inschrijving (cd)',
        DatVanInschrijvingBijGemeente: 'Datum inschrijving',
        DatBAdreshoudingBrp: 'Begin adreshouding',
        DatGeldigheidGegevens: 'Geldig vanaf',
        DatBFamilierechtelijkeBetrekking: 'Begin familieband',
        DatHuwelijkssluiting: 'Huwelijksdatum',
        CdGemeenteHuwelijkssluiting: 'Huwelijksgemeente (cd)',
        LandHuwelijkssluiting: 'Huwelijksland (cd)',
        Partner: 'Partner',
        Ouder1: 'Ouder 1',
        Ouder2: 'Ouder 2',
        Kind: 'Kind',
        Huwelijk: 'Huwelijk',
        Nationaliteit: 'Nationaliteit',
        DomicilieAdres: 'Adres',
        VerblijfplaatsHistorisch: 'Eerder adres',
        AangifteAdreshoudingBrp: 'Adreshouding (BRP)',
        InschrijvingsgegevensBrp: 'Inschrijving (BRP)',
        GeldigheidGegevensPersoon: 'Geldigheid persoon',
        GeldigheidGegevensNationaliteit: 'Geldigheid nationaliteit',
        GeldigheidGegevensKind: 'Geldigheid kind',
        Inkomstenverhouding: 'Inkomstenverhouding',
        VolgnrIkv: 'Volgnummer',
        DatBIkv: 'Begin IKV',
        DatEIkv: 'Einde IKV',
        AdministratieveEenheid: 'Administratieve eenheid',
        NaamAdministratieveEenheid: 'Naam',
        Loonheffingennr: 'Loonheffingennummer',
        FiNr: 'Fi-nr',
        NaamRechtspersoon: 'Naam rechtspersoon',
        FeitelijkAdresAeh: 'Feitelijk adres',
        FeitelijkAdres: 'Feitelijk adres',
        Straatadres: 'Straatadres',
        StraatadresBag: 'Straatadres (BAG)',
        RechtspersoonAdministratieveEenh: 'Rechtspersoon',
        Voertuig: 'Voertuig',
        CdSrtVoertuig: 'Soort voertuig',
        KentekenVoertuig: 'Kenteken',
        MerkVoertuig: 'Merk',
        TypeVoertuig: 'Type',
        HoofdkleurVoertuig: 'Hoofdkleur',
        Aansprakelijke: 'Aansprakelijke',
        RdwAdres: 'RDW adres',
        AanvraagUitkering: 'Aanvraag uitkering',
        DatAanvraagUitkering: 'Datum aanvraag',
        SzWet: 'SZ-wet',
        CdSzWet: 'SZ-wet (cd)',
        BeslissingOpAanvraagUitkering: 'Beslissing',
        CdBeslissingOpAanvraagUitkering: 'Beslissing (cd)',
        DatDagtekeningBeslisOpAanvrUitk: 'Datum beslissing',
        PartnerAanvraagUitkering: 'Partner aanvraag',
        ClientSuwi: 'Client',
        DatToestandKadaster: 'Datum toestand kadaster',
        Eigendom: 'Eigendom',
        OnroerendeZaak: 'Onroerende zaak',
        CdTypeOnroerendeZaak: 'Type onroerende zaak (cd)',
    };

    /** Field names that look like dates. We show a formatted hint next to them. */
    const DATE_FIELD_PATTERN = /^(Dat|Geboortedat)/;

    /** Maps a complex XML element to a visual category (color + icon) used for form-card / form-list styling. */
    const ELEMENT_CATEGORY = {
        Persoon: 'identity', ClientSuwi: 'identity',
        Naamgegevens: 'identity', GeldigheidGegevensPersoon: 'identity',
        Partner: 'family', Ouder1: 'family', Ouder2: 'family',
        Kind: 'family', Huwelijk: 'family', GeldigheidGegevensKind: 'family',
        DomicilieAdres: 'address', VerblijfplaatsHistorisch: 'address',
        FeitelijkAdres: 'address', FeitelijkAdresAeh: 'address',
        Straatadres: 'address', StraatadresBag: 'address', RdwAdres: 'address',
        AangifteAdreshoudingBrp: 'address', InschrijvingsgegevensBrp: 'address',
        Inkomstenverhouding: 'employer',
        AdministratieveEenheid: 'employer',
        RechtspersoonAdministratieveEenh: 'employer',
        Voertuig: 'vehicle', Aansprakelijke: 'vehicle',
        Eigendom: 'property', OnroerendeZaak: 'property',
        AanvraagUitkering: 'benefit',
        BeslissingOpAanvraagUitkering: 'benefit',
        PartnerAanvraagUitkering: 'benefit',
        SzWet: 'benefit',
        Nationaliteit: 'nationality',
        GeldigheidGegevensNationaliteit: 'nationality',
    };

    const CATEGORY_ICONS = {
        identity: '👤',
        family: '👪',
        address: '🏠',
        employer: '💼',
        vehicle: '🚗',
        property: '🏛️',
        benefit: '💶',
        nationality: '🌍',
        education: '🎓',
        default: '',
    };

    function categoryFor(name) {
        return ELEMENT_CATEGORY[name] || 'default';
    }

    /** Maps a Suwinet dienst-name to a CSS class used to color the dienst-pill. */
    function dienstClass(d) {
        if (!d) return '';
        if (d.startsWith('BRP')) return 'dienst-brp';
        if (d.startsWith('UWV')) return 'dienst-uwv';
        if (d.startsWith('DUO')) return 'dienst-duo';
        if (d.startsWith('Kadaster')) return 'dienst-kadaster';
        if (d.startsWith('RDW')) return 'dienst-rdw';
        if (d.startsWith('SVB')) return 'dienst-svb';
        if (d.startsWith('Bijstand')) return 'dienst-bijstand';
        return '';
    }

    const FILE_COL_KEYS = ['dienst', 'operatie', 'sleutel', 'naam', 'geboortedat', 'postcd', 'woonplaatsnaam', 'extra'];
    const PERSON_COL_KEYS = ['bsn', 'naam', 'geboortedat', 'woonplaatsnaam', 'diensten'];
    /** Up to this many unique values: dropdown. Beyond it: text input + datalist autocomplete (substring match). */
    const FILTER_DROPDOWN_THRESHOLD = 7;

    const state = {
        all: [],
        filtered: [],
        selected: null,
        loadedXml: null,
        dom: null,
        sortKey: 'dienst',
        sortDir: 'asc',
        search: '',
        editor: null,
        suppressRawSync: false,
        rawDebounceTimer: null,
        mode: 'persons',
        persons: [],
        filteredPersons: [],
        selectedPerson: null,
        personSortKey: 'naam',
        personSortDir: 'asc',
        colFilters: Object.fromEntries(FILE_COL_KEYS.map(k => [k, ''])),
        personColFilters: Object.fromEntries(PERSON_COL_KEYS.map(k => [k, ''])),
        colFilterMode: Object.fromEntries(FILE_COL_KEYS.map(k => [k, 'select'])),
        personColFilterMode: Object.fromEntries(PERSON_COL_KEYS.map(k => [k, 'select'])),
        gitAvailable: false,
        gitStatuses: {}, // filename -> two-char porcelain code (e.g. " M", "??", "A ")
        diffVisible: false,
    };

    /** Maps a porcelain status to {cls, title}. Returns null for clean files. */
    function gitBadgeFor(filename) {
        const code = state.gitStatuses[filename];
        if (!code) return null;
        const trimmed = code.trim();
        if (trimmed === '??') return { cls: 'added', title: 'Niet getrackt (nieuw bestand)' };
        if (trimmed.startsWith('A')) return { cls: 'added', title: 'Toegevoegd (staged)' };
        if (trimmed.startsWith('D') || trimmed.endsWith('D')) return { cls: 'deleted', title: 'Verwijderd' };
        if (trimmed.startsWith('R')) return { cls: 'modified', title: 'Hernoemd' };
        // M, MM, AM, etc.
        return { cls: 'modified', title: 'Gewijzigd t.o.v. HEAD' };
    }

    // Holds XML element references whose form-card / list-item should render collapsed.
    // WeakSet so that elements removed from the DOM (or replaced when a new file loads) are GC'd.
    const collapsedEls = new WeakSet();

    // For repeating groups (lists), there is no single XML element that represents the list
    // itself, so we key collapse-state on (parent element, child localName).
    const collapsedLists = new WeakMap(); // parentEl -> Set<localName>
    function isListCollapsed(parentEl, name) {
        const set = collapsedLists.get(parentEl);
        return !!(set && set.has(name));
    }
    function toggleListCollapsed(parentEl, name) {
        let set = collapsedLists.get(parentEl);
        if (!set) { set = new Set(); collapsedLists.set(parentEl, set); }
        if (set.has(name)) set.delete(name);
        else set.add(name);
        return set.has(name);
    }

    /* ---------- Init ---------- */

    document.addEventListener('DOMContentLoaded', () => {
        state.editor = CodeMirror.fromTextArea(document.getElementById('raw-editor'), {
            mode: 'application/xml',
            lineNumbers: true,
            lineWrapping: false,
            theme: 'mdn-like',
            indentUnit: 4,
            tabSize: 4,
        });
        state.editor.on('change', onRawEditorChange);

        document.getElementById('reload').addEventListener('click', loadIndex);
        document.getElementById('search').addEventListener('input', e => {
            state.search = e.target.value.toLowerCase();
            applyFilter();
        });
        document.querySelectorAll('#files-table thead tr.sort-row th').forEach(th => {
            th.addEventListener('click', () => toggleSort(th.dataset.sort));
        });
        document.getElementById('save-btn').addEventListener('click', save);
        document.getElementById('toggle-list-btn').addEventListener('click', toggleList);
        document.getElementById('toggle-raw-btn').addEventListener('click', toggleRaw);
        document.getElementById('toggle-diff-btn').addEventListener('click', toggleDiff);
        document.querySelectorAll('.mode-btn').forEach(btn => {
            btn.addEventListener('click', () => setMode(btn.dataset.mode));
        });
        document.querySelectorAll('#persons-table thead tr.sort-row th').forEach(th => {
            th.addEventListener('click', () => togglePersonSort(th.dataset.sortP));
        });
        document.querySelectorAll('th[data-col-filter]').forEach(th => {
            const col = th.dataset.colFilter;
            th.addEventListener('input', e => {
                state.colFilters[col] = e.target.value;
                e.target.classList.toggle('active', !!e.target.value);
                applyFilter();
            });
        });
        document.querySelectorAll('th[data-col-filter-p]').forEach(th => {
            const col = th.dataset.colFilterP;
            th.addEventListener('input', e => {
                state.personColFilters[col] = e.target.value;
                e.target.classList.toggle('active', !!e.target.value);
                applyFilter();
            });
        });
        document.getElementById('copy-person-btn').addEventListener('click', openCopyModal);
        document.getElementById('validation-fix-btn').addEventListener('click', applyValidationAutoFix);
        document.getElementById('validation-dismiss-btn').addEventListener('click', hideValidationBanner);
        initResizer();
        initRawResizer();
        initCopyModal();
        setupAutocompletePopup();
        initFormSearch();
        initRawSearch();
        initActionsHamburger();
        initDynamicDateInsert();

        loadIndex();
    });

    /* ---------- DynamicDate insert helper (raw editor) ---------- */

    function initDynamicDateInsert() {
        const select = document.getElementById('dynamic-date-insert');
        if (!select) return;
        select.addEventListener('change', () => {
            let expr = select.value;
            select.value = '';
            if (!expr) return;
            if (expr === '__custom__') {
                expr = (prompt(
                    'DynamicDate expressie (bijv. "today - 4 months", "today + 2 weeks"):',
                    'today - 1 month'
                ) || '').trim();
                if (!expr) return;
            }
            insertDynamicDateComment(expr);
        });
    }

    function insertDynamicDateComment(expr) {
        const cm = state.editor;
        if (!cm) return;
        const cursor = cm.getCursor();
        const lineText = cm.getLine(cursor.line) || '';
        const indent = (lineText.match(/^\s*/) || [''])[0];
        const atLineStart = cursor.ch <= indent.length;
        const comment = `<!-- DynamicDate: ${expr} -->`;
        const insertion = atLineStart
            ? `${comment}\n${indent}`
            : `\n${indent}${comment}\n${indent}`;
        cm.replaceRange(insertion, cursor);
        cm.focus();
    }


    /* ---------- Resizable divider between table and detail ---------- */

    const RESIZE_STORAGE_KEY = 'responses.leftPaneWidth';
    const DEFAULT_LEFT_WIDTH = '45%';

    function initResizer() {
        const handle = document.getElementById('resize-handle');
        const layout = document.querySelector('.layout');
        const leftPane = document.querySelector('.left-pane');

        const saved = localStorage.getItem(RESIZE_STORAGE_KEY);
        if (saved) layout.style.setProperty('--left-pane-width', saved);

        let dragging = false;

        handle.addEventListener('mousedown', e => {
            e.preventDefault();
            dragging = true;
            handle.classList.add('dragging');
            document.body.classList.add('resizing');
        });

        document.addEventListener('mousemove', e => {
            if (!dragging) return;
            const layoutRect = layout.getBoundingClientRect();
            const minPx = 240;
            const maxPx = layoutRect.width - 280;
            const px = Math.min(maxPx, Math.max(minPx, e.clientX - layoutRect.left));
            layout.style.setProperty('--left-pane-width', px + 'px');
        });

        document.addEventListener('mouseup', () => {
            if (!dragging) return;
            dragging = false;
            handle.classList.remove('dragging');
            document.body.classList.remove('resizing');
            const computed = getComputedStyle(leftPane).width;
            localStorage.setItem(RESIZE_STORAGE_KEY, computed);
            if (state.editor) state.editor.refresh();
        });

        handle.addEventListener('dblclick', () => {
            layout.style.setProperty('--left-pane-width', DEFAULT_LEFT_WIDTH);
            localStorage.removeItem(RESIZE_STORAGE_KEY);
            if (state.editor) state.editor.refresh();
        });
    }

    /* ---------- Actions hamburger (shown via container query when narrow) ---------- */

    function initActionsHamburger() {
        const btn = document.getElementById('actions-hamburger');
        const actions = document.getElementById('file-actions');

        function close() {
            actions.classList.remove('open');
            btn.setAttribute('aria-expanded', 'false');
        }

        btn.addEventListener('click', e => {
            e.stopPropagation();
            const open = actions.classList.toggle('open');
            btn.setAttribute('aria-expanded', open ? 'true' : 'false');
        });

        document.addEventListener('click', e => {
            if (!actions.classList.contains('open')) return;
            if (e.target === btn || actions.contains(e.target)) return;
            close();
        });

        document.addEventListener('keydown', e => {
            if (e.key === 'Escape') close();
        });

        // Auto-close after activating an action so the dropdown doesn't linger.
        actions.addEventListener('click', e => {
            if (e.target.tagName === 'BUTTON') close();
        });
    }

    /* ---------- Resizable divider between form and raw XML pane ---------- */

    const RAW_RESIZE_STORAGE_KEY = 'responses.rawPaneWidth';
    const DEFAULT_RAW_WIDTH = '45%';

    function initRawResizer() {
        const handle = document.getElementById('raw-resize-handle');
        const body = document.getElementById('detail-body');
        const rawPane = document.getElementById('raw-pane');

        const saved = localStorage.getItem(RAW_RESIZE_STORAGE_KEY);
        if (saved) body.style.setProperty('--raw-pane-width', saved);

        let dragging = false;

        handle.addEventListener('mousedown', e => {
            e.preventDefault();
            dragging = true;
            handle.classList.add('dragging');
            document.body.classList.add('resizing');
        });

        document.addEventListener('mousemove', e => {
            if (!dragging) return;
            const bodyRect = body.getBoundingClientRect();
            const minPx = 360;
            const maxPx = bodyRect.width - 280;
            const px = Math.min(maxPx, Math.max(minPx, bodyRect.right - e.clientX));
            body.style.setProperty('--raw-pane-width', px + 'px');
        });

        document.addEventListener('mouseup', () => {
            if (!dragging) return;
            dragging = false;
            handle.classList.remove('dragging');
            document.body.classList.remove('resizing');
            const computed = getComputedStyle(rawPane).width;
            localStorage.setItem(RAW_RESIZE_STORAGE_KEY, computed);
            if (state.editor) state.editor.refresh();
        });

        handle.addEventListener('dblclick', () => {
            body.style.setProperty('--raw-pane-width', DEFAULT_RAW_WIDTH);
            localStorage.removeItem(RAW_RESIZE_STORAGE_KEY);
            if (state.editor) state.editor.refresh();
        });
    }

    /* ---------- Index ---------- */

    async function loadIndex() {
        try {
            const res = await fetch(API, { headers: { Accept: 'application/json' } });
            if (!res.ok) throw new Error(res.status + ' ' + res.statusText);
            const data = await res.json();
            if (!Array.isArray(data.files)) {
                throw new Error('Onverwachte index-respons: "files" ontbreekt of is geen array');
            }
            state.all = data.files;
            state.persons = groupByBsn(state.all);
            document.getElementById('basedir').textContent = data.baseDir || '';
            await loadGitStatus();
            populateColumnFilters();
            applyFilter();
        } catch (e) {
            alert('Kon index niet laden: ' + e.message);
        }
    }

    async function loadGitStatus() {
        try {
            const res = await fetch(`${API}/git-status`, { headers: { Accept: 'application/json' } });
            if (!res.ok) {
                state.gitAvailable = false;
                state.gitStatuses = {};
                return;
            }
            const data = await res.json();
            state.gitAvailable = !!data.available;
            state.gitStatuses = data.statuses || {};
        } catch (e) {
            state.gitAvailable = false;
            state.gitStatuses = {};
        }
    }

    function fileColValue(f, col) {
        const m = f.metadata || {};
        switch (col) {
            case 'dienst': return f.dienst || '';
            case 'operatie': return f.operatie || '';
            case 'sleutel': return f.sleutel || '';
            case 'naam': return naam(f);
            case 'geboortedat': return m.geboortedat || '';
            case 'postcd': return m.postcd || '';
            case 'woonplaatsnaam': return m.woonplaatsnaam || '';
            case 'extra': return m.kentekenvoertuig || '';
        }
        return '';
    }

    /** Display-formatted value (e.g. dates as DD-MM-YYYY) used for substring matching in input-mode filters. */
    function fileColDisplay(f, col) {
        const v = fileColValue(f, col);
        return col === 'geboortedat' ? formatDate(v) : v;
    }

    function personColDisplay(p, col) {
        if (col === 'diensten') return (p.diensten || []).join(' ');
        const v = p[col] || '';
        return col === 'geboortedat' ? formatDate(v) : v;
    }

    function populateColumnFilters() {
        hideAutocomplete();
        FILE_COL_KEYS.forEach(col => {
            const th = document.querySelector(`th[data-col-filter="${col}"]`);
            if (!th) return;
            const values = uniqueSorted(state.all.map(f => fileColValue(f, col)));
            renderColumnFilter(th, col, values, state.colFilters, state.colFilterMode, '');
        });
        PERSON_COL_KEYS.forEach(col => {
            const th = document.querySelector(`th[data-col-filter-p="${col}"]`);
            if (!th) return;
            const raw = col === 'diensten'
                ? state.persons.flatMap(p => p.diensten)
                : state.persons.map(p => p[col] || '');
            const values = uniqueSorted(raw);
            renderColumnFilter(th, col, values, state.personColFilters, state.personColFilterMode, '-p');
        });
    }

    function uniqueSorted(list) {
        // Dedup case-insensitively. For each lowercase key, prefer a mixed-case
        // representative (e.g. "'s-Gravenhage" over "'S-GRAVENHAGE").
        const byLower = new Map();
        for (const v of list) {
            if (!v) continue;
            const k = v.toLowerCase();
            const existing = byLower.get(k);
            if (!existing || isBetterCasing(v, existing)) byLower.set(k, v);
        }
        const arr = [...byLower.values()];
        arr.sort((a, b) => a.localeCompare(b, 'nl', { numeric: true, sensitivity: 'base' }));
        return arr;
    }

    function isBetterCasing(candidate, existing) {
        const candMixed = /[a-z]/.test(candidate) && /[A-Z]/.test(candidate);
        const existMixed = /[a-z]/.test(existing) && /[A-Z]/.test(existing);
        return candMixed && !existMixed;
    }

    function renderColumnFilter(th, col, values, filtersObj, modeObj, attrSuffix) {
        const useInput = values.length > FILTER_DROPDOWN_THRESHOLD;
        const mode = useInput ? 'input' : 'select';
        modeObj[col] = mode;
        const cur = filtersObj[col];

        // For select mode: clear stale value if it's no longer in the option set.
        if (mode === 'select' && cur && !values.includes(cur)) filtersObj[col] = '';

        const dataAttr = `data-col-filter${attrSuffix}`;

        if (mode === 'input') {
            th.innerHTML = `<input type="search" placeholder="Alle…" autocomplete="off" `
                + `${dataAttr}="${col}" `
                + `value="${escapeAttr(filtersObj[col] || '')}">`;
            const isPerson = attrSuffix === '-p';
            attachAutocomplete(th.firstElementChild, () => facetAutocompleteValues(col, isPerson));
        } else {
            // Options are populated by refreshColumnFilterCounts() based on the current
            // facet (other filters + search), so the select starts empty here.
            th.innerHTML = `<select ${dataAttr}="${col}"></select>`;
        }
        const ctl = th.firstElementChild;
        if (ctl) ctl.classList.toggle('active', !!filtersObj[col]);
    }

    /* ---------- Faceted counts for column filter dropdowns ---------- */

    function fileMatchesSearch(f, q) {
        if (!q) return true;
        const haystack = [
            f.filename, f.dienst, f.operatie, f.sleutel,
            ...Object.values(f.metadata || {})
        ].join(' ').toLowerCase();
        return haystack.includes(q);
    }

    function fileMatchesColFilter(f, col) {
        const want = state.colFilters[col];
        if (!want) return true;
        const wl = want.toLowerCase();
        if (state.colFilterMode[col] === 'input') {
            return fileColDisplay(f, col).toLowerCase().includes(wl);
        }
        return fileColValue(f, col).toLowerCase() === wl;
    }

    function personMatchesSearch(p, q) {
        if (!q) return true;
        return [p.bsn, p.naam, p.woonplaatsnaam || '', p.geboortedat || '', ...p.files]
            .join(' ').toLowerCase().includes(q);
    }

    function personMatchesColFilter(p, col) {
        const want = state.personColFilters[col];
        if (!want) return true;
        const wl = want.toLowerCase();
        if (state.personColFilterMode[col] === 'input') {
            if (col === 'diensten') return p.diensten.some(d => d.toLowerCase().includes(wl));
            return personColDisplay(p, col).toLowerCase().includes(wl);
        }
        if (col === 'diensten') return p.diensten.some(d => d.toLowerCase() === wl);
        return (p[col] || '').toLowerCase() === wl;
    }

    function tallyValue(counts, value) {
        if (!value) return;
        const key = value.toLowerCase();
        const ex = counts.get(key);
        if (ex) {
            ex.count++;
            if (isBetterCasing(value, ex.display)) ex.display = value;
        } else {
            counts.set(key, { display: value, count: 1 });
        }
    }

    function computeFileFacetCounts(targetCol) {
        const q = state.search;
        const counts = new Map();
        for (const f of state.all) {
            if (!fileMatchesSearch(f, q)) continue;
            let pass = true;
            for (const other of FILE_COL_KEYS) {
                if (other === targetCol) continue;
                if (!fileMatchesColFilter(f, other)) { pass = false; break; }
            }
            if (!pass) continue;
            tallyValue(counts, fileColValue(f, targetCol));
        }
        return counts;
    }

    function computePersonFacetCounts(targetCol) {
        const q = state.search;
        const counts = new Map();
        for (const p of state.persons) {
            if (!personMatchesSearch(p, q)) continue;
            let pass = true;
            for (const other of PERSON_COL_KEYS) {
                if (other === targetCol) continue;
                if (!personMatchesColFilter(p, other)) { pass = false; break; }
            }
            if (!pass) continue;
            if (targetCol === 'diensten') {
                // One person can have multiple diensten, but each value still counts
                // at most once per person (we're counting matching persons, not rows).
                const seen = new Set();
                for (const d of (p.diensten || [])) {
                    if (!d) continue;
                    const k = d.toLowerCase();
                    if (seen.has(k)) continue;
                    seen.add(k);
                    tallyValue(counts, d);
                }
            } else {
                tallyValue(counts, p[targetCol] || '');
            }
        }
        return counts;
    }

    /** Facet-aware values for an input-mode column filter's autocomplete.
     *  Excludes the column's own current value from the facet, so the suggestion list
     *  reflects all other active filters and the global search. */
    function facetAutocompleteValues(col, isPerson) {
        const counts = isPerson ? computePersonFacetCounts(col) : computeFileFacetCounts(col);
        const arr = [...counts.values()].map(e => e.display);
        arr.sort((a, b) => a.localeCompare(b, 'nl', { numeric: true, sensitivity: 'base' }));
        return col === 'geboortedat' ? arr.map(formatDate) : arr;
    }

    function refreshSelectOptions(sel, counts, col, currentValue) {
        const entries = [...counts.values()];
        entries.sort((a, b) =>
            a.display.localeCompare(b.display, 'nl', { numeric: true, sensitivity: 'base' }));

        const parts = ['<option value="">Alle</option>'];
        // Preserve the active selection even when other filters have eliminated it,
        // so the user can still see and clear it.
        const currentInResults = currentValue
            && entries.some(e => e.display === currentValue);
        if (currentValue && !currentInResults) {
            const label = col === 'geboortedat' ? formatDate(currentValue) : currentValue;
            parts.push(`<option value="${escapeAttr(currentValue)}" selected>${escapeText(label)} (0)</option>`);
        }
        for (const { display, count } of entries) {
            const label = col === 'geboortedat' ? formatDate(display) : display;
            const selAttr = display === currentValue ? ' selected' : '';
            parts.push(`<option value="${escapeAttr(display)}"${selAttr}>${escapeText(label)} (${count})</option>`);
        }
        sel.innerHTML = parts.join('');
    }

    function refreshColumnFilterCounts() {
        FILE_COL_KEYS.forEach(col => {
            if (state.colFilterMode[col] !== 'select') return;
            const th = document.querySelector(`th[data-col-filter="${col}"]`);
            if (!th) return;
            const sel = th.querySelector('select');
            if (!sel || document.activeElement === sel) return;
            refreshSelectOptions(sel, computeFileFacetCounts(col), col, state.colFilters[col]);
        });
        PERSON_COL_KEYS.forEach(col => {
            if (state.personColFilterMode[col] !== 'select') return;
            const th = document.querySelector(`th[data-col-filter-p="${col}"]`);
            if (!th) return;
            const sel = th.querySelector('select');
            if (!sel || document.activeElement === sel) return;
            refreshSelectOptions(sel, computePersonFacetCounts(col), col, state.personColFilters[col]);
        });
    }

    /* ---------- Custom autocomplete popup ---------- */

    const autocomplete = {
        input: null,
        values: null,
        idx: -1,
        popup: null,
    };

    function setupAutocompletePopup() {
        if (autocomplete.popup) return;
        const popup = document.createElement('div');
        popup.id = 'autocomplete-popup';
        popup.hidden = true;
        document.body.appendChild(popup);
        // mousedown fires before the input's blur, so the input still has focus when we set its value.
        popup.addEventListener('mousedown', e => {
            const item = e.target.closest('.autocomplete-item');
            if (!item || !autocomplete.input) return;
            e.preventDefault();
            const input = autocomplete.input;
            input.value = item.dataset.value;
            input.dispatchEvent(new Event('input', { bubbles: true }));
            hideAutocomplete();
        });
        // Capture-phase scroll fires for any scrollable ancestor (incl. .table-wrap).
        // Skip scrolls inside the popup itself so the user can scroll the suggestion list.
        window.addEventListener('scroll', e => {
            if (popup.contains(e.target)) return;
            repositionAutocomplete();
        }, true);
        window.addEventListener('resize', hideAutocomplete);
        autocomplete.popup = popup;
    }

    function repositionAutocomplete() {
        const popup = autocomplete.popup;
        if (!popup || popup.hidden || !autocomplete.input) return;
        const rect = autocomplete.input.getBoundingClientRect();
        // Hide if the input has scrolled out of view.
        if (rect.bottom < 0 || rect.top > window.innerHeight
            || rect.right < 0 || rect.left > window.innerWidth) {
            hideAutocomplete();
            return;
        }
        popup.style.left = rect.left + 'px';
        popup.style.top = (rect.bottom + 2) + 'px';
    }

    function attachAutocomplete(input, values) {
        input.addEventListener('focus', () => openAutocomplete(input, values));
        input.addEventListener('input', () => {
            if (autocomplete.input === input) {
                autocomplete.idx = -1;
                renderAutocomplete();
            } else {
                openAutocomplete(input, values);
            }
        });
        input.addEventListener('blur', () => {
            // Delay so a click on a popup item registers before we hide.
            setTimeout(() => {
                if (autocomplete.input === input && document.activeElement !== input) {
                    hideAutocomplete();
                }
            }, 150);
        });
        input.addEventListener('keydown', e => {
            const matches = currentAutocompleteMatches();
            if (e.key === 'ArrowDown') {
                autocomplete.idx = Math.min(autocomplete.idx + 1, matches.length - 1);
                renderAutocomplete();
                e.preventDefault();
            } else if (e.key === 'ArrowUp') {
                autocomplete.idx = Math.max(autocomplete.idx - 1, -1);
                renderAutocomplete();
                e.preventDefault();
            } else if (e.key === 'Enter' && autocomplete.idx >= 0 && matches[autocomplete.idx]) {
                input.value = matches[autocomplete.idx];
                input.dispatchEvent(new Event('input', { bubbles: true }));
                hideAutocomplete();
                e.preventDefault();
            } else if (e.key === 'Escape') {
                hideAutocomplete();
            }
        });
    }

    function openAutocomplete(input, values) {
        autocomplete.input = input;
        autocomplete.values = values;
        autocomplete.idx = -1;
        renderAutocomplete();
    }

    function currentAutocompleteMatches() {
        if (!autocomplete.input || !autocomplete.values) return [];
        const values = typeof autocomplete.values === 'function'
            ? autocomplete.values() : autocomplete.values;
        if (!values) return [];
        const q = autocomplete.input.value.toLowerCase();
        return values.filter(v => v.toLowerCase().includes(q));
    }

    function renderAutocomplete() {
        const popup = autocomplete.popup;
        if (!popup || !autocomplete.input) return;
        const matches = currentAutocompleteMatches();
        if (!matches.length) {
            popup.hidden = true;
            return;
        }
        const limit = Math.min(matches.length, 200);
        popup.innerHTML = matches.slice(0, limit).map((v, i) =>
            `<div class="autocomplete-item${i === autocomplete.idx ? ' highlighted' : ''}" `
            + `data-value="${escapeAttr(v)}">${escapeText(v)}</div>`
        ).join('');
        const rect = autocomplete.input.getBoundingClientRect();
        popup.style.left = rect.left + 'px';
        popup.style.top = (rect.bottom + 2) + 'px';
        popup.style.minWidth = rect.width + 'px';
        popup.hidden = false;
        const hl = popup.querySelector('.autocomplete-item.highlighted');
        if (hl) hl.scrollIntoView({ block: 'nearest' });
    }

    function hideAutocomplete() {
        if (!autocomplete.popup) return;
        autocomplete.popup.hidden = true;
        autocomplete.input = null;
        autocomplete.values = null;
        autocomplete.idx = -1;
    }

    function applyFilter() {
        const q = state.search;
        state.filtered = state.all.filter(f => {
            for (const col of FILE_COL_KEYS) {
                const want = state.colFilters[col];
                if (!want) continue;
                const wl = want.toLowerCase();
                if (state.colFilterMode[col] === 'input') {
                    if (!fileColDisplay(f, col).toLowerCase().includes(wl)) return false;
                } else {
                    if (fileColValue(f, col).toLowerCase() !== wl) return false;
                }
            }
            if (!q) return true;
            const haystack = [
                f.filename, f.dienst, f.operatie, f.sleutel,
                ...Object.values(f.metadata || {})
            ].join(' ').toLowerCase();
            return haystack.includes(q);
        });
        sortFiltered();
        renderTable();

        state.filteredPersons = state.persons.filter(p => {
            for (const col of PERSON_COL_KEYS) {
                const want = state.personColFilters[col];
                if (!want) continue;
                const wl = want.toLowerCase();
                if (state.personColFilterMode[col] === 'input') {
                    if (col === 'diensten') {
                        if (!p.diensten.some(d => d.toLowerCase().includes(wl))) return false;
                    } else if (!personColDisplay(p, col).toLowerCase().includes(wl)) {
                        return false;
                    }
                } else if (col === 'diensten') {
                    if (!p.diensten.some(d => d.toLowerCase() === wl)) return false;
                } else if ((p[col] || '').toLowerCase() !== wl) {
                    return false;
                }
            }
            if (!q) return true;
            return [p.bsn, p.naam, p.woonplaatsnaam || '', p.geboortedat || '', ...p.files]
                .join(' ').toLowerCase().includes(q);
        });
        sortFilteredPersons();
        renderPersonsTable();

        const total = state.mode === 'persons' ? state.persons.length : state.all.length;
        const shown = state.mode === 'persons' ? state.filteredPersons.length : state.filtered.length;
        document.getElementById('result-count').textContent = `${shown} / ${total}`;

        refreshColumnFilterCounts();
    }

    function sortFiltered() {
        const key = state.sortKey;
        const dir = state.sortDir === 'asc' ? 1 : -1;
        state.filtered.sort((a, b) => {
            const va = sortValue(a, key);
            const vb = sortValue(b, key);
            return va.localeCompare(vb, 'nl', { numeric: true }) * dir;
        });
    }

    function sortValue(file, key) {
        switch (key) {
            case 'dienst': return file.dienst || '';
            case 'operatie': return file.operatie || '';
            case 'sleutel': return file.sleutel || '';
            case 'naam': return naam(file).toLowerCase();
            case 'geboortedat': return file.metadata?.geboortedat || '';
            case 'postcd': return file.metadata?.postcd || '';
            case 'woonplaatsnaam': return file.metadata?.woonplaatsnaam || '';
            case 'extra': return file.metadata?.kentekenvoertuig || '';
            default: return '';
        }
    }

    function toggleSort(key) {
        if (state.sortKey === key) {
            state.sortDir = state.sortDir === 'asc' ? 'desc' : 'asc';
        } else {
            state.sortKey = key;
            state.sortDir = 'asc';
        }
        document.querySelectorAll('#files-table thead tr.sort-row th').forEach(th => {
            th.classList.remove('sort-asc', 'sort-desc');
            if (th.dataset.sort === state.sortKey) {
                th.classList.add(state.sortDir === 'asc' ? 'sort-asc' : 'sort-desc');
            }
        });
        sortFiltered();
        renderTable();
    }

    function naam(f) {
        const m = f.metadata || {};
        const first = m.voornamen || m.voorletters || '';
        const tussen = m.voorvoegsel ? m.voorvoegsel + ' ' : '';
        const last = m.significantdeelvandeachternaam || '';
        const own = [first, tussen + last].filter(Boolean).join(' ').trim();
        return own || (m.naam_uit_brp || '');
    }

    function isNameBorrowedFromBrp(f) {
        const m = f.metadata || {};
        return !m.voornamen && !m.voorletters && !m.significantdeelvandeachternaam && !!m.naam_uit_brp;
    }

    function renderTable() {
        const tbody = document.getElementById('files-tbody');
        const rows = state.filtered.map(f => {
            const m = f.metadata || {};
            const extra = m.kentekenvoertuig
                ? `${escapeText(m.kentekenvoertuig)} ${m.merkvoertuig ? '(' + escapeText(m.merkvoertuig) + ')' : ''}`
                : (m.burgerservicenr ? 'BSN ' + escapeText(m.burgerservicenr) : '');
            const reqPill = f.isRequest ? '<span class="request-pill">request</span>' : '';
            const selectedClass = state.selected === f.filename ? 'selected' : '';
            const naamCell = isNameBorrowedFromBrp(f)
                ? `<span class="naam-from-brp" title="Naam niet in dit bestand — overgenomen uit BRP_AanvraagPersoon op dezelfde BSN">${escapeText(naam(f))}</span>`
                : escapeText(naam(f));
            const badge = gitBadgeFor(f.filename);
            const gitPill = badge ? `<span class="git-pill git-${badge.cls}" title="${escapeAttr(badge.title)}" aria-label="${escapeAttr(badge.title)}"></span>` : '';
            return `<tr class="${selectedClass}" data-filename="${escapeAttr(f.filename)}">
                <td>${gitPill}<span class="dienst-pill ${dienstClass(f.dienst)}">${escapeText(f.dienst)}</span>${reqPill}</td>
                <td>${escapeText(f.operatie)}</td>
                <td>${escapeText(f.sleutel)}</td>
                <td>${naamCell}</td>
                <td>${formatDate(m.geboortedat)}</td>
                <td>${escapeText(m.postcd || '')}</td>
                <td>${escapeText(m.woonplaatsnaam || '')}</td>
                <td>${extra}</td>
            </tr>`;
        }).join('');
        tbody.innerHTML = rows;
        tbody.querySelectorAll('tr').forEach(tr => {
            tr.addEventListener('click', () => selectFile(tr.dataset.filename));
        });
    }

    function formatDate(yyyymmdd) {
        if (!yyyymmdd || yyyymmdd.length !== 8 || !/^\d{8}$/.test(yyyymmdd)) {
            return escapeText(yyyymmdd || '');
        }
        return `${yyyymmdd.slice(6, 8)}-${yyyymmdd.slice(4, 6)}-${yyyymmdd.slice(0, 4)}`;
    }

    /* ---------- Detail: load / select ---------- */

    async function selectFile(filename) {
        if (state.loadedXml !== null && state.editor.getValue() !== state.loadedXml) {
            if (!confirm('Niet-opgeslagen wijzigingen worden weggegooid. Doorgaan?')) return;
        }
        state.selected = filename;
        renderTable();
        document.getElementById('empty-state').hidden = true;
        document.getElementById('detail').hidden = false;
        const file = state.all.find(f => f.filename === filename);
        document.getElementById('detail-filename').textContent = filename;
        document.getElementById('detail-sub').textContent = file
            ? `${file.dienst} · ${file.operatie} · ${file.sleutel}${file.isRequest ? ' (request)' : ''}`
            : '';

        try {
            const res = await fetch(`${API}/${encodeURIComponent(filename)}`, {
                headers: { Accept: 'application/xml' },
            });
            if (!res.ok) throw new Error(res.status + ' ' + res.statusText);
            const xml = await res.text();
            state.loadedXml = xml;
            state.dom = parseXmlOrNull(xml);
            setRawEditorValue(xml);
            renderForm();
            setDirty(false);
            setStatus('', '');
            maybeShowValidationBanner();
            updateGitHeaderForSelection();
            // Refresh CodeMirror in case the pane just appeared
            setTimeout(() => state.editor.refresh(), 0);
        } catch (e) {
            setStatus('Kon bestand niet laden: ' + e.message, 'error');
        }
    }

    function setDirty(dirty) {
        document.getElementById('dirty-indicator').hidden = !dirty;
        document.getElementById('save-btn').disabled = !dirty;
    }

    function setStatus(msg, level) {
        const el = document.getElementById('status');
        el.textContent = msg;
        el.classList.remove('error', 'success');
        if (level) el.classList.add(level);
    }

    function toggleList() {
        const layout = document.querySelector('.layout');
        const collapsed = layout.classList.toggle('list-collapsed');
        document.getElementById('toggle-list-btn').textContent =
            collapsed ? '⇔ Toon lijst' : '⇔ Volledig scherm';
        if (state.editor) setTimeout(() => state.editor.refresh(), 0);
    }

    function toggleRaw() {
        const body = document.getElementById('detail-body');
        const collapsed = body.classList.toggle('raw-collapsed');
        document.getElementById('toggle-raw-btn').textContent =
            collapsed ? 'XML tonen' : 'XML verbergen';
        if (state.editor && !collapsed) setTimeout(() => state.editor.refresh(), 0);
    }

    /* ---------- Git diff view ---------- */

    /**
     * Updates header indicator + Diff-button visibility for the currently selected file.
     * Also collapses the diff pane back to raw if a clean file becomes selected.
     */
    function updateGitHeaderForSelection() {
        const indicator = document.getElementById('git-indicator');
        const diffBtn = document.getElementById('toggle-diff-btn');
        const badge = state.selected ? gitBadgeFor(state.selected) : null;
        if (badge) {
            indicator.hidden = false;
            indicator.textContent = badge.title;
            indicator.className = `git-indicator git-${badge.cls}`;
            diffBtn.hidden = false;
            if (state.diffVisible) loadDiffForSelected();
        } else {
            indicator.hidden = true;
            diffBtn.hidden = true;
            if (state.diffVisible) toggleDiff(); // collapse to raw view
        }
    }

    async function toggleDiff() {
        const body = document.getElementById('detail-body');
        const diffPane = document.getElementById('diff-pane');
        const rawTextarea = state.editor && state.editor.getWrapperElement();
        const diffBtn = document.getElementById('toggle-diff-btn');
        const rawBtn = document.getElementById('toggle-raw-btn');
        state.diffVisible = !state.diffVisible;
        diffBtn.textContent = state.diffVisible ? 'Diff verbergen' : 'Diff tonen';

        if (state.diffVisible) {
            // Diff lives inside the raw column, so we force it open and remember
            // its pre-diff state to restore on close.
            state.rawWasCollapsedBeforeDiff = body.classList.contains('raw-collapsed');
            body.classList.remove('raw-collapsed');
            rawBtn.textContent = 'XML verbergen';
            if (rawTextarea) rawTextarea.style.display = 'none';
            diffPane.hidden = false;
            await loadDiffForSelected();
        } else {
            diffPane.hidden = true;
            if (rawTextarea) rawTextarea.style.display = '';
            if (state.rawWasCollapsedBeforeDiff) {
                body.classList.add('raw-collapsed');
                rawBtn.textContent = 'XML tonen';
            }
            state.rawWasCollapsedBeforeDiff = false;
            if (state.editor) setTimeout(() => state.editor.refresh(), 0);
        }
    }

    async function loadDiffForSelected() {
        const filename = state.selected;
        const empty = document.getElementById('diff-empty');
        const content = document.getElementById('diff-content');
        if (!filename) return;
        const status = (state.gitStatuses[filename] || '').trim();
        empty.textContent = '';
        content.innerHTML = '';

        if (status === '??') {
            // Untracked file — show entire current content as "added".
            const xml = state.loadedXml || '';
            content.innerHTML = renderAllAdded(xml);
            empty.textContent = 'Niet getrackt — volledig nieuw bestand.';
            return;
        }

        try {
            const res = await fetch(`${API}/git-diff/${encodeURIComponent(filename)}`, {
                headers: { Accept: 'text/plain' },
            });
            if (res.status === 404) {
                empty.textContent = 'Geen diff beschikbaar (bestand niet getrackt of git niet beschikbaar).';
                return;
            }
            if (!res.ok) throw new Error(res.status + ' ' + res.statusText);
            const diff = await res.text();
            if (!diff.trim()) {
                empty.textContent = 'Geen wijzigingen t.o.v. HEAD.';
                return;
            }
            content.innerHTML = renderUnifiedDiff(diff);
        } catch (e) {
            empty.textContent = 'Kon diff niet laden: ' + e.message;
        }
    }

    function renderAllAdded(text) {
        return text.split('\n').map(l => `<div class="diff-line diff-add">+ ${escapeText(l)}</div>`).join('');
    }

    /**
     * Renders a unified-diff blob as colored line-blocks. Skips the file-header lines
     * ("diff --git ...", "index ...", "--- a/...", "+++ b/...") and shows hunk headers
     * as a separator. Recognised line prefixes: '+' add, '-' delete, ' ' context,
     * '@@' hunk, '\\' (no newline marker — ignored).
     */
    function renderUnifiedDiff(diff) {
        const lines = diff.split('\n');
        const out = [];
        for (const raw of lines) {
            if (!raw && out.length === 0) continue;
            if (raw.startsWith('diff --git') || raw.startsWith('index ')
                || raw.startsWith('--- ') || raw.startsWith('+++ ')
                || raw.startsWith('new file mode') || raw.startsWith('deleted file mode')
                || raw.startsWith('similarity index') || raw.startsWith('rename ')
                || raw.startsWith('\\ No newline')) {
                continue;
            }
            if (raw.startsWith('@@')) {
                out.push(`<div class="diff-line diff-hunk">${escapeText(raw)}</div>`);
                continue;
            }
            if (raw.startsWith('+')) {
                out.push(`<div class="diff-line diff-add">${escapeText(raw)}</div>`);
            } else if (raw.startsWith('-')) {
                out.push(`<div class="diff-line diff-rem">${escapeText(raw)}</div>`);
            } else {
                out.push(`<div class="diff-line diff-ctx">${escapeText(raw || ' ')}</div>`);
            }
        }
        return out.join('');
    }

    /* ---------- Raw <-> Form sync ---------- */

    function setRawEditorValue(xml) {
        state.suppressRawSync = true;
        try {
            state.editor.setValue(xml);
        } finally {
            state.suppressRawSync = false;
        }
        // setValue clears all text markers; re-apply current raw search if any.
        applyRawSearch();
    }

    function onRawEditorChange() {
        if (state.suppressRawSync) return;
        if (state.loadedXml === null) return;
        setDirty(state.editor.getValue() !== state.loadedXml);
        // Re-parse and re-render the form, debounced. Only push when raw is well-formed; otherwise just show status.
        clearTimeout(state.rawDebounceTimer);
        state.rawDebounceTimer = setTimeout(() => {
            const text = state.editor.getValue();
            const parsed = parseXmlOrNull(text);
            if (!parsed) {
                setStatus('Raw XML is niet well-formed', 'error');
                return;
            }
            state.dom = parsed;
            renderForm();
            setStatus('', '');
        }, 350);
    }

    function pushDomToRaw() {
        if (!state.dom) return;
        clearTimeout(state.rawDebounceTimer);
        const xml = serializeXml(state.dom);
        setRawEditorValue(xml);
        setDirty(xml !== state.loadedXml);
    }

    function parseXmlOrNull(xmlString) {
        const doc = new DOMParser().parseFromString(xmlString, 'application/xml');
        if (doc.querySelector('parsererror')) return null;
        return doc;
    }

    /* ---------- Form rendering ---------- */

    function renderForm() {
        const pane = document.getElementById('form-fields');
        pane.innerHTML = '';
        if (!state.dom) {
            pane.innerHTML = '<div class="form-error">XML kon niet geparsed worden.</div>';
            refreshFormSearch();
            return;
        }

        // Auto-unwrap one or two levels of single-child wrapping (e.g. <Response><ClientSuwi>...).
        let root = state.dom.documentElement;
        while (elementChildren(root).length === 1 && elementChildren(elementChildren(root)[0]).length > 0) {
            root = elementChildren(root)[0];
        }
        const breadcrumb = document.createElement('div');
        breadcrumb.style.fontSize = '11px';
        breadcrumb.style.color = '#656d76';
        breadcrumb.style.marginBottom = '12px';
        breadcrumb.style.fontFamily = '"SF Mono", Menlo, Consolas, monospace';
        const path = pathFromDocument(root);
        breadcrumb.textContent = path;
        pane.appendChild(breadcrumb);
        pane.appendChild(renderChildrenOf(root, 0));
        refreshFormSearch();
    }

    function pathFromDocument(el) {
        const parts = [];
        let cur = el;
        while (cur && cur.nodeType === 1) {
            parts.unshift(cur.localName || cur.nodeName);
            cur = cur.parentElement;
        }
        return parts.join(' > ');
    }

    function elementChildren(el) {
        return Array.from(el.children);
    }

    function renderChildrenOf(parentEl, depth) {
        const container = document.createElement('div');
        for (const group of groupConsecutive(parentEl)) {
            if (group.type === 'comment') {
                const c = document.createElement('div');
                c.className = 'form-comment';
                c.textContent = '<!-- ' + group.node.nodeValue.trim() + ' -->';
                container.appendChild(c);
            } else if (group.items.length === 1) {
                container.appendChild(renderSingle(group.items[0], parentEl, depth));
            } else {
                container.appendChild(renderRepeating(group, parentEl, depth));
            }
        }
        return container;
    }

    function depthClass(depth) {
        return 'depth-' + Math.min(depth, 3);
    }

    function makeChevron() {
        const ch = document.createElement('span');
        ch.className = 'form-collapse-chevron';
        ch.textContent = '▾';
        ch.setAttribute('aria-hidden', 'true');
        return ch;
    }

    function attachCollapseToggle(headerEl, containerEl, xmlEl) {
        headerEl.classList.add('collapsible');
        headerEl.addEventListener('click', (e) => {
            // Don't toggle when clicking the remove button or interactive children inside the header.
            if (e.target.closest('.remove-btn,input,select,textarea,button:not(.collapsible-btn)')) return;
            const wasCollapsed = collapsedEls.has(xmlEl);
            if (wasCollapsed) {
                collapsedEls.delete(xmlEl);
                containerEl.classList.remove('collapsed');
            } else {
                collapsedEls.add(xmlEl);
                containerEl.classList.add('collapsed');
            }
        });
    }

    function groupConsecutive(parentEl) {
        const groups = [];
        let cur = null;
        for (const c of Array.from(parentEl.childNodes)) {
            if (c.nodeType === 8) {
                groups.push({ type: 'comment', node: c });
                cur = null;
                continue;
            }
            if (c.nodeType !== 1) continue;
            if (cur && cur.type === 'group' && cur.items[0].localName === c.localName) {
                cur.items.push(c);
            } else {
                cur = { type: 'group', items: [c] };
                groups.push(cur);
            }
        }
        return groups;
    }

    function isLeaf(el) {
        return el.children.length === 0;
    }

    function renderSingle(el, parentEl, depth) {
        if (isLeaf(el)) return renderLeafField(el);
        return renderCard(el, parentEl, depth);
    }

    function renderRepeating(group, parentEl, depth) {
        const list = document.createElement('div');
        const localName = group.items[0].localName;
        const cat = categoryFor(localName);
        list.className = 'form-list cat-' + cat + ' ' + depthClass(depth);
        if (isListCollapsed(parentEl, localName)) list.classList.add('collapsed');

        const header = document.createElement('div');
        header.className = 'form-list-header collapsible';
        header.appendChild(makeChevron());
        const icon = CATEGORY_ICONS[cat];
        if (icon) {
            const iconEl = document.createElement('span');
            iconEl.className = 'form-list-icon';
            iconEl.textContent = icon;
            header.appendChild(iconEl);
        }
        const titleEl = document.createElement('span');
        titleEl.textContent = friendly(localName);
        header.appendChild(titleEl);
        const countEl = document.createElement('span');
        countEl.className = 'form-list-count';
        countEl.textContent = group.items.length;
        header.appendChild(countEl);
        header.addEventListener('click', (e) => {
            if (e.target.closest('.remove-btn,input,select,textarea,button:not(.collapsible-btn)')) return;
            const nowCollapsed = toggleListCollapsed(parentEl, localName);
            list.classList.toggle('collapsed', nowCollapsed);
        });
        list.appendChild(header);

        group.items.forEach((item, idx) => {
            const itemBox = document.createElement('div');
            itemBox.className = 'form-list-item';
            if (collapsedEls.has(item)) itemBox.classList.add('collapsed');

            const itemHeader = document.createElement('div');
            itemHeader.className = 'form-list-item-header';
            itemHeader.appendChild(makeChevron());
            const left = document.createElement('span');
            left.innerHTML = `<span class="form-list-item-num">#${idx + 1}</span>`;
            const summary = summarize(item);
            if (summary) {
                const s = document.createElement('span');
                s.className = 'form-card-summary';
                s.textContent = summary;
                left.appendChild(document.createTextNode(' '));
                left.appendChild(s);
            }
            const remove = document.createElement('button');
            remove.type = 'button';
            remove.className = 'remove-btn';
            remove.textContent = '×';
            remove.title = 'Verwijderen';
            remove.addEventListener('click', (e) => {
                e.stopPropagation();
                if (!confirm(`${friendly(item.localName)} #${idx + 1} verwijderen?`)) return;
                item.parentNode.removeChild(item);
                pushDomToRaw();
                renderForm();
            });
            itemHeader.appendChild(left);
            itemHeader.appendChild(remove);
            attachCollapseToggle(itemHeader, itemBox, item);
            itemBox.appendChild(itemHeader);

            const body = document.createElement('div');
            body.className = 'form-list-item-body';
            if (isLeaf(item)) {
                body.appendChild(renderLeafField(item, /*labelOverride*/ '(waarde)'));
            } else {
                body.appendChild(renderChildrenOf(item, depth + 1));
            }
            itemBox.appendChild(body);

            list.appendChild(itemBox);
        });

        const actions = document.createElement('div');
        actions.className = 'form-list-actions';
        const addBtn = document.createElement('button');
        addBtn.type = 'button';
        addBtn.className = 'add-btn';
        addBtn.textContent = '+ ' + friendly(group.items[0].localName);
        addBtn.addEventListener('click', () => {
            const last = group.items[group.items.length - 1];
            const clone = last.cloneNode(true);
            clearLeafTextContent(clone);
            last.parentNode.insertBefore(clone, last.nextSibling);
            pushDomToRaw();
            renderForm();
        });
        actions.appendChild(addBtn);
        list.appendChild(actions);

        return list;
    }

    function renderCard(el, parentEl, depth) {
        const card = document.createElement('div');
        const cat = categoryFor(el.localName);
        card.className = 'form-card cat-' + cat + ' ' + depthClass(depth);
        if (collapsedEls.has(el)) card.classList.add('collapsed');

        const header = document.createElement('div');
        header.className = 'form-card-header';
        header.appendChild(makeChevron());
        const icon = CATEGORY_ICONS[cat];
        if (icon) {
            const iconEl = document.createElement('span');
            iconEl.className = 'form-card-icon';
            iconEl.textContent = icon;
            header.appendChild(iconEl);
        }
        const title = document.createElement('span');
        title.textContent = friendly(el.localName);
        header.appendChild(title);
        const summary = summarize(el);
        if (summary) {
            const s = document.createElement('span');
            s.className = 'form-card-summary';
            s.textContent = summary;
            header.appendChild(s);
        }
        attachCollapseToggle(header, card, el);
        card.appendChild(header);

        const body = document.createElement('div');
        body.className = 'form-card-body';
        body.appendChild(renderChildrenOf(el, depth + 1));
        card.appendChild(body);
        return card;
    }

    function renderLeafField(el, labelOverride) {
        const row = document.createElement('div');
        row.className = 'form-field';

        const label = document.createElement('label');
        label.textContent = labelOverride || friendly(el.localName);
        const fieldName = document.createElement('span');
        fieldName.className = 'field-name';
        fieldName.textContent = el.localName;
        label.appendChild(fieldName);
        row.appendChild(label);

        const input = document.createElement('input');
        input.type = 'text';
        input.value = el.textContent;
        input.spellcheck = false;
        input.addEventListener('input', () => {
            // Replace text content while preserving the element node
            setLeafText(el, input.value);
            updateHint();
            updateValidation();
            pushDomToRaw();
        });
        row.appendChild(input);

        const hint = document.createElement('span');
        hint.className = 'hint';
        row.appendChild(hint);
        function updateHint() {
            const v = input.value;
            if (DATE_FIELD_PATTERN.test(el.localName) && /^\d{8}$/.test(v)) {
                hint.textContent = formatDate(v);
            } else {
                hint.textContent = '';
            }
        }
        function updateValidation() {
            const v = input.value;
            const name = el.localName;
            input.classList.remove('valid-format', 'invalid-format');
            if (v.length === 0) return;
            let valid = null;
            if (DATE_FIELD_PATTERN.test(name)) {
                valid = /^\d{8}$/.test(v);
            } else if (name === 'Postcd') {
                valid = /^\d{4}\s?[A-Za-z]{2}$/.test(v);
            } else if (name === 'ANr') {
                valid = /^\d{10}$/.test(v);
            } else if (name === 'Burgerservicenr') {
                valid = /^\d{9}$/.test(v) && bsnIsValid(v);
            }
            if (valid === true) input.classList.add('valid-format');
            else if (valid === false) input.classList.add('invalid-format');
        }
        updateHint();
        updateValidation();

        return row;
    }

    function setLeafText(el, text) {
        // Clear existing children, then write a single text node.
        while (el.firstChild) el.removeChild(el.firstChild);
        if (text !== '') {
            el.appendChild(el.ownerDocument.createTextNode(text));
        }
    }

    function clearLeafTextContent(el) {
        if (el.children.length === 0) {
            setLeafText(el, '');
        } else {
            Array.from(el.children).forEach(clearLeafTextContent);
        }
    }

    /** Build a short summary string for a complex element by joining a few descendant leaf values. */
    function summarize(el) {
        const interesting = [
            'Voornamen', 'SignificantDeelVanDeAchternaam', 'Burgerservicenr',
            'Postcd', 'Woonplaatsnaam', 'Straatnaam', 'Huisnr',
            'Geboortedat', 'KentekenVoertuig', 'MerkVoertuig', 'NaamAdministratieveEenheid',
            'CdNationaliteit', 'CdSzWet', 'KadastraalPerceelnr',
        ];
        const found = [];
        for (const name of interesting) {
            const els = el.getElementsByTagNameNS('*', name);
            if (els.length === 0) continue;
            const txt = (els[0].textContent || '').trim();
            if (!txt) continue;
            const formatted = (DATE_FIELD_PATTERN.test(name) && /^\d{8}$/.test(txt)) ? formatDate(txt) : txt;
            found.push(formatted);
            if (found.length >= 4) break;
        }
        return found.join(' · ');
    }

    function friendly(name) {
        return FRIENDLY_LABELS[name] || name;
    }

    /* ---------- XML serialization (pretty, 4-space indent) ---------- */

    function serializeXml(doc) {
        return serializeNode(doc.documentElement, 0);
    }

    function serializeNode(node, indent) {
        const pad = '    '.repeat(indent);
        if (node.nodeType === 8) {
            return pad + '<!-- ' + node.nodeValue + ' -->';
        }
        if (node.nodeType !== 1) return '';

        const name = node.nodeName;
        let attrs = '';
        for (const a of Array.from(node.attributes)) {
            attrs += ` ${a.name}="${escapeAttr(a.value)}"`;
        }

        const elementOrCommentChildren = Array.from(node.childNodes)
            .filter(n => n.nodeType === 1 || n.nodeType === 8);

        if (elementOrCommentChildren.length === 0) {
            const text = node.textContent || '';
            if (text === '') {
                return `${pad}<${name}${attrs}/>`;
            }
            return `${pad}<${name}${attrs}>${escapeText(text)}</${name}>`;
        }

        const inner = elementOrCommentChildren
            .map(c => serializeNode(c, indent + 1))
            .filter(s => s)
            .join('\n');
        return `${pad}<${name}${attrs}>\n${inner}\n${pad}</${name}>`;
    }

    /* ---------- Save ---------- */

    async function save() {
        if (!state.selected) return;
        const xml = state.editor.getValue();
        setStatus('Opslaan...', '');
        try {
            const res = await fetch(`${API}/${encodeURIComponent(state.selected)}`, {
                method: 'PUT',
                headers: { 'Content-Type': 'application/xml' },
                body: xml,
            });
            if (!res.ok) {
                const err = await res.json().catch(() => ({}));
                throw new Error(err.error || (res.status + ' ' + res.statusText));
            }
            state.loadedXml = xml;
            setDirty(false);
            setStatus('Opgeslagen', 'success');
            loadIndex();
        } catch (e) {
            setStatus('Opslaan mislukt: ' + e.message, 'error');
        }
    }

    /* ---------- Helpers ---------- */

    function escapeText(s) {
        return String(s ?? '')
            .replace(/&/g, '&amp;')
            .replace(/</g, '&lt;')
            .replace(/>/g, '&gt;');
    }

    function escapeAttr(s) {
        return escapeText(s).replace(/"/g, '&quot;');
    }

    /* ==================== Personen-modus ==================== */

    function setMode(mode) {
        hideAutocomplete();
        state.mode = mode;
        document.querySelectorAll('.mode-btn').forEach(b =>
            b.classList.toggle('active', b.dataset.mode === mode));
        document.getElementById('files-wrap').hidden = mode !== 'files';
        document.getElementById('persons-wrap').hidden = mode !== 'persons';
        // Test mode hides the table area entirely; the right-pane shows only the test form.
        const inTest = mode === 'test';
        document.querySelector('.left-pane').hidden = inTest;
        document.getElementById('resize-handle').hidden = inTest;
        document.getElementById('test-pane').hidden = !inTest;
        // Reset right pane
        document.getElementById('detail').hidden = true;
        document.getElementById('person-detail').hidden = true;
        document.getElementById('empty-state').hidden = inTest;
        if (!inTest) {
            document.getElementById('empty-state').textContent = mode === 'persons'
                ? 'Selecteer een persoon links.'
                : 'Selecteer een bestand links.';
        }
        if (inTest) onEnterTestMode();
        applyFilter();
    }

    function groupByBsn(files) {
        const map = new Map();
        for (const f of files) {
            const m = f.metadata || {};
            const bsn = m.burgerservicenr || (/^\d{9}$/.test(f.sleutel) ? f.sleutel : null);
            if (!bsn) continue;
            if (!map.has(bsn)) {
                map.set(bsn, {
                    bsn,
                    naam: '',
                    geboortedat: '',
                    woonplaatsnaam: '',
                    postcd: '',
                    files: [],
                    diensten: [],
                    _diensten: new Set(),
                });
            }
            const p = map.get(bsn);
            p.files.push(f.filename);
            if (!p._diensten.has(f.dienst)) {
                p._diensten.add(f.dienst);
                p.diensten.push(f.dienst);
            }
            if (!p.naam) {
                const own = naam(f);
                if (own) p.naam = own;
            }
            if (!p.geboortedat && m.geboortedat) p.geboortedat = m.geboortedat;
            if (!p.woonplaatsnaam && m.woonplaatsnaam) p.woonplaatsnaam = m.woonplaatsnaam;
            if (!p.postcd && m.postcd) p.postcd = m.postcd;
        }
        return Array.from(map.values());
    }

    function sortFilteredPersons() {
        const key = state.personSortKey;
        const dir = state.personSortDir === 'asc' ? 1 : -1;
        state.filteredPersons.sort((a, b) => {
            let va, vb;
            if (key === 'diensten') { va = a.diensten.length + ''; vb = b.diensten.length + ''; }
            else { va = (a[key] || '').toLowerCase(); vb = (b[key] || '').toLowerCase(); }
            return va.localeCompare(vb, 'nl', { numeric: true }) * dir;
        });
    }

    function togglePersonSort(key) {
        if (!key) return;
        if (state.personSortKey === key) {
            state.personSortDir = state.personSortDir === 'asc' ? 'desc' : 'asc';
        } else {
            state.personSortKey = key;
            state.personSortDir = 'asc';
        }
        document.querySelectorAll('#persons-table thead tr.sort-row th').forEach(th => {
            th.classList.remove('sort-asc', 'sort-desc');
            if (th.dataset.sortP === state.personSortKey) {
                th.classList.add(state.personSortDir === 'asc' ? 'sort-asc' : 'sort-desc');
            }
        });
        sortFilteredPersons();
        renderPersonsTable();
    }

    function renderPersonsTable() {
        const tbody = document.getElementById('persons-tbody');
        const rows = state.filteredPersons.map(p => {
            const selectedClass = state.selectedPerson === p.bsn ? 'selected' : '';
            const pills = p.diensten.map(d =>
                `<span class="dienst-pill ${dienstClass(d)}" title="${escapeAttr(d)}">${escapeText(shortDienst(d))}</span>`).join(' ');
            const personBadge = personGitBadge(p);
            const gitPill = personBadge
                ? `<span class="git-pill git-${personBadge.cls}" title="${escapeAttr(personBadge.title)}" aria-label="${escapeAttr(personBadge.title)}"></span>`
                : '';
            return `<tr class="${selectedClass}" data-bsn="${escapeAttr(p.bsn)}">
                <td>${gitPill}${escapeText(p.bsn)}</td>
                <td>${escapeText(p.naam || '—')}</td>
                <td>${formatDate(p.geboortedat)}</td>
                <td>${escapeText(p.woonplaatsnaam || '')}</td>
                <td>${pills}</td>
            </tr>`;
        }).join('');
        tbody.innerHTML = rows;
        tbody.querySelectorAll('tr').forEach(tr => {
            tr.addEventListener('click', () => selectPerson(tr.dataset.bsn));
        });
    }

    /** Aggregates per-file badges into one badge for the person. Modified beats added beats deleted. */
    function personGitBadge(p) {
        if (!state.gitAvailable || !p.files) return null;
        let any = null, hasModified = false, hasAdded = false, hasDeleted = false;
        for (const fn of p.files) {
            const b = gitBadgeFor(fn);
            if (!b) continue;
            any = b;
            if (b.cls === 'modified') hasModified = true;
            else if (b.cls === 'added') hasAdded = true;
            else if (b.cls === 'deleted') hasDeleted = true;
        }
        if (!any) return null;
        if (hasModified) return { cls: 'modified', title: 'Eén of meer bestanden gewijzigd' };
        if (hasAdded) return { cls: 'added', title: 'Nieuwe bestanden' };
        if (hasDeleted) return { cls: 'deleted', title: 'Verwijderde bestanden' };
        return any;
    }

    function shortDienst(d) {
        const map = {
            BRPDossierPersoonGSD: 'BRP',
            UWVDossierInkomstenGSD: 'UWV',
            UWVDossierInkomstenGSDDigitaleDiensten: 'UWV-DD',
            DUODossierPersoonGSD: 'DUO-P',
            DUODossierStudiefinancieringGSD: 'DUO-SF',
            KadasterDossierGSD: 'Kadaster',
            RDWDossierGSD: 'RDW',
            SVBDossierPersoonGSD: 'SVB',
            Bijstandsregelingen: 'Bijstand',
        };
        return map[d] || d;
    }

    function selectPerson(bsn) {
        state.selectedPerson = bsn;
        const p = state.persons.find(x => x.bsn === bsn);
        if (!p) return;
        renderPersonsTable();
        document.getElementById('empty-state').hidden = true;
        document.getElementById('detail').hidden = true;
        document.getElementById('person-detail').hidden = false;

        document.getElementById('person-name').textContent = p.naam || `BSN ${p.bsn}`;
        document.getElementById('person-sub').textContent =
            `BSN ${p.bsn} · ${formatDate(p.geboortedat)} · ${p.woonplaatsnaam || ''}`.replace(/ · $/, '');

        const body = document.getElementById('person-body');
        body.innerHTML = '';
        const list = document.createElement('div');
        list.className = 'person-files';
        const heading = document.createElement('div');
        heading.className = 'person-files-heading';
        heading.textContent = `${p.files.length} bestanden`;
        list.appendChild(heading);
        for (const filename of p.files.slice().sort()) {
            const file = state.all.find(f => f.filename === filename);
            const row = document.createElement('div');
            row.className = 'person-file-row';
            const rowBadge = gitBadgeFor(filename);
            const rowGit = rowBadge ? `<span class="git-pill git-${rowBadge.cls}" title="${escapeAttr(rowBadge.title)}" aria-label="${escapeAttr(rowBadge.title)}"></span>` : '';
            row.innerHTML = `${rowGit}<span class="dienst-pill ${dienstClass(file ? file.dienst : '')}">${escapeText(file ? file.dienst : '')}</span>
                <span class="person-file-op">${escapeText(file ? file.operatie : '')}</span>
                <span class="person-file-name">${escapeText(filename)}</span>
                ${file && file.isRequest ? '<span class="request-pill">request</span>' : ''}`;
            row.addEventListener('click', () => {
                setMode('files');
                selectFile(filename);
            });
            list.appendChild(row);
        }
        body.appendChild(list);
        body.appendChild(buildQuickIncomePanel(p));
    }

    /* ==================== Recente inkomsten toevoegen ==================== */

    /** Hard-coded defaults per type, in cents. Override in the form to use other amounts. */
    const QI_DEFAULTS = {
        loondienst:   { bruto: 200000, netto: null,   showNetto: false, kind: 'uwv' },
        uwvuitkering: { bruto: 150000, netto: null,   showNetto: false, kind: 'uwv' },
        onbekend:     { bruto: 150000, netto: null,   showNetto: false, kind: 'uwv' },
        pensioen:     { bruto: 180000, netto: null,   showNetto: false, kind: 'uwv' },
        svbuitkering: { bruto: 240000, netto: 205000, showNetto: true,  kind: 'svb' },
        studiefinanciering: { bruto: 0, netto: null,  showNetto: false, kind: 'duo' },
    };

    /** Per-SVB-regeling defaults (cents). User can override in the form. */
    const QI_SVB_DEFAULTS = {
        AOW: { bruto: 240000, netto: 205000 },
        ANW: { bruto: 150000, netto: 130000 },
        AIO: { bruto: 120000, netto: 110000 },
        WLZ: { bruto:  80000, netto:  75000 },
    };

    function buildQuickIncomePanel(person) {
        const tpl = document.getElementById('quick-income-template');
        const node = tpl.content.firstElementChild.cloneNode(true);
        const typeSel = node.querySelector('[data-qi="type"]');
        const brutoInp = node.querySelector('[data-qi="bruto"]');
        const brutoRow = node.querySelector('[data-qi-bruto-row]');
        const nettoInp = node.querySelector('[data-qi="netto"]');
        const nettoRow = node.querySelector('[data-qi-netto-row]');
        const werkgeverInp = node.querySelector('[data-qi="werkgever"]');
        const werkgeverRow = node.querySelector('[data-qi-werkgever-row]');
        const svbRegelingSel = node.querySelector('[data-qi="svbregeling"]');
        const svbRegelingRow = node.querySelector('[data-qi-svbregeling-row]');
        const aliIngehoudenInp = node.querySelector('[data-qi="alimentatie-ingehouden"]');
        const aliIngehoudenRow = node.querySelector('[data-qi-alimentatie-ingehouden-row]');
        const aliRechtstreeksInp = node.querySelector('[data-qi="alimentatie-rechtstreeks"]');
        const aliRechtstreeksRow = node.querySelector('[data-qi-alimentatie-rechtstreeks-row]');
        const submitBtn = node.querySelector('[data-qi="submit"]');
        const statusEl = node.querySelector('[data-qi="status"]');

        const applyType = () => {
            const def = QI_DEFAULTS[typeSel.value];
            const isSvb = def.kind === 'svb';
            const isDuo = def.kind === 'duo';
            const isUwv = def.kind === 'uwv';

            svbRegelingRow.hidden = !isSvb;
            werkgeverRow.hidden = !isUwv;
            brutoRow.hidden = isDuo;
            nettoRow.hidden = !def.showNetto;
            aliIngehoudenRow.hidden = !isUwv;
            aliRechtstreeksRow.hidden = !isUwv;

            if (isSvb) {
                const svbDef = QI_SVB_DEFAULTS[svbRegelingSel.value];
                brutoInp.value = (svbDef.bruto / 100).toFixed(2);
                nettoInp.value = (svbDef.netto / 100).toFixed(2);
            } else if (isUwv) {
                brutoInp.value = (def.bruto / 100).toFixed(2);
                werkgeverInp.value = uwvIkvSpec(typeSel.value).naamAeh;
            }
        };
        applyType();
        typeSel.addEventListener('change', applyType);
        svbRegelingSel.addEventListener('change', applyType);

        submitBtn.addEventListener('click', async () => {
            const def = QI_DEFAULTS[typeSel.value];
            const months = parseInt(node.querySelector('[data-qi="months"]').value, 10);
            const brutoCent = def.kind === 'duo' ? 0 : Math.round(parseFloat(brutoInp.value) * 100);
            const nettoCent = def.showNetto ? Math.round(parseFloat(nettoInp.value) * 100) : null;
            const werkgever = def.kind === 'uwv' ? werkgeverInp.value.trim() : null;
            const cdSzWet = def.kind === 'svb' ? svbRegelingSel.value : null;
            const aliIngehoudenCent = def.kind === 'uwv' ? parseOptionalEuroCents(aliIngehoudenInp.value) : null;
            const aliRechtstreeksCent = def.kind === 'uwv' ? parseOptionalEuroCents(aliRechtstreeksInp.value) : null;
            if (!Number.isFinite(months) || months < 1 || months > 12) {
                setQiStatus(statusEl, 'Aantal maanden moet tussen 1 en 12 zijn.', 'error');
                return;
            }
            if (def.kind !== 'duo' && (!Number.isFinite(brutoCent) || brutoCent < 0)) {
                setQiStatus(statusEl, 'Bruto bedrag is ongeldig.', 'error');
                return;
            }
            if (nettoCent !== null && (!Number.isFinite(nettoCent) || nettoCent < 0)) {
                setQiStatus(statusEl, 'Netto bedrag is ongeldig.', 'error');
                return;
            }
            if (werkgever !== null && werkgever === '') {
                setQiStatus(statusEl, 'Werkgever mag niet leeg zijn.', 'error');
                return;
            }
            if (aliIngehoudenCent === 'invalid' || aliRechtstreeksCent === 'invalid') {
                setQiStatus(statusEl, 'Alimentatie-bedrag is ongeldig.', 'error');
                return;
            }
            submitBtn.disabled = true;
            setQiStatus(statusEl, 'Bezig…', '');
            try {
                const modifiedFile = await submitQuickIncome(person, typeSel.value, {
                    months, brutoCent, nettoCent, werkgever, cdSzWet,
                    aliIngehoudenCent: aliIngehoudenCent || null,
                    aliRechtstreeksCent: aliRechtstreeksCent || null,
                });
                setQiStatus(statusEl, 'Toegevoegd. Index wordt herladen…', 'success');
                await loadIndex();
                // Re-select the same person so the new file (if any) appears in the list.
                if (state.persons.find(x => x.bsn === person.bsn)) selectPerson(person.bsn);
                // If the modified file is currently open in the editor, reload it so
                // state.dom syncs with disk and the validation banner re-evaluates.
                if (modifiedFile && state.selected === modifiedFile) {
                    await selectFile(modifiedFile);
                }
            } catch (e) {
                setQiStatus(statusEl, 'Mislukt: ' + e.message, 'error');
            } finally {
                submitBtn.disabled = false;
            }
        });
        return node;
    }

    /** Empty -> null (not provided). Non-numeric or negative -> 'invalid'. Else cents. */
    function parseOptionalEuroCents(raw) {
        const s = (raw || '').trim();
        if (!s) return null;
        const n = parseFloat(s);
        if (!Number.isFinite(n) || n < 0) return 'invalid';
        return Math.round(n * 100);
    }

    function setQiStatus(el, msg, kind) {
        el.textContent = msg;
        el.className = 'quick-income-status' + (kind ? ' ' + kind : '');
    }

    async function submitQuickIncome(person, type, opts) {
        const periods = monthlyPeriods(new Date(), opts.months);
        const kind = QI_DEFAULTS[type].kind;
        if (kind === 'svb') {
            const filename = `SVBDossierPersoonGSD_SVBPersoonsInfo_${person.bsn}.xml`;
            const existing = await fetchXmlIfExists(filename);
            if (existing) {
                const updated = appendSvbUitkering(existing, periods, opts.brutoCent, opts.nettoCent, opts.cdSzWet);
                await putXml(filename, updated);
            } else {
                const skeleton = buildSvbSkeleton(person, periods, opts.brutoCent, opts.nettoCent, opts.cdSzWet);
                await postXml(filename, skeleton);
            }
            return filename;
        } else if (kind === 'duo') {
            const filename = `DUODossierStudiefinancieringGSD_DUOStudiefinancieringInfo_${person.bsn}.xml`;
            const existing = await fetchXmlIfExists(filename);
            if (existing) {
                const updated = appendDuoStudiefinanciering(existing, periods);
                await putXml(filename, updated);
            } else {
                const skeleton = buildDuoStudiefinancieringSkeleton(person, periods);
                await postXml(filename, skeleton);
            }
            return filename;
        } else {
            const filename = `UWVDossierInkomstenGSD_UWVPersoonsIkvInfo_${person.bsn}.xml`;
            const existing = await fetchXmlIfExists(filename);
            if (existing) {
                const updated = appendUwvInkomstenverhouding(existing, type, periods, opts.brutoCent, opts.werkgever, opts.aliIngehoudenCent, opts.aliRechtstreeksCent);
                await putXml(filename, updated);
            } else {
                const skeleton = buildUwvSkeleton(person, type, periods, opts.brutoCent, opts.werkgever, opts.aliIngehoudenCent, opts.aliRechtstreeksCent);
                await postXml(filename, skeleton);
            }
            return filename;
        }
    }

    async function fetchXmlIfExists(filename) {
        const res = await fetch(`${API}/${encodeURIComponent(filename)}`);
        if (res.status === 404) return null;
        if (!res.ok) throw new Error(res.status + ' ' + res.statusText);
        return await res.text();
    }

    async function putXml(filename, xml) {
        const res = await fetch(`${API}/${encodeURIComponent(filename)}`, {
            method: 'PUT',
            headers: { 'Content-Type': 'application/xml' },
            body: xml,
        });
        if (!res.ok) {
            const err = await res.json().catch(() => ({}));
            throw new Error(err.error || (res.status + ' ' + res.statusText));
        }
    }

    async function postXml(filename, xml) {
        const res = await fetch(`${API}/${encodeURIComponent(filename)}`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/xml' },
            body: xml,
        });
        if (!res.ok) {
            const err = await res.json().catch(() => ({}));
            throw new Error(err.error || (res.status + ' ' + res.statusText));
        }
    }

    /** Returns the last `count` calendar months as { startYmd, endYmd } pairs, oldest first. */
    function monthlyPeriods(today, count) {
        const periods = [];
        const y = today.getFullYear();
        const m = today.getMonth();
        for (let i = count - 1; i >= 0; i--) {
            const start = new Date(y, m - i, 1);
            const end = new Date(y, m - i + 1, 0);
            periods.push({ startYmd: ymd(start), endYmd: ymd(end) });
        }
        return periods;
    }

    function ymd(d) {
        const y = d.getFullYear();
        const m = String(d.getMonth() + 1).padStart(2, '0');
        const da = String(d.getDate()).padStart(2, '0');
        return `${y}${m}${da}`;
    }

    /* ---------- UWV-bestand: appenden of skeleton bouwen ---------- */

    function uwvIkvSpec(type) {
        switch (type) {
            case 'loondienst': return {
                naamAeh: 'VOORBEELD WERKGEVER B.V.',
                loonheffingennr: '999888777L01',
                fiNr: '999888777',
                naamRechtspersoon: 'VOORBEELD WERKGEVER B.V.',
                postcd: '1000AA', plaats: 'Amsterdam', straat: 'Voorbeeldstraat', huisnr: '1',
                cdSrtIkv: '11', contractType: 'B', cdAardIkv: '12',
                indLkToegepast: '1', indRegelmatig: '1',
                cdInvloedVerzPlicht: null,
            };
            case 'uwvuitkering': return {
                naamAeh: 'UWV',
                loonheffingennr: '004444444L01',
                fiNr: '004444444',
                naamRechtspersoon: 'UITVOERINGSINST. WERKNEMERSVERZEKERINGEN',
                postcd: '1043BZ', plaats: 'Amsterdam', straat: 'La Guardiaweg', huisnr: '116',
                cdSrtIkv: '31', contractType: 'U', cdAardIkv: '13',
                indLkToegepast: '1', indRegelmatig: null,
                cdInvloedVerzPlicht: 'AB',
            };
            case 'onbekend': return {
                naamAeh: 'ONBEKENDE BRON',
                loonheffingennr: '000000000L00',
                fiNr: '000000000',
                naamRechtspersoon: 'ONBEKEND',
                postcd: '0000AA', plaats: 'Onbekend', straat: 'Onbekend', huisnr: '0',
                cdSrtIkv: '00', contractType: null, cdAardIkv: null,
                indLkToegepast: null, indRegelmatig: null,
                cdInvloedVerzPlicht: null,
            };
            case 'pensioen': return {
                naamAeh: 'PENSIOENFONDS VOORBEELD',
                loonheffingennr: '008888888L01',
                fiNr: '008888888',
                naamRechtspersoon: 'PENSIOENFONDS VOORBEELD',
                postcd: '3511LH', plaats: 'Utrecht', straat: 'Pensioenlaan', huisnr: '1',
                cdSrtIkv: '85', contractType: null, cdAardIkv: '15',
                indLkToegepast: '1', indRegelmatig: null,
                cdInvloedVerzPlicht: null,
            };
        }
        throw new Error('Onbekend type: ' + type);
    }

    function appendUwvInkomstenverhouding(xml, type, periods, brutoCent, werkgever, aliIngehoudenCent, aliRechtstreeksCent) {
        const doc = parseXml(xml);
        const client = doc.getElementsByTagNameNS('*', 'ClientSuwi')[0];
        if (!client) throw new Error('ClientSuwi-element niet gevonden in UWV-bestand');
        const next = nextVolgnr(client);
        const block = buildIkvFragment(doc, type, periods, brutoCent, next, werkgever, aliIngehoudenCent, aliRechtstreeksCent);
        client.appendChild(doc.createTextNode('\n        '));
        client.appendChild(doc.createComment(' Toegevoegd door "Recente inkomsten" '));
        client.appendChild(doc.createTextNode('\n        '));
        client.appendChild(block);
        client.appendChild(doc.createTextNode('\n    '));
        // Houd PeriodeGegevensleveringIko consistent met de nieuwe data.
        updatePeriodeGegevensleveringIko(doc);
        return serializeXml(doc);
    }

    function nextVolgnr(client) {
        const existing = client.getElementsByTagNameNS('*', 'VolgnrIkv');
        let max = 0;
        for (let i = 0; i < existing.length; i++) {
            const n = parseInt(existing[i].textContent.trim(), 10);
            if (Number.isFinite(n) && n > max) max = n;
        }
        return max + 1;
    }

    function buildIkvFragment(doc, type, periods, brutoCent, volgnr, werkgever, aliIngehoudenCent, aliRechtstreeksCent) {
        const spec = uwvIkvSpec(type);
        const naamAeh = (werkgever && werkgever.length) ? werkgever : spec.naamAeh;
        const naamRp = (werkgever && werkgever.length) ? werkgever : spec.naamRechtspersoon;
        const ikv = doc.createElement('Inkomstenverhouding');
        const ikvStart = periods[0].startYmd;
        const ikvEnd = periods[periods.length - 1].endYmd;
        appendChild(ikv, 'VolgnrIkv', String(volgnr));
        appendChild(ikv, 'DatBIkv', ikvStart);
        appendChild(ikv, 'DatEIkv', ikvEnd);

        const aeh = doc.createElement('AdministratieveEenheid');
        appendChild(aeh, 'NaamAdministratieveEenheid', naamAeh);
        appendChild(aeh, 'Loonheffingennr', spec.loonheffingennr);
        const rp = doc.createElement('RechtspersoonAdministratieveEenh');
        appendChild(rp, 'FiNr', spec.fiNr);
        appendChild(rp, 'NaamRechtspersoon', naamRp);
        aeh.appendChild(rp);
        const adres = doc.createElement('FeitelijkAdresAeh');
        const straatadres = doc.createElement('Straatadres');
        appendChild(straatadres, 'Postcd', spec.postcd);
        appendChild(straatadres, 'Woonplaatsnaam', spec.plaats);
        appendChild(straatadres, 'Gemeentenaam', spec.plaats);
        appendChild(straatadres, 'Straatnaam', spec.straat);
        appendChild(straatadres, 'Huisnr', spec.huisnr);
        adres.appendChild(straatadres);
        aeh.appendChild(adres);
        ikv.appendChild(aeh);

        const ikp = doc.createElement('Inkomstenperiode');
        appendChild(ikp, 'DatBIkp', ikvStart);
        appendChild(ikp, 'DatEIkp', ikvEnd);
        if (spec.cdSrtIkv != null) appendChild(ikp, 'CdSrtIkv', spec.cdSrtIkv);
        if (spec.contractType != null) appendChild(ikp, 'CdTypeArbeidscontract', spec.contractType);
        if (spec.cdInvloedVerzPlicht != null) appendChild(ikp, 'CdInvloedVerzekeringsplicht', spec.cdInvloedVerzPlicht);
        if (spec.indLkToegepast != null) appendChild(ikp, 'IndLoonheffingskortingToegepast', spec.indLkToegepast);
        if (spec.indRegelmatig != null) appendChild(ikp, 'IndRegelmatigArbeidspatroon', spec.indRegelmatig);
        if (spec.cdAardIkv != null) appendChild(ikp, 'CdAardIkv', spec.cdAardIkv);
        ikv.appendChild(ikp);

        for (const p of periods) {
            const opg = doc.createElement('Inkomstenopgave');
            appendChild(opg, 'DatBIko', p.startYmd);
            appendChild(opg, 'DatEIko', p.endYmd);
            const days = daysBetween(p.startYmd, p.endYmd);
            appendChild(opg, 'AantSvDagenIko', String(days));
            appendChild(opg, 'AantVerloondeUrenIko', type === 'loondienst' ? '160' : '0');
            opg.appendChild(buildBedrag(doc, 'BedrBrutoloonSv', brutoCent));
            opg.appendChild(buildBedrag(doc, 'BedrLoonLbPremieVolksverz', brutoCent));
            if (aliIngehoudenCent != null) {
                opg.appendChild(buildBedrag(doc, 'BedrInUitkBegrBetAlimentatie', aliIngehoudenCent));
            }
            if (aliRechtstreeksCent != null) {
                opg.appendChild(buildBedrag(doc, 'BedrRechtstreeksBetAlimentatie', aliRechtstreeksCent));
            }
            ikv.appendChild(opg);
        }
        return ikv;
    }

    function buildBedrag(doc, name, cents) {
        const el = doc.createElement(name);
        appendChild(el, 'CdMunteenheid', 'EUR');
        appendChild(el, 'CdPositiefNegatief', '+');
        appendChild(el, 'WaardeBedr', String(cents));
        return el;
    }

    function buildUwvSkeleton(person, type, periods, brutoCent, werkgever, aliIngehoudenCent, aliRechtstreeksCent) {
        const xml = `<smls:UWVPersoonsIkvInfoResponse xmlns:smls="http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200">
    <ClientSuwi>
        <Burgerservicenr>${escapeText(person.bsn)}</Burgerservicenr>
    </ClientSuwi>
</smls:UWVPersoonsIkvInfoResponse>`;
        return appendUwvInkomstenverhouding(xml, type, periods, brutoCent, werkgever, aliIngehoudenCent, aliRechtstreeksCent);
    }

    /* ---------- SVB-bestand: appenden of skeleton bouwen ---------- */

    function appendSvbUitkering(xml, periods, brutoCent, nettoCent, cdSzWet) {
        const doc = parseXml(xml);
        const client = doc.getElementsByTagNameNS('*', 'ClientSuwi')[0];
        if (!client) throw new Error('ClientSuwi-element niet gevonden in SVB-bestand');
        const block = buildSvbUitkeringFragment(doc, periods, brutoCent, nettoCent, cdSzWet);
        client.appendChild(doc.createTextNode('\n        '));
        client.appendChild(doc.createComment(' Toegevoegd door "Recente inkomsten" '));
        client.appendChild(doc.createTextNode('\n        '));
        client.appendChild(block);
        client.appendChild(doc.createTextNode('\n    '));
        return serializeXml(doc);
    }

    function buildSvbUitkeringFragment(doc, periods, brutoCent, nettoCent, cdSzWet) {
        const uv = doc.createElement('Uitkeringsverhouding');
        const start = periods[0].startYmd;
        const end = periods[periods.length - 1].endYmd;
        appendChild(uv, 'DatBUitkeringsverhouding', start);
        appendChild(uv, 'DatEUitkeringsverhouding', end);
        const sz = doc.createElement('SzWet');
        appendChild(sz, 'CdSzWet', cdSzWet || 'AOW');
        uv.appendChild(sz);
        for (const p of periods) {
            const up = doc.createElement('Uitkeringsperiode');
            appendChild(up, 'DatBUitkeringsperiode', p.startYmd);
            appendChild(up, 'DatEUitkeringsperiode', p.endYmd);
            up.appendChild(buildSvbBedrag(doc, 'BrutoUitkeringsbedr', brutoCent, p.startYmd, p.endYmd));
            up.appendChild(buildSvbBedrag(doc, 'NettoUitkeringsbedr', nettoCent, p.startYmd, p.endYmd));
            uv.appendChild(up);
        }
        return uv;
    }

    function buildSvbBedrag(doc, name, cents, startYmd, endYmd) {
        const el = doc.createElement(name);
        appendChild(el, 'CdMunteenheid', 'EUR');
        appendChild(el, 'WaardeBedr', String(cents));
        appendChild(el, 'CdUitkeringsperiode', '1');
        // Element-suffix matches the parent: BrutoUitkeringsbedr -> DatBBrutoUitkeringsbedr / DatEBrutoUitkeringsbedr
        appendChild(el, 'DatB' + name, startYmd);
        appendChild(el, 'DatE' + name, endYmd);
        return el;
    }

    function buildSvbSkeleton(person, periods, brutoCent, nettoCent, cdSzWet) {
        const xml = `<ns4:SVBPersoonsInfoResponse xmlns:ns3="http://bkwi.nl/SuwiML/FWI/v0205" xmlns:ns4="http://bkwi.nl/SuwiML/Diensten/SVBDossierPersoonGSD/v0200">
    <ClientSuwi>
        <Burgerservicenr>${escapeText(person.bsn)}</Burgerservicenr>
    </ClientSuwi>
</ns4:SVBPersoonsInfoResponse>`;
        return appendSvbUitkering(xml, periods, brutoCent, nettoCent, cdSzWet);
    }

    /* ---------- DUO Studiefinanciering: appenden of skeleton bouwen ---------- */

    function appendDuoStudiefinanciering(xml, periods) {
        const doc = parseXml(xml);
        const client = doc.getElementsByTagNameNS('*', 'ClientSuwi')[0];
        if (!client) throw new Error('ClientSuwi-element niet gevonden in DUO-bestand');
        const block = buildDuoStudiefinancieringFragment(doc, periods);
        client.appendChild(doc.createTextNode('\n        '));
        client.appendChild(doc.createComment(' Toegevoegd door "Recente inkomsten" '));
        client.appendChild(doc.createTextNode('\n        '));
        client.appendChild(block);
        client.appendChild(doc.createTextNode('\n    '));
        return serializeXml(doc);
    }

    function buildDuoStudiefinancieringFragment(doc, periods) {
        const sf = doc.createElement('Studiefinanciering');
        const start = periods[0].startYmd;
        const end = periods[periods.length - 1].endYmd;
        appendChild(sf, 'DatBToekenningsperiodeStufi', start);
        appendChild(sf, 'DatEToekenningsperiodeStufi', end);
        appendChild(sf, 'CdToekenningBasisbeursStufi', '1');
        appendChild(sf, 'IndAanvullendeBeursStufi', '2');
        appendChild(sf, 'IndToekenningWtosVo18', '2');
        return sf;
    }

    function buildDuoStudiefinancieringSkeleton(person, periods) {
        const xml = `<s60:DUOStudiefinancieringInfoResponse xmlns:s60="http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200">
    <ClientSuwi>
        <Burgerservicenr>${escapeText(person.bsn)}</Burgerservicenr>
    </ClientSuwi>
</s60:DUOStudiefinancieringInfoResponse>`;
        return appendDuoStudiefinanciering(xml, periods);
    }

    /* ---------- XML helpers (parseXml has stricter error handling than parseXmlOrNull) ---------- */

    function parseXml(xml) {
        const doc = new DOMParser().parseFromString(xml, 'application/xml');
        const err = doc.getElementsByTagName('parsererror')[0];
        if (err) throw new Error('XML-parsefout: ' + err.textContent);
        return doc;
    }

    function appendChild(parent, name, text) {
        const el = parent.ownerDocument.createElement(name);
        el.textContent = text;
        parent.appendChild(el);
    }

    function daysBetween(startYmd, endYmd) {
        const s = ymdToDate(startYmd);
        const e = ymdToDate(endYmd);
        return Math.round((e - s) / 86400000) + 1;
    }

    function ymdToDate(s) {
        return new Date(
            parseInt(s.slice(0, 4), 10),
            parseInt(s.slice(4, 6), 10) - 1,
            parseInt(s.slice(6, 8), 10),
        );
    }

    /* ==================== Validatie: UWV-inkomsten-bestand ==================== */

    /** Open-ended date marker (UWV gebruikt 99991231 / 99991230 voor "geen einddatum"). */
    function isOpenEndedYmd(s) {
        return typeof s === 'string' && s.startsWith('9999');
    }

    function isUwvIkvDoc(dom) {
        return !!(dom && dom.documentElement && dom.documentElement.localName === 'UWVPersoonsIkvInfoResponse');
    }

    /** Returns the first direct element child of `parent` with the given local name, or null. */
    function firstElementChildByName(parent, localName) {
        if (!parent) return null;
        const kids = parent.childNodes;
        for (let i = 0; i < kids.length; i++) {
            const k = kids[i];
            if (k.nodeType === 1 && k.localName === localName) return k;
        }
        return null;
    }

    /** Inspects the loaded UWV-Ikv document and returns an array of issue objects. */
    function validateUwvIkv(dom) {
        const issues = [];
        // 1. Duplicate VolgnrIkv across <Inkomstenverhouding> records.
        const ikvs = dom.getElementsByTagNameNS('*', 'Inkomstenverhouding');
        const seen = new Set();
        const dups = new Set();
        for (let i = 0; i < ikvs.length; i++) {
            const v = firstElementChildByName(ikvs[i], 'VolgnrIkv');
            if (!v) continue;
            const t = (v.textContent || '').trim();
            if (!t) continue;
            if (seen.has(t)) dups.add(t);
            else seen.add(t);
        }
        if (dups.size) {
            issues.push({
                kind: 'duplicate-volgnr',
                message: `Dubbele VolgnrIkv: ${[...dups].join(', ')}. Records ná de duplicate kunnen wegvallen in GZAC.`,
            });
        }
        // 2. PeriodeGegevensleveringIko ontbreekt of dekt de data niet.
        const expected = computeExpectedIkoPeriode(dom);
        if (expected) {
            const periode = firstElementChildByName(dom.documentElement, 'PeriodeGegevensleveringIko');
            if (!periode) {
                issues.push({
                    kind: 'periode-missing',
                    message: 'PeriodeGegevensleveringIko ontbreekt.',
                });
            } else {
                const datB = (firstElementChildByName(periode, 'DatBPeriode')?.textContent || '').trim();
                const datE = (firstElementChildByName(periode, 'DatEPeriode')?.textContent || '').trim();
                if (datB && datB > expected.min) {
                    issues.push({
                        kind: 'periode-start-too-late',
                        message: `DatBPeriode (${formatDate(datB)}) ligt na de vroegste data (${formatDate(expected.min)}).`,
                    });
                }
                if (datE && datE < expected.max) {
                    issues.push({
                        kind: 'periode-end-too-early',
                        message: `DatEPeriode (${formatDate(datE)}) ligt vóór de laatste data (${formatDate(expected.max)}).`,
                    });
                }
            }
        }
        return issues;
    }

    /**
     * Bepaalt min/max datum die `PeriodeGegevensleveringIko` zou moeten dekken,
     * op basis van alle DatB/DatE-velden binnen Inkomstenperiode/Inkomstenopgave.
     * `99991230`/`99991231`-markers (geen-einddatum) worden genegeerd.
     * Eventueel hoger eindigt op vandaag (gecapt).
     */
    function computeExpectedIkoPeriode(dom) {
        const tags = ['DatBIko', 'DatEIko', 'DatBIkp', 'DatEIkp'];
        let min = null;
        let max = null;
        for (const tag of tags) {
            const els = dom.getElementsByTagNameNS('*', tag);
            for (let i = 0; i < els.length; i++) {
                const t = (els[i].textContent || '').trim();
                if (!/^\d{8}$/.test(t)) continue;
                if (isOpenEndedYmd(t)) continue;
                if (min === null || t < min) min = t;
                if (max === null || t > max) max = t;
            }
        }
        if (min === null || max === null) return null;
        const today = ymd(new Date());
        if (max > today) max = today;
        return { min, max };
    }

    /**
     * Past auto-fixes toe op `dom` (in-place). Returnt een lijst beschrijvende strings,
     * leeg als er niets te fixen viel.
     */
    function autoFixUwvIkv(dom) {
        const fixes = [];
        // 1. VolgnrIkv hernummeren 1..N op volgorde van voorkomen.
        const ikvs = dom.getElementsByTagNameNS('*', 'Inkomstenverhouding');
        let renumbered = 0;
        for (let i = 0; i < ikvs.length; i++) {
            const target = String(i + 1);
            let v = firstElementChildByName(ikvs[i], 'VolgnrIkv');
            if (!v) {
                v = dom.createElement('VolgnrIkv');
                ikvs[i].insertBefore(v, ikvs[i].firstChild);
            }
            if ((v.textContent || '').trim() !== target) {
                v.textContent = target;
                renumbered++;
            }
        }
        if (renumbered) fixes.push(`${renumbered} VolgnrIkv hernummerd`);
        // 2. PeriodeGegevensleveringIko bijwerken.
        const periodMsg = updatePeriodeGegevensleveringIko(dom);
        if (periodMsg) fixes.push(periodMsg);
        return fixes;
    }

    /**
     * Maakt of werkt `PeriodeGegevensleveringIko` zo bij dat het de data in het bestand
     * dekt (gecapt op vandaag). Returnt een beschrijving als er iets veranderd is, anders null.
     */
    function updatePeriodeGegevensleveringIko(dom) {
        const expected = computeExpectedIkoPeriode(dom);
        if (!expected) return null;
        const root = dom.documentElement;
        let periode = firstElementChildByName(root, 'PeriodeGegevensleveringIko');
        let created = false;
        if (!periode) {
            periode = dom.createElement('PeriodeGegevensleveringIko');
            root.appendChild(periode);
            created = true;
        }
        let datB = firstElementChildByName(periode, 'DatBPeriode');
        if (!datB) {
            datB = dom.createElement('DatBPeriode');
            periode.appendChild(datB);
        }
        let datE = firstElementChildByName(periode, 'DatEPeriode');
        if (!datE) {
            datE = dom.createElement('DatEPeriode');
            periode.appendChild(datE);
        }
        const oldB = (datB.textContent || '').trim();
        const oldE = (datE.textContent || '').trim();
        datB.textContent = expected.min;
        datE.textContent = expected.max;
        if (created) {
            return `PeriodeGegevensleveringIko aangemaakt (${formatDate(expected.min)} – ${formatDate(expected.max)})`;
        }
        if (oldB !== expected.min || oldE !== expected.max) {
            return `PeriodeGegevensleveringIko bijgewerkt naar ${formatDate(expected.min)} – ${formatDate(expected.max)}`;
        }
        return null;
    }

    function maybeShowValidationBanner() {
        if (!state.dom || !isUwvIkvDoc(state.dom)) {
            hideValidationBanner();
            return;
        }
        const issues = validateUwvIkv(state.dom);
        if (!issues.length) {
            hideValidationBanner();
            return;
        }
        showValidationBanner(issues);
    }

    function showValidationBanner(issues) {
        const list = document.getElementById('validation-banner-issues');
        list.innerHTML = '';
        for (const issue of issues) {
            const li = document.createElement('li');
            li.textContent = issue.message;
            list.appendChild(li);
        }
        document.getElementById('validation-banner').hidden = false;
    }

    function hideValidationBanner() {
        const banner = document.getElementById('validation-banner');
        if (banner) banner.hidden = true;
    }

    function applyValidationAutoFix() {
        if (!state.dom) return;
        const fixes = autoFixUwvIkv(state.dom);
        if (!fixes.length) {
            setStatus('Niets te fixen.', '');
            hideValidationBanner();
            return;
        }
        pushDomToRaw();
        setStatus('Fixes toegepast (nog niet opgeslagen): ' + fixes.join('; '), 'success');
        maybeShowValidationBanner();
    }

    /* ==================== Copy modaal ==================== */

    function initCopyModal() {
        // Populate cities datalist
        const datalist = document.getElementById('cities-datalist');
        if (window.NL_GEMEENTEN) {
            datalist.innerHTML = window.NL_GEMEENTEN
                .map(c => `<option value="${escapeAttr(c.name)}" data-code="${escapeAttr(c.code)}"/>`)
                .join('');
        }

        document.getElementById('copy-modal-close').addEventListener('click', closeCopyModal);
        document.getElementById('copy-cancel').addEventListener('click', closeCopyModal);
        document.getElementById('copy-modal').addEventListener('click', e => {
            if (e.target.id === 'copy-modal') closeCopyModal();
        });
        document.getElementById('copy-bsn-gen').addEventListener('click', generateBsn);
        document.getElementById('copy-bsn').addEventListener('input', validateBsnInput);
        document.getElementById('copy-anr-toggle').addEventListener('change', e => {
            document.getElementById('copy-anr-row').hidden = !e.target.checked;
        });
        document.getElementById('copy-name-toggle').addEventListener('change', e => {
            document.getElementById('copy-name-rows').hidden = !e.target.checked;
        });
        document.getElementById('copy-stad').addEventListener('input', e => {
            const m = (window.NL_GEMEENTEN || []).find(c => c.name === e.target.value);
            if (m) document.getElementById('copy-gemeentecode').value = m.code;
        });
        document.getElementById('copy-submit').addEventListener('click', submitCopy);
    }

    function openCopyModal() {
        const p = state.persons.find(x => x.bsn === state.selectedPerson);
        if (!p) return;

        document.getElementById('copy-source').textContent =
            `Bron: ${p.naam || '—'} (BSN ${p.bsn})`;
        document.getElementById('copy-bsn').value = '';
        document.getElementById('bsn-validation').textContent = '';
        document.getElementById('copy-anr-toggle').checked = false;
        document.getElementById('copy-anr-row').hidden = true;
        document.getElementById('copy-anr').value = '';
        document.getElementById('copy-name-toggle').checked = false;
        document.getElementById('copy-name-rows').hidden = true;
        document.getElementById('copy-voornamen').value = '';
        document.getElementById('copy-voorvoegsel').value = '';
        document.getElementById('copy-achternaam').value = '';
        document.getElementById('copy-stad').value = '';
        document.getElementById('copy-gemeentecode').value = '';
        document.getElementById('copy-straat').value = '';
        document.getElementById('copy-huisnr').value = '';
        document.getElementById('copy-postcd').value = '';
        document.querySelector('input[name=conflict][value=ABORT]').checked = true;
        document.getElementById('copy-status').textContent = '';

        const filesDiv = document.getElementById('copy-files');
        filesDiv.innerHTML = p.files.slice().sort().map(fn =>
            `<label class="checkbox-line"><input type="checkbox" value="${escapeAttr(fn)}" checked/> ${escapeText(fn)}</label>`
        ).join('');

        document.getElementById('copy-modal').hidden = false;
        document.getElementById('copy-bsn').focus();
    }

    function closeCopyModal() {
        document.getElementById('copy-modal').hidden = true;
    }

    function generateBsn() {
        fetch(`${API}/test-bsn`).then(r => r.json()).then(d => {
            const input = document.getElementById('copy-bsn');
            input.value = d.bsn;
            validateBsnInput();
        }).catch(e => {
            document.getElementById('copy-status').textContent = 'BSN-generator faalde: ' + e.message;
        });
    }

    function bsnIsValid(bsn) {
        if (!/^\d{9}$/.test(bsn)) return false;
        let sum = 0;
        for (let i = 0; i < 9; i++) {
            const w = i === 8 ? -1 : 9 - i;
            sum += parseInt(bsn[i], 10) * w;
        }
        return sum % 11 === 0;
    }

    function validateBsnInput() {
        const v = document.getElementById('copy-bsn').value;
        const hint = document.getElementById('bsn-validation');
        if (!v) { hint.textContent = ''; hint.className = 'hint'; return; }
        if (bsnIsValid(v)) {
            hint.textContent = '✓ elfproef OK';
            hint.className = 'hint success';
        } else {
            hint.textContent = 'voldoet niet aan elfproef';
            hint.className = 'hint error';
        }
    }

    async function submitCopy() {
        const status = document.getElementById('copy-status');
        const sourceBsn = state.selectedPerson;
        const targetBsn = document.getElementById('copy-bsn').value.trim();
        if (!bsnIsValid(targetBsn)) {
            status.textContent = 'Doel-BSN voldoet niet aan elfproef.';
            status.className = 'status error';
            return;
        }
        const includeFiles = Array.from(
            document.querySelectorAll('#copy-files input[type=checkbox]:checked')
        ).map(c => c.value);
        if (includeFiles.length === 0) {
            status.textContent = 'Kies minstens één bestand.';
            status.className = 'status error';
            return;
        }

        const newAddress = {
            straatnaam: document.getElementById('copy-straat').value.trim(),
            huisnr: document.getElementById('copy-huisnr').value.trim(),
            postcd: document.getElementById('copy-postcd').value.trim(),
            woonplaatsnaam: document.getElementById('copy-stad').value.trim(),
            gemeentecode: document.getElementById('copy-gemeentecode').value.trim(),
        };
        const missing = Object.entries(newAddress).filter(([_, v]) => !v).map(([k]) => k);
        if (missing.length) {
            status.textContent = 'Adres incompleet: ' + missing.join(', ');
            status.className = 'status error';
            return;
        }

        const useName = document.getElementById('copy-name-toggle').checked;
        const useAnr = document.getElementById('copy-anr-toggle').checked;
        const conflictMode = document.querySelector('input[name=conflict]:checked').value;

        const body = {
            sourceBsn,
            targetBsn,
            newAnr: useAnr ? document.getElementById('copy-anr').value.trim() : null,
            newName: useName ? {
                voornamen: document.getElementById('copy-voornamen').value,
                voorvoegsel: document.getElementById('copy-voorvoegsel').value,
                achternaam: document.getElementById('copy-achternaam').value,
            } : null,
            newAddress,
            includeFiles,
            conflictMode,
        };

        status.textContent = 'Bezig met kopiëren...';
        status.className = 'status';

        try {
            let res = await postClone(body);
            if (res.status === 409) {
                const data = await res.json();
                const choice = await chooseConflictAction(data.conflicts || []);
                if (!choice) {
                    status.textContent = 'Geannuleerd vanwege conflicten.';
                    status.className = 'status error';
                    return;
                }
                body.conflictMode = choice;
                res = await postClone(body);
            }
            if (!res.ok) {
                const err = await res.json().catch(() => ({}));
                throw new Error(err.error || (res.status + ' ' + res.statusText));
            }
            const result = await res.json();
            const summary = `Aangemaakt: ${result.created.length}, overschreven: ${result.overwritten.length}, ` +
                `overgeslagen: ${result.skipped.length}, fouten: ${result.errors.length}`;
            status.textContent = summary;
            status.className = result.errors.length ? 'status error' : 'status success';
            if (result.errors.length === 0) {
                setTimeout(closeCopyModal, 800);
            }
            await loadIndex();
        } catch (e) {
            status.textContent = 'Mislukt: ' + e.message;
            status.className = 'status error';
        }
    }

    function postClone(body) {
        return fetch(`${API}/clone`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(body),
        });
    }

    /** Shows the conflict modal and resolves with 'OVERWRITE', 'SKIP', or null (cancel). */
    function chooseConflictAction(conflicts) {
        const modal = document.getElementById('conflict-modal');
        const list = document.getElementById('conflict-list');
        list.innerHTML = '';
        for (const fn of conflicts) {
            const li = document.createElement('li');
            li.textContent = fn;
            list.appendChild(li);
        }
        modal.hidden = false;

        return new Promise(resolve => {
            const overwriteBtn = document.getElementById('conflict-overwrite');
            const skipBtn = document.getElementById('conflict-skip');
            const cancelBtn = document.getElementById('conflict-cancel');
            const closeBtn = document.getElementById('conflict-modal-close');
            const close = (choice) => {
                modal.hidden = true;
                overwriteBtn.removeEventListener('click', onOverwrite);
                skipBtn.removeEventListener('click', onSkip);
                cancelBtn.removeEventListener('click', onCancel);
                closeBtn.removeEventListener('click', onCancel);
                modal.removeEventListener('click', onBackdrop);
                resolve(choice);
            };
            const onOverwrite = () => close('OVERWRITE');
            const onSkip = () => close('SKIP');
            const onCancel = () => close(null);
            const onBackdrop = (e) => { if (e.target === modal) close(null); };
            overwriteBtn.addEventListener('click', onOverwrite);
            skipBtn.addEventListener('click', onSkip);
            cancelBtn.addEventListener('click', onCancel);
            closeBtn.addEventListener('click', onCancel);
            modal.addEventListener('click', onBackdrop);
        });
    }

    /* ---------- In-file search: shared controller ---------- */

    /**
     * Wires up an in-file search bar (input + prev/next/clear buttons + autocomplete).
     * The state object must expose a writable `query` string. onApply runs after every
     * query change. onMove receives +1 or -1 for next/previous (Enter / Shift+Enter and buttons).
     */
    function initSearchController({ ids, state, autocompleteValues, onApply, onMove, trim = true }) {
        const input = document.getElementById(ids.input);
        const prev = document.getElementById(ids.prev);
        const next = document.getElementById(ids.next);
        const clear = document.getElementById(ids.clear);

        const setQuery = (value) => {
            state.query = trim ? value.trim() : value;
            clear.hidden = !state.query;
        };

        input.addEventListener('input', () => {
            setQuery(input.value);
            onApply();
        });
        input.addEventListener('keydown', (e) => {
            if (e.key === 'Enter') {
                if (autocomplete.input === input && autocomplete.idx >= 0) return;
                onMove(e.shiftKey ? -1 : 1);
                e.preventDefault();
            } else if (e.key === 'Escape') {
                input.value = '';
                setQuery('');
                onApply();
            }
        });
        prev.addEventListener('click', () => onMove(-1));
        next.addEventListener('click', () => onMove(1));
        clear.addEventListener('click', () => {
            input.value = '';
            setQuery('');
            onApply();
            input.focus();
        });

        attachAutocomplete(input, autocompleteValues);
    }

    /* ---------- In-file search: form pane ---------- */

    const formSearch = {
        query: '',
        matches: [],
        idx: -1,
        labels: [],
    };

    function initFormSearch() {
        initSearchController({
            ids: { input: 'form-search', prev: 'form-search-prev', next: 'form-search-next', clear: 'form-search-clear' },
            state: formSearch,
            autocompleteValues: formSearch.labels,
            onApply: applyFormSearch,
            onMove: formSearchMove,
            trim: true,
        });
        updateFormSearchCount();
    }

    function refreshFormSearch() {
        const labels = new Set();
        document.querySelectorAll('#form-fields .form-field > label').forEach(label => {
            const first = label.firstChild;
            const friendlyTxt = first && first.nodeType === 3 ? (first.nodeValue || '').trim() : '';
            if (friendlyTxt) labels.add(friendlyTxt);
            const fn = label.querySelector('.field-name');
            if (fn && fn.textContent.trim()) labels.add(fn.textContent.trim());
        });
        document.querySelectorAll('#form-fields .form-card-header, #form-fields .form-list-header').forEach(h => {
            const txt = h.textContent.trim().replace(/^▾\s*/, '').replace(/\s+\d+$/, '').trim();
            if (txt) labels.add(txt);
        });
        formSearch.labels.length = 0;
        for (const l of labels) formSearch.labels.push(l);
        formSearch.labels.sort((a, b) => a.localeCompare(b, 'nl'));

        applyFormSearch();
        refreshRawSearchVocab();
    }

    function applyFormSearch() {
        const fields = document.getElementById('form-fields');
        if (!fields) return;
        fields.querySelectorAll('.search-hit, .search-hit-current, .search-faded').forEach(el => {
            el.classList.remove('search-hit', 'search-hit-current', 'search-faded');
        });

        const q = formSearch.query.toLowerCase();
        if (!q) {
            fields.classList.remove('searching');
            formSearch.matches = [];
            formSearch.idx = -1;
            updateFormSearchCount();
            return;
        }

        fields.classList.add('searching');
        const matches = [];

        fields.querySelectorAll('.form-field').forEach(field => {
            const label = field.querySelector('label');
            const labelText = label ? label.textContent.toLowerCase() : '';
            const input = field.querySelector('input');
            const valueText = input ? input.value.toLowerCase() : '';
            if (labelText.includes(q) || valueText.includes(q)) {
                field.classList.add('search-hit');
                matches.push(field);
            }
        });

        fields.querySelectorAll('.form-card, .form-list').forEach(card => {
            const headerSel = card.classList.contains('form-card') ? '.form-card-header' : '.form-list-header';
            const header = card.querySelector(':scope > ' + headerSel);
            if (!header) return;
            if (header.textContent.toLowerCase().includes(q)) {
                card.classList.add('search-hit');
                matches.push(card);
            }
        });

        fields.querySelectorAll('.form-card, .form-list').forEach(card => {
            if (card.classList.contains('search-hit')) return;
            if (!card.querySelector('.search-hit')) {
                card.classList.add('search-faded');
            }
        });

        formSearch.matches = matches;
        formSearch.idx = matches.length > 0 ? 0 : -1;
        if (formSearch.idx >= 0) markCurrentFormHit();
        updateFormSearchCount();
    }

    function markCurrentFormHit() {
        document.querySelectorAll('#form-fields .search-hit-current').forEach(el => {
            el.classList.remove('search-hit-current');
        });
        if (formSearch.idx < 0) return;
        const el = formSearch.matches[formSearch.idx];
        if (!el) return;
        el.classList.add('search-hit-current');
        let cur = el.parentElement;
        while (cur && cur.id !== 'form-fields') {
            if (cur.classList.contains('collapsed')) cur.classList.remove('collapsed');
            cur = cur.parentElement;
        }
        el.scrollIntoView({ block: 'center', behavior: 'smooth' });
    }

    function formSearchMove(delta) {
        if (formSearch.matches.length === 0) return;
        formSearch.idx = (formSearch.idx + delta + formSearch.matches.length) % formSearch.matches.length;
        markCurrentFormHit();
        updateFormSearchCount();
    }

    function updateFormSearchCount() {
        const count = document.getElementById('form-search-count');
        const prev = document.getElementById('form-search-prev');
        const next = document.getElementById('form-search-next');
        const total = formSearch.matches.length;
        if (!formSearch.query) {
            count.textContent = '';
            count.classList.remove('no-match');
            prev.disabled = next.disabled = true;
            return;
        }
        if (total === 0) {
            count.textContent = 'geen';
            count.classList.add('no-match');
        } else {
            count.textContent = `${formSearch.idx + 1} / ${total}`;
            count.classList.remove('no-match');
        }
        prev.disabled = next.disabled = total === 0;
    }

    /* ---------- In-file search: raw XML pane ---------- */

    const rawSearch = {
        query: '',
        marks: [],
        idx: -1,
        names: [],
    };

    function initRawSearch() {
        initSearchController({
            ids: { input: 'raw-search', prev: 'raw-search-prev', next: 'raw-search-next', clear: 'raw-search-clear' },
            state: rawSearch,
            autocompleteValues: rawSearch.names,
            onApply: applyRawSearch,
            onMove: rawSearchMove,
            trim: false,
        });
        updateRawSearchCount();
    }

    function refreshRawSearchVocab() {
        const names = new Set();
        if (state.dom) {
            const all = state.dom.getElementsByTagName('*');
            for (let i = 0; i < all.length; i++) {
                const el = all[i];
                if (el.localName) names.add(el.localName);
                for (const a of Array.from(el.attributes)) {
                    if (a.name) names.add(a.name);
                }
            }
        }
        rawSearch.names.length = 0;
        for (const n of names) rawSearch.names.push(n);
        rawSearch.names.sort((a, b) => a.localeCompare(b, 'nl'));
    }

    function clearRawMarks() {
        for (const m of rawSearch.marks) m.clear();
        rawSearch.marks = [];
        rawSearch.idx = -1;
    }

    function applyRawSearch() {
        if (!state.editor) return;
        clearRawMarks();

        const q = rawSearch.query;
        if (!q) {
            updateRawSearchCount();
            return;
        }

        const cm = state.editor;
        if (typeof cm.getSearchCursor !== 'function') {
            updateRawSearchCount();
            return;
        }
        const cursor = cm.getSearchCursor(q, { line: 0, ch: 0 }, { caseFold: true });
        while (cursor.findNext()) {
            const from = cursor.from(), to = cursor.to();
            const mark = cm.markText(from, to, { className: 'cm-search-hit' });
            rawSearch.marks.push(mark);
        }

        if (rawSearch.marks.length > 0) {
            rawSearch.idx = 0;
            highlightCurrentRawHit();
        }
        updateRawSearchCount();
    }

    function highlightCurrentRawHit() {
        if (!state.editor || rawSearch.idx < 0) return;
        const cm = state.editor;
        for (let i = 0; i < rawSearch.marks.length; i++) {
            const m = rawSearch.marks[i];
            const r = m.find();
            if (!r) continue;
            m.clear();
            rawSearch.marks[i] = cm.markText(r.from, r.to, {
                className: i === rawSearch.idx ? 'cm-search-hit cm-search-hit-current' : 'cm-search-hit',
            });
        }
        const range = rawSearch.marks[rawSearch.idx].find();
        if (range) {
            cm.scrollIntoView({ from: range.from, to: range.to }, 100);
        }
    }

    function rawSearchMove(delta) {
        if (rawSearch.marks.length === 0) return;
        rawSearch.idx = (rawSearch.idx + delta + rawSearch.marks.length) % rawSearch.marks.length;
        highlightCurrentRawHit();
        updateRawSearchCount();
    }

    function updateRawSearchCount() {
        const count = document.getElementById('raw-search-count');
        const prev = document.getElementById('raw-search-prev');
        const next = document.getElementById('raw-search-next');
        const total = rawSearch.marks.length;
        if (!rawSearch.query) {
            count.textContent = '';
            count.classList.remove('no-match');
            prev.disabled = next.disabled = true;
            return;
        }
        if (total === 0) {
            count.textContent = 'geen';
            count.classList.add('no-match');
        } else {
            count.textContent = `${rawSearch.idx + 1} / ${total}`;
            count.classList.remove('no-match');
        }
        prev.disabled = next.disabled = total === 0;
    }

    /* ===================== Test feature =====================
     * Backend: /admin/responses/test/catalog (GET), /admin/responses/test (POST),
     *          /admin/responses/test/person (POST). The catalog drives the dropdowns
     *          in test-mode; the single + person endpoints fire SOAP requests through
     *          the simulator's own /ws/... endpoints and return canonicalized expected/actual
     *          XML for diffing.
     */

    const TEST = {
        catalog: null,
        catalogPromise: null,
    };

    const OUTCOME_META = {
        MATCH:             { icon: '✓', cls: 'match',     label: 'Match' },
        MISMATCH:          { icon: '⚠', cls: 'mismatch',  label: 'Verschil' },
        NIET_GEVONDEN:     { icon: '✗', cls: 'not-found', label: 'Niet gevonden' },
        NO_EXPECTED_FILE:  { icon: '?', cls: 'no-file',   label: 'Geen file' },
        OK:                { icon: '✓', cls: 'ok',        label: 'OK' },
        HTTP_FAILURE:      { icon: '!', cls: 'fail',      label: 'HTTP fout' },
        TRANSPORT_FAILURE: { icon: '!', cls: 'fail',      label: 'Verbinding mislukt' },
    };

    async function loadTestCatalog() {
        if (TEST.catalog) return TEST.catalog;
        if (!TEST.catalogPromise) {
            TEST.catalogPromise = fetch(`${API}/test/catalog`)
                .then(r => {
                    if (!r.ok) throw new Error('catalog HTTP ' + r.status);
                    return r.json();
                })
                .then(data => {
                    TEST.catalog = data.operations || [];
                    return TEST.catalog;
                });
        }
        return TEST.catalogPromise;
    }

    function findCatalogOp(dienst, operatie) {
        return (TEST.catalog || []).find(o => o.dienst === dienst && o.operatie === operatie);
    }

    async function runSingleTest(dienst, operatie, keys, compareToFile) {
        const res = await fetch(`${API}/test`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ dienst, operatie, keys, compareToFile }),
        });
        if (!res.ok) {
            const t = await res.text();
            throw new Error(`HTTP ${res.status}: ${t || res.statusText}`);
        }
        return res.json();
    }

    async function runPersonTest(bsn, compareToFile) {
        const res = await fetch(`${API}/test/person`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ bsn, compareToFile }),
        });
        if (!res.ok) {
            const t = await res.text();
            throw new Error(`HTTP ${res.status}: ${t || res.statusText}`);
        }
        const data = await res.json();
        return data.results || [];
    }

    /** O(m·n) LCS line diff — fine for canonicalized XML responses (typically < 2k lines). */
    function lineDiff(a, b) {
        const A = (a || '').split('\n');
        const B = (b || '').split('\n');
        const m = A.length, n = B.length;
        const dp = Array.from({ length: m + 1 }, () => new Int32Array(n + 1));
        for (let i = m - 1; i >= 0; i--) {
            for (let j = n - 1; j >= 0; j--) {
                if (A[i] === B[j]) dp[i][j] = dp[i + 1][j + 1] + 1;
                else dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
            }
        }
        const out = [];
        let i = 0, j = 0;
        while (i < m && j < n) {
            if (A[i] === B[j]) { out.push({ type: 'eq', text: A[i] }); i++; j++; }
            else if (dp[i + 1][j] >= dp[i][j + 1]) { out.push({ type: 'del', text: A[i] }); i++; }
            else { out.push({ type: 'add', text: B[j] }); j++; }
        }
        while (i < m) out.push({ type: 'del', text: A[i++] });
        while (j < n) out.push({ type: 'add', text: B[j++] });
        return out;
    }

    function renderDiff(expected, actual) {
        if (!expected && !actual) {
            return '<div class="test-diff-empty muted">Geen content om te diffen.</div>';
        }
        if (!expected) {
            return '<div class="test-diff-empty muted">Geen verwacht-XML beschikbaar — alleen response getoond:</div>'
                + `<pre class="test-pre">${escapeText(actual || '')}</pre>`;
        }
        const ops = lineDiff(expected, actual);
        if (ops.every(o => o.type === 'eq')) {
            return '<div class="test-diff-empty success">✓ Identiek (na canonicalisatie)</div>';
        }
        return '<div class="test-diff">' + ops.map(o => {
            const cls = o.type === 'eq' ? 'eq' : (o.type === 'add' ? 'add' : 'del');
            const prefix = o.type === 'eq' ? '  ' : (o.type === 'add' ? '+ ' : '- ');
            return `<div class="test-diff-line test-diff-${cls}">${escapeText(prefix + o.text)}</div>`;
        }).join('') + '</div>';
    }

    let testResultIdSeq = 0;

    function renderTestResult(result, container) {
        const meta = OUTCOME_META[result.outcome] || OUTCOME_META.OK;
        const id = 'tr-' + (++testResultIdSeq);
        const keyDesc = (result.keyValues || []).join(' / ');
        const errorBlock = result.errorMessage
            ? `<div class="test-error">${escapeText(result.errorMessage)}</div>`
            : '';
        const fileLine = result.expectedFile
            ? `<div class="test-meta-line">Verwachte file: <code>${escapeText(result.expectedFile)}</code> — ${result.expectedFileExists ? 'aanwezig' : 'ontbreekt'}</div>`
            : '';
        const expectedDisplay = result.expectedXml
            || (result.expectedFileExists ? '(leeg)' : '(geen file op disk)');
        container.innerHTML = `
            <div class="test-result test-result-${meta.cls}" data-id="${id}">
                <div class="test-result-header">
                    <span class="test-status test-status-${meta.cls}" title="${escapeAttr(result.outcome)}">${meta.icon} ${meta.label}</span>
                    <span class="test-result-title">${escapeText(result.dienst)} · ${escapeText(result.operatie)} · <code>${escapeText(keyDesc)}</code></span>
                    <span class="test-result-meta muted small">HTTP ${result.httpStatus} · ${result.durationMs}ms</span>
                </div>
                ${errorBlock}
                ${fileLine}
                <div class="test-result-tabs">
                    <button type="button" data-tab="diff" class="active">Diff</button>
                    <button type="button" data-tab="actual">Response</button>
                    <button type="button" data-tab="expected">Verwacht</button>
                    <button type="button" data-tab="request">Request</button>
                </div>
                <div class="test-result-tab-content" data-tab-content="diff">${renderDiff(result.expectedXml, result.actualXml)}</div>
                <div class="test-result-tab-content" data-tab-content="actual" hidden><pre class="test-pre">${escapeText(result.actualXml || '(leeg)')}</pre></div>
                <div class="test-result-tab-content" data-tab-content="expected" hidden><pre class="test-pre">${escapeText(expectedDisplay)}</pre></div>
                <div class="test-result-tab-content" data-tab-content="request" hidden><pre class="test-pre">${escapeText(result.requestEnvelope || '')}</pre></div>
            </div>
        `;
        container.querySelectorAll(`[data-id="${id}"] .test-result-tabs button`).forEach(btn => {
            btn.addEventListener('click', () => {
                const root = container.querySelector(`[data-id="${id}"]`);
                root.querySelectorAll('.test-result-tabs button').forEach(b => b.classList.remove('active'));
                btn.classList.add('active');
                const tab = btn.dataset.tab;
                root.querySelectorAll('.test-result-tab-content').forEach(el => {
                    el.hidden = el.dataset.tabContent !== tab;
                });
            });
        });
    }

    function renderTestResultsList(results, container) {
        container.innerHTML = '';
        if (!results.length) {
            container.innerHTML = '<div class="test-result-empty muted">Geen resultaten.</div>';
            return;
        }
        const counts = results.reduce((m, r) => (m[r.outcome] = (m[r.outcome] || 0) + 1, m), {});
        const summary = Object.entries(counts).map(([k, v]) => {
            const meta = OUTCOME_META[k] || OUTCOME_META.OK;
            return `<span class="test-summary-pill test-summary-${meta.cls}">${meta.icon} ${meta.label}: ${v}</span>`;
        }).join(' ');
        const wrap = document.createElement('div');
        wrap.className = 'test-results-list';
        wrap.innerHTML = `<div class="test-results-summary">${summary}</div>`;
        results.forEach(r => {
            const child = document.createElement('div');
            child.className = 'test-result-wrap';
            renderTestResult(r, child);
            wrap.appendChild(child);
        });
        container.appendChild(wrap);
    }

    /* --- (B) "Test"-knop in detail-pane: roundtrip-test op het geselecteerde bestand --- */

    async function onTestFileClick() {
        const filename = state.selected;
        if (!filename) return;
        const file = state.all.find(f => f.filename === filename);
        if (!file) return;
        if (file.isRequest) {
            alert('Test op request-bestanden wordt niet ondersteund — alleen response-bestanden.');
            return;
        }
        try {
            await loadTestCatalog();
        } catch (e) {
            alert('Kon catalogus niet laden: ' + e.message);
            return;
        }
        const op = findCatalogOp(file.dienst, file.operatie);
        if (!op) {
            alert(`Onbekende dienst/operatie: ${file.dienst} / ${file.operatie}`);
            return;
        }
        let keys;
        if (op.keys.length === 1) {
            keys = [file.sleutel || ''];
        } else {
            const parts = (file.sleutel || '').split('_');
            if (parts.length !== op.keys.length) {
                alert(`Sleutel '${file.sleutel}' kan niet worden opgesplitst voor ${op.keys.length} velden.`);
                return;
            }
            keys = parts;
        }
        openTestResultModal(`Test: ${filename}`, () => runSingleTest(file.dienst, file.operatie, keys, true));
    }

    function openTestResultModal(title, runner) {
        const modal = document.getElementById('test-result-modal');
        const body = document.getElementById('test-result-modal-body');
        document.getElementById('test-result-modal-title').textContent = title;
        body.innerHTML = '<div class="test-result-loading">⏳ Verzenden…</div>';
        modal.hidden = false;
        runner()
            .then(result => renderTestResult(result, body))
            .catch(e => { body.innerHTML = `<div class="test-error">${escapeText(e.message)}</div>`; });
    }

    function closeTestResultModal() {
        document.getElementById('test-result-modal').hidden = true;
    }

    /* --- (A) "Test alle diensten" in person-detail: stuur alle BSN-keyed ops --- */

    async function onTestPersonClick() {
        const bsn = state.selectedPerson;
        if (!bsn) return;
        const personBody = document.getElementById('person-body');
        let panel = personBody.querySelector('.person-test-panel');
        if (panel) panel.remove();
        panel = document.createElement('div');
        panel.className = 'person-test-panel';
        panel.innerHTML = `
            <div class="person-test-header">
                <h3>Test alle diensten</h3>
                <span class="muted small">SOAP-roundtrip per dienst voor BSN ${escapeText(bsn)}</span>
                <button type="button" class="secondary-btn person-test-close">Sluiten</button>
            </div>
            <div class="person-test-body"><div class="test-result-loading">⏳ Test loopt…</div></div>`;
        personBody.prepend(panel);
        panel.querySelector('.person-test-close').addEventListener('click', () => panel.remove());

        try {
            const results = await runPersonTest(bsn, true);
            renderTestResultsList(results, panel.querySelector('.person-test-body'));
        } catch (e) {
            panel.querySelector('.person-test-body').innerHTML =
                `<div class="test-error">${escapeText(e.message)}</div>`;
        }
    }

    /* --- (C) Test-mode: ad-hoc form met alle catalog-operations --- */

    async function onEnterTestMode() {
        let ops;
        try {
            ops = await loadTestCatalog();
        } catch (e) {
            document.getElementById('test-form-status').textContent = 'Catalog laden mislukt: ' + e.message;
            return;
        }
        const dienstSelect = document.getElementById('test-dienst');
        if (!dienstSelect.options.length) {
            const unique = [...new Set(ops.map(o => o.dienst))];
            dienstSelect.innerHTML = unique
                .map(d => `<option value="${escapeAttr(d)}">${escapeText(d)}</option>`).join('');
            refreshTestOperatieDropdown();
        }
    }

    function refreshTestOperatieDropdown() {
        const dienst = document.getElementById('test-dienst').value;
        const ops = (TEST.catalog || []).filter(o => o.dienst === dienst);
        const opSelect = document.getElementById('test-operatie');
        opSelect.innerHTML = ops
            .map(o => `<option value="${escapeAttr(o.operatie)}">${escapeText(o.operatie)}</option>`)
            .join('');
        refreshTestKeyFields();
    }

    function refreshTestKeyFields() {
        const dienst = document.getElementById('test-dienst').value;
        const operatie = document.getElementById('test-operatie').value;
        const op = findCatalogOp(dienst, operatie);
        const container = document.getElementById('test-key-fields');
        if (!op) { container.innerHTML = ''; return; }
        container.innerHTML = op.keys.map((k, i) => `
            <label>${escapeText(k.label)}
                <input type="text" data-key-index="${i}" placeholder="${escapeAttr(k.hint || '')}"/>
            </label>
        `).join('');
    }

    async function onRunAdHocTest() {
        const dienst = document.getElementById('test-dienst').value;
        const operatie = document.getElementById('test-operatie').value;
        const inputs = document.querySelectorAll('#test-key-fields input[data-key-index]');
        const keys = Array.from(inputs).map(i => i.value.trim());
        const status = document.getElementById('test-form-status');
        if (keys.length === 0 || keys.some(k => !k)) {
            status.textContent = 'Vul alle sleutels in.';
            status.className = 'status error';
            return;
        }
        const compare = document.getElementById('test-compare-toggle').checked;
        status.textContent = '⏳ Verzenden…';
        status.className = 'status';
        const result = document.getElementById('test-form-result');
        result.innerHTML = '';
        try {
            const r = await runSingleTest(dienst, operatie, keys, compare);
            renderTestResult(r, result);
            status.textContent = '';
            status.className = 'status';
        } catch (e) {
            status.textContent = e.message;
            status.className = 'status error';
        }
    }

    function wireTestUi() {
        const fileBtn = document.getElementById('test-file-btn');
        if (fileBtn) fileBtn.addEventListener('click', onTestFileClick);
        const personBtn = document.getElementById('test-person-btn');
        if (personBtn) personBtn.addEventListener('click', onTestPersonClick);
        const closeBtn = document.getElementById('test-result-modal-close');
        if (closeBtn) closeBtn.addEventListener('click', closeTestResultModal);
        const okBtn = document.getElementById('test-result-modal-ok');
        if (okBtn) okBtn.addEventListener('click', closeTestResultModal);
        const dSel = document.getElementById('test-dienst');
        if (dSel) dSel.addEventListener('change', refreshTestOperatieDropdown);
        const oSel = document.getElementById('test-operatie');
        if (oSel) oSel.addEventListener('change', refreshTestKeyFields);
        const runBtn = document.getElementById('test-run-btn');
        if (runBtn) runBtn.addEventListener('click', onRunAdHocTest);
    }

    document.addEventListener('DOMContentLoaded', wireTestUi);
})();
