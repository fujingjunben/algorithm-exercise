package com.bigdeal.leetbook.simple.s2;

public class Test {
    public static void main(String[] args) {
        test1();
//        test2();
    }

    private static int test1() {
        Solution solution = new Solution();
        int[] a = new int[]{7, 1, 5, 3, 6, 4, 5, 8};
        int maxSum = solution.maxProfit(a);
        System.out.println("max sum: " + maxSum);
        return maxSum;
    }

    private static int test2() {
        Solution solution = new Solution();
        int[] a = new int[]{7, 1, 5, 3, 6, 4};
        int maxSum = solution.maxProfit(a);
        System.out.println("max sum: " + maxSum);
        return maxSum;
    }
}
