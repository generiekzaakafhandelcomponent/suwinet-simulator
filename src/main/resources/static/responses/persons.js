import {
    API, CATEGORY_ICONS,
    formatDate, escapeText, escapeAttr, dienstClass, buildSearchMatchHint,
} from './constants.js';
import { state } from './state.js';
import {
    fetchXmlIfExists, putXml, postXml, monthlyPeriods,
    appendUwvInkomstenverhouding, buildUwvSkeleton, uwvIkvSpec,
    appendSvbUitkering, buildSvbSkeleton,
    appendDuoStudiefinanciering, buildDuoStudiefinancieringSkeleton,
} from './xml.js';
import { gitBadgeFor, renderPersonsTable as filterRenderPersonsTable } from './filter.js';
import { selectFile } from './editor.js';
import { syncHash } from './routing.js';

export function selectPerson(bsn) {
    state.selectedPerson = bsn;
    const p = state.persons.find(x => x.bsn === bsn);
    if (!p) return;
    filterRenderPersonsTable();
    document.getElementById('empty-state').hidden = true;
    document.getElementById('detail').hidden = true;
    document.getElementById('person-detail').hidden = false;
    syncHash();

    document.getElementById('person-name').innerHTML = `<span aria-hidden="true">👤</span> ` + escapeText(p.naam || `BSN ${p.bsn}`);
    document.getElementById('person-sub').textContent =
        `BSN ${p.bsn} · ${formatDate(p.geboortedat)} · ${p.woonplaatsnaam || ''}`.replace(/ · $/, '');

    const body = document.getElementById('person-body');
    body.innerHTML = '';
    body.appendChild(buildPartnerLine(p));
    const list = document.createElement('div');
    list.className = 'person-files';
    list.id = 'person-file-list';
    body.appendChild(list);
    body.appendChild(buildQuickIncomePanel(p));

    // Auto-populate person search from global search when it's a content-level hit
    const personSearchInput = document.getElementById('person-search');
    const chip = document.getElementById('person-search-chip');
    const chipText = document.getElementById('person-search-chip-text');
    const chipClear = document.getElementById('person-search-chip-clear');
    const globalQ = document.getElementById('search')?.value || '';
    const globalQl = globalQ.toLowerCase();
    const isPersonHit = globalQl && [p.bsn, p.naam || '', p.woonplaatsnaam || '', p.geboortedat || '']
        .some(v => v.toLowerCase().includes(globalQl));
    const autoFill = (globalQ && !isPersonHit) ? globalQ : '';

    const showChip = (value) => {
        chipText.textContent = value;
        chip.hidden = false;
        personSearchInput.hidden = true;
        personSearchInput.value = value;
    };

    const clearChip = () => {
        chip.hidden = true;
        personSearchInput.hidden = false;
        personSearchInput.value = '';
        personSearchInput.focus();
        renderPersonFileRows(bsn, '');
    };

    chipClear.onclick = clearChip;

    if (autoFill) {
        showChip(autoFill);
    } else {
        chip.hidden = true;
        personSearchInput.hidden = false;
        personSearchInput.value = '';
    }

    renderPersonFileRows(bsn, autoFill || personSearchInput.value);

    personSearchInput.oninput = () => renderPersonFileRows(bsn, personSearchInput.value);
}

