package com.bigdeal.leetbook.simple.s1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int size = 0;
        int offset = 0;
        for (int i = 0; i < nums.length; i = i + offset) {
            if (i > 1) {
                if (nums[i - 1] == nums[i]) {
                    offset++;
                } else if (offset != 0) {
                    nums[i - offset] = nums[i];
                    size++;
                }
            } else {
                size++;
            }
        }
        return size;
    }
}
