package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanConverterTest {

    RomanConverter converter = new RomanConverter();

    @Test
    public void testSimple() {
        assertEquals(3, converter.romanToInt("III"));
    }

    @Test
    public void testSubtractive() {
        assertEquals(4, converter.romanToInt("IV"));
        assertEquals(9, converter.romanToInt("IX"));
    }

    @Test
    public void testComplex() {
        assertEquals(58, converter.romanToInt("LVIII")); // L = 50, V = 5, III = 3
        assertEquals(1994, converter.romanToInt("MCMXCIV")); // explained above
    }

    @Test
    public void testEdgeCase() {
        assertEquals(1, converter.romanToInt("I"));
    }
}
