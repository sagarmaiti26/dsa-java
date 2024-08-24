package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue { // Last In First Out
        Deque<Integer> dq = new LinkedList<>();

        void add(int a) {
            dq.addLast(a);
        }

        int remove() {

            return dq.removeFirst();
        }

        int peek() {
            return dq.getFirst();
        }

    }

    public static void main(String[] args) {
        Queue st = new Queue();
        st.add(10);
        st.add(20);
        st.add(40);
        System.out.println(st.peek());

    }
}
