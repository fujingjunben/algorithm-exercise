package com.bigdeal.leetcode.s524;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestSolution {

    @Test
    public void test1(){
        String s = "abpcplea";
        String[] strArray = {"ale","apple","monkey","plea"};
        List<String> dictionary = Arrays.asList(strArray);
        String expected = "apple";

        Solution solution = new Solution();
        String result = solution.findLongestWord(s, dictionary);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test2(){
        String s = "abpcplea";
        String[] strArray = {"a", "b", "c" };
        List<String> dictionary = Arrays.asList(strArray);
        String expected = "a";
        Solution solution = new Solution();
        String result = solution.findLongestWord(s, dictionary);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test3(){
        String s = "aaa";
        String[] strArray = {"aaa", "aa", "a" };
        List<String> dictionary = Arrays.asList(strArray);
        String expected = "aaa";
        Solution solution = new Solution();
        String result = solution.findLongestWord(s, dictionary);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test4(){
        String s = "abpcplea";
        String[] strArray = {"ale","apple","monkey","plea", "abpcplaaa","abpcllllll","abccclllpppeeaaaa"};
        List<String> dictionary = Arrays.asList(strArray);
        String expected = "apple";
        Solution solution = new Solution();
        String result = solution.findLongestWord(s, dictionary);
        Assertions.assertEquals(expected, result);
    }
}
