package com.bigdeal.leetcode.s167;

import com.bigdeal.util.ArrayUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestSolution {
    @Test
    public void test1() {
        int[] numbers = new int[] {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(numbers, target);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void test2() {
        int[] numbers = new int[] {2, 3, 4};
        int target = 6;

        Solution solution = new Solution();
        int[] result = solution.twoSum(numbers, target);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    public void test3() {
        int[] numbers = new int[] {-1, 0};
        int target = -1;

        Solution solution = new Solution();
        int[] result = solution.twoSum(numbers, target);
        assertArrayEquals(new int[]{1, 2}, result);
    }
}
