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
        if (arr.isEmpty()) {
            return -1;
        }
        return arr.get(0);

    }

    public int remove() {
        int data = arr.get(0);
        // First and last Swap
        int temp = arr.get(arr.size() - 1);
        arr.set(arr.size() - 1, arr.get(0));
        arr.set(0, temp);
        // Delete the last element
        arr.remove(arr.size() - 1);
        // Heapify
        heapify(0);
        return data;
    }

    private void heapify(int i) {
      
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int min = i;
        if (left < arr.size() && arr.get(min) > arr.get(left)) {
            min = left;
        }
        if (right < arr.size() && arr.get(min) > arr.get(right)) {
            min = right;
        }
        if (min != i) {
            int temp = arr.get(i);
            arr.set(i, arr.get(min));
            arr.set(min, temp);
             heapify(min);
        }
       

    }
    public boolean isEmpty(){
        return arr.size()==0;
    }
    public void print(){
        for (Integer x : arr) {
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(10);
        h.add(19);
        h.add(12);
        h.add(62);
        h.add(2);
        h.print();
        System.out.println();
       while (!h.isEmpty()) {
        System.out.println(h.remove());
       }
        
       



        
    }

}
