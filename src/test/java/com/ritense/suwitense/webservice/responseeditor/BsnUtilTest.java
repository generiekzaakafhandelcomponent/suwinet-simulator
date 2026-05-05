package com.ritense.suwitense.webservice.responseeditor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BsnUtilTest {

    @ParameterizedTest
    @ValueSource(strings = {"999997051", "999991954", "022264541", "689735273"})
    void isValid_knownValidBsns(String bsn) {
        assertTrue(BsnUtil.isValid(bsn));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123456789", "111111111", "999999999", "999990001"})
    void isValid_knownInvalidBsns(String bsn) {
        assertFalse(BsnUtil.isValid(bsn));
    }

    @Test
    void isValid_null_returnsFalse() {
        assertFalse(BsnUtil.isValid(null));
    }

    @Test
    void isValid_tooShort_returnsFalse() {
        assertFalse(BsnUtil.isValid("12345678"));
    }

    @Test
    void isValid_tooLong_returnsFalse() {
        assertFalse(BsnUtil.isValid("1234567890"));
    }

    @Test
    void isValid_nonDigit_returnsFalse() {
        assertFalse(BsnUtil.isValid("12345678A"));
    }

    @Test
    void generateTestBsn_producesValidBsn() {
        for (int i = 0; i < 20; i++) {
            String bsn = BsnUtil.generateTestBsn();
            assertTrue(BsnUtil.isValid(bsn), "Generated BSN failed elfproef: " + bsn);
        }
    }

    @Test
    void generateTestBsn_staysInTestRange() {
        for (int i = 0; i < 20; i++) {
            String bsn = BsnUtil.generateTestBsn();
            assertTrue(bsn.startsWith("99999"), "Generated BSN outside test range: " + bsn);
        }
    }
}
