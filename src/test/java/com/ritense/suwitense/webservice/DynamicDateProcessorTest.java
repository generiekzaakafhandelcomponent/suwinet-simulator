package com.ritense.suwitense.webservice;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class DynamicDateProcessorTest {

    private static final LocalDate TODAY = LocalDate.of(2026, 5, 4);

    @Test
    void leavesXmlUntouchedWhenNoMarkerPresent() {
        String xml = "<root><DatEIkv>20240131</DatEIkv></root>";
        assertSame(xml, DynamicDateProcessor.process(xml, TODAY));
    }

    @Test
    void substitutesTodayWithoutOffsetCompactFormat() {
        String xml = "<root><!-- DynamicDate: today --><DatEIkv>20240131</DatEIkv></root>";
        String expected = "<root><!-- DynamicDate: today --><DatEIkv>20260504</DatEIkv></root>";
        assertEquals(expected, DynamicDateProcessor.process(xml, TODAY));
    }

    @Test
    void substitutesNegativeMonthOffset() {
        String xml = "<root><!-- DynamicDate: today - 2 months --><DatEIkv>20240131</DatEIkv></root>";
        String expected = "<root><!-- DynamicDate: today - 2 months --><DatEIkv>20260304</DatEIkv></root>";
        assertEquals(expected, DynamicDateProcessor.process(xml, TODAY));
    }

    @Test
    void substitutesNegativeDayOffset() {
        String xml = "<a><!-- DynamicDate: today - 90 days --><Datum>20240101</Datum></a>";
        String expected = "<a><!-- DynamicDate: today - 90 days --><Datum>20260203</Datum></a>";
        assertEquals(expected, DynamicDateProcessor.process(xml, TODAY));
    }

    @Test
    void substitutesPositiveYearOffset() {
        String xml = "<a><!-- DynamicDate: today + 1 year --><Datum>20240101</Datum></a>";
        String expected = "<a><!-- DynamicDate: today + 1 year --><Datum>20270504</Datum></a>";
        assertEquals(expected, DynamicDateProcessor.process(xml, TODAY));
    }

    @Test
    void preservesIsoDashedFormat() {
        String xml = "<a><!-- DynamicDate: today - 1 month --><Datum>2024-01-31</Datum></a>";
        String expected = "<a><!-- DynamicDate: today - 1 month --><Datum>2026-04-04</Datum></a>";
        assertEquals(expected, DynamicDateProcessor.process(xml, TODAY));
    }

    @Test
    void substitutesMultipleOccurrences() {
        String xml = "<a>"
                + "<!-- DynamicDate: today - 6 months --><Begin>20200101</Begin>"
                + "<!-- DynamicDate: today - 1 month --><Eind>20200201</Eind>"
                + "</a>";
        String expected = "<a>"
                + "<!-- DynamicDate: today - 6 months --><Begin>20251104</Begin>"
                + "<!-- DynamicDate: today - 1 month --><Eind>20260404</Eind>"
                + "</a>";
        assertEquals(expected, DynamicDateProcessor.process(xml, TODAY));
    }

    @Test
    void allowsWhitespaceAndNewlinesBetweenCommentAndElement() {
        String xml = "<a>\n  <!-- DynamicDate: today - 1 month -->\n  <Datum>20240101</Datum>\n</a>";
        String expected = "<a>\n  <!-- DynamicDate: today - 1 month -->\n  <Datum>20260404</Datum>\n</a>";
        assertEquals(expected, DynamicDateProcessor.process(xml, TODAY));
    }

    @Test
    void isCaseInsensitiveOnUnitAndKeyword() {
        String xml = "<a><!-- dynamicdate: today - 2 MONTHS --><Datum>20240101</Datum></a>";
        String expected = "<a><!-- dynamicdate: today - 2 MONTHS --><Datum>20260304</Datum></a>";
        assertEquals(expected, DynamicDateProcessor.process(xml, TODAY));
    }

    @Test
    void leavesUnrelatedDatesUntouched() {
        String xml = "<a><Geboortedatum>19800101</Geboortedatum>"
                + "<!-- DynamicDate: today --><Datum>20240101</Datum></a>";
        String expected = "<a><Geboortedatum>19800101</Geboortedatum>"
                + "<!-- DynamicDate: today --><Datum>20260504</Datum></a>";
        assertEquals(expected, DynamicDateProcessor.process(xml, TODAY));
    }

    @Test
    void handlesNullInput() {
        assertEquals(null, DynamicDateProcessor.process(null, TODAY));
    }
}