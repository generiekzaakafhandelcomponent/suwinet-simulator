package com.ritense.suwitense.webservice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Substitutes {@code <!-- DynamicDate: today [+|- N day|week|month|year(s)] -->}
 * markers with a computed date in the value of the immediately following XML element.
 *
 * The original date value's format is preserved: {@code YYYYMMDD} stays compact,
 * {@code YYYY-MM-DD} stays ISO-dashed.
 */
public final class DynamicDateProcessor {

    private static final Pattern QUICK_CHECK = Pattern.compile("DynamicDate", Pattern.CASE_INSENSITIVE);

    private static final Pattern PATTERN = Pattern.compile(
            "<!--\\s*DynamicDate:\\s*today" +
                    "(?:\\s*([+-])\\s*(\\d+)\\s*(day|week|month|year)s?)?" +
                    "\\s*-->" +
                    "(?:\\s*<[^/!?][^>]*>)" +
                    "(\\d{8}|\\d{4}-\\d{2}-\\d{2})",
            Pattern.CASE_INSENSITIVE);

    private static final DateTimeFormatter COMPACT = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter ISO = DateTimeFormatter.ISO_LOCAL_DATE;

    private DynamicDateProcessor() {
    }

    public static String process(String xml) {
        return process(xml, LocalDate.now());
    }

    public static String process(String xml, LocalDate today) {
        if (xml == null || !QUICK_CHECK.matcher(xml).find()) {
            return xml;
        }
        Matcher m = PATTERN.matcher(xml);
        StringBuilder out = new StringBuilder(xml.length());
        while (m.find()) {
            String sign = m.group(1);
            String amountStr = m.group(2);
            String unit = m.group(3);
            String originalDate = m.group(4);

            LocalDate target = today;
            if (sign != null) {
                long amount = Long.parseLong(amountStr);
                if ("-".equals(sign)) {
                    amount = -amount;
                }
                switch (unit.toLowerCase()) {
                    case "day":
                        target = today.plusDays(amount);
                        break;
                    case "week":
                        target = today.plusWeeks(amount);
                        break;
                    case "month":
                        target = today.plusMonths(amount);
                        break;
                    case "year":
                        target = today.plusYears(amount);
                        break;
                }
            }
            DateTimeFormatter fmt = originalDate.contains("-") ? ISO : COMPACT;
            String replacement = m.group(0).substring(0, m.group(0).length() - originalDate.length())
                    + target.format(fmt);
            m.appendReplacement(out, Matcher.quoteReplacement(replacement));
        }
        m.appendTail(out);
        return out.toString();
    }
}
