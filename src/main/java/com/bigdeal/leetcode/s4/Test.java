package com.bigdeal.leetcode.s4;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1, 3, 5, 6, 10};
        int[] nums2 = new int[]{7, 8, 9, 12, 20};

        if (solution.findMedianSortedArrays(nums1, nums2) == (7 + 8) / 2.0){
            System.out.println("1. correct");
        } else {
            System.out.println("1. false");
        }
        int[] nums3 = new int[]{1, 3, 5, 6, 10};
        int[] nums4 = new int[]{2, 4, 9, 12, 20};

        if (solution.findMedianSortedArrays(nums3, nums4) == (5 + 6) / 2.0){
            System.out.println("2. correct");
        } else {
            System.out.println("2. false");
        }
        int[] nums5 = new int[]{1, 3, 5, 6};
        int[] nums6 = new int[]{2, 4, 9, 12, 20};

        if (solution.findMedianSortedArrays(nums5, nums6) == 5.0){
            System.out.println("3. correct");
        } else {
            System.out.println("3. false");
        }
        int[] nums7 = new int[]{2, 5, 20, 30, 31, 42, 52, 62};
        int[] nums8 = new int[]{4, 8, 10 ,34, 40, 63, 78};
        int[] test = new int[]{2, 4, 5, 8, 10, 20, 30, 31, 34, 40, 42, 52, 62, 63, 78};
        if (solution.findMedianSortedArrays(nums7, nums8) == 31){
            System.out.println("4. correct");
        } else {
            System.out.println("4. false");
        }
    }
}
