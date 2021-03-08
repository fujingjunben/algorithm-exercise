package leetcode.s4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        return 0;
    }

    private double getMedian(int[] nums){
        int size = nums.length;
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
        double median = solution.getMedian(nums7);
        System.out.println("nums7 median: " + median);
        median = solution.getMedian(nums8);
        System.out.println("nums8 median: " + median);
        median = solution.getMedian(test);
        System.out.println("test median: " + median);

        if (solution.findMedianSortedArrays(nums7, nums8) == 5.0){
            System.out.println("3. correct");
        } else {
            System.out.println("3. false");
        }


    }
}
