package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class pairSum {
    // Find pair sum in a sorted arry
    public static boolean pair(ArrayList<Integer> arr, int sum) {
        int start = 0;
        int end = arr.size() - 1;
        int temp;
        while (start < end) {
            temp = arr.get(start) + arr.get(end);
            if (temp == sum) {
                return true;
            }
            if (temp > sum) {
                end--;
            } else {
                start++;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 5, 7, 9, 11, 14, 16, 21, 26));
        System.out.println(pair(arr, 25));
    }
}
