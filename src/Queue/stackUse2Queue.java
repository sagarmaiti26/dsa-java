package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackUse2Queue {

    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty();
        }

        public void push(int data) {
            q1.add(data);

        }

        public int pop() {
            if (q1.isEmpty()) {
                return -1;
            }
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int x = q1.remove();
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return x;
        }

    }

    
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(13);
        st.push(19);
        st.push(33);
        st.push(73);

        st.pop();
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

}
