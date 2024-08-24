package Strings;

public class stringstr {
    static String compString(String str) {
        String newStr = "";

        for (int i = 1; i < str.length() - 1; i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count;
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaaabbcdddd";
        System.out.println(compString(str));
    }

}