package com.bigdeal.exercise.s1;

public class Solution {
    private static final int UNIT = 60;
    private static final String[] UNIT_LABELS = {"s", "min", "h"};
    public static String convert(int num) {
        int[] cache = new int[UNIT_LABELS.length];
        helper(num, 0, UNIT_LABELS.length, cache);

        StringBuilder sb = new StringBuilder();
        for (int i = cache.length - 1; i >= 0 ; i--) {
            int value = cache[i];
            if (value != 0) {
                sb.append(value).append(UNIT_LABELS[i]);
            }
        }
        return sb.toString();
    }

    private static void helper(int num, int position, int limit, int[] cache) {
        int reminder = num % UNIT;
        cache[position] = reminder;

        int quotient = num / UNIT;
        if (quotient == 0) {
            return;
        }

        if (position == limit) {
            cache[position] = reminder;
            return;
        }
        helper(quotient, position + 1, limit, cache);
    }
}
