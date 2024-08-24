package Algorithms.Sorting;

import java.util.Arrays;

public class countingSort {
    static void countSort(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int[] temp = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;

        }
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            while (temp[i]>0) {
                arr[count]=i;
                count++;
                temp[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 4, 3, 9, 1 };
        countSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
