package com.ritense.suwitense.webservice.responseeditor;

import java.util.List;

/**
 * Outcome of one round-trip SOAP test against the simulator. Returned to the frontend as JSON.
 *
 * @param outcome           coarse result for UI rendering (icon + colour)
 * @param nietGevonden      true when the simulator returned its {@code <NietsGevonden>} payload
 *                          (i.e. no XML file matched the request)
 * @param expectedFile      filename the simulator would have looked up (always set, even when
 *                          the file doesn't exist)
 * @param expectedFileExists whether {@link #expectedFile} actually exists on disk
 * @param match             {@code null} when no comparison was requested or possible; otherwise
 *                          true when canonicalized expected matches canonicalized actual
 * @param actualXml         response body (single root element, canonicalized) — null on failure
 * @param expectedXml       canonicalized contents of {@link #expectedFile} — null when not compared
 * @param requestEnvelope   the SOAP envelope we sent (for "show me what was tested")
 * @param errorMessage      transport-error / non-2xx body, populated for HTTP/TRANSPORT failures
 */
public record TestResult(
        String dienst,
        String operatie,
        List<String> keyValues,
        int httpStatus,
        long durationMs,
        Outcome outcome,
        boolean nietGevonden,
        String expectedFile,
        boolean expectedFileExists,
        Boolean match,
        String actualXml,
        String expectedXml,
        String requestEnvelope,
        String errorMessage
) {

    public enum Outcome {
        /** File matched and canonicalized response equals canonicalized file. */
        MATCH,
        /** Response came back fine but differs from the file on disk. */
        MISMATCH,
        /** Simulator returned its NietsGevonden body — request didn't resolve to a file. */
        NIET_GEVONDEN,
        /** Comparison was not requested but the request returned a body successfully. */
        OK,
        /** Comparison was requested but no expected file exists for this key. */
        NO_EXPECTED_FILE,
        /** HTTP returned non-2xx, or response body was unparseable. */
        HTTP_FAILURE,
        /** Connection refused / timeout / similar — never reached the simulator. */
        TRANSPORT_FAILURE
    }

    public static TestResult transportFailure(
            ServiceCatalog.Operation op, List<String> keyValues, String errorMessage, long durationMs) {
        return new TestResult(
                op.dienst(), op.operatie(), keyValues,
                0, durationMs, Outcome.TRANSPORT_FAILURE,
                false, op.filenameFor(keyValues), false, null,
                null, null, null, errorMessage
        );
    }

    public static TestResult httpFailure(
            ServiceCatalog.Operation op, List<String> keyValues, int statusCode, String body, long durationMs) {
        return new TestResult(
                op.dienst(), op.operatie(), keyValues,
                statusCode, durationMs, Outcome.HTTP_FAILURE,
                false, op.filenameFor(keyValues), false, null,
                body, null, null, "HTTP " + statusCode
        );
    }
}
