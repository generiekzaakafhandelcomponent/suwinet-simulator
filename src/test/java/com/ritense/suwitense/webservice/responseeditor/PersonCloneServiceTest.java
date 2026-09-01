package com.ritense.suwitense.webservice.responseeditor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class PersonCloneServiceTest {

    @TempDir
    Path tempDir;

    private PersonCloneService service() {
        return new PersonCloneService(new ResponseFileService(tempDir.toString()));
    }

    private CloneRequest.AddressSpec anyAddress() {
        return new CloneRequest.AddressSpec("Kerkstraat", "1", "1234AB", "Amsterdam", "0363");
    }

    @Test
    void clone_rejectsBlankSourceBsn() {
        CloneRequest req = new CloneRequest("", "999997051", null, null, anyAddress(), null, CloneRequest.ConflictMode.ABORT);
        assertThrows(IllegalArgumentException.class, () -> service().clone(req));
    }

    @Test
    void clone_rejectsInvalidTargetBsn() {
        // 123456789 fails the elfproef
        CloneRequest req = new CloneRequest("999997051", "123456789", null, null, anyAddress(), null, CloneRequest.ConflictMode.ABORT);
        assertThrows(IllegalArgumentException.class, () -> service().clone(req));
    }

    @Test
    void clone_rejectsSameSourceAndTargetBsn() {
        CloneRequest req = new CloneRequest("999997051", "999997051", null, null, anyAddress(), null, CloneRequest.ConflictMode.ABORT);
        assertThrows(IllegalArgumentException.class, () -> service().clone(req));
    }

    @Test
    void clone_rejectsMissingAddress() {
        CloneRequest req = new CloneRequest("999997051", "999991954", null, null, null, null, CloneRequest.ConflictMode.ABORT);
        assertThrows(IllegalArgumentException.class, () -> service().clone(req));
    }

    @Test
    void clone_rejectsMissingConflictMode() {
        CloneRequest req = new CloneRequest("999997051", "999991954", null, null, anyAddress(), null, null);
        assertThrows(IllegalArgumentException.class, () -> service().clone(req));
    }

    @Test
    void clone_returnsEmptyResultWhenNoMatchingFiles() throws Exception {
        // Valid request but no files in tempDir matching sourceBsn
        CloneRequest req = new CloneRequest("999997051", "999991954", null, null, anyAddress(), null, CloneRequest.ConflictMode.ABORT);
        CloneResult result = service().clone(req);
        assertTrue(result.created().isEmpty());
        assertTrue(result.errors().isEmpty());
    }
}
