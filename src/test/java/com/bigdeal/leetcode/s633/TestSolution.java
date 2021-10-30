package com.bigdeal.leetcode.s633;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestSolution {
    @Test
    public void test1() {
        Boolean[] expection = new Boolean[] {
                true, false, true, true, true};
        List<Integer> data = Arrays.asList(5, 3, 4, 2, 1);

        Solution solution = new Solution();
        Boolean[] result = data.stream()
                .map(solution::judgeSquareSum).toArray(Boolean[]::new);
        assertArrayEquals(expection, result);
    }

    public static void main(String[] args) {
        String orderId = "";
        int tablePage = orderId.hashCode() % 20;

        System.out.println(tablePage);
    }
}
