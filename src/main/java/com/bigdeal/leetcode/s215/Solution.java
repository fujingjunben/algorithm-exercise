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
        return nums[k - 1];
    }
}
