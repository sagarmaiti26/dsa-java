package Algorithms.Recursion;

public class reverseString {
    static String reverse(String x, String res) {
        if (x.isEmpty()) {
            return res;
        }
        res = res + x.charAt(x.length() - 1);
        return reverse(x.substring(0, x.length() - 1), res);
    }

    public static void main(String[] args) {
        String x = "SUNFLOWER";
        System.out.println(reverse(x, ""));
    }
}