package com.bigdeal.leetcode.s88;

/**
 * date: 2021/11/1
 * 解题的关键是从后往前排，减少nums1数据移动
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m - 1;
        int second = n - 1;

        for (int i = m + n - 1; i >= 0 ; i--) {
            if (second < 0) {
                return;
            }

            if (first >= 0) {
                if (nums1[first] >= nums2[second]) {
                    nums1[i] = nums1[first--];
                } else {
                    nums1[i] = nums2[second--];
                }
            } else {
                nums1[i] = nums2[second--];
            }
        }
    }
}
