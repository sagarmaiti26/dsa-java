package Algorithms.DivideAndConquer;

import java.util.Arrays;

public class quickSort {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void quick(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int low = start;
        int high = end;
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];

        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }

        }
        quick(arr, start, high);
        quick(arr, low, end);

    }

    public static void main(String[] args) {
        int[] arr = { 54, 89, 23, 41, 75 };
        int high = 0;
        int low = arr.length - 1;
        quick(arr, high, low);
        System.out.println(Arrays.toString(arr));
    }
}
