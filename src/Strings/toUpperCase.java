package Strings;

// For a given sentence convert first letter of each word into Uppercase
public class toUpperCase {
    static String UpperCase(String sentence) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(sentence.charAt(0)));
        for (int i = 0; i < sentence.length()-1; i++) {
            if (sentence.charAt(i) == ' ') {
                sb.append(Character.toUpperCase(sentence.charAt(i + 1)));
                continue;
            }
            sb.append(sentence.charAt(i + 1));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String sentence = "hi, i am sagar";
        System.out.println(UpperCase(sentence));
    }
}
