package BruteForce;

import java.util.*;

public class RainWater {
    public static int water(ArrayList<Integer> arr) {
        int maxWater = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                maxWater = Math.max(maxWater, (Math.min(arr.get(i), arr.get(j)) * (j - i)));
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>( Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7) );
       
        System.out.println(water(arr));
    }
}
