package com.bigdeal.leetbook.simple.array.s1;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                if (nums[i - 1] != nums[i]) {
                    if (size != i) {
                        nums[size] = nums[i];
                    }
                    size++;
                }
            } else {
                size++;
            }
        }
        return size;
    }
}
