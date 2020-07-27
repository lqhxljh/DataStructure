package com.ljh.data.sort;

import java.util.Arrays;

public class SortUtils {
    /**
     * 重复地走访要经过的排序的数列，每次和指定位置比较，如果发现位置不对就交换
     *
     * @param arr 未排序数组
     */
    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 重复地走访要经过的排序的数列，每次比较相邻元素，如果他们的顺序错误就将顺序交换过来，最大数将放置在末尾
     *
     * @param arr 未排序数组
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 归并排序
     * 将数组分成2组，调用递归排列2个子数组,并将排序好的结果放到临时数组。拍好后拷贝到原数组
     */
    public static int[] mergeSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        } else {
            int[] merger = new int[arr.length];
            internalMergeSort(0, arr.length - 1, arr, merger);
            return merger;
        }
    }

    public static void internalMergeSort(int start, int end, int[] arr, int[] mergeData) {
        if (start >= end) {
        } else {
            int mid = (start + end) / 2;
            internalMergeSort(start, mid, arr, mergeData);
            internalMergeSort(mid + 1, end, arr, mergeData);
            int i = start;
            int j = mid + 1;
            int position = 0;
            while (i <= mid && j <= end) {
                mergeData[position ++] = arr[i] < arr[j]? arr[i++] : arr[j++];
            }
            while (i <= mid)
            {
                mergeData[position ++] = arr[i++];
            }
            while (j <= end)
            {
                mergeData[position ++] = arr[j++];
            }

            position = 0;
            //将temp中的元素全部拷贝到原数组中
            while(start <= end){
                arr[start++] = mergeData[position++];
            }

        }
    }
}
