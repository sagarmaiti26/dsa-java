package Heap;

import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int a) {
        arr.add(a);
        int n = arr.size() - 1;
        int parent = (n - 1) / 2;
        while (n > 0 && arr.get(n) <= arr.get(parent)) {
            int temp = arr.get(n);
            arr.set(n, arr.get(parent));
            arr.set(parent, temp);
            n = parent;
            parent = (n - 1) / 2;
        }

    }

    public int peek() {

        return arr.get(0);

    }

    public static void main(String[] args) {

    }

}
