package com.bigdeal.leetcode.s4;

public class SolutionV2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int k = (m + n + 1) / 2;
        return splitArray(nums1, nums2, 0, 0, k);
    }

    private double splitArray(int[] array1, int[] array2, int start1, int start2, int k) {
        if (start1 >= array1.length) {
            return getMedian(array2, start2, array2.length - 1);
        }
        if (start2 >= array2.length) {
            return getMedian(array1, start1, array1.length - 1);
        }

        int smallOffset = k / 2 - 1;
        int largeOffset = k - smallOffset;
        if (array1[start1 + offset] <= array2[start2 + ]) {
            return splitArray(array1, array2, start1 + offset, start2, k - Math.min());
        } else {
            return splitArray(array1, array2, start1, start2 + k - (k / 2 - 1), k - (k / 2 - 1));
        }
    }

    double getMedian(int[] nums, int start, int end){
        if (start == end) {
            return nums[start];
        }
        int size = end - start + 1;
        double median = 0;
        if (size % 2 == 0) {
            median = (nums[start + size / 2] + nums[start + size / 2 - 1]) / 2.0;
        } else {
            median = nums[start + (size - 1) / 2];
        }
        return median;
    }
}
