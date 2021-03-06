package leetcode.s3;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        StringBuilder subString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int position = subString.indexOf(String.valueOf(c));
            if (position != -1) {
                if (subString.length() > maxLength){
                    maxLength = subString.length();
                }
                subString = new StringBuilder(
                        subString.substring(position + 1));
            }
            subString.append(c);
        }
        return Math.max(subString.length(), maxLength);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("length: " + result);
        s = "pwwkew";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println("length: " + result);
        s = "bbbbbb";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println("length: " + result);
        s = "asjrgapa";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println("length: " + result);

    }
}
