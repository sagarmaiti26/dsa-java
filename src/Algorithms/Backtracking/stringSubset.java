package Algorithms.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
// n numbers of elemnt have 2^n number of subset elements
public class stringSubset {
    // Using ArrayList Return
    static ArrayList<String> arrayListSubset(String str, String ans) {
        ArrayList<String> subString = new ArrayList<>();
        if (str.isEmpty()) {
            if (ans.length()==0) {
                return new ArrayList<>(Arrays.asList("null"));
            }
            return new ArrayList<>(Arrays.asList(ans));
        }
        subString.addAll(arrayListSubset(str.substring(1), ans + str.charAt(0)));
        subString.addAll(arrayListSubset(str.substring(1), ans));
        return subString;
    }

    // Using Normal String and Void
    static void subset(String str, String ans) {
        if (str.isEmpty()) {
            if (ans.length() == 0) {
                System.out.println("null");

            } else {
                System.out.print(ans + " ");
            }

            return;
        }
        subset(str.substring(1), ans + str.charAt(0));
        subset(str.substring(1), ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        subset(str, ans);
        System.out.println(arrayListSubset(str,ans));

    }
}
