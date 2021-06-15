package com.bigdeal.search;

public class BinarySearch {
    public static int search(int[] sortedArray, int key) {
        return searchIteratively(sortedArray, key, 0,
                sortedArray.length - 1);
    }

    private static int searchIteratively(int[] sortedArray, int key,
                                         int low, int high) {
        while (low <= high) {
            int middle = (low + high) / 2;
            if (sortedArray[middle] < key) {
                low = middle + 1;
            } else if (sortedArray[middle] > key) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
