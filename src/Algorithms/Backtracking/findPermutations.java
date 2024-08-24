package Algorithms.Backtracking;

// n Elements have n! permutation
public class findPermutations {
    static void permutation(String str, String ans) {

        if (str.isEmpty()) {
            System.out.print(ans + ", ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, ans + curr);
        }
    }

    static void permutationKunal(String str, String ans) {

        if (str.isEmpty()) {
            System.out.print(ans + ", ");
            return;
        }

        for (int i = 0; i <= ans.length(); i++) {
            char curr = str.charAt(0);
            // "_ab" , a_b , ab_'
            String newAns = ans.substring(0, i) + curr + ans.substring(i);

            permutationKunal(str.substring(1), newAns);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutationKunal(str, "");

    }
}
