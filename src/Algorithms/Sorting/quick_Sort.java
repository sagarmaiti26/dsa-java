package Algorithms.Sorting;

import java.util.Arrays;

public class quick_Sort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start>=end) {return;}
        int low = start;
        int high = end;
        int pivot = start + (end - start) / 2;
        while (low < high) {
            while (arr[low] < arr[pivot]) {
                low++;
            }
            while (arr[high] > arr[pivot]) {
                high--;
            }
            if (low<=high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }


        }
        quickSort(arr, start, high);
        quickSort(arr, low, end);


    }

    public static void main(String[] args) {
        int[] arr = {45, 23, 37, 12, 76, 52};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
