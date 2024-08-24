package Stack;

import java.util.Stack;

public class duplicateParenthesis {
    public static boolean isDuplicate(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (st.peek() == '(') {
                    return true;
                }
                while (st.pop() != '(') {
                }

            } else {
                st.push(s.charAt(i));
            }

        }

        return false;
    }

    public static void main(String[] args) {
        String s = "(a+b)";
        System.out.println(isDuplicate(s));

    }

}
