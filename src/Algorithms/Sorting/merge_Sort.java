package Algorithms.Sorting;

import java.util.Arrays;

public class merge_Sort {
    public static void mergeSort(int[] arr, int start, int end) {

        if (end - start == 1) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, end, mid);
    }

    private static void merge(int[] arr, int start, int end, int mid) {
        int i = start;
        int j = mid;
        int k = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j < end) {
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[start + l] = temp[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 13, 87, 34, 26, 91, 56 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
