package com.bigdeal.leetcode.s88;

import com.bigdeal.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void test1() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] expected = {1,2,2,3,5,6};

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        ArrayUtil.printArray(nums1, true);
        Assertions.assertArrayEquals(expected, nums1);
    }

    @Test
    public void test2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);
    }


    @Test
    public void test3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);
    }
}
