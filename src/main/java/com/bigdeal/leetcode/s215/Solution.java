package com.bigdeal.leetcode.s215;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.bigdeal.sort.HeapSort;
import com.bigdeal.util.*;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        HeapSort<Integer> solution = new HeapSort<Integer>();
        Integer[] what = Arrays.stream(nums)
                .boxed().toArray(Integer[]::new);

        int heapSize = what.length;
        solution.buildMaxHeap(what, heapSize);

        for (int i = nums.length - 1; i > nums.length - k; i--) {
            solution.exch(what, 0, i);
            solution.maxHeapify(what, --heapSize, 0);
        }

        return what[0];
    }
}