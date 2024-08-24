package Stack;

import java.util.Stack;

public class validParenthesis {
    static boolean valid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (s.charAt(i) == '}' && st.pop() == '{' || s.charAt(i) == ']' && st.pop() == '['
                        || s.charAt(i) == ')' && st.pop() == '(') {
                    continue;
                } else {
                    return false;
                }

            }
        }
        if (!st.isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "((";
        System.out.println(valid(s));
    }
}
