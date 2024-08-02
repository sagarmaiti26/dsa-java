package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack { // Last In First Out
        Deque<Integer> dq = new LinkedList<>();

        void push(int a) {
            dq.addLast(a);
        }

        int pop() {

            return dq.removeLast();
        }

        int peek() {
            return dq.getLast();
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(40);
        System.out.println(st.peek());

    }
}
