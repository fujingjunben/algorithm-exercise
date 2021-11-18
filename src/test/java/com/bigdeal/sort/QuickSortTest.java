package com.bigdeal.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    @Test
    public void test1() {
        int[] a = {1, 5, 2, 11, 6, 8, 3, 5};
        int[] expected = {1, 2, 3, 5, 5, 6, 8, 11};
        QuickSort solution = new QuickSort();
        solution.sort(a);
        Assertions.assertArrayEquals(expected, a);
    }

    @Test
    public void test2() {
        int[] a = {5, 2, 11, 6, 8, 3, 5, 9, 20, 1};
        int[] expected = {1, 2, 3, 5, 5, 6, 8, 9, 11, 20};
        QuickSort solution = new QuickSort();
        solution.sort(a);
        Assertions.assertArrayEquals(expected, a);
    }


}
