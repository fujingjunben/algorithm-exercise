package com.bigdeal.leetcode.s345;

public class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] charArray = s.toCharArray();
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (isVowel(leftChar) && isVowel(rightChar)) {
                if (leftChar != rightChar) {
                    charArray[left] = rightChar;
                    charArray[right] = leftChar;
                }
                left++;
                right--;
            }
            if (!isVowel(leftChar)) {
                left++;
            }
            if (!isVowel(rightChar)) {
                right--;
            }
        }

        return new String(charArray);
    }

    private boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
