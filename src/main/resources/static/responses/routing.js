import { state } from './state.js';

export function syncHash() {
    const { mode, selected, selectedPerson } = state;
    let hash = '#' + mode;
    if (mode === 'files' && selected && !document.getElementById('detail').hidden) {
        hash += '/' + encodeURIComponent(selected);
    } else if (mode === 'persons' && selectedPerson && !document.getElementById('person-detail').hidden) {
        hash += '/' + encodeURIComponent(selectedPerson);
    }
    const searchVal = document.getElementById('search')?.value || '';
    if (searchVal) hash += '?' + new URLSearchParams({ q: searchVal });
    history.replaceState(null, '', hash);
}
