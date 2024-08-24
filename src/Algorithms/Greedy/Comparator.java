package Algorithms.Greedy;

import java.util.*;

class Comparator {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40 };
        int[] b = { 90, 80, 70, 60 };
        int[][] newC = new int[a.length][3];
        for (int i = 0; i < a.length; i++) {
            newC[i][0] = i;
            newC[i][1] = a[i];
            newC[i][2] = b[i];

        }
        System.out.println(Arrays.deepToString(newC));
        Arrays.sort(newC, java.util.Comparator.comparingInt(o -> o[2]));
    }
}