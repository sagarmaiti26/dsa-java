package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q1interLeave {
    static Queue<Integer> inter(Queue<Integer> q) {
        Queue<Integer> first = new LinkedList<>();

        int n = q.size() / 2;
        for (int i = 0; i < n; i++) {
            first.add(q.remove());
        }

        while (!first.isEmpty()) {
            q.add(first.remove());
            q.add(q.remove());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            q.add(i + 1);
        }
        System.out.println(inter(q));

    }

}
