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
    };

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
        initResizer();
        initRawResizer();
        initCopyModal();
        setupAutocompletePopup();
        initFormSearch();
        initRawSearch();

        loadIndex();
    });

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
            state.all = data.files;
            state.persons = groupByBsn(state.all);
            document.getElementById('basedir').textContent = data.baseDir;
            populateColumnFilters();
            applyFilter();
        } catch (e) {
            alert('Kon index niet laden: ' + e.message);
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
            return `<tr class="${selectedClass}" data-filename="${escapeAttr(f.filename)}">
                <td><span class="dienst-pill ${dienstClass(f.dienst)}">${escapeText(f.dienst)}</span>${reqPill}</td>
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
        // Reset right pane
        document.getElementById('detail').hidden = true;
        document.getElementById('person-detail').hidden = true;
        document.getElementById('empty-state').hidden = false;
        document.getElementById('empty-state').textContent = mode === 'persons'
            ? 'Selecteer een persoon links.'
            : 'Selecteer een bestand links.';
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
            return `<tr class="${selectedClass}" data-bsn="${escapeAttr(p.bsn)}">
                <td>${escapeText(p.bsn)}</td>
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
            row.innerHTML = `<span class="dienst-pill ${dienstClass(file ? file.dienst : '')}">${escapeText(file ? file.dienst : '')}</span>
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
        loondienst:   { bruto: 200000, netto: null,   showNetto: false },
        uwvuitkering: { bruto: 150000, netto: null,   showNetto: false },
        onbekend:     { bruto: 150000, netto: null,   showNetto: false },
        svbuitkering: { bruto: 240000, netto: 205000, showNetto: true  },
    };

    function buildQuickIncomePanel(person) {
        const tpl = document.getElementById('quick-income-template');
        const node = tpl.content.firstElementChild.cloneNode(true);
        const typeSel = node.querySelector('[data-qi="type"]');
        const brutoInp = node.querySelector('[data-qi="bruto"]');
        const nettoInp = node.querySelector('[data-qi="netto"]');
        const nettoRow = node.querySelector('[data-qi-netto-row]');
        const werkgeverInp = node.querySelector('[data-qi="werkgever"]');
        const werkgeverRow = node.querySelector('[data-qi-werkgever-row]');
        const submitBtn = node.querySelector('[data-qi="submit"]');
        const statusEl = node.querySelector('[data-qi="status"]');

        const applyType = () => {
            const def = QI_DEFAULTS[typeSel.value];
            brutoInp.value = (def.bruto / 100).toFixed(2);
            nettoRow.hidden = !def.showNetto;
            if (def.showNetto) nettoInp.value = (def.netto / 100).toFixed(2);
            werkgeverRow.hidden = def.showNetto; // SVB has no employer field
            if (!def.showNetto) werkgeverInp.value = uwvIkvSpec(typeSel.value).naamAeh;
        };
        applyType();
        typeSel.addEventListener('change', applyType);

        submitBtn.addEventListener('click', async () => {
            const months = parseInt(node.querySelector('[data-qi="months"]').value, 10);
            const brutoCent = Math.round(parseFloat(brutoInp.value) * 100);
            const nettoCent = QI_DEFAULTS[typeSel.value].showNetto
                ? Math.round(parseFloat(nettoInp.value) * 100) : null;
            const werkgever = QI_DEFAULTS[typeSel.value].showNetto ? null : werkgeverInp.value.trim();
            if (!Number.isFinite(months) || months < 1 || months > 12) {
                setQiStatus(statusEl, 'Aantal maanden moet tussen 1 en 12 zijn.', 'error');
                return;
            }
            if (!Number.isFinite(brutoCent) || brutoCent < 0) {
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
            submitBtn.disabled = true;
            setQiStatus(statusEl, 'Bezig…', '');
            try {
                await submitQuickIncome(person, typeSel.value, months, brutoCent, nettoCent, werkgever);
                setQiStatus(statusEl, 'Toegevoegd. Index wordt herladen…', 'success');
                await loadIndex();
                // Re-select the same person so the new file (if any) appears in the list.
                if (state.persons.find(x => x.bsn === person.bsn)) selectPerson(person.bsn);
            } catch (e) {
                setQiStatus(statusEl, 'Mislukt: ' + e.message, 'error');
            } finally {
                submitBtn.disabled = false;
            }
        });
        return node;
    }

    function setQiStatus(el, msg, kind) {
        el.textContent = msg;
        el.className = 'quick-income-status' + (kind ? ' ' + kind : '');
    }

    async function submitQuickIncome(person, type, months, brutoCent, nettoCent, werkgever) {
        const periods = monthlyPeriods(new Date(), months);
        if (type === 'svbuitkering') {
            const filename = `SVBDossierPersoonGSD_SVBPersoonsInfo_${person.bsn}.xml`;
            const existing = await fetchXmlIfExists(filename);
            if (existing) {
                const updated = appendSvbUitkering(existing, periods, brutoCent, nettoCent);
                await putXml(filename, updated);
            } else {
                const skeleton = buildSvbSkeleton(person, periods, brutoCent, nettoCent);
                await postXml(filename, skeleton);
            }
        } else {
            const filename = `UWVDossierInkomstenGSD_UWVPersoonsIkvInfo_${person.bsn}.xml`;
            const existing = await fetchXmlIfExists(filename);
            if (existing) {
                const updated = appendUwvInkomstenverhouding(existing, type, periods, brutoCent, werkgever);
                await putXml(filename, updated);
            } else {
                const skeleton = buildUwvSkeleton(person, type, periods, brutoCent, werkgever);
                await postXml(filename, skeleton);
            }
        }
    }

    async function fetchXmlIfExists(filename) {
        const res = await fetch(`${API}/${encodeURIComponent(filename)}`, {
            headers: { Accept: 'application/xml' },
        });
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
        }
        throw new Error('Onbekend type: ' + type);
    }

    function appendUwvInkomstenverhouding(xml, type, periods, brutoCent, werkgever) {
        const doc = parseXml(xml);
        const client = doc.getElementsByTagNameNS('*', 'ClientSuwi')[0];
        if (!client) throw new Error('ClientSuwi-element niet gevonden in UWV-bestand');
        const next = nextVolgnr(client);
        const block = buildIkvFragment(doc, type, periods, brutoCent, next, werkgever);
        client.appendChild(doc.createTextNode('\n        '));
        client.appendChild(doc.createComment(' Toegevoegd door "Recente inkomsten" '));
        client.appendChild(doc.createTextNode('\n        '));
        client.appendChild(block);
        client.appendChild(doc.createTextNode('\n    '));
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

    function buildIkvFragment(doc, type, periods, brutoCent, volgnr, werkgever) {
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

    function buildUwvSkeleton(person, type, periods, brutoCent, werkgever) {
        const xml = `<smls:UWVPersoonsIkvInfoResponse xmlns:smls="http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200">
    <ClientSuwi>
        <Burgerservicenr>${escapeText(person.bsn)}</Burgerservicenr>
    </ClientSuwi>
</smls:UWVPersoonsIkvInfoResponse>`;
        return appendUwvInkomstenverhouding(xml, type, periods, brutoCent, werkgever);
    }

    /* ---------- SVB-bestand: appenden of skeleton bouwen ---------- */

    function appendSvbUitkering(xml, periods, brutoCent, nettoCent) {
        const doc = parseXml(xml);
        const client = doc.getElementsByTagNameNS('*', 'ClientSuwi')[0];
        if (!client) throw new Error('ClientSuwi-element niet gevonden in SVB-bestand');
        const block = buildSvbUitkeringFragment(doc, periods, brutoCent, nettoCent);
        client.appendChild(doc.createTextNode('\n        '));
        client.appendChild(doc.createComment(' Toegevoegd door "Recente inkomsten" '));
        client.appendChild(doc.createTextNode('\n        '));
        client.appendChild(block);
        client.appendChild(doc.createTextNode('\n    '));
        return serializeXml(doc);
    }

    function buildSvbUitkeringFragment(doc, periods, brutoCent, nettoCent) {
        const uv = doc.createElement('Uitkeringsverhouding');
        const start = periods[0].startYmd;
        const end = periods[periods.length - 1].endYmd;
        appendChild(uv, 'DatBUitkeringsverhouding', start);
        appendChild(uv, 'DatEUitkeringsverhouding', end);
        const sz = doc.createElement('SzWet');
        appendChild(sz, 'CdSzWet', 'AOW');
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

    function buildSvbSkeleton(person, periods, brutoCent, nettoCent) {
        const xml = `<ns4:SVBPersoonsInfoResponse xmlns:ns3="http://bkwi.nl/SuwiML/FWI/v0205" xmlns:ns4="http://bkwi.nl/SuwiML/Diensten/SVBDossierPersoonGSD/v0200">
    <ClientSuwi>
        <Burgerservicenr>${escapeText(person.bsn)}</Burgerservicenr>
    </ClientSuwi>
</ns4:SVBPersoonsInfoResponse>`;
        return appendSvbUitkering(xml, periods, brutoCent, nettoCent);
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
                const cnf = (data.conflicts || []).join('\n  ');
                const choice = await chooseConflictAction(cnf);
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

    function chooseConflictAction(conflictList) {
        const msg = `Bestanden bestaan al:\n  ${conflictList}\n\n`
            + `Druk OK om TE OVERSCHRIJVEN.\n`
            + `Druk Annuleren om af te breken.\n\n`
            + `(Voor 'skip bestaande' kies je dat in het modaal.)`;
        return Promise.resolve(confirm(msg) ? 'OVERWRITE' : null);
    }

    /* ---------- In-file search: form pane ---------- */

    const formSearch = {
        query: '',
        matches: [],
        idx: -1,
        labels: [],
    };

    function initFormSearch() {
        const input = document.getElementById('form-search');
        const prev = document.getElementById('form-search-prev');
        const next = document.getElementById('form-search-next');
        const clear = document.getElementById('form-search-clear');

        input.addEventListener('input', () => {
            formSearch.query = input.value.trim();
            clear.hidden = !formSearch.query;
            applyFormSearch();
        });
        input.addEventListener('keydown', (e) => {
            if (e.key === 'Enter') {
                if (autocomplete.input === input && autocomplete.idx >= 0) return;
                if (e.shiftKey) formSearchMove(-1);
                else formSearchMove(1);
                e.preventDefault();
            } else if (e.key === 'Escape') {
                input.value = '';
                formSearch.query = '';
                clear.hidden = true;
                applyFormSearch();
            }
        });
        prev.addEventListener('click', () => formSearchMove(-1));
        next.addEventListener('click', () => formSearchMove(1));
        clear.addEventListener('click', () => {
            input.value = '';
            formSearch.query = '';
            clear.hidden = true;
            applyFormSearch();
            input.focus();
        });

        attachAutocomplete(input, formSearch.labels);
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
        const input = document.getElementById('raw-search');
        const prev = document.getElementById('raw-search-prev');
        const next = document.getElementById('raw-search-next');
        const clear = document.getElementById('raw-search-clear');

        input.addEventListener('input', () => {
            rawSearch.query = input.value;
            clear.hidden = !rawSearch.query;
            applyRawSearch();
        });
        input.addEventListener('keydown', (e) => {
            if (e.key === 'Enter') {
                if (autocomplete.input === input && autocomplete.idx >= 0) return;
                if (e.shiftKey) rawSearchMove(-1);
                else rawSearchMove(1);
                e.preventDefault();
            } else if (e.key === 'Escape') {
                input.value = '';
                rawSearch.query = '';
                clear.hidden = true;
                applyRawSearch();
            }
        });
        prev.addEventListener('click', () => rawSearchMove(-1));
        next.addEventListener('click', () => rawSearchMove(1));
        clear.addEventListener('click', () => {
            input.value = '';
            rawSearch.query = '';
            clear.hidden = true;
            applyRawSearch();
            input.focus();
        });

        attachAutocomplete(input, rawSearch.names);
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
})();
