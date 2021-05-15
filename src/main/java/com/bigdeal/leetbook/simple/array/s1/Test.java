package com.bigdeal.leetbook.simple.array.s1;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a1 = new int[]{1, 1, 2};
        int size = solution.removeDuplicates(a1);
        System.out.println("a1: " + size);
        printArray(a1, size);
        a1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        size = solution.removeDuplicates(a1);
        System.out.println("a2: " + size);
        printArray(a1, size);
    }

    public static void printArray(int[] num, int len) {
        for (int i = 0; i < len; i++) {
            System.out.println(num[i]);
        }
    }
}
