package com.bigdeal.leetcode.s633;

public class Solution {
    public boolean judgeSquareSum(int c) {
        double sqrt = Math.sqrt(c);
        long length = Math.round(sqrt);

        long left = 0;
        long right = length;

        while (left <= right) {
            long sum = left * left + right * right;
            if (sum > c) {
                right--;
            } else if (sum < c) {
                left++;
            } else {
                return true;
            }
        }

        return false;
    }
}
