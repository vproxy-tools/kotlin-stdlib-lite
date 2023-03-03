package io.vproxy.lite.kotlin.stdlib.test;

import kotlin.text.StringsKt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestIndexOf {
    private static final int INDEX_MASK_START_INDEX = 2;
    private static final int INDEX_MASK_IGNORE_CASE = 4;
    private static final int BEGIN_END_MASK_IGNORE_CASE = 2;

    @Test
    public void simpleIndexOf() {
        int res = StringsKt.indexOf$default("0123 0123", "23", 0, false,
            INDEX_MASK_START_INDEX | INDEX_MASK_IGNORE_CASE, null);
        assertEquals(2, res);
    }

    @Test
    public void startIndexOf() {
        int res = StringsKt.indexOf$default("0123 0123", "23", 2, false,
            INDEX_MASK_IGNORE_CASE, null);
        assertEquals(2, res);
    }

    @Test
    public void startIndexOf2() {
        int res = StringsKt.indexOf$default("0123 0123", "23", 3, false,
            INDEX_MASK_IGNORE_CASE, null);
        assertEquals(7, res);
    }

    @Test
    public void simpleLastIndexOf() {
        int res = StringsKt.lastIndexOf$default("0123 0123", "23", 0, false,
            INDEX_MASK_START_INDEX | INDEX_MASK_IGNORE_CASE, null);
        assertEquals(7, res);
    }

    @Test
    public void startLastIndexOf() {
        int res = StringsKt.lastIndexOf$default("0123 0123", "23", 7, false,
            INDEX_MASK_IGNORE_CASE, null);
        assertEquals(7, res);
    }

    @Test
    public void startLastIndexOf2() {
        int res = StringsKt.lastIndexOf$default("0123 0123", "23", 6, false,
            INDEX_MASK_IGNORE_CASE, null);
        assertEquals(2, res);
    }

    @Test
    public void tooShortIndexOf() {
        int res = StringsKt.indexOf$default("01", "0123", 0, false,
            INDEX_MASK_START_INDEX | INDEX_MASK_IGNORE_CASE, null);
        assertEquals(-1, res);
    }

    @Test
    public void tooShortLastIndexOf() {
        int res = StringsKt.indexOf$default("01", "0123", 0, false,
            INDEX_MASK_START_INDEX | INDEX_MASK_IGNORE_CASE, null);
        assertEquals(-1, res);
    }

    @Test
    public void startIndexTooShort() {
        int res = StringsKt.indexOf$default("0123 0123", "0123", 8, false,
            INDEX_MASK_IGNORE_CASE, null);
        assertEquals(-1, res);
    }

    @Test
    public void startIndexTooHigh() {
        int res = StringsKt.indexOf$default("0123 0123", "123", 7, false,
            INDEX_MASK_IGNORE_CASE, null);
        assertEquals(-1, res);
    }

    @Test
    public void startLastIndexTooLow() {
        int res = StringsKt.lastIndexOf$default("0123 0123", "23", 1, false,
            INDEX_MASK_IGNORE_CASE, null);
        assertEquals(-1, res);
    }

    @Test
    public void ignoreCaseIndexOf() {
        int res = StringsKt.indexOf$default("ABc aBc", "bc", 0, true,
            INDEX_MASK_START_INDEX, null);
        assertEquals(1, res);
    }

    @Test
    public void ignoreCaseLastIndexOf() {
        int res = StringsKt.lastIndexOf$default("ABc aBc", "bc", 0, true,
            INDEX_MASK_START_INDEX, null);
        assertEquals(5, res);
    }

    @Test
    public void startsWith() {
        boolean res = StringsKt.startsWith$default("Hello world", "Hello", false,
            BEGIN_END_MASK_IGNORE_CASE, null);
        assertTrue(res);
    }

    @Test
    public void ignoreCaseStartsWith() {
        boolean res = StringsKt.startsWith$default("Hello world", "hello", true,
            0, null);
        assertTrue(res);
    }

    @Test
    public void endsWith() {
        boolean res = StringsKt.endsWith$default("Hello world", "world", false,
            BEGIN_END_MASK_IGNORE_CASE, null);
        assertTrue(res);
    }

    @Test
    public void ignoreCaseEndsWith() {
        boolean res = StringsKt.endsWith$default("Hello world", "World", true,
            0, null);
        assertTrue(res);
    }
}
