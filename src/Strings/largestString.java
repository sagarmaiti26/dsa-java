package Strings;

public class largestString {
    static String largeString(String[] arr) {
        String large ;
        large = arr[0];
        for (String string : arr) {
            int compare = large.compareTo(string);
            if (compare > 0) {
                large = string;
            }
        }
        return large;
    }

    public static void main(String[] args) {
        String[] large = {"elephant", "dog", "tiger" };
        System.out.println(largeString(large));
    }
}
