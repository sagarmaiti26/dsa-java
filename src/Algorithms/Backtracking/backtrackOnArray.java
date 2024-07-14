package Algorithms.Backtracking;

import java.util.Arrays;

public class backtrackOnArray {
    static void backTrack(int[] arr, int i, int value) {
     //Base Case
     if (i==arr.length) {
        System.out.println(Arrays.toString(arr));
        return;
     }
     //Recursion Call
     arr[i]=value;
     backTrack(arr, i+1, value+1);
     arr[i]=arr[i]-2;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        backTrack(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
