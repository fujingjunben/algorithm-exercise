package leetcode.s3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> keys = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (keys.containsKey(c)) {
                maxLength = Math.max(maxLength, i - left);
                left = Math.max(left, keys.get(c) + 1);
            }
            keys.put(c, i);
        }
        return Math.max(maxLength, s.length() - left);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println( s + " : " + result);
        s = "pwwkew";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println( s + " : " + result);
        s = "bbbbbb";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println( s + " : " + result);
        s = "asjrgapa";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println( s + " : " + result);
        s = "aab";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println( s + " : " + result);
        s = "abba";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println( s + " : " + result);
        s = "dvdf";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println( s + " : " + result);
        s = "abcde";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println( s + " : " + result);

    }
}
