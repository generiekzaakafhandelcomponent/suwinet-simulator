package com.ritense.suwitense.webservice.responseeditor;

import java.util.List;

public record CloneRequest(
        String sourceBsn,
        String targetBsn,
        String newAnr,
        NameSpec newName,
        AddressSpec newAddress,
        List<String> includeFiles,
        ConflictMode conflictMode
) {
    public enum ConflictMode { ABORT, SKIP, OVERWRITE }

    public record NameSpec(String voornamen, String voorvoegsel, String achternaam) {}

    public record AddressSpec(
            String straatnaam,
            String huisnr,
            String postcd,
            String woonplaatsnaam,
            String gemeentecode
    ) {}
}