export function renderPersonFileRows(bsn, q) {
    const p = state.persons.find(x => x.bsn === bsn);
    const list = document.getElementById('person-file-list');
    if (!p || !list) return;
    list.innerHTML = '';

    const ql = q ? q.toLowerCase() : '';
    const matches = [];
    for (const filename of p.files.slice().sort()) {
        const file = state.all.find(f => f.filename === filename);
        if (ql) {
            const inSimple = filename.toLowerCase().includes(ql)
                || (file && (file.dienst || '').toLowerCase().includes(ql))
                || (file && (file.operatie || '').toLowerCase().includes(ql))
                || (file && Object.values(file.metadata || {}).some(v => v && v.toLowerCase().includes(ql)));
            const inContent = file && file.content && file.content.toLowerCase().includes(ql);
            if (!inSimple && !inContent) continue;
        }
        matches.push({filename, file});
    }

    const heading = document.createElement('div');
    heading.className = 'person-files-heading';
    heading.textContent = ql
        ? `${matches.length} van ${p.files.length} bestanden`
        : `${p.files.length} bestanden`;
    list.appendChild(heading);

    const countEl = document.getElementById('person-search-count');
    if (ql) {
        countEl.textContent = `${matches.length} / ${p.files.length}`;
        countEl.hidden = false;
    } else {
        countEl.hidden = true;
    }

    for (const {filename, file} of matches) {
        const row = document.createElement('div');
        const inContent = ql && file && file.content && file.content.toLowerCase().includes(ql);
        row.className = 'person-file-row' + (inContent ? ' person-file-search-hit' : '');
        const rowBadge = gitBadgeFor(filename);
        const rowGit = rowBadge ? `<span class="git-pill git-${rowBadge.cls}" title="${escapeAttr(rowBadge.title)}" aria-label="${escapeAttr(rowBadge.title)}"></span>` : '';
        const matchHint = inContent ? buildSearchMatchHint(file, ql) : '';
        row.innerHTML = `${rowGit}<span class="dienst-pill ${dienstClass(file ? file.dienst : '')}">${escapeText(file ? file.dienst : '')}</span>
            <span class="person-file-op">${escapeText(file ? file.operatie : '')}</span>
            <span class="person-file-name">${escapeText(filename)}</span>
            ${file && file.isRequest ? '<span class="request-pill">request</span>' : ''}
            ${matchHint}`;
        row.addEventListener('click', () => {
            state.fromPersonBsn = bsn;
            selectFile(filename);
        });
        list.appendChild(row);
    }
}

/* ==================== Partner-regel ==================== */

export function buildPartnerLine(p) {
    const wrap = document.createElement('div');
    if (!p.partnerNaam && !p.partnerBsn) return wrap;

    wrap.className = 'partner-line';

    const label = document.createElement('span');
    label.className = 'partner-line-label';
    label.textContent = 'Partner';
    wrap.appendChild(label);

    const parts = [];
    if (p.partnerNaam) parts.push(p.partnerNaam);
    if (p.partnerGeboortedat) parts.push(formatDate(p.partnerGeboortedat));

    const text = document.createElement('span');
    text.className = 'partner-line-text';
    text.innerHTML = `<span aria-hidden="true">👤</span> ${escapeText(parts.join(' · '))}`;
    wrap.appendChild(text);

    if (p.partnerBsn) {
        const bsnSpan = document.createElement('span');
        bsnSpan.className = 'partner-line-bsn';
        const partnerExists = state.persons.find(x => x.bsn === p.partnerBsn);
        if (partnerExists) {
            const link = document.createElement('button');
            link.type = 'button';
            link.className = 'partner-line-link';
            link.textContent = `BSN ${p.partnerBsn} →`;
            link.title = 'Ga naar deze persoon';
            link.onclick = () => selectPerson(p.partnerBsn);
            bsnSpan.appendChild(link);
        } else {
            bsnSpan.textContent = `BSN ${p.partnerBsn}`;
        }
        wrap.appendChild(bsnSpan);
    }

    return wrap;
}

/* ==================== Recente inkomsten toevoegen ==================== */

/** Hard-coded defaults per type, in cents. Override in the form to use other amounts. */
export const QI_DEFAULTS = {
    loondienst:   { bruto: 200000, netto: null,   showNetto: false, kind: 'uwv' },
    uwvuitkering: { bruto: 150000, netto: null,   showNetto: false, kind: 'uwv' },
    onbekend:     { bruto: 150000, netto: null,   showNetto: false, kind: 'uwv' },
    pensioen:     { bruto: 180000, netto: null,   showNetto: false, kind: 'uwv' },
    svbuitkering: { bruto: 240000, netto: 205000, showNetto: true,  kind: 'svb' },
    studiefinanciering: { bruto: 0, netto: null,  showNetto: false, kind: 'duo' },
};

/** Per-SVB-regeling defaults (cents). User can override in the form. */
export const QI_SVB_DEFAULTS = {
    AOW: { bruto: 240000, netto: 205000 },
    ANW: { bruto: 150000, netto: 130000 },
    AIO: { bruto: 120000, netto: 110000 },
    WLZ: { bruto:  80000, netto:  75000 },
};

