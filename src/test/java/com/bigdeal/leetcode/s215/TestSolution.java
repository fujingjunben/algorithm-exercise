package com.bigdeal.leetcode.s215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void test1(){
        int[] input =  {3,2,1,5,6,4};
        int k = 2;
        int expected =  5;

        Solution solution = new Solution();
        int result = solution.findKthLargest(input, k);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test2(){
        int[] input =  {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int expected =  4;

        Solution solution = new Solution();
        int result = solution.findKthLargest(input, k);
        Assertions.assertEquals(expected, result);
    }
}
