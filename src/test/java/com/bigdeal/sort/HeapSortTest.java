package com.bigdeal.sort;

import com.bigdeal.util.MyArrayUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapSortTest {
    @Test
    public void test1() {
        Integer[] actual = {5, 1, 6, 2, 3, 4};
        Integer[] expected = {1, 2, 3, 4, 5, 6};

        HeapSort<Integer> solution = new HeapSort<>();
        solution.sort(actual);
        MyArrayUtil.printArray(actual);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void test2(){
        Integer[] b = { 8, 13, 2, 20, 9};
        Integer[] expect = { 2, 8, 9, 13, 20};
        HeapSort<Integer> solution = new HeapSort<>();
        solution.sort(b);
        MyArrayUtil.printArray(b);
        assertArrayEquals(expect, b);
    }
}
