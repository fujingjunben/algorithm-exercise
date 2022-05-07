package com.bigdeal.leetcode.s905;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (!isEven(nums[i]) && !isOdd(nums[j])) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                if (isEven(nums[i])) {
                    i++;
                }
                if (isOdd(nums[j])) {
                    j--;
                }
            }
        }
        return nums;
    }

    private boolean isEven(int n) {
        return 0 == n % 2;
    }

    private boolean isOdd(int n) {
        return !isEven(n);
    }
}
