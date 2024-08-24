package Stack;

import java.util.Stack;

public class stockSpan {
    public static void stock(int[] price, int[] span) { //Time Complexity O(n)
        //New Stack Created    
        Stack<Integer> st = new Stack<>();
        //As First span alwyays 1 
        span[0] = 1;
        st.push(0);
        //Iterating the price array
        for (int i = 1; i < price.length; i++) {
            //checking in stack until which there's a span
            while (!st.isEmpty() && price[i] > price[st.peek()]) {
                st.pop();
            }
            //if stack empty it means it's the biggest till now so the index+1 will be span
            if (st.isEmpty()) {
                span[i] = i + 1;
            }
            //else it's a formula (price index - prev min price index = span)
            else {
                span[i] = i - st.peek();
            }
            // Pushing every index in stack
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
