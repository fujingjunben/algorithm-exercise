package com.bigdeal.leetcode.s70;

import com.bigdeal.util.MyArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestSolution {
    @Test
    public void test1(){
        int[] testData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

        Solution solution = new Solution();
        int[] result = Arrays.stream(testData).map(solution::climbStairs).toArray();
        MyArrayUtil.printArray(result, true);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void test2(){
        int n = 4;
        Solution solution = new Solution();
        int result = solution.climbStairs(n);
        Assertions.assertEquals(5, result);
    }
}
