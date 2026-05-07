import { escapeText, escapeAttr, API } from './constants.js';

export function parseXmlOrNull(xmlString) {
    const doc = new DOMParser().parseFromString(xmlString, 'application/xml');
    if (doc.querySelector('parsererror')) return null;
    return doc;
}

export function parseXml(xml) {
    const doc = new DOMParser().parseFromString(xml, 'application/xml');
    const err = doc.getElementsByTagName('parsererror')[0];
    if (err) throw new Error('XML-parsefout: ' + err.textContent);
    return doc;
}

export function serializeXml(doc) {
    return serializeNode(doc.documentElement, 0);
}

export function serializeNode(node, indent) {
    const pad = '    '.repeat(indent);
    if (node.nodeType === 8) {
        return pad + '<!-- ' + node.nodeValue.trim() + ' -->';
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

export function elementChildren(el) {
    return Array.from(el.children);
}

export function appendChild(parent, name, text) {
    const el = parent.ownerDocument.createElement(name);
    el.textContent = text;
    parent.appendChild(el);
}

export function daysBetween(startYmd, endYmd) {
    const s = ymdToDate(startYmd);
    const e = ymdToDate(endYmd);
    return Math.round((e - s) / 86400000) + 1;
}

export function ymdToDate(s) {
    return new Date(
        parseInt(s.slice(0, 4), 10),
        parseInt(s.slice(4, 6), 10) - 1,
        parseInt(s.slice(6, 8), 10),
    );
}

export function isOpenEndedYmd(s) {
    return typeof s === 'string' && s.startsWith('9999');
}

export function isUwvIkvDoc(dom) {
    return !!(dom && dom.documentElement && dom.documentElement.localName === 'UWVPersoonsIkvInfoResponse');
}

/** Returns the first direct element child of `parent` with the given local name, or null. */
export function firstElementChildByName(parent, localName) {
    if (!parent) return null;
    const kids = parent.childNodes;
    for (let i = 0; i < kids.length; i++) {
        const k = kids[i];
        if (k.nodeType === 1 && k.localName === localName) return k;
    }
    return null;
}

export async function fetchXmlIfExists(filename) {
    const res = await fetch(`${API}/${encodeURIComponent(filename)}`);
    if (res.status === 404) return null;
    if (!res.ok) throw new Error(res.status + ' ' + res.statusText);
    return await res.text();
}

export async function putXml(filename, xml) {
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

export async function postXml(filename, xml) {
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
export function monthlyPeriods(today, count) {
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

/* ---------- UWV builder functions ---------- */

export function uwvIkvSpec(type) {
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

export function appendUwvInkomstenverhouding(xml, type, periods, brutoCent, werkgever, aliIngehoudenCent, aliRechtstreeksCent) {
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

export function buildUwvSkeleton(person, type, periods, brutoCent, werkgever, aliIngehoudenCent, aliRechtstreeksCent) {
    const xml = `<smls:UWVPersoonsIkvInfoResponse xmlns:smls="http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200">
    <ClientSuwi>
        <Burgerservicenr>${escapeText(person.bsn)}</Burgerservicenr>
    </ClientSuwi>
</smls:UWVPersoonsIkvInfoResponse>`;
    return appendUwvInkomstenverhouding(xml, type, periods, brutoCent, werkgever, aliIngehoudenCent, aliRechtstreeksCent);
}

/* ---------- SVB builder functions ---------- */

export function appendSvbUitkering(xml, periods, brutoCent, nettoCent, cdSzWet) {
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

export function buildSvbSkeleton(person, periods, brutoCent, nettoCent, cdSzWet) {
    const xml = `<ns4:SVBPersoonsInfoResponse xmlns:ns3="http://bkwi.nl/SuwiML/FWI/v0205" xmlns:ns4="http://bkwi.nl/SuwiML/Diensten/SVBDossierPersoonGSD/v0200">
    <ClientSuwi>
        <Burgerservicenr>${escapeText(person.bsn)}</Burgerservicenr>
    </ClientSuwi>
</ns4:SVBPersoonsInfoResponse>`;
    return appendSvbUitkering(xml, periods, brutoCent, nettoCent, cdSzWet);
}

/* ---------- DUO builder functions ---------- */

export function appendDuoStudiefinanciering(xml, periods) {
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

export function buildDuoStudiefinancieringSkeleton(person, periods) {
    const xml = `<s60:DUOStudiefinancieringInfoResponse xmlns:s60="http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200">
    <ClientSuwi>
        <Burgerservicenr>${escapeText(person.bsn)}</Burgerservicenr>
    </ClientSuwi>
</s60:DUOStudiefinancieringInfoResponse>`;
    return appendDuoStudiefinanciering(xml, periods);
}

/* ==================== Validatie: UWV-inkomsten-bestand ==================== */

/** Inspects the loaded UWV-Ikv document and returns an array of issue objects. */
export function validateUwvIkv(dom) {
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

function formatDate(yyyymmdd) {
    if (!yyyymmdd || yyyymmdd.length !== 8 || !/^\d{8}$/.test(yyyymmdd)) {
        return String(yyyymmdd || '');
    }
    return `${yyyymmdd.slice(6, 8)}-${yyyymmdd.slice(4, 6)}-${yyyymmdd.slice(0, 4)}`;
}

/**
 * Bepaalt min/max datum die `PeriodeGegevensleveringIko` zou moeten dekken,
 * op basis van alle DatB/DatE-velden binnen Inkomstenperiode/Inkomstenopgave.
 * `99991230`/`99991231`-markers (geen-einddatum) worden genegeerd.
 * Eventueel hoger eindigt op vandaag (gecapt).
 */
export function computeExpectedIkoPeriode(dom) {
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
export function autoFixUwvIkv(dom) {
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
export function updatePeriodeGegevensleveringIko(dom) {
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
