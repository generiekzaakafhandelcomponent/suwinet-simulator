package com.ritense.suwitense.webservice.responseeditor;

import java.util.List;

public record CloneResult(
        List<String> created,
        List<String> overwritten,
        List<String> skipped,
        List<FileError> errors
) {
    public record FileError(String filename, String message) {}
}
