package com.ritense.suwitense.webservice.responseeditor;

/**
 * Base for service-thrown exceptions that map directly to an HTTP status code. The controller
 * has a single handler that turns any subtype into {@code {status, body: {"error": message}}}.
 */
public class ApiException extends RuntimeException {

    private final int status;

    public ApiException(int status, String message) {
        super(message);
        this.status = status;
    }

    public int status() {
        return status;
    }
}
