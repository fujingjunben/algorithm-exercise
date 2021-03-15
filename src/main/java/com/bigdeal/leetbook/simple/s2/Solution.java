package com.bigdeal.leetbook.simple.s2;

import com.bigdeal.util.ArrayUtil;

public class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                matrix[i][j] = Math.max(0, prices[j] - prices[i]);
            }
        }

        ArrayUtil.printArray(prices, true);
        ArrayUtil.print2DArray(matrix, false);

        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 3; j < size; j++) {
                if (i + 2 < size) {
                    sum = sum + matrix[i + 2][j];
                }
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
