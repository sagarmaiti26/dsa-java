package Numbers;

public class prime {
    static boolean primeCheck(int x) {
        if (x <= 1) {
            return false;
        }
        if (x == 2) {
            return true;
        }
        System.out.println(Math.sqrt(x));
        for (int i = 2; i <= Math.sqrt(x); i ++) {

            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    System.out.println(primeCheck(5));
    }
}
