package PriorityQueue;

import java.util.PriorityQueue;

// Given a list of n points on 2D plane, the task is to find the K (k < n) closest points to the origin O(0, 0). 
public class KNearest {
    static class Points implements Comparable<Points> {
        int x;
        int y;
        int distSq;

        Points(int x, int y, int distSq) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
        }

        @Override
        public int compareTo(Points o) {

            return this.distSq - o.distSq;
        }
    }

    static void KClosest(int[][] arr, int k) {
        if (arr.length < k) {
            return;
        }
        PriorityQueue<Points> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            pq.add(new Points(x, y, (int) (Math.pow(x, 2) + Math.pow(y, 2))));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("C-("+pq.peek().x + "," + pq.remove().y+")");
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int K = 2;
        KClosest(arr, K);
    }
}
