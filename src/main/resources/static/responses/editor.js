import {
    API,
    FRIENDLY_LABELS, DATE_FIELD_PATTERN, CATEGORY_ICONS,
    categoryFor, formatDate, escapeText, escapeAttr,
} from './constants.js';
import { state, collapsedEls, isListCollapsed, toggleListCollapsed } from './state.js';
import {
    parseXmlOrNull, serializeXml, elementChildren,
    isUwvIkvDoc, validateUwvIkv, autoFixUwvIkv,
} from './xml.js';
import { applyFilter, renderTable, gitBadgeFor, personGitBadge } from './filter.js';
import { autocomplete, attachAutocomplete, hideAutocomplete } from './autocomplete.js';
import { syncHash } from './routing.js';

export function updateUndoRedoButtons() {
    const hist = state.editor.historySize();
    document.getElementById('raw-undo-btn').disabled = hist.undo === 0;
    document.getElementById('raw-redo-btn').disabled = hist.redo === 0;
}

/* ---------- Datum invullen (raw editor) ---------- */

export const DYNDATE_OPTIONS = [
    { expr: 'today',                    label: 'Vandaag' },
    { expr: 'today - 1 week',           label: '1 week geleden' },
    { expr: 'today - 1 month',          label: '1 maand geleden' },
    { expr: 'today - 2 months',         label: '2 maanden geleden' },
    { expr: 'today - 3 months',         label: '3 maanden geleden' },
    { expr: 'today - 6 months',         label: '6 maanden geleden' },
    { expr: 'today - 1 year',           label: '1 jaar geleden' },
    { expr: 'today + 1 month',          label: 'Over 1 maand' },
    { expr: 'today + 1 year',           label: 'Over 1 jaar' },
    null,
    { expr: 'startOfMonth',             label: '1e van deze maand' },
    { expr: 'endOfMonth',               label: 'Laatste dag deze maand' },
    { expr: 'startOfMonth - 1 month',   label: '1e van vorige maand' },
    { expr: 'endOfMonth - 1 month',     label: 'Laatste dag vorige maand' },
    { expr: 'startOfMonth - 2 months',  label: '1e van 2 maanden geleden' },
    { expr: 'endOfMonth - 2 months',    label: 'Laatste dag 2 maanden geleden' },
    { expr: 'startOfMonth + 1 month',   label: '1e van volgende maand' },
    { expr: 'endOfMonth + 1 month',     label: 'Laatste dag volgende maand' },
];

export function parseDyndateExpr(expr) {
    const anchorMatch = expr.match(/^(today|startOfMonth|endOfMonth)/i);
    if (!anchorMatch) return null;
    const anchor = anchorMatch[1].toLowerCase();
    const off = expr.match(/([+-])\s*(\d+)\s*(day|week|month|year)s?/i);
    let d = new Date();
    if (off) {
        const n = parseInt(off[2]) * (off[1] === '+' ? 1 : -1);
        if (off[3].toLowerCase() === 'day')   d.setDate(d.getDate() + n);
        if (off[3].toLowerCase() === 'week')  d.setDate(d.getDate() + n * 7);
        if (off[3].toLowerCase() === 'month') d.setMonth(d.getMonth() + n);
        if (off[3].toLowerCase() === 'year')  d.setFullYear(d.getFullYear() + n);
    }
    if (anchor === 'startofmonth') d.setDate(1);
    if (anchor === 'endofmonth') d = new Date(d.getFullYear(), d.getMonth() + 1, 0);
    return d;
}

export function formatDyndatePreview(d) {
    return d.toLocaleDateString('nl-NL', { day: 'numeric', month: 'short', year: 'numeric' });
}

export function getExistingDyndateComment(xmlEl) {
    let prev = xmlEl.previousSibling;
    while (prev) {
        if (prev.nodeType === 8) {
            const m = prev.nodeValue.trim().match(/^DynamicDate:\s*(.+)$/i);
            return m ? { node: prev, expr: m[1].trim() } : null;
        }
        if (prev.nodeType === 3 && /^\s*$/.test(prev.nodeValue)) {
            prev = prev.previousSibling;
        } else {
            return null;
        }
    }
    return null;
}

export function setDyndateForEl(xmlEl, exprOrNull) {
    const existing = getExistingDyndateComment(xmlEl);
    if (exprOrNull === null) {
        if (existing) existing.node.parentNode.removeChild(existing.node);
    } else {
        const commentVal = ` DynamicDate: ${exprOrNull} `;
        if (existing) {
            existing.node.nodeValue = commentVal;
        } else {
            const comment = xmlEl.ownerDocument.createComment(commentVal);
            xmlEl.parentNode.insertBefore(comment, xmlEl);
        }
    }
    pushDomToRaw();
    const formPane = document.getElementById('form-pane');
    const savedScroll = formPane ? formPane.scrollTop : 0;
    renderForm();
    if (formPane) formPane.scrollTop = savedScroll;
}

