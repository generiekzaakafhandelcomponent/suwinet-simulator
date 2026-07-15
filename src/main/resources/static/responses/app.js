import { setupAutocompletePopup, attachAutocomplete, hideAutocomplete } from './autocomplete.js';
import { state } from './state.js';
import {
    loadIndex, loadGitStatus, applyFilter, toggleSort, togglePersonSort,
    setAutoSelectPersonCallback, searchAutocompleteValues, personSearchAutocompleteValues,
    populateColumnFilters, setSelectFileCallback, startAutoRefresh,
} from './filter.js';
import {
    initResizer, initRawResizer, initActionsHamburger, updateUndoRedoButtons,
    initDynamicDatePanel, initFormSearch, initRawSearch, setMode,
    toggleDiff, toggleIgnoreWhitespace, toggleList, toggleRaw,
    save, selectFile, applyValidationAutoFix, hideValidationBanner,
    onRawEditorChange, setSelectPersonCallback, setLoadIndexCallback,
} from './editor.js';
import {
    initCopyModal, selectPerson, wireTestUi, wireDrawerResize,
    openCopyModal, setPersonsLoadIndexCallback, setLoadGitStatusCallback,
} from './persons.js';
import { syncHash } from './routing.js';

// Wire callbacks to break circular dependencies
setAutoSelectPersonCallback(selectPerson);
setSelectFileCallback(selectFile);
setSelectPersonCallback(selectPerson);
setLoadIndexCallback(loadIndex);
setPersonsLoadIndexCallback(loadIndex);
setLoadGitStatusCallback(loadGitStatus);

async function applyHash() {
    const raw = location.hash.slice(1);
    if (!raw) return;
    const qIdx = raw.indexOf('?');
    const path = qIdx === -1 ? raw : raw.slice(0, qIdx);
    const q = qIdx === -1 ? '' : new URLSearchParams(raw.slice(qIdx + 1)).get('q') || '';
    const slashIdx = path.indexOf('/');
    const mode = slashIdx === -1 ? path : path.slice(0, slashIdx);
    const encoded = slashIdx === -1 ? null : path.slice(slashIdx + 1);
    const value = encoded ? decodeURIComponent(encoded) : null;
    if (q) {
        const searchEl = document.getElementById('search');
        searchEl.value = q;
        state.search = q.toLowerCase();
    }
    if (mode === 'files') {
        setMode('files');
        if (value && state.all.find(f => f.filename === value)) await selectFile(value);
    } else if (mode === 'persons') {
        setMode('persons');
        if (value && state.persons.find(p => p.bsn === value)) selectPerson(value);
    }
}

document.addEventListener('DOMContentLoaded', () => {
    if (window.lucide) lucide.createIcons();

    state.editor = CodeMirror.fromTextArea(document.getElementById('raw-editor'), {
        mode: 'application/xml',
        lineNumbers: true,
        lineWrapping: false,
        theme: 'mdn-like',
        indentUnit: 4,
        tabSize: 4,
    });
    state.editor.on('change', onRawEditorChange);
    state.editor.on('change', updateUndoRedoButtons);

    document.getElementById('raw-undo-btn').addEventListener('click', () => { state.editor.undo(); state.editor.focus(); });
    document.getElementById('raw-redo-btn').addEventListener('click', () => { state.editor.redo(); state.editor.focus(); });

    document.getElementById('reload').addEventListener('click', () => loadIndex());
    document.getElementById('search').addEventListener('input', e => {
        state.search = e.target.value.toLowerCase();
        applyFilter();
        syncHash();
    });
    document.querySelectorAll('#files-table thead tr.sort-row th').forEach(th => {
        th.addEventListener('click', () => toggleSort(th.dataset.sort));
    });
    document.getElementById('save-btn').addEventListener('click', save);
    document.getElementById('toggle-list-btn').addEventListener('click', toggleList);
    document.getElementById('toggle-raw-btn').addEventListener('click', toggleRaw);
    document.getElementById('toggle-diff-btn').addEventListener('click', toggleDiff);
    document.getElementById('diff-ignore-ws-btn').addEventListener('click', toggleIgnoreWhitespace);
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
    attachAutocomplete(document.getElementById('search'), searchAutocompleteValues);
    attachAutocomplete(document.getElementById('person-search'), personSearchAutocompleteValues);
    initFormSearch();
    initRawSearch();
    initActionsHamburger();
    initDynamicDatePanel();

    loadIndex().then(applyHash).then(startAutoRefresh);

    wireTestUi();
    wireDrawerResize();
});
