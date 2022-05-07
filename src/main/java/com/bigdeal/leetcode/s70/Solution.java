package com.bigdeal.leetcode.s70;

public class Solution {
    public int climbStairs(int n) {
        return helper(n);
    }

    private int helper(int n) {
        int fn = 1;
        int fm = 2;

        if (n == 1) {
            return fn;
        }

        if (n == 2) {
            return fm;
        }

        for (int i = 3; i <= n; i++) {
            int result = fn + fm;
            fn =  fm;
            fm = result;
        }

        return fm;
    }
}
