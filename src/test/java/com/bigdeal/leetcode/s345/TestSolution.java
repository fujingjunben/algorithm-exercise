package com.bigdeal.leetcode.s345;

import com.bigdeal.leetcode.s345.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void test1() {
        String s = "hello";
        Solution solution = new Solution();
        String result = solution.reverseVowels(s);
        Assertions.assertEquals("holle", result);
    }

    @Test
    public void test2() {
        String s = "leetcode";
        Solution solution = new Solution();
        String result = solution.reverseVowels(s);
        Assertions.assertEquals("leotcede", result);
    }

    @Test
    public void test3() {
        String s = "aA";
        Solution solution = new Solution();
        String result = solution.reverseVowels(s);
        Assertions.assertEquals("Aa", result);
    }
}
