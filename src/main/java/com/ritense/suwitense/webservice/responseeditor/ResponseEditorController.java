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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/responses")
public class ResponseEditorController {

    private final ResponseFileService service;
    private final PersonCloneService cloneService;
    private final GitService gitService;
    private final ResponseTestService testService;
    private final ServiceCatalog catalog;
    private final XsdValidationService xsdValidator;

    public ResponseEditorController(
            ResponseFileService service,
            PersonCloneService cloneService,
            GitService gitService,
            ResponseTestService testService,
            ServiceCatalog catalog,
            XsdValidationService xsdValidator) {
        this.service = service;
        this.cloneService = cloneService;
        this.gitService = gitService;
        this.testService = testService;
        this.catalog = catalog;
        this.xsdValidator = xsdValidator;
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

    /**
     * Streaming variant of {@link #list()}: parsing all response files takes a noticeable
     * moment, so this emits "total" up front and a "progress" event per parsed file, then a
     * final "index" event with the same payload as {@link #list()}. Lets the UI show a real
     * progress bar instead of an empty table. Falls back to {@link #list()} when EventSource
     * is unavailable client-side.
     */
    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter listStream() {
        SseEmitter emitter = new SseEmitter(300_000L);
        new Thread(() -> {
            try {
                List<ResponseFile> files = service.list(
                        total -> {
                            try {
                                emitter.send(SseEmitter.event().name("total").data(total));
                            } catch (IOException e) {
                                throw new UncheckedIOException(e);
                            }
                        },
                        done -> {
                            try {
                                emitter.send(SseEmitter.event().name("progress").data(done));
                            } catch (IOException e) {
                                throw new UncheckedIOException(e);
                            }
                        });
                emitter.send(SseEmitter.event().name("index").data(Map.of(
                        "baseDir", service.baseDir().toString(),
                        "count", files.size(),
                        "files", files
                )));
                emitter.send(SseEmitter.event().name("done").data(""));
                emitter.complete();
            } catch (Exception e) {
                emitter.completeWithError(e);
            }
        }).start();
        return emitter;
    }

    @GetMapping(value = "/test-bsn", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> generateTestBsn() {
        return Map.of("bsn", BsnUtil.generateTestBsn());
    }

    @GetMapping(value = "/git-status", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> gitStatus() {
        return Map.of(
                "available", gitService.isAvailable(),
                "statuses", gitService.status()
        );
    }

    @GetMapping(value = "/git-diff/{filename:.+}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> gitDiff(@PathVariable String filename) {
        return gitService.unifiedDiff(filename)
                .map(diff -> ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body(diff))
                .orElseGet(() -> ResponseEntity.notFound().build());
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

    /** Catalog of testable operations + key shapes — drives the "Test"-mode dropdowns. */
    @GetMapping(value = "/test/catalog", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> testCatalog() {
        List<Map<String, Object>> ops = catalog.all().stream()
                .map(o -> {
                    List<Map<String, String>> keys = o.keys().stream()
                            .map(k -> Map.of(
                                    "elementName", k.elementName(),
                                    "label", k.label(),
                                    "type", k.type().name(),
                                    "hint", k.hint()
                            ))
                            .toList();
                    Map<String, Object> m = new LinkedHashMap<>();
                    m.put("dienst", o.dienst());
                    m.put("operatie", o.operatie());
                    m.put("namespace", o.namespace());
                    m.put("endpointPath", o.endpointPath());
                    m.put("keys", keys);
                    return m;
                })
                .toList();
        return Map.of("operations", ops);
    }

    /** Run a single SOAP test. Body: {@code {dienst, operatie, keys: [...], compareToFile?: bool}}. */
    @PostMapping(value = "/test", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public TestResult test(@RequestBody TestRunRequest req) {
        boolean compare = req.compareToFile() == null || req.compareToFile();
        return testService.test(req.dienst(), req.operatie(), req.keys(), compare);
    }

    /**
     * Run every BSN-keyed operation against one BSN. Body: {@code {bsn, compareToFile?: bool}}.
     * Returns one {@link TestResult} per operation.
     */
    @PostMapping(value = "/test/person", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> testPerson(@RequestBody PersonTestRequest req) {
        boolean compare = req.compareToFile() == null || req.compareToFile();
        List<TestResult> results = testService.testAllForBsn(req.bsn(), compare);
        return Map.of("bsn", req.bsn(), "results", results);
    }

    /** Test every response file on disk. Body: {@code {compareToFile?: bool}} (optional). */
    @PostMapping(value = "/test/all", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> testAll(@RequestBody(required = false) AllTestRequest req) {
        boolean compare = req == null || req.compareToFile() == null || req.compareToFile();
        List<TestResult> results = testService.testAll(compare);
        return Map.of("results", results, "count", results.size());
    }

    /**
     * Stream every response-file test as Server-Sent Events so the frontend can render results
     * progressively. Each event is named {@code result} (JSON-serialized {@link TestResult});
     * a final {@code done} event signals completion.
     */
    @GetMapping(value = "/test/all/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter testAllStream(@RequestParam(defaultValue = "true") boolean compareToFile) {
        SseEmitter emitter = new SseEmitter(300_000L);
        new Thread(() -> {
            try {
                testService.testAllStream(compareToFile,
                        total -> {
                            try {
                                emitter.send(SseEmitter.event().name("total").data(total));
                            } catch (IOException e) {
                                throw new UncheckedIOException(e);
                            }
                        },
                        result -> {
                            try {
                                emitter.send(SseEmitter.event().name("result").data(result));
                            } catch (IOException e) {
                                throw new UncheckedIOException(e);
                            }
                        });
                emitter.send(SseEmitter.event().name("done").data(""));
                emitter.complete();
            } catch (Exception e) {
                emitter.completeWithError(e);
            }
        }).start();
        return emitter;
    }

    /**
     * Overwrite an existing response file with the actual SOAP response body. Intended for the
     * "accept actual" flow in the test UI: the test round-trip already produced the JAXB-serialized
     * XML; this endpoint persists it as the new stored response.
     */
    @PostMapping(value = "/{filename:.+}/accept-actual", consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Void> acceptActual(@PathVariable String filename, @RequestBody String xml) throws IOException {
        if (filename.endsWith("-request.xml")) {
            throw new ApiException(400, "accept-actual is niet van toepassing op request-bestanden");
        }
        service.write(filename, xml);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{filename:.+}/schema-issues", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> schemaIssues(@PathVariable String filename) throws IOException {
        if (filename.endsWith("-request.xml")) return Map.of("issues", List.of());
        String dienst = filename.contains("_") ? filename.split("_")[0] : "";
        String xml = service.read(filename);
        List<XsdValidationService.Issue> issues = xsdValidator.validate(dienst, xml);
        return Map.of("issues", issues);
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

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<Map<String, String>> handleApi(ApiException e) {
        return ResponseEntity.status(e.status()).body(Map.of("error", e.getMessage()));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handleIllegal(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
    }

    /** Request body for {@link #test}. */
    public record TestRunRequest(String dienst, String operatie, List<String> keys, Boolean compareToFile) {}

    /** Request body for {@link #testPerson}. */
    public record PersonTestRequest(String bsn, Boolean compareToFile) {}

    /** Request body for {@link #testAll}. */
    public record AllTestRequest(Boolean compareToFile) {}
}
