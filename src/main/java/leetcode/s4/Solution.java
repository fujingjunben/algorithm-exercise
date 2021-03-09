package leetcode.s4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double m1 = getMedian(nums1, 0, nums1.length - 1);
        double m2 = getMedian(nums2, 0, nums2.length - 1);
        double r1 = findMedian(nums1, 0, nums1.length - 1,
                Math.min(m1, m2), Math.max(m1, m2));
        double r2 = findMedian(nums1, 0, nums1.length - 1,
                Math.min(m1, m2), Math.max(m1, m2));

        return (r1 + r2) / 2;
    }

    private double findMedian(int[] nums, int start, int end, double low, double high){
        if (low == high) {
            return low;
        }
        if (start >= end) {
            return nums[start];
        }
        if (nums[start] < low) {
            start = (end + start) / 2 + 1;
        }
        if (nums[end] > high) {
            end = (end - start) / 2;
        }

        return findMedian(nums, start, end, low, high);
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
        double median = solution.getMedian(nums7, 0, nums7.length - 1);
        System.out.println("nums7 median: " + median);
        median = solution.getMedian(nums8,0, nums8.length - 1);
        System.out.println("nums8 median: " + median);
        median = solution.getMedian(test, 0, test.length - 1);
        System.out.println("test median: " + median);

        if (solution.findMedianSortedArrays(nums7, nums8) == 5.0){
            System.out.println("3. correct");
        } else {
            System.out.println("3. false");
        }


    }
}
