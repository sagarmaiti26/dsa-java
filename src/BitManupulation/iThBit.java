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

    static int clearIthBit(int bit, int i) {
        int bitMask = ~(1 << i);
        return bit & bitMask;
    }

    static int updateIthBit(int bit, int i, int newBit) {
        int bitMask = newBit << i;
        return bit | bitMask;

    }

    static int clearLastIBits(int bit, int i) {
        int bitMask = ~0 << i;
        return bit & bitMask;
    }

    public static void main(String[] args) {
        int i = 2;
        int bit = 13;
        System.out.println(i + "th bit of the " + bit + " = " + getIthBit(bit, i));
        System.out.println(i + "th bit set in " + bit + " = " + setIthBit(bit, i));
        System.out.println(i + "th bit clear in " + bit + " = " + clearIthBit(bit, i));
        System.out.println(i + "th bit update in " + bit + " = " + updateIthBit(bit, i, 1));
        System.out.println("After clearing last " + i + " bits " + bit + " = " + clearLastIBits(bit, i));

    }
}
