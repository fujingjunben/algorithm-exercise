package com.bigdeal.sort;

public class Merge {
    public static void sort(int[] a, int n) {
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = a[i];
        }

        sort(left, mid);
        sort(right, n - mid);
        merge(a, left, right, mid, n - mid);
    }

    public static void merge(int[] a, int[] left, int[] right,
                             int leftLength, int rightLength) {
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        while (i < leftLength) {
            a[k++] = left[i++];
        }

        while (j < rightLength) {
            a[k++] = right[j++];
        }
    }
}
