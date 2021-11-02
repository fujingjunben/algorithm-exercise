package com.bigdeal.leetcode.s524;

import java.util.List;

public class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String result = "";
        for (String item : dictionary) {
            if (isMatch(s, item)) {
                if (result.length() < item.length()
                        || (result.length() == item.length()
                        && result.compareTo(item) > 0)) {
                    result = item;
                }
            }
        }
        return result;
    }

    private boolean isMatch(String s1, String s2) {
        int i = 0;
        int j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        return j == s2.length();
    }
}
