package Numbers;

public class binaryToDecimal {
    static int decimal(int binary){
        int pow =0 ;
        int decValue =0;
        while (binary>0) {
            int lastDigit = binary%10;
            decValue+=lastDigit*(Math.pow(2,pow));
            pow++;
            binary = binary/10;
        }
        return decValue;
    }
    public static void main(String[] args) {
        System.out.println(decimal(100));
    }
}
