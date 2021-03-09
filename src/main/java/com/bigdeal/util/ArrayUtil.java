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
}
