package ArrayList;

import java.util.*;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(17);
        arr.add(25);
        arr.add(39);
        arr.add(52);
   for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }
}
