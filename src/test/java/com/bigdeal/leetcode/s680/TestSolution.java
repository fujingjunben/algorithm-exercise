package com.bigdeal.leetcode.s680;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void test1() {
        String s = "aba";
        Solution solution = new Solution();
        boolean result = solution.validPalindrome(s);
        Assertions.assertTrue(result);
    }

    @Test
    public void test2() {
        String s = "abca";
        Solution solution = new Solution();
        boolean result = solution.validPalindrome(s);
        Assertions.assertTrue(result);
    }

    @Test
    public void test3() {
        String s = "abc";
        Solution solution = new Solution();
        boolean result = solution.validPalindrome(s);
        Assertions.assertFalse(result);
    }

    @Test
    public void test4(){
        String s = "aabdeenddbaagbddeedbaa";
        Solution solution = new Solution();
        boolean result = solution.validPalindrome(s);
        Assertions.assertFalse(result);
    }

    @Test
    public void test5(){
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        Solution solution = new Solution();
        boolean result = solution.validPalindrome(s);
        Assertions.assertTrue(result);
    }

    @Test
    public void test6(){
        String s = "acufxfucua";
        Solution solution = new Solution();
        boolean result = solution.validPalindrome(s);
        Assertions.assertTrue(result);
    }

}
