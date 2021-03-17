package com.bigdeal.leetbook.simple.s2;

import com.bigdeal.util.ArrayUtil;

public class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        if (size == 2) {
            return Math.max(0, prices[1] - prices[0]);
        }

        for (int i = 0; i < size; i++) {
            int q = 0;
            for (int j = 1; j < i; j++) {
                q = Math.max(q, )
            }
        }

        if (size == 3) {
            return Math.max(0, Math.max(prices[end] - prices[end - 1], prices[start + 1] - prices[start]));
        }

        return 0;
    }

    private int computeProfit(int[] prices) {
        int size = end - start + 1;

        if (size < 2) {
            return 0;
        }

        int q = 0;
        for (int i = start; i < size; i++) {
            q = Math.max(q, computeProfit(prices, 0, i) + computeProfit(prices, i + 1, size));
        }
        return q;
    }
}
