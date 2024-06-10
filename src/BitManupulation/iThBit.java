package BitManupulation;

public class iThBit {

    static int getIthBit(int bit, int i) {
        int bitMask = 1 << i;
        if ((bit & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    static int setIthBit(int bit, int i) {
        int bitMask = 1 << i;
        return (bit | bitMask);
    }

    public static void main(String[] args) {
        int i = 2;
        int bit = 12;
        System.out.println(i + "th bit of the " + bit + " is " + getIthBit(bit, i));
        System.out.println(i + "th bit set in " + bit + " =" + setIthBit(bit, i));
    }
}
