package Stack;

import java.util.Stack;

public class pushBottom {
    public static void addBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int x = st.pop();
        addBottom(st, data);
        st.push(x);

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(17);
        st.push(19);
        st.push(15);
        addBottom(st, 20);
        System.out.println(st);
    }
}
