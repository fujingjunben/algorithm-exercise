package com.bigdeal.util;

public class ArrayUtil {
    // merge sort two sorted int array
    public static int[] pickSmaller(int[] nums1, int[] nums2, int n1, int n2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] nums3 = new int[n1 + n2];

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }
        while (i < n1) {
            nums3[k++] = nums1[i++];
        }

        while (j < n2) {
            nums3[k++] = nums2[j++];
        }
        return nums3;
    }

    public static double getMedian(int[] nums){
        int size = nums.length;
        double median;
        if (size % 2 == 0) {
            median = (nums[size / 2] + nums[size / 2 - 1]) / 2.0;
        } else {
            median = nums[(size - 1) / 2];
        }
        return median;
    }
    public static void printArray(int[] nums, boolean showHeader) {
        int size = nums.length;
        if (showHeader) {
            System.out.printf("%5s", "");
            for (int i = 0; i < size; i++) {
                System.out.printf("%5d", i);
            }

            System.out.println();
            System.out.printf("%5s", "");
            for (int i = 0; i < size * 5; i++) {
                System.out.printf("%s", "*");
            }
        }
        System.out.println("");
        System.out.printf("%5s", "");

        for (int i = 0; i < size; i++) {
            System.out.printf("%5d", nums[i]);
        }
        System.out.println();
    }
    public static void print2DArray(int[][] nums, boolean showHeader) {
        int row = nums.length;
        int col = nums[0].length;
        if (showHeader) {
            System.out.printf("%5s", "");
            for (int i = 0; i < row; i++) {
                System.out.printf("%5d", i);
            }

        }

        System.out.println();
        for (int i = 0; i < row; i++) {
            System.out.printf("%5d", i);
            for (int j = 0; j < col; j++) {
                System.out.printf("%5d", nums[i][j]);
            }
            System.out.println();
        }
    }
}
