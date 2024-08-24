package Stack;

import java.util.Stack;

public class ColllectionStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(42);
        st.push(92);
        st.push(18);
        System.out.println(st.pop());
    }
    
}
