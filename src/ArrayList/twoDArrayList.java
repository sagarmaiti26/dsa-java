package ArrayList;

import java.util.*;

public class twoDArrayList {

   public static void main(String[] args) {
      ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
      ArrayList<Integer> one = new ArrayList<>();
      one.add(10);
      one.add(20);
      one.add(30);
      one.add(40);
      ArrayList<Integer> two = new ArrayList<>();
      two.add(15);
      two.add(25);
      two.add(35);
      two.add(45);

      arr.add(one);
      arr.add(two);

      for (int i = 0; i < arr.size(); i++) {
         for (int j = 0; j < arr.get(i).size(); j++) {
            System.out.print(arr.get(i).get(j));
         }
      
      }
   }
}
