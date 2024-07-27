package Algorithms.Sorting;

import java.util.*;

public class selectionSort {
    public static void selection(int[] arr) {
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

    public static void main(String[] args) {
        int[] arr = { 34, 5, 39, 54, 29, 43 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
