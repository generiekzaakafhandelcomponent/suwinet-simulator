import { FILE_COL_KEYS, PERSON_COL_KEYS } from './constants.js';

export const state = {
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
    fromPersonBsn: null,
    personSortKey: 'naam',
    personSortDir: 'asc',
    colFilters: Object.fromEntries(FILE_COL_KEYS.map(k => [k, ''])),
    personColFilters: Object.fromEntries(PERSON_COL_KEYS.map(k => [k, ''])),
    colFilterMode: Object.fromEntries(FILE_COL_KEYS.map(k => [k, 'select'])),
    personColFilterMode: Object.fromEntries(PERSON_COL_KEYS.map(k => [k, 'select'])),
    gitAvailable: false,
    gitStatuses: {}, // filename -> two-char porcelain code (e.g. " M", "??", "A ")
    wsOnlyFiles: new Set(), // filenames whose git diff is whitespace-only
    diffVisible: false,
    ignoreWhitespace: false,
};

// Holds XML element references whose form-card / list-item should render collapsed.
// WeakSet so that elements removed from the DOM (or replaced when a new file loads) are GC'd.
export const collapsedEls = new WeakSet();

// For repeating groups (lists), there is no single XML element that represents the list
// itself, so we key collapse-state on (parent element, child localName).
export const collapsedLists = new WeakMap(); // parentEl -> Set<localName>

export function isListCollapsed(parentEl, name) {
    const set = collapsedLists.get(parentEl);
    return !!(set && set.has(name));
}

export function toggleListCollapsed(parentEl, name) {
    let set = collapsedLists.get(parentEl);
    if (!set) { set = new Set(); collapsedLists.set(parentEl, set); }
    if (set.has(name)) set.delete(name);
    else set.add(name);
    return set.has(name);
}
