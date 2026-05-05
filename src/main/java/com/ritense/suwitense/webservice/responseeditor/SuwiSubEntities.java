package com.ritense.suwitense.webservice.responseeditor;

import java.util.HashSet;
import java.util.Set;

/**
 * Sub-entity containers in Suwinet responses: nested blocks that represent OTHER persons or
 * entities (employer, partner, child, parent, historical address, ...) than the primary
 * person the response is about.
 *
 * <p>Walkers that read or mutate persoon-level fields skip into these so fields belonging to
 * a different entity don't get mistaken for — or overwritten as — fields of the primary persoon.</p>
 */
final class SuwiSubEntities {

    private SuwiSubEntities() {}

    /**
     * Containers walked-around when MUTATING persoon-level fields (BSN replace, name, current address).
     * {@code VerblijfplaatsHistorisch} is intentionally NOT in this set: the clone-flow rewrites
     * historical addresses too (with cycled values).
     */
    static final Set<String> MUTATION = Set.of(
            "Inkomstenverhouding",
            "Partner",
            "PartnerAanvraagUitkering",
            "Kind",
            "Ouder1",
            "Ouder2",
            "Huwelijk",
            "PersoonAdministratieveEenheid",
            "RechtspersoonAdministratieveEenh",
            "AdministratieveEenheid",
            "Aansprakelijke",
            "AanvraagUitkering",
            "BeslissingOpAanvraagUitkering",
            "Eigendom",
            "OnroerendeZaak"
    );

    /**
     * Containers walked-around when EXTRACTING metadata for the index. Same as {@link #MUTATION}
     * plus {@code VerblijfplaatsHistorisch}: a former address must not leak into the index columns
     * (postcode, woonplaats) of the queried persoon.
     */
    static final Set<String> INDEX;
    static {
        Set<String> idx = new HashSet<>(MUTATION);
        idx.add("VerblijfplaatsHistorisch");
        INDEX = Set.copyOf(idx);
    }
}