let _formDyndateDropdown = null;
let _formDyndateCloseListener = null;

export function closeFormDyndateDropdown() {
    if (_formDyndateDropdown) { _formDyndateDropdown.remove(); _formDyndateDropdown = null; }
    if (_formDyndateCloseListener) {
        document.removeEventListener('click', _formDyndateCloseListener);
        _formDyndateCloseListener = null;
    }
}

export function openFormDyndateDropdown(xmlEl, anchorEl) {
    closeFormDyndateDropdown();
    const existing = getExistingDyndateComment(xmlEl);

    const dropdown = document.createElement('div');
    dropdown.className = 'form-dyndate-dropdown';
    _formDyndateDropdown = dropdown;

    DYNDATE_OPTIONS.forEach((opt) => {
        if (opt === null) {
            const sep = document.createElement('div');
            sep.className = 'form-dyndate-sep';
            dropdown.appendChild(sep);
            return;
        }
        const btn = document.createElement('button');
        btn.type = 'button';
        btn.className = 'form-dyndate-option';
        if (existing && existing.expr.toLowerCase() === opt.expr.toLowerCase()) btn.classList.add('active');
        const labelEl = document.createElement('span');
        labelEl.className = 'form-dyndate-option-label';
        labelEl.textContent = opt.label;
        const previewEl = document.createElement('span');
        previewEl.className = 'form-dyndate-option-preview';
        const d = parseDyndateExpr(opt.expr);
        previewEl.textContent = d ? formatDyndatePreview(d) : '';
        btn.appendChild(labelEl);
        btn.appendChild(previewEl);
        btn.addEventListener('click', () => { closeFormDyndateDropdown(); setDyndateForEl(xmlEl, opt.expr); });
        dropdown.appendChild(btn);
    });

    if (existing) {
        const sep = document.createElement('div');
        sep.className = 'form-dyndate-sep';
        dropdown.appendChild(sep);
        const removeBtn = document.createElement('button');
        removeBtn.type = 'button';
        removeBtn.className = 'form-dyndate-option form-dyndate-remove';
        removeBtn.textContent = 'Verwijder dynamische datum';
        removeBtn.addEventListener('click', () => { closeFormDyndateDropdown(); setDyndateForEl(xmlEl, null); });
        dropdown.appendChild(removeBtn);
    }

    const customSep = document.createElement('div');
    customSep.className = 'form-dyndate-sep';
    dropdown.appendChild(customSep);
    const customRow = document.createElement('div');
    customRow.className = 'form-dyndate-custom-row';
    const customInput = document.createElement('input');
    customInput.type = 'text';
    customInput.className = 'form-dyndate-custom-input';
    customInput.placeholder = 'bv. startOfMonth - 3 months';
    customInput.value = existing ? existing.expr : '';
    const customSubmit = document.createElement('button');
    customSubmit.type = 'button';
    customSubmit.className = 'form-dyndate-custom-submit';
    customSubmit.textContent = existing ? 'Bijwerken' : 'Invoegen';
    function tryCustom() {
        const expr = customInput.value.trim();
        if (expr) { closeFormDyndateDropdown(); setDyndateForEl(xmlEl, expr); }
    }
    customSubmit.addEventListener('click', tryCustom);
    customInput.addEventListener('keydown', (e) => {
        if (e.key === 'Enter')  { e.preventDefault(); tryCustom(); }
        if (e.key === 'Escape') { e.stopPropagation(); closeFormDyndateDropdown(); }
    });
    customRow.appendChild(customInput);
    customRow.appendChild(customSubmit);
    dropdown.appendChild(customRow);

    document.body.appendChild(dropdown);
    const rect = anchorEl.getBoundingClientRect();
    const dropW = 280;
    const left = Math.min(rect.left + window.scrollX, window.innerWidth - dropW - 8);
    dropdown.style.top  = (rect.bottom + window.scrollY + 4) + 'px';
    dropdown.style.left = Math.max(8, left) + 'px';

    _formDyndateCloseListener = (e) => {
        if (!dropdown.contains(e.target) && e.target !== anchorEl) closeFormDyndateDropdown();
    };
    setTimeout(() => document.addEventListener('click', _formDyndateCloseListener), 0);
    document.addEventListener('keydown', function esc(e) {
        if (e.key === 'Escape') { closeFormDyndateDropdown(); document.removeEventListener('keydown', esc); }
    });
}

