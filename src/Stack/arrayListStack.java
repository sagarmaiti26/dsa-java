package Stack;

import java.util.ArrayList;

public class arrayListStack {
    static public class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int a) {
            list.add(a);
        }

        public int pop() {
            if (list.isEmpty()) {
                return -1;
            }
            int a = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return a;
        }

        public int peek() {
            return list.get(list.size() - 1);

        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(12);
        s.push(14);
        s.push(10);
        s.push(13);
        s.push(17);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println(s.isEmpty());
    }
}
