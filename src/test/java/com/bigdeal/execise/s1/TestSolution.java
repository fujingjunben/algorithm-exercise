package com.bigdeal.execise.s1;

import com.bigdeal.exercise.s1.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void test1() {
        int a = 1;
        String expected = "1s";
        String result = Solution.convert(a);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test2() {
        int a = 60;
        String expected = "1min";
        String result = Solution.convert(a);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test3() {
        int a = 62;
        String expected = "1min2s";
        String result = Solution.convert(a);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test4() {
        int a = 3622;
        String expected = "1h22s";
        String result = Solution.convert(a);
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void test5() {
        int a = 36022;
        String expected = "10h22s";
        String result = Solution.convert(a);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test6() {
        int a = 36662;
        String expected = "10h11min2s";
        String result = Solution.convert(a);
        Assertions.assertEquals(expected, result);
    }
}
