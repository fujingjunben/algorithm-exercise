package com.bigdeal.leetcode.s215;

import com.bigdeal.sort.HeapSort;

import java.util.Arrays;

public class SolutionV2 {
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        buildMaxHeap(nums, heapSize);

        for (int i = nums.length - 1; i > nums.length - k; i--) {
            exch(nums, 0, i);
            maxHeapify(nums, --heapSize, 0);
        }

        return nums[0];
    }


    public boolean less(int[] a, int i, int j) {
        return a[i] < a[j];
    }

    public void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int left(int[] a, int i) {
        return i * 2 + 1;
    }

    public int right(int[] a, int i) {
        return i * 2 + 2;
    }

    public void maxHeapify(int[] a, int heapSize, int k) {
        int l = left(a, k);
        int r = right(a, k);

        int largest = k;

        if (l < heapSize && !less(a, l, k)) {
            largest = l;
        }

        if (r < heapSize && !less(a, r, largest)) {
            largest = r;
        }

        if (largest != k) {
            exch(a, k, largest);
            maxHeapify(a, heapSize, largest);
        }
    }

    public void buildMaxHeap(int[] a, int heapSize) {
        for (int i = heapSize / 2; i >= 0; i--) {
            maxHeapify(a, heapSize, i);
        }
    }
}