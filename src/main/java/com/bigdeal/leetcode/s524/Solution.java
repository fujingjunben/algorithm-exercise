package com.bigdeal.leetcode.s524;

import java.util.List;

public class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String result = "";
        for (String item : dictionary) {
            boolean match = true;
            for (char c : item.toCharArray()) {
                if (!s.contains(Character.toString(c))) {
                    match = false;
                }
            }
            if (match) {
                if (result.length() < item.length()) {
                    result = item;
                }
                if (result.length() == item.length()
                        && (result.compareTo(item) > 0)) {
                    result = item;
                }
            }
        }
        return result;
    }
}
