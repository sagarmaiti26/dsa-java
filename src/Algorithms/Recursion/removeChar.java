package Algorithms.Recursion;

public class removeChar {
    static String skip(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.charAt(0) == 'a') {
            return skip(str.substring(1));
        } else {
            return str.charAt(0) + skip(str.substring(1));
        }
    }
    // Remove a word from

    static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("apple")) {
            return skip(str.substring(6));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    static void removedChar(String str, String res, int i) {
        if (i == str.length()) {
            System.out.println(res);
            return;
        }
        if (str.charAt(i) != 'a') {
            res = res + str.charAt(i);
        }
        removedChar(str, res, i + 1);

    }

    public static void main(String[] args) {
        String str = "bcaddaf";
        String res = "";
        removedChar(str, res, 0);
        System.out.println(skip(str));
        System.out.println(skipApple("My apple is red"));
    }
}
