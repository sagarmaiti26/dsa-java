package Algorithms.Sorting;

import java.util.*;

public class bubbleSort {
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 34, 5, 39, 54, 29, 43 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
