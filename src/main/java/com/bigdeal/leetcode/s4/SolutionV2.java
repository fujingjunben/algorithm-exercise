package com.bigdeal.leetcode.s4;

public class SolutionV2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Position p1 = shrink(nums1, 0, nums1.length - 1, 0, 0);
        Position p2 = shrink(nums2, 0, nums1.length - 1, 0, 0);
        int[] a = pickSmaller(nums1, nums2, p1.start, p1.end, p2.start, p2.end);
        return getMedian(a, 0, a.length - 1);
    }

    private int[] pickSmaller(int[] nums1, int[] nums2, int start1, int end1, int start2, int end2) {
        int i = start1;
        int j = start2;
        int k = 0;
        int[] nums3 = new int[end1 - start1 + end2 - start2 + 2];

        while (i <= end1 && j <= end2 ) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }
        while (i <= end1) {
            nums3[k++] = nums1[i++];
        }

        while (j <= end2) {
            nums3[k++] = nums2[j++];
        }
        return nums3;
    }

    private Position shrink(int[] nums, int start, int end, double low, double high){
        if ((end - start) <= 2){
            return new Position(start, end);
        }

        int nextStart = start;
        int nextEnd = end;
        if (nums[start] < low) {
            nextStart = (end + start) / 2 + 1;
        }
        if (nums[end] > high) {
            nextEnd = (end - nextStart) / 2;
        }

        double median = getMedian(nums, nextStart, nextEnd);

        return shrink(nums, nextStart, nextEnd, Math.max(low, median), Math.min(high, median));
    }

    private double getMedian(int[] nums, int start, int end){
        if (start == end) {
            return nums[start];
        }
        int size = end - start + 1;
        double median = 0;
        if (size % 2 == 0) {
            median = (nums[size / 2] + nums[size / 2 - 1]) / 2.0;
        } else {
            median = nums[(size - 1) / 2];
        }
        return median;
    }

    private static class Position {
        public int start;
        public int end;

        public Position(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int size(){
            return this.end - this.start + 1;
        }
    }

    public static void main(String[] args) {
        SolutionV2 solution = new SolutionV2();
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
        double median = solution.getMedian(nums7, 0, nums7.length - 1);
        System.out.println("nums7 median: " + median);
        median = solution.getMedian(nums8,0, nums8.length - 1);
        System.out.println("nums8 median: " + median);
        median = solution.getMedian(test, 0, test.length - 1);
        System.out.println("test median: " + median);

        if (solution.findMedianSortedArrays(nums7, nums8) == 31){
            System.out.println("4. correct");
        } else {
            System.out.println("4. false");
        }


    }
}
