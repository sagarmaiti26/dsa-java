package Algorithms.Searching;

public class linear_Search {
    public static int linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 76, 45, 3, 2, 673, 4 };
        int target = 45;
        System.out.println(linear(arr, target));
    }

}
