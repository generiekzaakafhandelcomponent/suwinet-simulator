import {
    API, FILE_COL_KEYS, PERSON_COL_KEYS, FILTER_DROPDOWN_THRESHOLD,
    CATEGORY_ICONS, METADATA_FIELD_CATEGORY,
    formatDate, escapeText, escapeAttr, naam, isNameBorrowedFromBrp,
    dienstClass, shortDienst, buildSearchMatchHint,
} from './constants.js';
import { state } from './state.js';
import { attachAutocomplete, hideAutocomplete } from './autocomplete.js';

// Callback set by app.js to break circular dep with persons.js
let _autoSelectPerson = null;
export function setAutoSelectPersonCallback(fn) { _autoSelectPerson = fn; }

/**
 * Reloads the full index. Pass {quiet:true} for the auto-refresh poll: it skips the loading
 * overlay, the reload-button animation and the error alert (rethrows instead) so a background
 * refresh never flashes UI over the user. The current selection and open editor are untouched —
 * loadIndex only rebuilds the file/person lists.
 */
export async function loadIndex({ quiet = false } = {}) {
    const btn = document.getElementById('reload');
    const originalText = btn ? btn.textContent : null;
    if (!quiet && btn) { btn.textContent = 'Herladen…'; btn.disabled = true; }
    if (!quiet) showLoading();
    try {
        const data = await fetchIndexStreaming();
        if (!Array.isArray(data.files)) {
            throw new Error('Onverwachte index-respons: "files" ontbreekt of is geen array');
        }
        state.all = data.files;
        state.persons = groupByBsn(state.all);
        const basedirEl = document.getElementById('basedir');
        basedirEl.textContent = data.baseDir || '';
        basedirEl.title = data.baseDir || '';
        await loadGitStatus();
        populateColumnFilters();
        applyFilter();
        if (!quiet && btn) {
            btn.textContent = 'Klaar ✓';
            setTimeout(() => { btn.textContent = originalText; btn.disabled = false; }, 1500);
        }
    } catch (e) {
        if (!quiet && btn) { btn.textContent = originalText; btn.disabled = false; }
        if (quiet) throw e;
        alert('Kon index niet laden: ' + e.message);
    } finally {
        if (!quiet) hideLoading();
    }
}

// --- Auto-refresh: poll a cheap directory signature and reload the index when it changes, so a
// push from persona-lab (or any other writer) shows up without a manual reload. -------------------
const SIGNATURE_POLL_MS = 4000;
let lastSignature = null;
let pollTimer = null;

async function fetchSignature() {
    const res = await fetch(`${API}/signature`, { headers: { Accept: 'application/json' } });
    if (!res.ok) throw new Error(res.status + ' ' + res.statusText);
    const sig = await res.json();
    return `${sig.count}:${sig.latest}`;
}

async function pollSignature() {
    if (document.hidden) return; // niet pollen op een verborgen tab; bij terugkeer pakt de volgende tick het op
    let sig;
    try {
        sig = await fetchSignature();
    } catch (e) {
        return; // simulator even onbereikbaar — stil overslaan, volgende tick probeert opnieuw
    }
    if (sig === lastSignature) return;
    lastSignature = sig;
    try {
        await loadIndex({ quiet: true });
    } catch (e) {
        // stille reload mislukte; de reload-knop blijft beschikbaar voor de gebruiker
    }
}

/** Starts the background poll. Primes the baseline first so it never reloads on the very first tick. */
export async function startAutoRefresh() {
    if (pollTimer) return;
    try { lastSignature = await fetchSignature(); } catch (e) { /* baseline volgt bij de eerste geslaagde tick */ }
    pollTimer = setInterval(pollSignature, SIGNATURE_POLL_MS);
}

/**
 * Fetches the index via the SSE /stream endpoint so we can render real per-file progress.
 * Resolves with the same {baseDir, count, files} payload as the plain JSON endpoint.
 * Falls back to a plain fetch when EventSource is unavailable or the stream errors before
 * delivering the index.
 */
function fetchIndexStreaming() {
    return new Promise((resolve, reject) => {
        if (typeof EventSource === 'undefined') {
            fetchIndexPlain().then(resolve, reject);
            return;
        }
        const es = new EventSource(`${API}/stream`);
        let total = 0;
        let settled = false;
        es.addEventListener('total', e => {
            total = parseInt(e.data, 10) || 0;
            updateLoading(0, total);
        });
        es.addEventListener('progress', e => {
            updateLoading(parseInt(e.data, 10) || 0, total);
        });
        es.addEventListener('index', e => {
            settled = true;
            es.close();
            try {
                updateLoading(total, total);
                resolve(JSON.parse(e.data));
            } catch (err) {
                reject(err);
            }
        });
        es.onerror = () => {
            if (settled) return;
            settled = true;
            es.close();
            // Stream broke before the index arrived — fall back to the plain endpoint.
            fetchIndexPlain().then(resolve, reject);
        };
    });
}

