package Strings;

public class palindrome {
    static void palindromeCheck(String pal) {

        for (int i = 0; i < pal.length()/2; i++) {
            if (pal.charAt(i) != pal.charAt(pal.length() - i-1)) {
                System.out.println("Not Palindrome");
                return;
            }

        }
        System.out.println("It's Palindrome");
    }

    public static void main(String[] args) {
        String pal = "madaam";
        palindromeCheck(pal);

    }
}
