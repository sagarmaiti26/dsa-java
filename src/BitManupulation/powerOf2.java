package BitManupulation;

public class powerOf2 {
    static boolean powerOfTwo(int n) {
       if ((n&(n-1))==0) {
        return true;
       }
        return false;
    }

    public static void main(String[] args) {
System.out.println(powerOfTwo(16));
    }
}
