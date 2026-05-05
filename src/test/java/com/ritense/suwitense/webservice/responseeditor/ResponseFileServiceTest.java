package com.ritense.suwitense.webservice.responseeditor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResponseFileServiceTest {

    @TempDir
    Path tempDir;

    private ResponseFileService service() {
        return new ResponseFileService(tempDir.toString());
    }

    // --- Path traversal security ---

    @ParameterizedTest
    @ValueSource(strings = {"../secret.xml", "subdir/file.xml", "file\\other.xml"})
    void read_rejectsUnsafePaths(String filename) {
        assertThrows(IllegalArgumentException.class, () -> service().read(filename));
    }

    @Test
    void read_rejectsBlankFilename() {
        assertThrows(IllegalArgumentException.class, () -> service().read("  "));
    }

    // --- XML well-formedness validation ---

    @Test
    void write_rejectsMalformedXml() throws IOException {
        Path existing = tempDir.resolve("test.xml");
        Files.writeString(existing, "<valid/>", StandardCharsets.UTF_8);
        ResponseFileService svc = service();
        assertThrows(ResponseFileService.InvalidXmlException.class,
                () -> svc.write("test.xml", "<not closed"));
    }

    @Test
    void write_rejectsEmptyPayload() throws IOException {
        Path existing = tempDir.resolve("test.xml");
        Files.writeString(existing, "<valid/>", StandardCharsets.UTF_8);
        ResponseFileService svc = service();
        assertThrows(ResponseFileService.InvalidXmlException.class,
                () -> svc.write("test.xml", "   "));
    }

    @Test
    void create_throwsWhenFileAlreadyExists() throws IOException {
        Path existing = tempDir.resolve("existing.xml");
        Files.writeString(existing, "<root/>", StandardCharsets.UTF_8);
        assertThrows(ResponseFileService.ResponseFileExistsException.class,
                () -> service().create("existing.xml", "<root/>"));
    }

    @Test
    void write_throwsWhenFileDoesNotExist() {
        assertThrows(ResponseFileService.ResponseFileNotFoundException.class,
                () -> service().write("nonexistent.xml", "<root/>"));
    }

    // --- list() parses filename structure ---

    @Test
    void list_parsesFilenameIntoDienstOperatieSleutel() throws IOException {
        Files.writeString(
                tempDir.resolve("SVBDossierPersoonGSD_SVBPersoonsInfo_999997051.xml"),
                "<root/>", StandardCharsets.UTF_8);
        List<ResponseFile> files = service().list();
        assertEquals(1, files.size());
        ResponseFile f = files.get(0);
        assertEquals("SVBDossierPersoonGSD", f.dienst());
        assertEquals("SVBPersoonsInfo", f.operatie());
        assertEquals("999997051", f.sleutel());
        assertFalse(f.isRequest());
    }

    @Test
    void list_recognisesRequestSuffix() throws IOException {
        Files.writeString(
                tempDir.resolve("BRPDossierPersoonGSD_AanvraagPersoon_999997051-request.xml"),
                "<root/>", StandardCharsets.UTF_8);
        List<ResponseFile> files = service().list();
        assertEquals(1, files.size());
        assertTrue(files.get(0).isRequest());
    }
}
