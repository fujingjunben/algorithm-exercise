package com.bigdeal.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSort {
    @Test
    public void positiveTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
//        Merge.sort(actual, actual.length);
//        assertArrayEquals(expected, actual);

        Insertion.sort(actual);
        assertArrayEquals(expected, actual);

        int[] a = { 10, 2};
        int[] a1 = { 2, 10};
        Insertion.sort(a);
        assertArrayEquals(a1, a);

        int[] b = { 8, 13, 2, 20, 9};
        int[] b1 = { 20, 13, 9, 8, 2};
        Insertion.sortByDesc(b);
        assertArrayEquals(b1, b);
    }
}
