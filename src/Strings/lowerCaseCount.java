package Strings;
import java.util.*;
public class lowerCaseCount {
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
    int count=0;
    for(int i = 0 ;i<str.length();i++){
      if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        count++;
      }
    }
    System.out.println("Total Number of Lower Case Char is: "+count);
}
    
}