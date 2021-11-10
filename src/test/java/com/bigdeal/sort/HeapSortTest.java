package com.bigdeal.sort;

import com.bigdeal.util.MyArrayUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapSortTest {
    @Test
    public void test1() {
        Integer[] actual = {5, 1, 6, 2, 3, 4};
        Integer[] expected = {6, 5, 4, 3, 2, 1};

        HeapSort<Integer> solution = new HeapSort<>();
        solution.sort(actual);
        MyArrayUtil.printArray(actual);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void test2(){
        int[] a = { 10, 2};
        int[] a1 = { 2, 10};

        HeapSort<Integer> solution = new HeapSort<>();
        Insertion.sort(a);
        assertArrayEquals(a1, a);

        int[] b = { 8, 13, 2, 20, 9};
        int[] b1 = { 20, 13, 9, 8, 2};
        Insertion.sortByDesc(b);
        assertArrayEquals(b1, b);
    }
}
