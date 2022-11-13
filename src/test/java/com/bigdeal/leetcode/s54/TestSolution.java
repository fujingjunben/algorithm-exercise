package com.bigdeal.leetcode.s54;

import com.bigdeal.util.MyArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestSolution {
    @Test
    public void test1(){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[] expect = {1, 2, 3, 6, 9, 8, 7, 4, 5};

        Solution solution = new Solution();
        int[] result = solution.spiralOrder(a).stream().mapToInt(Integer::intValue).toArray();
        MyArrayUtil.printArray(result, true);
        Assertions.assertArrayEquals(expect, result);
    }

    @Test
    public void test2(){
        int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] expect = {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};

        Solution solution = new Solution();
        int[] result = solution.spiralOrder(a).stream().mapToInt(Integer::intValue).toArray();
        MyArrayUtil.printArray(result, true);
        Assertions.assertArrayEquals(expect, result);
    }

}
