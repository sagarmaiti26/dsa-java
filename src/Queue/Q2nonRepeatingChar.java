package Queue;

import java.util.*;

//Given an input stream of characters consisting only of lowercase alphabets.  Find the first non-repeating character in the input string each time a new character is inserted into the stream. If there is no non-repeating character, then append '-1' to the answer.
public class Q2nonRepeatingChar {
    public static String nonRepeat(String s) {
        String res = "";
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            freq[ch - 'a']++;
            q.add(ch);
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                  q.remove();
            }
            if (q.isEmpty()) {
                res=res+"-1";
            }
            else{
                res=res+q.peek();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "aabccxb";
        System.out.println(nonRepeat(s));

    }

}
