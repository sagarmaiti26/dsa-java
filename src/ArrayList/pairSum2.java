package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class pairSum2 {
    // Find pair sum in a sorted and rotated arry
    public static boolean pair(ArrayList<Integer> arr, int sum) {
        int n = arr.size()-1;
        int rightPoint = arr.size() - 1;
        int leftPoint = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                rightPoint = i;
                leftPoint = i + 1;
                break;
            }
        }
        while (arr.get(leftPoint) < arr.get(rightPoint)) {
            int temp = arr.get(leftPoint) + arr.get(rightPoint);
            if (temp == sum) {
                return true;
            }
            
        
            if (temp > sum) {
                rightPoint= (n+rightPoint-1)%n;
            } else {
                leftPoint = (leftPoint+1)%n;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList( 21, 26, 1, 5, 7, 9, 11, 14,16));
        System.out.println(pair(arr, 25));
    }
}
