package Algorithms.DivideAndConquer;

import java.util.Arrays;

public class mergeSort {
    static void mergeSorts(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSorts(arr, low, mid);
        mergeSorts(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];

                i++;
            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = 0, i = low; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 43, 87, 23, 98, 71, 34 };
        mergeSorts(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
