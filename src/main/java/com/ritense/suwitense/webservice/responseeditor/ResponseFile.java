package com.ritense.suwitense.webservice.responseeditor;

import java.util.Map;

public record ResponseFile(
        String filename,
        String dienst,
        String operatie,
        String sleutel,
        boolean isRequest,
        Map<String, String> metadata
) {
}
