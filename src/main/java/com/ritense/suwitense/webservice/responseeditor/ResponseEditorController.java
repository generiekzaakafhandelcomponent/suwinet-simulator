package com.ritense.suwitense.webservice.responseeditor;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/responses")
public class ResponseEditorController {

    private final ResponseFileService service;
    private final PersonCloneService cloneService;

    public ResponseEditorController(ResponseFileService service, PersonCloneService cloneService) {
        this.service = service;
        this.cloneService = cloneService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> list() throws IOException {
        List<ResponseFile> files = service.list();
        return Map.of(
                "baseDir", service.baseDir().toString(),
                "count", files.size(),
                "files", files
        );
    }

    @GetMapping(value = "/test-bsn", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> generateTestBsn() {
        return Map.of("bsn", BsnUtil.generateTestBsn());
    }

    @PostMapping(value = "/clone", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> clone(@RequestBody CloneRequest request) throws IOException {
        try {
            CloneResult result = cloneService.clone(request);
            return ResponseEntity.ok(result);
        } catch (PersonCloneService.ConflictException e) {
            return ResponseEntity.status(409).body(Map.of(
                    "error", "conflict",
                    "conflicts", e.conflicts()
            ));
        }
    }

    @GetMapping(value = "/{filename:.+}", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<String> read(@PathVariable String filename) throws IOException {
        return ResponseEntity.ok(service.read(filename));
    }

    @PutMapping(value = "/{filename:.+}", consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Void> write(@PathVariable String filename, @RequestBody String xml) throws IOException {
        service.write(filename, xml);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/{filename:.+}", consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Void> create(@PathVariable String filename, @RequestBody String xml) throws IOException {
        service.create(filename, xml);
        return ResponseEntity.status(201).build();
    }

    @ExceptionHandler(ResponseFileService.ResponseFileNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleNotFound(ResponseFileService.ResponseFileNotFoundException e) {
        return ResponseEntity.status(404).body(Map.of("error", e.getMessage()));
    }

    @ExceptionHandler(ResponseFileService.ResponseFileExistsException.class)
    public ResponseEntity<Map<String, String>> handleExists(ResponseFileService.ResponseFileExistsException e) {
        return ResponseEntity.status(409).body(Map.of("error", e.getMessage()));
    }

    @ExceptionHandler(ResponseFileService.InvalidXmlException.class)
    public ResponseEntity<Map<String, String>> handleInvalid(ResponseFileService.InvalidXmlException e) {
        return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handleIllegal(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
    }
}
