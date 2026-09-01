package com.ritense.suwitense.webservice.responseeditor;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

/**
 * Static catalog of every Suwinet service+operation that the simulator exposes via {@code /ws/...}.
 * Used by the response tester to know where to send a SOAP request, which namespace to use, and
 * which key fields to put in the request body. Filename layout matches what the
 * Endpoint classes use to locate the response XML on disk.
 */
@Component
public class ServiceCatalog {

    public enum KeyType { BSN, KENTEKEN, KADASTRAAL_GEMEENTE, KADASTRAAL_PERCEEL }

    public record KeyField(String elementName, String label, KeyType type, String hint) {}

    public record Operation(
            String dienst,
            String operatie,
            String namespace,
            String endpointPath,
            List<KeyField> keys
    ) {
        public String filenameFor(List<String> parts) {
            return dienst + "_" + operatie + "_" + String.join("_", parts) + ".xml";
        }
    }

    private static final KeyField BSN = new KeyField(
            "Burgerservicenr", "BSN", KeyType.BSN, "9 cijfers (elfproef)");
    private static final KeyField KENTEKEN = new KeyField(
            "KentekenVoertuig", "Kenteken", KeyType.KENTEKEN, "bv. 0118SK");
    private static final KeyField CD_KAD_GEMEENTE = new KeyField(
            "CdKadastraleGemeente", "Code kadastrale gemeente", KeyType.KADASTRAAL_GEMEENTE, "bv. 0277");
    private static final KeyField KAD_PERCEELNR = new KeyField(
            "KadastraalPerceelnr", "Kadastraal perceelnummer", KeyType.KADASTRAAL_PERCEEL, "bv. 2839");

    private static final List<Operation> OPERATIONS = List.of(
            new Operation(
                    "BRPDossierPersoonGSD", "AanvraagPersoon",
                    "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200",
                    "/ws/BRPDossierPersoonGSD-v0200/", List.of(BSN)),
            new Operation(
                    "Bijstandsregelingen", "BijstandsregelingenInfo",
                    "http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500",
                    "/ws/Bijstandsregelingen-v0500/", List.of(BSN)),
            new Operation(
                    "DUODossierPersoonGSD", "DUOPersoonsInfo",
                    "http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300",
                    "/ws/DUODossierPersoonGSD-v0300/", List.of(BSN)),
            new Operation(
                    "DUODossierStudiefinancieringGSD", "DUOStudiefinancieringInfo",
                    "http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200",
                    "/ws/DUODossierStudiefinancieringGSD-v0200/", List.of(BSN)),
            new Operation(
                    "KadasterDossierGSD", "PersoonsInfo",
                    "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300",
                    "/ws/KadasterDossierGSD-v0300/", List.of(BSN)),
            new Operation(
                    "KadasterDossierGSD", "ObjectInfoKadastraleAanduiding",
                    "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300",
                    "/ws/KadasterDossierGSD-v0300/", List.of(CD_KAD_GEMEENTE, KAD_PERCEELNR)),
            new Operation(
                    "RDWDossierGSD", "KentekenInfo",
                    "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200",
                    "/ws/RDWDossierGSD-v0200/", List.of(KENTEKEN)),
            new Operation(
                    "RDWDossierGSD", "VoertuigbezitInfoPersoon",
                    "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200",
                    "/ws/RDWDossierGSD-v0200/", List.of(BSN)),
            new Operation(
                    "SVBDossierPersoonGSD", "SVBPersoonsInfo",
                    "http://bkwi.nl/SuwiML/Diensten/SVBDossierPersoonGSD/v0200",
                    "/ws/SVBDossierPersoonGSD-v0200/", List.of(BSN)),
            new Operation(
                    "UWVDossierInkomstenGSD", "UWVPersoonsIkvInfo",
                    "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200",
                    "/ws/UWVDossierInkomstenGSD-v0200/", List.of(BSN))
    );

    public List<Operation> all() {
        return OPERATIONS;
    }

    public Optional<Operation> find(String dienst, String operatie) {
        return OPERATIONS.stream()
                .filter(o -> o.dienst.equalsIgnoreCase(dienst) && o.operatie.equalsIgnoreCase(operatie))
                .findFirst();
    }

    public List<Operation> bsnOperations() {
        return OPERATIONS.stream()
                .filter(o -> o.keys.size() == 1 && o.keys.get(0).type == KeyType.BSN)
                .toList();
    }

    /**
     * Best-effort match of a parsed filename ({@code <dienst>_<operatie>_<sleutel>}) to a known
     * operation. Returns empty when the dienst/operatie pair is not in the catalog.
     */
    public Optional<Operation> matchFile(String dienst, String operatie) {
        return find(dienst, operatie);
    }

    /**
     * Split the {@code sleutel} segment of a filename ({@code 999991954}, or
     * {@code 0277_4711} for the kadaster object dienst) into its key parts.
     */
    public List<String> splitSleutel(Operation op, String sleutel) {
        if (op.keys.size() == 1) {
            return List.of(sleutel);
        }
        // Multi-key operations join key parts with '_'.
        String[] parts = sleutel.split("_");
        if (parts.length != op.keys.size()) {
            throw new IllegalArgumentException(
                    "sleutel '" + sleutel + "' heeft " + parts.length
                            + " delen, verwacht " + op.keys.size()
                            + " voor " + op.dienst + "/" + op.operatie);
        }
        return List.of(parts);
    }

    public static String normalizeBsn(String input) {
        return input == null ? "" : input.trim().toLowerCase(Locale.ROOT);
    }
}
