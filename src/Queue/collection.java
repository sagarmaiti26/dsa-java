package Queue;

import java.util.*;

public class collection {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> qL = new LinkedList<>();
        q.add(10);
        q.add(40);
        q.add(19);
        q.add(15);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
