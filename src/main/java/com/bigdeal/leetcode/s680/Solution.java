package com.bigdeal.leetcode.s680;

public class Solution {
    public boolean validPalindrome(String s) {
        return helper(s, 0, s.length() - 1, 0);
    }

    private boolean helper(String s, int left, int right, int count) {
        if (count > 1) {
            return false;
        }
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return helper(s, left + 1, right, count + 1)
                        || helper(s, left, right - 1, count + 1);
            }
        }
        return true;
    }
}