export function initDynamicDatePanel() {
    const btn        = document.getElementById('dyndate-btn');
    const panel      = document.getElementById('dyndate-panel');
    const optionsEl  = document.getElementById('dyndate-options');
    const customIn   = document.getElementById('dyndate-custom-input');
    const customBtn  = document.getElementById('dyndate-custom-submit');
    if (!btn || !panel) return;

    DYNDATE_OPTIONS.forEach((opt) => {
        if (opt === null) {
            const sep = document.createElement('div');
            sep.className = 'dyndate-sep';
            optionsEl.appendChild(sep);
            return;
        }
        const b = document.createElement('button');
        b.type = 'button';
        b.className = 'dyndate-option';
        b.innerHTML = `<span class="dyndate-option-label">${opt.label}</span><span class="dyndate-option-preview"></span>`;
        b.addEventListener('click', () => { close(); insertDynamicDateComment(opt.expr); });
        optionsEl.appendChild(b);
    });

    function refreshPreviews() {
        const buttons = Array.from(optionsEl.querySelectorAll('.dyndate-option'));
        const opts = DYNDATE_OPTIONS.filter(o => o !== null);
        buttons.forEach((b, i) => {
            const d = parseDyndateExpr(opts[i].expr);
            b.querySelector('.dyndate-option-preview').textContent = d ? formatDyndatePreview(d) : '';
        });
    }

    function open() {
        refreshPreviews();
        panel.hidden = false;
        btn.classList.add('active');
    }

    function close() {
        panel.hidden = true;
        btn.classList.remove('active');
    }

    btn.addEventListener('click', (e) => {
        e.stopPropagation();
        panel.hidden ? open() : close();
    });

    function tryInsertCustom() {
        const expr = customIn.value.trim();
        if (!expr) return;
        close();
        insertDynamicDateComment(expr);
        customIn.value = '';
    }

    customBtn.addEventListener('click', tryInsertCustom);
    customIn.addEventListener('keydown', (e) => {
        if (e.key === 'Enter')  { e.preventDefault(); tryInsertCustom(); }
        if (e.key === 'Escape') close();
    });

    document.addEventListener('click', (e) => {
        if (!panel.hidden && !document.getElementById('dyndate-wrap').contains(e.target)) close();
    });
    document.addEventListener('keydown', (e) => {
        if (e.key === 'Escape' && !panel.hidden) { close(); state.editor && state.editor.focus(); }
    });
}

export function insertDynamicDateComment(expr) {
    const cm = state.editor;
    if (!cm) return;
    const cursor = cm.getCursor();
    const lineText = cm.getLine(cursor.line) || '';
    const indent = (lineText.match(/^\s*/) || [''])[0];
    // Always insert as a new line *before* the current line so the comment
    // never lands mid-value regardless of where the cursor is on the line.
    cm.replaceRange(`${indent}<!-- DynamicDate: ${expr} -->\n`, { line: cursor.line, ch: 0 });
    cm.focus();
}

/* ---------- Resizable divider between table and detail ---------- */

const RESIZE_STORAGE_KEY = 'responses.leftPaneWidth';
const DEFAULT_LEFT_WIDTH = '45%';