function fetchIndexPlain() {
    return fetch(API, { headers: { Accept: 'application/json' } }).then(res => {
        if (!res.ok) throw new Error(res.status + ' ' + res.statusText);
        return res.json();
    });
}

function showLoading() {
    const overlay = document.getElementById('loading-overlay');
    if (overlay) overlay.hidden = false;
    updateLoading(0, 0);
}

function hideLoading() {
    const overlay = document.getElementById('loading-overlay');
    if (overlay) overlay.hidden = true;
}

function updateLoading(done, total) {
    const bar = document.getElementById('loading-bar');
    const label = document.getElementById('loading-label');
    if (total > 0) {
        const pct = Math.min(100, Math.round((done / total) * 100));
        if (bar) bar.style.width = pct + '%';
        if (label) label.textContent = `${done} / ${total} bestanden (${pct}%)`;
    } else {
        if (bar) bar.style.width = '0%';
        if (label) label.textContent = 'Voorbereiden…';
    }
}

export async function loadGitStatus() {
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

/** Maps a porcelain status to {cls, title}. Returns null for clean files. */
export function gitBadgeFor(filename) {
    const code = state.gitStatuses[filename];
    if (!code) return null;
    const trimmed = code.trim();
    if (trimmed === '??') return { cls: 'added', title: 'Nieuw' };
    if (trimmed.startsWith('A')) return { cls: 'added', title: 'Toegevoegd' };
    if (trimmed.startsWith('D') || trimmed.endsWith('D')) return { cls: 'deleted', title: 'Verwijderd' };
    if (trimmed.startsWith('R')) return { cls: 'modified', title: 'Hernoemd' };
    // M, MM, AM, etc.
    return { cls: 'modified', title: 'Gewijzigd' };
}

/** Aggregates per-file badges into one badge for the person. Modified beats added beats deleted. */
export function personGitBadge(p) {
    if (!state.gitAvailable || !p.files) return null;
    let any = null, hasModified = false, hasAdded = false, hasDeleted = false;
    let modifiedCount = 0, wsOnlyModifiedCount = 0;
    for (const fn of p.files) {
        const b = gitBadgeFor(fn);
        if (!b) continue;
        any = b;
        if (b.cls === 'modified') {
            hasModified = true;
            modifiedCount++;
            if (state.wsOnlyFiles.has(fn)) wsOnlyModifiedCount++;
        } else if (b.cls === 'added') hasAdded = true;
        else if (b.cls === 'deleted') hasDeleted = true;
    }
    if (!any) return null;
    if (hasModified) {
        if (modifiedCount > 0 && modifiedCount === wsOnlyModifiedCount) {
            return { cls: 'ws-only', title: 'Alleen witruimte-wijzigingen (spaties, inspringing) — geen inhoudelijk verschil' };
        }
        return { cls: 'modified', title: 'Eén of meer bestanden gewijzigd' };
    }
    if (hasAdded) return { cls: 'added', title: 'Nieuwe bestanden' };
    if (hasDeleted) return { cls: 'deleted', title: 'Verwijderde bestanden' };
    return any;
}

export function groupByBsn(files) {
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
                geslacht: '',
                partnerNaam: '',
                partnerGeboortedat: '',
                partnerBsn: '',
                partnerGeslacht: '',
                files: [],
                diensten: [],
                _diensten: new Set(),
                _content: '',
            });
        }
        const p = map.get(bsn);
        p.files.push(f.filename);
        if (!p._diensten.has(f.dienst)) {
            p._diensten.add(f.dienst);
            p.diensten.push(f.dienst);
        }
        if (!p.naam || (!p._naamFromVoornamen && m.voornamen)) {
            const own = naam(f);
            if (own) {
                p.naam = own;
                p._naamFromVoornamen = !!m.voornamen;
            }
        }
        if (!p.geslacht && m.geslacht) p.geslacht = m.geslacht;
        if (!p.geboortedat && m.geboortedat) p.geboortedat = m.geboortedat;
        if (!p.woonplaatsnaam && m.woonplaatsnaam) p.woonplaatsnaam = m.woonplaatsnaam;
        if (!p.postcd && m.postcd) p.postcd = m.postcd;
        if (!p.partnerNaam && m.partner_significantdeelvandeachternaam) p.partnerNaam = m.partner_significantdeelvandeachternaam;
        if (!p.partnerGeboortedat && m.partner_geboortedat) p.partnerGeboortedat = m.partner_geboortedat;
        if (!p.partnerBsn && m.partner_burgerservicenr) p.partnerBsn = m.partner_burgerservicenr;
        if (!p.partnerGeslacht && m.partner_geslacht) p.partnerGeslacht = m.partner_geslacht;
        if (f.content) p._content += f.content;
    }
    return Array.from(map.values());
}

