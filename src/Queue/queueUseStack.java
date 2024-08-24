package Queue;

import java.util.Stack;

public class queueUseStack {
    static class Queue {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        // isEmpty
        boolean isEmpty() {
            return st.isEmpty();
        }

        // add
        void add(int data) {
            if (st.isEmpty()) {
                st.push(data);
            } else {
                while (!st.isEmpty()) {
                    temp.push(st.pop());
                }
                st.push(data);
                while (!temp.isEmpty()) {
                    st.push(temp.pop());
                }
            }
        }

        // remove
        int remove() {
            if (st.isEmpty()) {
                return -1;
            }

            return st.pop();
        }

        int peek() {
            if (st.isEmpty()) {
                return -1;
            }

            return st.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(19);
        q.add(16);
        q.add(14);
        q.add(10);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }

}
