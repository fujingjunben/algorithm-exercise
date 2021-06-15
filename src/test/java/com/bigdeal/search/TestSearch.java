package com.bigdeal.search;

import com.bigdeal.sort.Merge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSearch {
    @Test
    public void positiveTest() {
        int[] actual = { 1, 2, 3, 4, 5, 6 };
        int key = 5;
        int expected = 4;
        int result = BinarySearch.search(actual, key);
        assertEquals(expected, result);
    }

    @Test
    public void positiveTest2() {
        int[] actual = { 1, 3, 5, 9, 18 };
        int key = 5;
        int expected = 4;
        int result = BinarySearch.search(actual, key);
        assertEquals(expected, result);
    }
}
