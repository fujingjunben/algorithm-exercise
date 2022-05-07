package com.bigdeal.leetcode.s905;

import com.bigdeal.util.MyArrayUtil;
import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void test1(){
        int[] nums = {3, 1, 2, 4};
        int[] expected = {2, 4, 3, 1};
        Solution solution = new Solution();
        int[] result = solution.sortArrayByParity(nums);
        MyArrayUtil.printArray(result, true);
    }
}
