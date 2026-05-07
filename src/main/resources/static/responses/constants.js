export const API = '/admin/responses';

/** Friendly labels for known XML element names. Unknown names fall back to the raw element name. */
export const FRIENDLY_LABELS = {
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
export const DATE_FIELD_PATTERN = /^(Dat|Geboortedat)/;

/** Maps a complex XML element to a visual category (color + icon) used for form-card / form-list styling. */
export const ELEMENT_CATEGORY = {
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

/** Maps lowercase metadata field names (from ResponseFileService) to a visual category. */
export const METADATA_FIELD_CATEGORY = {
    burgerservicenr: 'identity',
    voornamen: 'identity',
    voorletters: 'identity',
    voorvoegsel: 'identity',
    significantdeelvandeachternaam: 'identity',
    geboortedat: 'identity',
    geslacht: 'identity',
    naam_uit_brp: 'identity',
    postcd: 'address',
    woonplaatsnaam: 'address',
    straatnaam: 'address',
    huisnr: 'address',
    cdkadastralegemeente: 'property',
    kadastraalperceelnr: 'property',
    kentekenvoertuig: 'vehicle',
    merkvoertuig: 'vehicle',
};

export const CATEGORY_ICONS = {
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

export function categoryFor(name) {
    return ELEMENT_CATEGORY[name] || 'default';
}

/** Maps a Suwinet dienst-name to a CSS class used to color the dienst-pill. */
export function dienstClass(d) {
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

export const FILE_COL_KEYS = ['dienst', 'operatie', 'sleutel', 'naam', 'geboortedat', 'postcd', 'woonplaatsnaam', 'extra'];
export const PERSON_COL_KEYS = ['bsn', 'naam', 'geboortedat', 'woonplaatsnaam', 'diensten'];
/** Up to this many unique values: dropdown. Beyond it: text input + datalist autocomplete (substring match). */
export const FILTER_DROPDOWN_THRESHOLD = 7;

export function formatDate(yyyymmdd) {
    if (!yyyymmdd || yyyymmdd.length !== 8 || !/^\d{8}$/.test(yyyymmdd)) {
        return escapeText(yyyymmdd || '');
    }
    return `${yyyymmdd.slice(6, 8)}-${yyyymmdd.slice(4, 6)}-${yyyymmdd.slice(0, 4)}`;
}

export function escapeText(s) {
    return String(s ?? '')
        .replace(/&/g, '&amp;')
        .replace(/</g, '&lt;')
        .replace(/>/g, '&gt;');
}

export function escapeAttr(s) {
    return escapeText(s).replace(/"/g, '&quot;');
}

export function naam(f) {
    const m = f.metadata || {};
    const first = m.voornamen || m.voorletters || '';
    const tussen = m.voorvoegsel ? m.voorvoegsel + ' ' : '';
    const last = m.significantdeelvandeachternaam || '';
    const own = [first, tussen + last].filter(Boolean).join(' ').trim();
    return own || (m.naam_uit_brp || '');
}

export function isNameBorrowedFromBrp(f) {
    const m = f.metadata || {};
    return !m.voornamen && !m.voorletters && !m.significantdeelvandeachternaam && !!m.naam_uit_brp;
}

export function highlightTerm(text, ql) {
    const idx = text.toLowerCase().indexOf(ql);
    if (idx < 0) return escapeText(text);
    return escapeText(text.substring(0, idx))
        + '<mark>' + escapeText(text.substring(idx, idx + ql.length)) + '</mark>'
        + escapeText(text.substring(idx + ql.length));
}

export function buildSearchMatchHint(file, ql) {
    // Prefer a clean metadata match (e.g. "postcd: 2511BT")
    for (const [k, v] of Object.entries(file.metadata || {})) {
        if (!k.startsWith('_') && v && v.toLowerCase().includes(ql)) {
            return `<span class="search-match-hint">${escapeText(k)}: ${highlightTerm(v, ql)}</span>`;
        }
    }
    // Fall back to a short text snippet from raw XML content
    const content = file.content || '';
    const idx = content.toLowerCase().indexOf(ql);
    if (idx < 0) return '';
    const start = Math.max(0, idx - 25);
    const end = Math.min(content.length, idx + ql.length + 25);
    const raw = content.substring(start, end).replace(/<[^>]*>/g, ' ').replace(/\s+/g, ' ').trim();
    const prefix = start > 0 ? '…' : '';
    const suffix = end < content.length ? '…' : '';
    return `<span class="search-match-hint">${prefix}${highlightTerm(raw, ql)}${suffix}</span>`;
}

export function shortDienst(d) {
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
