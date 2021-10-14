package com.bigdeal.sort;

/**
 * 插入排序
 */
public class Insertion {
    public static void sort(int[] a) {
        if (a.length <= 1) {
            return;
        }
        for (int i = 1; i < a.length; i++) {
            // 待排序的元素
            int key = a[i];

            // 将key插入左边已排序部分数组
            int j = i - 1;
            while (j >=0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }
    }
}
