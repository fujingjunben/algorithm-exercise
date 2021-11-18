package com.bigdeal.sort;

public class QuickSort {
    public void sort(int[] a) {
        sortHelper(a, 0, a.length - 1);
    }

    public void sortHelper(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int p = partion(a, start, end);
        sortHelper(a, start, p - 1);
        sortHelper(a, p + 1, end);
    }

    public int partion(int[] a, int start, int end) {
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (a[j] < a[end]) {
                exchange(a, ++i, j);
            }
        }

        exchange(a, i + 1, end);
        return i + 1;
    }

    public void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
