package Queue;

import java.util.*;

public class reverseQueue {
    static Queue<Integer> reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            q.add(i + 1);
        }
        System.out.println(reverse(q));

        
    }




}
