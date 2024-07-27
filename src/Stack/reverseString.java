package Stack;

import java.util.Stack;

public class reverseString {
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        String newStr = "";
        while (!s.isEmpty()) {
            newStr = newStr + s.pop();
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "Rainbow";
        System.out.println(reverse(str));

    }

}