export function buildQuickIncomePanel(person) {
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
            if (_loadIndexFn) await _loadIndexFn();
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
export function parseOptionalEuroCents(raw) {
    const s = (raw || '').trim();
    if (!s) return null;
    const n = parseFloat(s);
    if (!Number.isFinite(n) || n < 0) return 'invalid';
    return Math.round(n * 100);
}

export function setQiStatus(el, msg, kind) {
    el.textContent = msg;
    el.className = 'quick-income-status' + (kind ? ' ' + kind : '');
}

export async function submitQuickIncome(person, type, opts) {
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

// Callback for loadIndex — set from app.js
let _loadIndexFn = null;
export function setPersonsLoadIndexCallback(fn) { _loadIndexFn = fn; }

/* ==================== Copy modaal ==================== */

export function initCopyModal() {
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

export function openCopyModal() {
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

export function closeCopyModal() {
    document.getElementById('copy-modal').hidden = true;
}

export function generateBsn() {
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

export function validateBsnInput() {
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

export async function submitCopy() {
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
        if (_loadIndexFn) await _loadIndexFn();
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

/* ===================== Test feature ===================== */

export const TEST = {
    catalog: null,
    catalogPromise: null,
};

export const ISSUE_OUTCOMES = new Set(['MISMATCH', 'SCHEMA_ISSUES', 'HTTP_FAILURE', 'TRANSPORT_FAILURE']);

/* --- All-test drawer state --- */
let allTestSse     = null;
let allTestResults = [];
let allTestTotal   = null;
let allTestStatus  = 'idle'; // 'idle' | 'running' | 'done'
let allTestBtnOriginalHtml = null;

export const OUTCOME_META = {
    MATCH:             { icon: '✓', cls: 'match',        label: 'Match' },
    SCHEMA_ISSUES:     { icon: '⚠', cls: 'schema-issues', label: 'XSD-fouten' },
    MISMATCH:          { icon: '⚠', cls: 'mismatch',     label: 'Verschil' },
    NIET_GEVONDEN:     { icon: '✗', cls: 'not-found',    label: 'Niet gevonden' },
    NO_EXPECTED_FILE:  { icon: '?', cls: 'no-file',      label: 'Geen file' },
    OK:                { icon: '✓', cls: 'ok',           label: 'OK' },
    HTTP_FAILURE:      { icon: '!', cls: 'fail',         label: 'HTTP fout' },
    TRANSPORT_FAILURE: { icon: '!', cls: 'fail',         label: 'Verbinding mislukt' },
};

export async function loadTestCatalog() {
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

export function findCatalogOp(dienst, operatie) {
    return (TEST.catalog || []).find(o => o.dienst === dienst && o.operatie === operatie);
}

export async function runSingleTest(dienst, operatie, keys, compareToFile) {
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

export async function runPersonTest(bsn, compareToFile) {
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

function lineDiffIsWhitespaceOnly(ops) {
    const changed = ops.filter(o => o.type !== 'eq');
    if (changed.length === 0) return false;
    const dels = ops.filter(o => o.type === 'del');
    const adds = ops.filter(o => o.type === 'add');
    if (dels.length === adds.length && dels.length > 0) {
        return dels.every((d, i) => d.text.trim() === adds[i].text.trim());
    }
    return changed.every(o => o.text.trim() === '');
}

function renderDiff(expected, actual, wsOnly = false) {
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
    const banner = wsOnly
        ? '<div class="test-diff-ws-banner" title="Inhoud is identiek na het weghalen van witruimte">Alleen witruimte-verschillen (spaties, inspringing, regeleinden) — inhoud is identiek</div>'
        : '';
    return banner + '<div class="test-diff">' + ops.map(o => {
        if (o.type === 'eq') {
            return `<div class="test-diff-line test-diff-eq">${escapeText('  ' + o.text)}</div>`;
        }
        const cls = wsOnly
            ? (o.type === 'add' ? 'ws-add' : 'ws-del')
            : (o.type === 'add' ? 'add' : 'del');
        const prefix = o.type === 'add' ? '+ ' : '- ';
        return `<div class="test-diff-line test-diff-${cls}">${escapeText(prefix + o.text)}</div>`;
    }).join('') + '</div>';
}

function renderSchemaIssue(i) {
    const msg = (i && typeof i === 'object') ? (i.message || '') : String(i || '');
    const hint = (i && typeof i === 'object' && i.hint) ? i.hint : null;
    let html = '<li>' + escapeText(msg);
    if (hint) html += '<div class="schema-issue-hint">' + escapeText(hint) + '</div>';
    html += '</li>';
    return html;
}

let testResultIdSeq = 0;

async function acceptActual(filename, actualXml, statusEl) {
    statusEl.textContent = 'Opslaan…';
    statusEl.className = 'test-accept-status';
    try {
        const res = await fetch(`${API}/${encodeURIComponent(filename)}/accept-actual`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/xml; charset=utf-8' },
            body: actualXml,
        });
        if (!res.ok) {
            const t = await res.text().catch(() => '');
            statusEl.textContent = `Fout: HTTP ${res.status}${t ? ' — ' + t : ''}`;
            statusEl.className = 'test-accept-status test-accept-error';
        } else {
            statusEl.textContent = 'Opgeslagen.';
            statusEl.className = 'test-accept-status test-accept-ok';
            if (_loadGitStatusFn) _loadGitStatusFn();
        }
    } catch (e) {
        statusEl.textContent = `Fout: ${e.message}`;
        statusEl.className = 'test-accept-status test-accept-error';
    }
}

// Callback for loadGitStatus — set from app.js
let _loadGitStatusFn = null;
export function setLoadGitStatusCallback(fn) { _loadGitStatusFn = fn; }

function renderTestResult(result, container) {
    const meta = OUTCOME_META[result.outcome] || OUTCOME_META.OK;
    const wsOnly = result.outcome === 'MISMATCH' && !!result.expectedXml && !!result.actualXml
        && lineDiffIsWhitespaceOnly(lineDiff(result.expectedXml, result.actualXml));
    const effectiveMeta = wsOnly
        ? { icon: '~', cls: 'ws-mismatch', label: 'Witruimte' }
        : meta;
    const badgeTooltip = wsOnly
        ? 'Alle verschillen zijn witruimte (spaties, inspringing, regeleinden) — inhoud is identiek'
        : result.outcome;
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
    const schemaIssues = result.schemaIssues || [];
    const schemaBlock = schemaIssues.length
        ? '<div class="test-schema-issues"><strong>XSD-fouten in bestand:</strong><ul>'
            + schemaIssues.map(renderSchemaIssue).join('')
            + '</ul></div>'
        : '';
    const canAccept = (result.outcome === 'MISMATCH' || result.outcome === 'SCHEMA_ISSUES')
        && result.expectedFileExists
        && (result.rawActualXml || result.actualXml);
    const fixBar = (() => {
        if (canAccept) {
            if (result.outcome === 'SCHEMA_ISSUES') {
                return `<div class="test-fix-bar test-fix-available">
                    <span class="test-fix-label"><strong>Volgorde fix beschikbaar</strong> — Overschrijft het bestand met de JAXB-response (herstelt elementvolgorde). Ontbrekende verplichte velden moeten daarna handmatig worden toegevoegd.</span>
                    <button type="button" class="test-accept-btn">Overschrijf bestand</button>
                    <span class="test-accept-status"></span>
                </div>`;
            }
            return `<div class="test-fix-bar test-fix-available">
                <span class="test-fix-label"><strong>Bestand bijwerken</strong> — Overschrijft het opgeslagen bestand met de actuele SOAP-response van de simulator.</span>
                <button type="button" class="test-accept-btn">Overschrijf bestand</button>
                <span class="test-accept-status"></span>
            </div>`;
        }
        if (result.outcome === 'HTTP_FAILURE' || result.outcome === 'TRANSPORT_FAILURE') {
            return `<div class="test-fix-bar test-fix-none">
                <span class="test-fix-label">Geen automatische fix mogelijk — controleer de serverlogs of download het rapport.</span>
            </div>`;
        }
        return '';
    })();
    container.innerHTML = `
        <div class="test-result test-result-${effectiveMeta.cls}" data-id="${id}">
            <div class="test-result-header">
                <span class="test-status test-status-${effectiveMeta.cls}" title="${escapeAttr(badgeTooltip)}">${effectiveMeta.icon} ${effectiveMeta.label}</span>
                <span class="test-result-title">${escapeText(result.dienst)} · ${escapeText(result.operatie)} · <code>${escapeText(keyDesc)}</code></span>
                <span class="test-result-meta muted small">HTTP ${result.httpStatus} · ${result.durationMs}ms</span>
            </div>
            ${errorBlock}
            ${schemaBlock}
            ${fileLine}
            ${fixBar}
            <div class="test-result-tabs">
                <button type="button" data-tab="diff" class="active">Diff</button>
                <button type="button" data-tab="actual">Response</button>
                <button type="button" data-tab="expected">Verwacht</button>
                <button type="button" data-tab="request">Request</button>
            </div>
            <div class="test-result-tab-content" data-tab-content="diff">${renderDiff(result.expectedXml, result.actualXml, wsOnly)}</div>
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
    if (canAccept) {
        const root = container.querySelector(`[data-id="${id}"]`);
        const acceptBtn = root.querySelector('.test-accept-btn');
        const statusEl = root.querySelector('.test-accept-status');
        let confirmed = false;
        acceptBtn.addEventListener('click', () => {
            if (!confirmed) {
                confirmed = true;
                acceptBtn.textContent = 'Bevestig opslaan';
                acceptBtn.classList.add('test-accept-btn-confirm');
                statusEl.textContent = `Overschrijft: ${result.expectedFile}`;
                statusEl.className = 'test-accept-status test-accept-warn';
            } else {
                acceptBtn.disabled = true;
                acceptActual(result.expectedFile, result.rawActualXml || result.actualXml, statusEl);
            }
        });
    }
}

function buildIssueReport(results, bsn) {
    const issues = results.filter(r => ISSUE_OUTCOMES.has(r.outcome));
    const lines = [];
    lines.push(`Suwinet Simulator — Testrapport`);
    lines.push(`BSN: ${bsn}`);
    lines.push(`Datum: ${new Date().toISOString()}`);
    lines.push(`Problemen: ${issues.length}`);
    issues.forEach((r, i) => {
        lines.push('');
        lines.push('='.repeat(72));
        lines.push(`[${i + 1}] ${r.dienst} · ${r.operatie} · ${(r.keyValues || []).join(' / ')}`);
        lines.push(`    Uitkomst: ${r.outcome} | HTTP ${r.httpStatus} · ${r.durationMs}ms`);
        if (r.errorMessage) lines.push(`    Fout: ${r.errorMessage}`);
        if ((r.schemaIssues || []).length) {
            lines.push('');
            lines.push('--- XSD-FOUTEN ---');
            r.schemaIssues.forEach(s => lines.push('  ' + s));
        }
        if (r.outcome === 'MISMATCH') {
            lines.push('');
            lines.push('--- DIFF (- verwacht / + response) ---');
            const ops = lineDiff(r.expectedXml || '', r.actualXml || '');
            ops.forEach(o => {
                if (o.type === 'del') lines.push('- ' + o.text);
                else if (o.type === 'add') lines.push('+ ' + o.text);
            });
            lines.push('');
            lines.push('--- VERWACHT (bestand op disk) ---');
            lines.push(r.expectedXml || '(geen)');
            lines.push('');
            lines.push('--- RESPONSE (van SOAP) ---');
            lines.push(r.actualXml || '(geen)');
        }
        lines.push('');
        lines.push('--- REQUEST ---');
        lines.push(r.requestEnvelope || '(geen)');
    });
    return lines.join('\n');
}

const OUTCOME_SORT_PRIORITY = {
    HTTP_FAILURE: 0, TRANSPORT_FAILURE: 0,
    MISMATCH: 1, SCHEMA_ISSUES: 1,
};

function renderTestResultsList(results, container, bsn) {
    container.innerHTML = '';
    const visible = results
        .filter(r => r.outcome !== 'NIET_GEVONDEN')
        .sort((a, b) => (OUTCOME_SORT_PRIORITY[a.outcome] ?? 2) - (OUTCOME_SORT_PRIORITY[b.outcome] ?? 2));
    if (!visible.length) {
        container.innerHTML = '<div class="test-result-empty muted">Geen resultaten.</div>';
        return;
    }
    const counts = visible.reduce((m, r) => (m[r.outcome] = (m[r.outcome] || 0) + 1, m), {});
    const summaryPills = Object.entries(counts).map(([k, v]) => {
        const meta = OUTCOME_META[k] || OUTCOME_META.OK;
        return `<span class="test-summary-pill test-summary-${meta.cls}">${meta.icon} ${meta.label}: ${v}</span>`;
    }).join(' ');
    const hasIssues = visible.some(r => ISSUE_OUTCOMES.has(r.outcome));
    const downloadBtn = `<button type="button" class="secondary-btn test-download-btn" style="margin-left:auto">⬇ Download rapport</button>`;
    const wrap = document.createElement('div');
    wrap.className = 'test-results-list';
    wrap.innerHTML = `<div class="test-results-summary">${summaryPills}${downloadBtn}</div>`;
    wrap.querySelector('.test-download-btn').addEventListener('click', () => {
        const text = buildIssueReport(results, bsn || '');
        const blob = new Blob([text], { type: 'text/plain' });
        const a = document.createElement('a');
        a.href = URL.createObjectURL(blob);
        a.download = `suwinet-rapport-${bsn || 'onbekend'}-${new Date().toISOString().slice(0,19).replace(/:/g,'-')}.txt`;
        a.click();
        URL.revokeObjectURL(a.href);
    });
    visible.forEach(r => {
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
        renderTestResultsList(results, panel.querySelector('.person-test-body'), bsn);
    } catch (e) {
        panel.querySelector('.person-test-body').innerHTML =
            `<div class="test-error">${escapeText(e.message)}</div>`;
    }
}

function updateTestAllBtn() {
    const btn = document.getElementById('test-all-btn');
    if (!btn) return;
    if (allTestBtnOriginalHtml === null) allTestBtnOriginalHtml = btn.innerHTML;
    btn.classList.remove('state-running', 'state-done-errors', 'state-done-ok');
    if (allTestStatus === 'idle') {
        btn.innerHTML = allTestBtnOriginalHtml;
        btn.title = 'Test alle response-bestanden: SOAP-roundtrip + XSD-validatie';
        if (window.lucide) lucide.createIcons({ nodes: [btn] });
    } else if (allTestStatus === 'running') {
        const done = allTestResults.length;
        const label = allTestTotal ? `${done}/${allTestTotal}` : `${done}`;
        btn.innerHTML = `<span class="topbar-spinner"></span>${label} getest`;
        btn.classList.add('state-running');
        btn.title = 'Test loopt — klik om te bekijken';
    } else {
        const issues = allTestResults.filter(r => ISSUE_OUTCOMES.has(r.outcome));
        if (issues.length > 0) {
            btn.innerHTML = `<span style="font-size:13px;line-height:1">⚠</span>${issues.length} ${issues.length === 1 ? 'fout' : 'fouten'}`;
            btn.classList.add('state-done-errors');
            btn.title = `${issues.length} bestanden met problemen — klik om te bekijken`;
        } else {
            btn.innerHTML = `<span style="font-size:13px;line-height:1">✓</span>Alles OK`;
            btn.classList.add('state-done-ok');
            btn.title = 'Alle tests geslaagd — klik om te bekijken';
        }
    }
}

function showAllTestDrawer() {
    const drawer = document.getElementById('all-test-drawer');
    if (drawer) drawer.classList.add('is-visible');
}

function hideAllTestDrawer() {
    const drawer = document.getElementById('all-test-drawer');
    if (drawer) drawer.classList.remove('is-visible');
}

function updateAllTestDrawerProgress() {
    const label = document.getElementById('all-test-progress-label');
    const track = document.getElementById('all-test-progress-track');
    const bar   = document.getElementById('all-test-progress-bar');
    const body  = document.getElementById('all-test-drawer-body');
    if (!label || !track || !bar || !body) return;

    const done  = allTestResults.length;
    const total = allTestTotal;
    label.textContent = total ? `${done} van ${total}…` : `${done} resultaten…`;
    label.hidden = false;
    track.hidden = !total;
    if (total) bar.style.width = `${Math.round(done / total * 100)}%`;

    if (!body.querySelector('.all-test-running-msg')) {
        body.innerHTML = '<div class="test-result-loading all-test-running-msg">⏳ Test loopt…</div>';
    }
}

function startAllTests() {
    if (allTestSse) { allTestSse.close(); allTestSse = null; }
    allTestResults = [];
    allTestTotal   = null;
    allTestStatus  = 'running';

    const rerunBtn = document.getElementById('all-test-rerun-btn');
    const label    = document.getElementById('all-test-progress-label');
    const track    = document.getElementById('all-test-progress-track');
    const body     = document.getElementById('all-test-drawer-body');
    if (rerunBtn) rerunBtn.hidden = true;
    if (label)    label.hidden = true;
    if (track)    track.hidden = true;
    if (body)     body.innerHTML = '<div class="test-result-loading">⏳ Test loopt…</div>';

    showAllTestDrawer();
    updateTestAllBtn();

    allTestSse = new EventSource(`${API}/test/all/stream?compareToFile=true`);

    allTestSse.addEventListener('total', (e) => {
        allTestTotal = parseInt(e.data, 10);
        updateAllTestDrawerProgress();
        updateTestAllBtn();
    });

    allTestSse.addEventListener('result', (e) => {
        allTestResults.push(JSON.parse(e.data));
        updateAllTestDrawerProgress();
        updateTestAllBtn();
    });

    allTestSse.addEventListener('done', () => {
        allTestSse.close(); allTestSse = null;
        allTestStatus = 'done';
        const rerun = document.getElementById('all-test-rerun-btn');
        const lbl   = document.getElementById('all-test-progress-label');
        const trk   = document.getElementById('all-test-progress-track');
        if (rerun) rerun.hidden = false;
        if (lbl)   lbl.hidden = true;
        if (trk)   trk.hidden = true;
        renderTestResultsList(allTestResults, document.getElementById('all-test-drawer-body'), null);
        updateTestAllBtn();
    });

    allTestSse.onerror = () => {
        if (!allTestSse) return;
        allTestSse.close(); allTestSse = null;
        allTestStatus = 'done';
        const rerun = document.getElementById('all-test-rerun-btn');
        const lbl   = document.getElementById('all-test-progress-label');
        const trk   = document.getElementById('all-test-progress-track');
        const bdy   = document.getElementById('all-test-drawer-body');
        if (rerun) rerun.hidden = false;
        if (lbl)   lbl.hidden = true;
        if (trk)   trk.hidden = true;
        if (allTestResults.length > 0) {
            renderTestResultsList(allTestResults, bdy, null);
            bdy.insertAdjacentHTML('afterbegin',
                `<div class="test-error" style="margin-bottom:8px">Verbinding verbroken na ${allTestResults.length} resultaten.</div>`);
        } else {
            if (bdy) bdy.innerHTML = `<div class="test-error">Verbinding verbroken — kon test niet starten.</div>`;
        }
        updateTestAllBtn();
    };
}

function onTestAllClick() {
    if (allTestStatus === 'idle') {
        startAllTests();
    } else {
        showAllTestDrawer();
    }
}

export function wireTestUi() {
    const fileBtn = document.getElementById('test-file-btn');
    if (fileBtn) fileBtn.addEventListener('click', onTestFileClick);
    const personBtn = document.getElementById('test-person-btn');
    if (personBtn) personBtn.addEventListener('click', onTestPersonClick);
    const allBtn = document.getElementById('test-all-btn');
    if (allBtn) allBtn.addEventListener('click', onTestAllClick);
    const closeBtn = document.getElementById('test-result-modal-close');
    if (closeBtn) closeBtn.addEventListener('click', closeTestResultModal);
    const okBtn = document.getElementById('test-result-modal-ok');
    if (okBtn) okBtn.addEventListener('click', closeTestResultModal);

    const drawerCloseBtn = document.getElementById('all-test-close-btn');
    if (drawerCloseBtn) drawerCloseBtn.addEventListener('click', hideAllTestDrawer);

    const rerunBtn = document.getElementById('all-test-rerun-btn');
    if (rerunBtn) rerunBtn.addEventListener('click', () => {
        allTestStatus = 'idle';
        startAllTests();
    });
}

export function wireDrawerResize() {
    const handle = document.getElementById('all-test-resize-handle');
    const drawer = document.getElementById('all-test-drawer');
    if (!handle || !drawer) return;

    let startY = 0;
    let startH = 0;

    handle.addEventListener('mousedown', (e) => {
        e.preventDefault();
        startY = e.clientY;
        startH = drawer.offsetHeight;
        handle.classList.add('dragging');
        document.body.style.userSelect = 'none';
        document.body.style.cursor = 'ns-resize';
    });

    document.addEventListener('mousemove', (e) => {
        if (!handle.classList.contains('dragging')) return;
        const delta = startY - e.clientY;
        const newH = Math.min(Math.max(startH + delta, 120), window.innerHeight - 60);
        drawer.style.height = `${newH}px`;
    });

    document.addEventListener('mouseup', () => {
        if (!handle.classList.contains('dragging')) return;
        handle.classList.remove('dragging');
        document.body.style.userSelect = '';
        document.body.style.cursor = '';
    });
}
