package com.ritense.suwitense.webservice.responseeditor;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
public class GitService {

    private static final Logger logger = LoggerFactory.getLogger(GitService.class);
    private static final long EXEC_TIMEOUT_SECONDS = 5;

    private final ResponseFileService fileService;
    private boolean available;
    /** Path of the responses dir relative to the git repo root, with trailing slash. Empty if at root. */
    private String prefix = "";

    public GitService(ResponseFileService fileService) {
        this.fileService = fileService;
    }

    @PostConstruct
    void detect() {
        try {
            ExecResult inside = exec("rev-parse", "--is-inside-work-tree");
            this.available = inside.exitCode == 0 && inside.stdout.trim().equals("true");
            if (available) {
                ExecResult pfx = exec("rev-parse", "--show-prefix");
                if (pfx.exitCode == 0) {
                    this.prefix = pfx.stdout.trim();
                }
            }
            logger.info("Git diff support: available={} prefix='{}' (baseDir={})", available, prefix, fileService.baseDir());
        } catch (Exception e) {
            this.available = false;
            logger.info("Git not detected for responses dir; diff disabled: {}", e.getMessage());
        }
    }

    public boolean isAvailable() {
        return available;
    }

    /**
     * Status codes per file (relative to baseDir), as produced by {@code git status --porcelain}.
     * Two-character codes like "M ", " M", "??", "A ", "AM", "MM" are returned trimmed where useful.
     */
    public Map<String, String> status() {
        if (!available) return Map.of();
        try {
            ExecResult r = exec("status", "--porcelain", "--", ".");
            if (r.exitCode != 0) {
                logger.warn("git status failed (exit={}): {}", r.exitCode, r.stderr);
                return Map.of();
            }
            Map<String, String> out = new HashMap<>();
            for (String line : r.stdout.split("\n")) {
                if (line.length() < 4) continue;
                String code = line.substring(0, 2);
                String path = line.substring(3);
                int arrow = path.indexOf(" -> ");
                if (arrow >= 0) path = path.substring(arrow + 4);
                if (path.startsWith("\"") && path.endsWith("\"")) {
                    path = path.substring(1, path.length() - 1);
                }
                // git status prints repo-root-relative paths; strip the responses-dir prefix
                // so the map is keyed by just the filename (matches what the UI shows).
                if (!prefix.isEmpty() && path.startsWith(prefix)) {
                    path = path.substring(prefix.length());
                }
                if (path.contains("/")) continue; // skip anything still nested below baseDir
                out.put(path, code);
            }
            return out;
        } catch (Exception e) {
            logger.warn("git status execution error", e);
            return Map.of();
        }
    }

    /**
     * Unified diff for a single file (HEAD vs working tree), as returned by {@code git diff HEAD -- <file>}.
     * Returns empty for untracked files (no HEAD entry) — caller can then treat the whole file as "added".
     */
    public Optional<String> unifiedDiff(String filename) {
        if (!available) return Optional.empty();
        validateFilename(filename);
        try {
            // -b / --ignore-space-change: skips noise from XML round-trip whitespace
            // changes (e.g. spacing inside comments) while still showing real content edits
            // and added/removed lines.
            ExecResult r = exec("diff", "--no-color", "--ignore-space-change", "HEAD", "--", filename);
            if (r.exitCode != 0) {
                logger.debug("git diff returned exit={} for {}: {}", r.exitCode, filename, r.stderr);
                return Optional.empty();
            }
            return Optional.of(r.stdout);
        } catch (Exception e) {
            logger.debug("git diff failed for {}: {}", filename, e.getMessage());
            return Optional.empty();
        }
    }

    private static void validateFilename(String filename) {
        if (filename == null || filename.isBlank()) {
            throw new IllegalArgumentException("filename required");
        }
        if (filename.contains("/") || filename.contains("\\") || filename.contains("..")) {
            throw new IllegalArgumentException("Invalid filename: " + filename);
        }
    }

    private ExecResult exec(String... gitArgs) throws IOException, InterruptedException {
        String[] cmd = new String[gitArgs.length + 3];
        cmd[0] = "git";
        cmd[1] = "-C";
        cmd[2] = fileService.baseDir().toString();
        System.arraycopy(gitArgs, 0, cmd, 3, gitArgs.length);

        ProcessBuilder pb = new ProcessBuilder(cmd);
        Process p = pb.start();

        StringBuilder out = new StringBuilder();
        StringBuilder err = new StringBuilder();
        Thread tOut = new Thread(() -> drain(p.getInputStream(), out));
        Thread tErr = new Thread(() -> drain(p.getErrorStream(), err));
        tOut.start();
        tErr.start();

        boolean finished = p.waitFor(EXEC_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        if (!finished) {
            p.destroyForcibly();
            tOut.join(500);
            tErr.join(500);
            throw new IOException("git command timed out: " + String.join(" ", cmd));
        }
        tOut.join();
        tErr.join();
        return new ExecResult(p.exitValue(), out.toString(), err.toString());
    }

    private static void drain(InputStream in, StringBuilder sink) {
        try (BufferedReader r = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
            char[] buf = new char[4096];
            int n;
            while ((n = r.read(buf)) >= 0) sink.append(buf, 0, n);
        } catch (IOException ignored) {
        }
    }

    private record ExecResult(int exitCode, String stdout, String stderr) {
    }
}
