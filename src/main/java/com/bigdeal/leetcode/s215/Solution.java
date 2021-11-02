package com.bigdeal.leetcode.s215;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.bigdeal.util.*;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (k >= nums.length) {
            return -1;
        }
        Arrays.sort(nums, Comparator.reverseOrder());
        MyArrayUtil.printArray(nums, false);
        return nums[k - 1];
    }
}
