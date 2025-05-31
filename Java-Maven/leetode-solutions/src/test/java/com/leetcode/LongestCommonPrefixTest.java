package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strings1 = {"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strings1));
        // Test case 2
        String[] strs2 = {"dog", "racecar", "car"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs2));

        // Test case 3
        String[] strs3 = {"", "b", "c"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs3));

        // Test case 4
        String[] strs4 = {"apple", "appetizer", "application"};
        assertEquals("app", longestCommonPrefix.longestCommonPrefix(strs4));

        // Test case 5 (Single string)
        String[] strs5 = {"java"};
        assertEquals("java", longestCommonPrefix.longestCommonPrefix(strs5));
    }
}