package Algorithms.Greedy;

public class activitySelection {
    static int selection(int[] start, int[] end) {
        int count = 0;
        if (start.length == 0 || start[0] > end[0]) {
            return count;
        } else {
            count++;
        }
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                count++;
                lastEnd = end[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] start = { 1, 5, 0, 3, 8, 5 };
        int[] end = { 2, 9, 6, 7, 4, 9 };
        int[][] twoD = new int[start.length][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD.length; j++) {
                System.out.print(twoD[j]);
            }
            System.out.println();
        }
        System.out.println(selection(start, end));
    }

}