export function initResizer() {
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

export function initActionsHamburger() {
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

export function initRawResizer() {
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

/* ---------- Raw <-> Form sync ---------- */

export function setRawEditorValue(xml) {
    state.suppressRawSync = true;
    try {
        state.editor.setValue(xml);
    } finally {
        state.suppressRawSync = false;
    }
    // setValue clears all text markers; re-apply current raw search if any.
    applyRawSearch();
}

export function onRawEditorChange() {
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

export function pushDomToRaw() {
    if (!state.dom) return;
    clearTimeout(state.rawDebounceTimer);
    const xml = serializeXml(state.dom);
    setRawEditorValue(xml);
    setDirty(xml !== state.loadedXml);
}

/* ---------- Form rendering ---------- */

export function renderForm() {
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

export function pathFromDocument(el) {
    const parts = [];
    let cur = el;
    while (cur && cur.nodeType === 1) {
        parts.unshift(cur.localName || cur.nodeName);
        cur = cur.parentElement;
    }
    return parts.join(' > ');
}

export function renderChildrenOf(parentEl, depth) {
    const container = document.createElement('div');
    for (const group of groupConsecutive(parentEl)) {
        if (group.type === 'comment') {
            const isDyndate = /^\s*DynamicDate:/i.test(group.node.nodeValue);
            const c = document.createElement('div');
            c.className = isDyndate ? 'form-comment form-comment--dyndate' : 'form-comment';
            c.textContent = '<!-- ' + group.node.nodeValue.trim() + ' -->';
            if (isDyndate) {
                let nextXmlEl = group.node.nextSibling;
                while (nextXmlEl && nextXmlEl.nodeType !== 1) nextXmlEl = nextXmlEl.nextSibling;
                if (nextXmlEl) {
                    c.title = 'Klik om te bewerken';
                    c.addEventListener('click', () => openFormDyndateDropdown(nextXmlEl, c));
                }
            }
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

export function groupConsecutive(parentEl) {
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
    const isDate = DATE_FIELD_PATTERN.test(el.localName);
    const row = document.createElement('div');
    row.className = isDate ? 'form-field form-field--date' : 'form-field';

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

    // For date fields, the ⏱ button sits between the input and the hint
    // so the action is adjacent to the field it modifies.
    let dyndateBtn = null;
    if (isDate) {
        const existingDyndate = getExistingDyndateComment(el);
        dyndateBtn = document.createElement('button');
        dyndateBtn.type = 'button';
        dyndateBtn.className = 'form-dyndate-btn' + (existingDyndate ? ' active' : '');
        dyndateBtn.title = existingDyndate
            ? `Dynamische datum: ${existingDyndate.expr}`
            : 'Dynamische datum instellen';
        dyndateBtn.textContent = '⏱';
        dyndateBtn.addEventListener('click', (e) => {
            e.stopPropagation();
            openFormDyndateDropdown(el, dyndateBtn);
        });
        row.appendChild(dyndateBtn);
    }

    const hint = document.createElement('span');
    hint.className = 'hint';
    const hintText = document.createTextNode('');
    hint.appendChild(hintText);
    row.appendChild(hint);
    function updateHint() {
        const v = input.value;
        if (isDate && /^\d{8}$/.test(v)) {
            hintText.nodeValue = formatDate(v);
        } else {
            hintText.nodeValue = '';
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

function bsnIsValid(bsn) {
    if (!/^\d{9}$/.test(bsn)) return false;
    let sum = 0;
    for (let i = 0; i < 9; i++) {
        const w = i === 8 ? -1 : 9 - i;
        sum += parseInt(bsn[i], 10) * w;
    }
    return sum % 11 === 0;
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

/* ---------- Detail: load / select ---------- */

export function syncFormSearchFromGlobal() {
    const q = state.search;
    const input = document.getElementById('form-search');
    if (!input) return;
    if (!q) return;
    const person = state.persons.find(p => p.bsn === state.selectedPerson);
    const ql = q.toLowerCase();
    const isPersonHit = person && [person.bsn, person.naam || '', person.woonplaatsnaam || '', person.geboortedat || '']
        .some(v => v.toLowerCase().includes(ql));
    if (!isPersonHit) {
        input.value = q;
        formSearch.query = q;
    }
}

export async function selectFile(filename) {
    if (state.loadedXml !== null && state.editor.getValue() !== state.loadedXml) {
        if (!confirm('Niet-opgeslagen wijzigingen worden weggegooid. Doorgaan?')) return;
    }
    state.selected = filename;
    renderTable();
    document.getElementById('empty-state').hidden = true;
    document.getElementById('person-detail').hidden = true;
    document.getElementById('detail').hidden = false;
    syncHash();

    const breadcrumb = document.getElementById('detail-breadcrumb');
    if (state.fromPersonBsn) {
        const fromBsn = state.fromPersonBsn;
        const person = state.persons.find(p => p.bsn === fromBsn);
        const label = person ? (person.naam || `BSN ${person.bsn}`) : `BSN ${fromBsn}`;
        breadcrumb.innerHTML = '';
        const btn = document.createElement('button');
        btn.type = 'button';
        btn.className = 'breadcrumb-back-btn';
        btn.textContent = `← ${label}`;
        btn.addEventListener('click', () => {
            state.fromPersonBsn = null;
            if (_selectPersonFn) _selectPersonFn(fromBsn);
        });
        breadcrumb.appendChild(btn);
        breadcrumb.hidden = false;
    } else {
        breadcrumb.hidden = true;
    }

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
        syncFormSearchFromGlobal();
        renderForm();
        setDirty(false);
        if (!state.dom) {
            setStatus('Raw XML is niet well-formed', 'error');
        } else {
            setStatus('', '');
            await maybeShowValidationBanner();
        }
        updateGitHeaderForSelection();
        // Refresh CodeMirror in case the pane just appeared
        setTimeout(() => state.editor.refresh(), 0);
    } catch (e) {
        setStatus('Kon bestand niet laden: ' + e.message, 'error');
    }
}

// Callback for selectPerson — set from persons.js to avoid circular dep
let _selectPersonFn = null;
export function setSelectPersonCallback(fn) { _selectPersonFn = fn; }

export function setDirty(dirty) {
    document.getElementById('dirty-indicator').hidden = !dirty;
    document.getElementById('save-btn').disabled = !dirty;
}

export function setStatus(msg, level) {
    const el = document.getElementById('status');
    el.textContent = msg;
    el.classList.remove('error', 'success');
    if (level) el.classList.add(level);
}

export function toggleList() {
    const layout = document.querySelector('.layout');
    const collapsed = layout.classList.toggle('list-collapsed');
    document.getElementById('toggle-list-btn').classList.toggle('active', !collapsed);
    if (state.editor) setTimeout(() => state.editor.refresh(), 0);
}

export function toggleRaw() {
    const body = document.getElementById('detail-body');
    const collapsed = body.classList.toggle('raw-collapsed');
    document.getElementById('toggle-raw-btn').classList.toggle('active', !collapsed);
    if (state.editor && !collapsed) {
        setTimeout(() => state.editor.refresh(), 0);
        const globalQ = document.getElementById('search')?.value || '';
        if (globalQ && !rawSearch.query) {
            const rawInput = document.getElementById('raw-search');
            rawInput.value = globalQ;
            rawSearch.query = globalQ;
            document.getElementById('raw-search-clear').hidden = false;
            applyRawSearch();
        }
    }
}

/* ---------- Git diff view ---------- */

/** Refreshes only the git-indicator badge text/class/tooltip for the selected file. */
export function refreshGitIndicator() {
    const indicator = document.getElementById('git-indicator');
    if (!indicator || indicator.hidden) return;
    const badge = state.selected ? gitBadgeFor(state.selected) : null;
    if (!badge) return;
    const isWs = state.wsOnlyFiles.has(state.selected);
    if (isWs) {
        indicator.textContent = 'Witruimte';
        indicator.className = 'git-indicator git-ws-only';
        indicator.title = 'Alleen witruimte-wijzigingen (spaties, inspringing, regeleinden) — geen inhoudelijk verschil';
    } else {
        indicator.textContent = badge.title;
        indicator.className = `git-indicator git-${badge.cls}`;
        indicator.title = badge.title;
    }
}

/** Updates git-pills for all person rows whose files include filename. */
export function updatePersonPillsForFilename(filename) {
    const tbody = document.getElementById('persons-tbody');
    if (!tbody) return;
    tbody.querySelectorAll('tr[data-bsn]').forEach(tr => {
        const p = state.persons.find(x => x.bsn === tr.dataset.bsn);
        if (!p || !p.files.includes(filename)) return;
        const badge = personGitBadge(p);
        const pill = tr.querySelector('.git-pill');
        if (badge) {
            if (pill) {
                pill.className = `git-pill git-${badge.cls}`;
                pill.title = badge.title;
                pill.setAttribute('aria-label', badge.title);
            } else {
                const span = document.createElement('span');
                span.className = `git-pill git-${badge.cls}`;
                span.title = badge.title;
                span.setAttribute('aria-label', badge.title);
                tr.querySelector('td').prepend(span);
            }
        } else if (pill) {
            pill.remove();
        }
    });
}

/** Updates the git-pill of a single file row in the file list, using cached wsOnlyFiles info. */
export function updateFilePillForFilename(filename) {
    const rows = document.querySelectorAll('#files-tbody tr[data-filename]');
    const tr = Array.from(rows).find(r => r.dataset.filename === filename);
    if (!tr) return;
    const badge = gitBadgeFor(filename);
    if (!badge) return;
    const isWs = state.wsOnlyFiles.has(filename);
    const cls = isWs ? 'git-ws-only' : `git-${badge.cls}`;
    const title = isWs
        ? 'Alleen witruimte-wijzigingen (spaties, inspringing) — geen inhoudelijk verschil'
        : badge.title;
    const pill = tr.querySelector('.git-pill');
    if (pill) {
        pill.className = `git-pill ${cls}`;
        pill.title = title;
        pill.setAttribute('aria-label', title);
    }
}

/**
 * Updates header indicator + Diff-button visibility for the currently selected file.
 * Also collapses the diff pane back to raw if a clean file becomes selected.
 */
export function updateGitHeaderForSelection() {
    const indicator = document.getElementById('git-indicator');
    const diffBtn = document.getElementById('toggle-diff-btn');
    const badge = state.selected ? gitBadgeFor(state.selected) : null;
    if (badge) {
        indicator.hidden = false;
        diffBtn.hidden = false;
        refreshGitIndicator();
        if (state.diffVisible) loadDiffForSelected();
    } else {
        indicator.hidden = true;
        diffBtn.hidden = true;
        if (state.diffVisible) toggleDiff(); // collapse to raw view
    }
}

export async function toggleDiff() {
    const body = document.getElementById('detail-body');
    const diffPane = document.getElementById('diff-pane');
    const rawTextarea = state.editor && state.editor.getWrapperElement();
    const diffBtn = document.getElementById('toggle-diff-btn');
    const rawBtn = document.getElementById('toggle-raw-btn');
    state.diffVisible = !state.diffVisible;
    diffBtn.classList.toggle('active', state.diffVisible);

    if (state.diffVisible) {
        // Diff lives inside the raw column, so we force it open and remember
        // its pre-diff state to restore on close.
        state.rawWasCollapsedBeforeDiff = body.classList.contains('raw-collapsed');
        body.classList.remove('raw-collapsed');
        rawBtn.classList.add('active');
        if (rawTextarea) rawTextarea.style.display = 'none';
        diffPane.hidden = false;
        await loadDiffForSelected();
    } else {
        diffPane.hidden = true;
        if (rawTextarea) rawTextarea.style.display = '';
        if (state.rawWasCollapsedBeforeDiff) {
            body.classList.add('raw-collapsed');
            rawBtn.classList.remove('active');
        }
        state.rawWasCollapsedBeforeDiff = false;
        if (state.editor) setTimeout(() => state.editor.refresh(), 0);
    }
}

export function toggleIgnoreWhitespace() {
    state.ignoreWhitespace = !state.ignoreWhitespace;
    document.getElementById('diff-ignore-ws-btn').classList.toggle('active', state.ignoreWhitespace);
    if (state.diffVisible) loadDiffForSelected();
}

export async function loadDiffForSelected() {
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
        const { html: rendered, wsOnly } = renderUnifiedDiff(diff, state.ignoreWhitespace);
        if (wsOnly) {
            state.wsOnlyFiles.add(filename);
        } else {
            state.wsOnlyFiles.delete(filename);
        }
        refreshGitIndicator();
        updateFilePillForFilename(filename);
        updatePersonPillsForFilename(filename);
        if (!rendered.trim()) {
            empty.textContent = wsOnly
                ? 'Alleen witruimte-wijzigingen (verborgen door filter).'
                : 'Geen wijzigingen t.o.v. HEAD.';
        } else {
            content.innerHTML = rendered;
        }
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
 * When ignoreWhitespace is true, hunks whose only changes are blank lines or
 * lines that differ solely in whitespace are omitted.
 */
function renderUnifiedDiff(diff, ignoreWhitespace = false) {
    const lines = diff.split('\n');

    function isHeaderLine(raw) {
        return raw.startsWith('diff --git') || raw.startsWith('index ')
            || raw.startsWith('--- ') || raw.startsWith('+++ ')
            || raw.startsWith('new file mode') || raw.startsWith('deleted file mode')
            || raw.startsWith('similarity index') || raw.startsWith('rename ')
            || raw.startsWith('\\ No newline');
    }

    // Parse into typed tokens
    const parsed = [];
    for (const raw of lines) {
        if (!raw && parsed.length === 0) continue;
        if (isHeaderLine(raw)) continue;
        if (raw.startsWith('@@')) {
            parsed.push({ type: 'hunk', raw });
        } else if (raw.startsWith('+')) {
            parsed.push({ type: 'add', raw, content: raw.slice(1) });
        } else if (raw.startsWith('-')) {
            parsed.push({ type: 'rem', raw, content: raw.slice(1) });
        } else {
            parsed.push({ type: 'ctx', raw });
        }
    }

    // Annotate rem/add groups: mark each token as wsOnly when the group only differs in whitespace.
    let hasChanges = false;
    let allChangesAreWs = true;
    const annotated = [];
    let i = 0;
    while (i < parsed.length) {
        if (parsed[i].type === 'rem' || parsed[i].type === 'add') {
            const rems = [];
            const adds = [];
            while (i < parsed.length && parsed[i].type === 'rem') rems.push(parsed[i++]);
            while (i < parsed.length && parsed[i].type === 'add') adds.push(parsed[i++]);
            hasChanges = true;
            const ws = isWhitespaceOnlyChange(rems, adds);
            if (!ws) allChangesAreWs = false;
            for (const t of [...rems, ...adds]) annotated.push({ ...t, wsOnly: ws });
        } else {
            annotated.push(parsed[i++]);
        }
    }

    const wsOnly = hasChanges && allChangesAreWs;

    // Build HTML; ws-only groups get muted dashed styling or are hidden when ignoreWhitespace is on.
    const out = [];
    for (let j = 0; j < annotated.length; j++) {
        const t = annotated[j];
        if (t.type === 'hunk') {
            const hasVisible = annotated.slice(j + 1).some(
                l => (l.type === 'add' || l.type === 'rem') && !(ignoreWhitespace && l.wsOnly)
            );
            if (hasVisible) out.push(`<div class="diff-line diff-hunk">${escapeText(t.raw)}</div>`);
        } else if (t.type === 'add') {
            if (ignoreWhitespace && t.wsOnly) continue;
            const cls = t.wsOnly ? 'diff-ws-add' : 'diff-add';
            out.push(`<div class="diff-line ${cls}">${escapeText(t.raw)}</div>`);
        } else if (t.type === 'rem') {
            if (ignoreWhitespace && t.wsOnly) continue;
            const cls = t.wsOnly ? 'diff-ws-rem' : 'diff-rem';
            out.push(`<div class="diff-line ${cls}">${escapeText(t.raw)}</div>`);
        } else {
            out.push(`<div class="diff-line diff-ctx">${escapeText(t.raw || ' ')}</div>`);
        }
    }

    return { html: out.join(''), wsOnly };
}

function isWhitespaceOnlyChange(rems, adds) {
    const all = [...rems, ...adds];
    if (all.every(l => l.content.trim() === '')) return true;
    if (rems.length === adds.length && rems.length > 0) {
        return rems.every((r, idx) => r.content.trim() === adds[idx].content.trim());
    }
    return false;
}

/* ---------- Save ---------- */

export async function save() {
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
        // loadIndex is imported lazily to avoid circular dep
        if (_loadIndexFn) _loadIndexFn();
    } catch (e) {
        setStatus('Opslaan mislukt: ' + e.message, 'error');
    }
}

let _loadIndexFn = null;
export function setLoadIndexCallback(fn) { _loadIndexFn = fn; }

/* ==================== Personen-modus ==================== */

export function setMode(mode) {
    hideAutocomplete();
    state.mode = mode;
    state.fromPersonBsn = null;
    document.querySelectorAll('.mode-btn').forEach(b =>
        b.classList.toggle('active', b.dataset.mode === mode));
    document.getElementById('files-wrap').hidden = mode !== 'files';
    document.getElementById('persons-wrap').hidden = mode !== 'persons';
    // Reset right pane
    document.getElementById('detail').hidden = true;
    document.getElementById('person-detail').hidden = true;
    document.getElementById('empty-state').textContent = mode === 'persons'
        ? 'Selecteer een persoon links.'
        : 'Selecteer een bestand links.';
    applyFilter();
    syncHash();
}

/* ---------- Validation banner ---------- */

export async function maybeShowValidationBanner() {
    const issues = [];
    if (state.dom && isUwvIkvDoc(state.dom)) {
        issues.push(...validateUwvIkv(state.dom).map(i => ({ ...i, fixable: true })));
    }
    if (state.selected) {
        try {
            const res = await fetch(`${API}/${encodeURIComponent(state.selected)}/schema-issues`);
            if (res.ok) {
                const data = await res.json();
                for (const i of (data.issues || [])) {
                    issues.push({ message: i.message, hint: i.hint || null, fixable: false });
                }
            }
        } catch (e) {
            // schema-validatie niet beschikbaar, stille fout
        }
    }
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
        if (issue.hint) {
            const hint = document.createElement('div');
            hint.className = 'schema-issue-hint';
            hint.textContent = issue.hint;
            li.appendChild(hint);
        }
        list.appendChild(li);
    }
    const hasFixable = issues.some(i => i.fixable !== false);
    document.getElementById('validation-fix-btn').hidden = !hasFixable;
    document.getElementById('validation-banner').hidden = false;
}

export function hideValidationBanner() {
    const banner = document.getElementById('validation-banner');
    if (banner) banner.hidden = true;
}

export async function applyValidationAutoFix() {
    if (!state.dom) return;
    const fixes = autoFixUwvIkv(state.dom);
    if (!fixes.length) {
        setStatus('Niets te fixen.', '');
        hideValidationBanner();
        return;
    }
    pushDomToRaw();
    setStatus('Fixes toegepast (nog niet opgeslagen): ' + fixes.join('; '), 'success');
    await maybeShowValidationBanner();
}

/* ---------- In-file search: shared controller ---------- */

/**
 * Wires up an in-file search bar (input + prev/next/clear buttons + autocomplete).
 * The state object must expose a writable `query` string. onApply runs after every
 * query change. onMove receives +1 or -1 for next/previous (Enter / Shift+Enter and buttons).
 */
export function initSearchController({ ids, state, autocompleteValues, onApply, onMove, trim = true }) {
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

export const formSearch = {
    query: '',
    matches: [],
    idx: -1,
    labels: [],
};

export function initFormSearch() {
    initSearchController({
        ids: { input: 'form-search', prev: 'form-search-prev', next: 'form-search-next', clear: 'form-search-clear' },
        state: formSearch,
        autocompleteValues: formSearch.labels,
        onApply: applyFormSearch,
        onMove: formSearchMove,
        trim: true,
    });
    document.getElementById('form-search-only').addEventListener('change', e => {
        const fields = document.getElementById('form-fields');
        if (fields) fields.classList.toggle('search-only', e.target.checked);
    });
    updateFormSearchCount();
}

export function refreshFormSearch() {
    const map = new Map();
    document.querySelectorAll('#form-fields .form-field > label').forEach(label => {
        const first = label.firstChild;
        const friendlyTxt = first && first.nodeType === 3 ? (first.nodeValue || '').trim() : '';
        if (friendlyTxt && !map.has(friendlyTxt))
            map.set(friendlyTxt, {value: friendlyTxt, label: 'veld', cls: 'ac-hint-field'});
        const fn = label.querySelector('.field-name');
        const fnTxt = fn && fn.textContent.trim();
        if (fnTxt && !map.has(fnTxt))
            map.set(fnTxt, {value: fnTxt, label: 'veld', cls: 'ac-hint-field'});
    });
    document.querySelectorAll('#form-fields .form-card-header, #form-fields .form-list-header').forEach(h => {
        const parts = [];
        h.childNodes.forEach(node => {
            const t = node.textContent.trim();
            if (t && t !== '▾') parts.push(t);
        });
        const txt = parts.join(' ').replace(/\s+\d+$/, '').trim();
        if (txt && !map.has(txt))
            map.set(txt, {value: txt, label: 'sectie', cls: 'ac-hint-section'});
    });
    document.querySelectorAll('#form-fields .form-field input').forEach(input => {
        const v = input.value.trim();
        if (v && !map.has(v))
            map.set(v, {value: v, label: 'waarde', cls: 'ac-hint-value'});
    });
    formSearch.labels.length = 0;
    for (const item of [...map.values()].sort((a, b) => a.value.localeCompare(b.value, 'nl')))
        formSearch.labels.push(item);

    applyFormSearch();
    refreshRawSearchVocab();
}

export function applyFormSearch() {
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
    const onlyWrap = document.getElementById('form-search-only-wrap');
    const total = formSearch.matches.length;
    if (onlyWrap) onlyWrap.hidden = !formSearch.query;
    if (!formSearch.query) {
        count.textContent = '';
        count.classList.remove('no-match');
        prev.disabled = next.disabled = true;
        const fields = document.getElementById('form-fields');
        if (fields) fields.classList.remove('search-only');
        if (document.getElementById('form-search-only')) document.getElementById('form-search-only').checked = false;
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

export const rawSearch = {
    query: '',
    marks: [],
    idx: -1,
    names: [],
};

export function initRawSearch() {
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
    const tags = new Set();
    const attrs = new Set();
    if (state.dom) {
        const all = state.dom.getElementsByTagName('*');
        for (let i = 0; i < all.length; i++) {
            const el = all[i];
            if (el.localName) tags.add(el.localName);
            for (const a of Array.from(el.attributes)) {
                if (a.name) attrs.add(a.name);
            }
        }
    }
    rawSearch.names.length = 0;
    const tagItems = [...tags].sort((a, b) => a.localeCompare(b, 'nl')).map(n => ({value: n, label: 'tag', cls: 'ac-hint-tag'}));
    const attrItems = [...attrs].sort((a, b) => a.localeCompare(b, 'nl')).map(n => ({value: n, label: 'attr', cls: 'ac-hint-attr'}));
    for (const item of [...tagItems, ...attrItems]) rawSearch.names.push(item);
}

function clearRawMarks() {
    for (const m of rawSearch.marks) m.clear();
    rawSearch.marks = [];
    rawSearch.idx = -1;
}

export function applyRawSearch() {
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

