package Numbers;
public class decimaltoBinary {
    static int binary(int decimal){
       int binary = 0;
       int multiply = 1;
      while (decimal>0) {
        binary+=(decimal%2)*multiply;
        multiply*=10;
        decimal/=2;
      }
        return binary;
    }
    public static void main(String[] args) {
        System.out.println(binary(8));
    }
}
