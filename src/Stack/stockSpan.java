package Stack;

import java.util.Stack;

public class stockSpan {
    public static void stock(int[] price, int[] span) {
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);
        for (int i = 1; i < price.length; i++) {
            while (!st.isEmpty() && price[i] > price[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);

        }

    }

    public static void main(String[] args) {
        int[] price = { 10, 12, 7, 15, 8, 8, 10 };
        int[] span = new int[price.length];
        stock(price, span);
        for (int i : span) {
            System.out.print(i + " ");
        }
    }
}
