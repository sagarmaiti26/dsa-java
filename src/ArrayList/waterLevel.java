package ArrayList;

import java.util.*;

public class waterLevel {
    // You have been given a long type array/list 'arr’ of size 'n’.
    // It represents an elevation map wherein 'arr[i]’ denotes the elevation of the 'ith' bar.
    // Print the total amount of rainwater that can be trapped in these elevations.
    public static int water(ArrayList<Integer> arr) {
        int max = 0;
        int height, width;
        int leftPoint = 0;
        int rightPoint = arr.size() - 1;
        while (leftPoint < rightPoint) {
            height = Math.min(arr.get(rightPoint), arr.get(leftPoint));
            width = rightPoint - leftPoint;
            max = Math.max(max, height * width);
            if (leftPoint < rightPoint) {
                leftPoint++;
            } else {
                rightPoint--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));

        System.out.println(water(arr));
    }
}
