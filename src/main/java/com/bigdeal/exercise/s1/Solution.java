package com.bigdeal.exercise.s1;

import java.util.Map;

public class Solution {
    private static final int UNIT = 60;
    private static final String[] UNIT_SET = {"s", "m", "h"};
    public static String convert(int num) {
        int[] cache = new int[UNIT_SET.length];
        helper(num, 0, UNIT_SET.length, cache);

        StringBuilder sb = new StringBuilder();
        for (int i = cache.length - 1; i >= 0 ; i--) {
            int value = cache[i];
            if (value != 0) {
                sb.append(value).append(UNIT_SET[i]);
            }
        }
        return sb.toString();
    }

    private static void helper(int num, int position, int limit, int[] cache) {
        int reminder = num % UNIT;
        cache[position] = reminder;

        int quotient = num / UNIT;

        String log = String.format("num: %d, position: %d, reminder: %d, quotient: %d", num, position, reminder, quotient);
        System.out.println(log);

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
