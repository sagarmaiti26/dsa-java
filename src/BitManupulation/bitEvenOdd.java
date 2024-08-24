package BitManupulation;

public class bitEvenOdd {
    static void bitCheck(int decimal) {
        int bitMask = 1;
        if ((decimal & bitMask) == 1) {
            System.out.println("It's Not a Even Number");
        } else {
            System.out.println("It's a Even Number");
        }
    }

    public static void main(String[] args) {
        bitCheck(6);
    }
}
