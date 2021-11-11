package com.bigdeal.sort;

public class HeapSort<Key extends Comparable<Key>> {
    public void sort(Key[] a) {
        int heapSize = a.length;
        buildMaxHeap(a, heapSize);
        for (int i = a.length - 1; i > 0 ; i--) {
            exch(a, 0, i);
            heapSize--;
            maxHeapify(a, heapSize, 0);
        }
    }
    public void sink(Key[] a, int k, int N) {
        while (2 * k + 2 < N) {
            int j = 2 * k + 1;
            if (j < N - 1 && less(a, j, j + 1)) {
                j++;
            }
            if (!less(a, k, j)) {
                break;
            }
            exch(a, k, j);
            k = j;
        }
    }

    public boolean less(Key[] a, int i, int j) {
        return a[i].compareTo(a[j]) < 0;
    }

    public void exch(Key[] a, int i, int j) {
        Key temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int left(Key[] a, int i) {
        return i * 2 + 1;
    }

    public int right(Key[] a, int i) {
        return i * 2 + 2;
    }

    public void maxHeapify(Key[] a, int heapSize, int k) {
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

    public void buildMaxHeap(Key[] a, int heapSize) {
        for (int i = heapSize / 2; i >= 0; i--) {
            maxHeapify(a, heapSize, i);
        }
    }
}
