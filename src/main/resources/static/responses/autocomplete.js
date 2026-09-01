import { escapeText, escapeAttr } from './constants.js';

export const autocomplete = {
    input: null,
    values: null,
    idx: -1,
    popup: null,
};

export function setupAutocompletePopup() {
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

export function repositionAutocomplete() {
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

export function attachAutocomplete(input, values) {
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
            input.value = matches[autocomplete.idx].value;
            input.dispatchEvent(new Event('input', { bubbles: true }));
            hideAutocomplete();
            e.preventDefault();
        } else if (e.key === 'Escape') {
            hideAutocomplete();
        }
    });
}

export function openAutocomplete(input, values) {
    autocomplete.input = input;
    autocomplete.values = values;
    autocomplete.idx = -1;
    renderAutocomplete();
}

export function currentAutocompleteMatches() {
    if (!autocomplete.input || !autocomplete.values) return [];
    const values = typeof autocomplete.values === 'function'
        ? autocomplete.values() : autocomplete.values;
    if (!values) return [];
    const q = autocomplete.input.value.toLowerCase();
    return values
        .map(v => typeof v === 'string' ? {value: v} : v)
        .filter(v => v.value.toLowerCase().includes(q));
}

export function renderAutocomplete() {
    const popup = autocomplete.popup;
    if (!popup || !autocomplete.input) return;
    const matches = currentAutocompleteMatches();
    if (matches.length === 0) {
        popup.hidden = true;
        return;
    }
    const q = autocomplete.input.value;
    const limit = q.length < 3 ? Math.min(matches.length, 8) : Math.min(matches.length, 200);
    popup.innerHTML = matches.slice(0, limit).map((v, i) =>
        `<div class="autocomplete-item${i === autocomplete.idx ? ' highlighted' : ''}" `
        + `data-value="${escapeAttr(v.value)}">`
        + escapeText(v.value)
        + (v.label ? `<span class="autocomplete-hint ${v.cls || ''}">${escapeText(v.label)}</span>` : '')
        + `</div>`
    ).join('');
    const rect = autocomplete.input.getBoundingClientRect();
    popup.style.left = rect.left + 'px';
    popup.style.top = (rect.bottom + 2) + 'px';
    popup.style.minWidth = rect.width + 'px';
    popup.hidden = false;
    const hl = popup.querySelector('.autocomplete-item.highlighted');
    if (hl) hl.scrollIntoView({ block: 'nearest' });
}

export function hideAutocomplete() {
    if (!autocomplete.popup) return;
    autocomplete.popup.hidden = true;
    autocomplete.input = null;
    autocomplete.values = null;
    autocomplete.idx = -1;
}
