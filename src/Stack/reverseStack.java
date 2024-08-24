package Stack;

import java.util.Stack;

public class reverseStack {
    public static void addBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int x = st.pop();
        addBottom(st, data);
        st.push(x);

    }

    private static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int x = st.pop();
        reverse(st);
        addBottom(st, x);

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(17);
        st.push(19);
        st.push(15);
        
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }

}
