package com.ritense.suwitense.webservice.responseeditor;

import java.util.concurrent.ThreadLocalRandom;

/**
 * BSN helpers. Implements the Dutch elfproef (11-test) and a generator that
 * stays inside the conventional test range 999990000 - 999999999.
 */
public final class BsnUtil {

    private BsnUtil() {}

    public static boolean isValid(String bsn) {
        if (bsn == null || bsn.length() != 9) return false;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            char c = bsn.charAt(i);
            if (c < '0' || c > '9') return false;
            int digit = c - '0';
            int weight = (i == 8) ? -1 : (9 - i);
            sum += digit * weight;
        }
        return sum % 11 == 0;
    }

    /**
     * Generate a random valid BSN inside the conventional Dutch test range
     * 999990000 - 999999999, satisfying the elfproef.
     */
    public static String generateTestBsn() {
        ThreadLocalRandom rng = ThreadLocalRandom.current();
        for (int attempts = 0; attempts < 1000; attempts++) {
            int tail = rng.nextInt(0, 10000);
            String candidate = String.format("99999%04d", tail);
            if (isValid(candidate)) return candidate;
        }
        throw new IllegalStateException("Could not generate test BSN");
    }
}