export function fileColValue(f, col) {
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
export function fileColDisplay(f, col) {
    const v = fileColValue(f, col);
    return col === 'geboortedat' ? formatDate(v) : v;
}

export function personColDisplay(p, col) {
    if (col === 'diensten') return (p.diensten || []).join(' ');
    const v = p[col] || '';
    return col === 'geboortedat' ? formatDate(v) : v;
}

export function populateColumnFilters() {
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

export function uniqueSorted(list) {
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

export function isBetterCasing(candidate, existing) {
    const candMixed = /[a-z]/.test(candidate) && /[A-Z]/.test(candidate);
    const existMixed = /[a-z]/.test(existing) && /[A-Z]/.test(existing);
    return candMixed && !existMixed;
}

export function renderColumnFilter(th, col, values, filtersObj, modeObj, attrSuffix) {
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

export function fileMatchesSearch(f, q) {
    if (!q) return true;
    const haystack = [
        f.filename, f.dienst, f.operatie, f.sleutel,
        ...Object.values(f.metadata || {})
    ].join(' ').toLowerCase();
    return haystack.includes(q);
}

export function fileMatchesColFilter(f, col) {
    const want = state.colFilters[col];
    if (!want) return true;
    const wl = want.toLowerCase();
    if (state.colFilterMode[col] === 'input') {
        return fileColDisplay(f, col).toLowerCase().includes(wl);
    }
    return fileColValue(f, col).toLowerCase() === wl;
}

export function personMatchesSearch(p, q) {
    if (!q) return true;
    return [p.bsn, p.naam, p.woonplaatsnaam || '', p.geboortedat || '', ...p.files]
        .join(' ').toLowerCase().includes(q);
}

export function personMatchesColFilter(p, col) {
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

export function tallyValue(counts, value) {
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

export function computeFileFacetCounts(targetCol) {
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

export function computePersonFacetCounts(targetCol) {
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
export function facetAutocompleteValues(col, isPerson) {
    const counts = isPerson ? computePersonFacetCounts(col) : computeFileFacetCounts(col);
    const arr = [...counts.values()].map(e => e.display);
    arr.sort((a, b) => a.localeCompare(b, 'nl', { numeric: true, sensitivity: 'base' }));
    return col === 'geboortedat' ? arr.map(formatDate) : arr;
}

export function refreshSelectOptions(sel, counts, col, currentValue) {
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

export function refreshColumnFilterCounts() {
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

export function searchAutocompleteValues() {
    const map = new Map(); // value → {diensten: Set, icon: string}
    const add = (value, dienst, icon = '') => {
        if (!value) return;
        if (!map.has(value)) map.set(value, {diensten: new Set(), icon: ''});
        const entry = map.get(value);
        if (dienst) entry.diensten.add(dienst);
        if (icon && !entry.icon) entry.icon = icon;
    };
    for (const f of state.all) {
        const d = f.dienst || '';
        if (f.dienst) add(f.dienst, f.dienst);
        for (const [k, v] of Object.entries(f.metadata || {})) {
            if (!k.startsWith('_') && v) {
                const cat = METADATA_FIELD_CATEGORY[k];
                add(v, d, cat ? CATEGORY_ICONS[cat] : '');
            }
        }
        if (f.sleutel) add(f.sleutel, d);
    }
    const fileItems = [...map.entries()]
        .map(([value, {diensten, icon}]) => {
            const ds = [...diensten].filter(Boolean);
            const shorts = [...new Set(ds.map(shortDienst))];
            const shortLabel = shorts.slice(0, 2).join(', ') + (shorts.length > 2 ? ` +${shorts.length - 2}` : '');
            const label = icon ? (shortLabel ? `${icon} ${shortLabel}` : icon) : shortLabel;
            const cls = ds.length === 1 ? dienstClass(ds[0]) : '';
            return {value, label, cls};
        });
    const seen = new Set(fileItems.map(i => i.value));
    const personItems = [];
    for (const p of state.persons) {
        if (p.naam && !seen.has(p.naam)) {
            personItems.push({value: p.naam, label: `${CATEGORY_ICONS.identity} persoon`, cls: 'ac-hint-persoon'});
            seen.add(p.naam);
        }
    }
    return [...fileItems, ...personItems]
        .sort((a, b) => a.value.localeCompare(b.value, undefined, {sensitivity: 'base'}));
}

export function personSearchAutocompleteValues() {
    if (!state.selectedPerson) return [];
    const p = state.persons.find(x => x.bsn === state.selectedPerson);
    if (!p) return [];
    const map = new Map(); // value → {diensten: Set, icon: string}
    const add = (value, dienst, icon = '') => {
        if (!value) return;
        if (!map.has(value)) map.set(value, {diensten: new Set(), icon: ''});
        const entry = map.get(value);
        if (dienst) entry.diensten.add(dienst);
        if (icon && !entry.icon) entry.icon = icon;
    };
    for (const filename of p.files) {
        const f = state.all.find(x => x.filename === filename);
        if (!f) continue;
        const d = f.dienst || '';
        if (f.dienst) add(f.dienst, f.dienst);
        if (f.operatie) add(f.operatie, d);
        for (const [k, v] of Object.entries(f.metadata || {})) {
            if (!k.startsWith('_') && v) {
                const cat = METADATA_FIELD_CATEGORY[k];
                add(v, d, cat ? CATEGORY_ICONS[cat] : '');
            }
        }
    }
    const fileItems = [...map.entries()]
        .map(([value, {diensten, icon}]) => {
            const ds = [...diensten].filter(Boolean);
            const shorts = [...new Set(ds.map(shortDienst))];
            const shortLabel = shorts.slice(0, 2).join(', ') + (shorts.length > 2 ? ` +${shorts.length - 2}` : '');
            const label = icon ? (shortLabel ? `${icon} ${shortLabel}` : icon) : shortLabel;
            const cls = ds.length === 1 ? dienstClass(ds[0]) : '';
            return {value, label, cls};
        });
    const seen = new Set(fileItems.map(i => i.value));
    const personItems = [];
    if (p.naam && !seen.has(p.naam)) personItems.push({value: p.naam, label: `${CATEGORY_ICONS.identity} persoon`, cls: 'ac-hint-persoon'});
    if (p.bsn && !seen.has(p.bsn)) personItems.push({value: p.bsn, label: `${CATEGORY_ICONS.identity} bsn`, cls: 'ac-hint-persoon'});
    return [...fileItems, ...personItems]
        .sort((a, b) => a.value.localeCompare(b.value, undefined, {sensitivity: 'base'}));
}

export function applyFilter() {
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
            ...Object.values(f.metadata || {}),
            f.content || ''
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
        return [p.bsn, p.naam, p.woonplaatsnaam || '', p.geboortedat || '', ...p.files, p._content || '']
            .join(' ').toLowerCase().includes(q);
    });
    sortFilteredPersons();
    renderPersonsTable();

    if (state.mode === 'persons' && state.filteredPersons.length === 1) {
        const hasFilter = state.search || Object.values(state.personColFilters).some(v => v);
        if (hasFilter && state.selectedPerson !== state.filteredPersons[0].bsn) {
            _autoSelectPerson?.(state.filteredPersons[0].bsn);
        }
    }

    const total = state.mode === 'persons' ? state.persons.length : state.all.length;
    const shown = state.mode === 'persons' ? state.filteredPersons.length : state.filtered.length;
    document.getElementById('result-count').textContent = `${shown} / ${total}`;

    refreshColumnFilterCounts();
}

export function sortFiltered() {
    const key = state.sortKey;
    const dir = state.sortDir === 'asc' ? 1 : -1;
    state.filtered.sort((a, b) => {
        const va = sortValue(a, key);
        const vb = sortValue(b, key);
        return va.localeCompare(vb, 'nl', { numeric: true }) * dir;
    });
}

export function sortValue(file, key) {
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

export function toggleSort(key) {
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

export function sortFilteredPersons() {
    const key = state.personSortKey;
    const dir = state.personSortDir === 'asc' ? 1 : -1;
    state.filteredPersons.sort((a, b) => {
        let va, vb;
        if (key === 'diensten') { va = a.diensten.length + ''; vb = b.diensten.length + ''; }
        else { va = (a[key] || '').toLowerCase(); vb = (b[key] || '').toLowerCase(); }
        return va.localeCompare(vb, 'nl', { numeric: true }) * dir;
    });
}

export function togglePersonSort(key) {
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

// selectFile is imported lazily via a callback to avoid circular deps
let _selectFileFn = null;
export function setSelectFileCallback(fn) { _selectFileFn = fn; }

export function renderTable() {
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
        tr.addEventListener('click', () => _selectFileFn && _selectFileFn(tr.dataset.filename));
    });
}

export function renderPersonsTable() {
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
        tr.addEventListener('click', () => _autoSelectPerson && _autoSelectPerson(tr.dataset.bsn));
    });
}
