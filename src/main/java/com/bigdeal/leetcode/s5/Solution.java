package com.bigdeal.leetcode.s5;

public class Solution {
    public String longestPalindrome(String s) {
        int right = 0;
        StringBuilder builder = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (j == 0 && i > 0) {
                if (s.charAt(i) == s.charAt(i - j)) {
                    // 偶数

                } else if (s.charAt(i) == s.charAt(i - j)){
                    // 奇数

                } else {

                }
            }
        }
        return "";
    }
}
