package Stack;

import java.util.Stack;

public class nextGreaterElement {
    private static void nextGreater(int[] arr, int[] next) {
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                next[i] = -1;
            } else {
                next[i] = arr[st.peek()];
            }
            st.push(i);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 1, 7, 3, 4 };
        int[] next = new int[arr.length];
        nextGreater(arr, next);
        for (int i : next) {
            System.out.print(i + " ");
        }
    }

}
