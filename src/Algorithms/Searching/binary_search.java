package Algorithms.Searching;


    public class binary_search {
        public static int binarySearch(int[] arr, int target) {
           int start = 0;
           int end =arr.length-1;
    
           while (start<=end){
               int pivot =start+(end-start)/2;
               if (arr[pivot] == target) {
                   return pivot;
               } else if (target>arr[pivot]) {
                   start=pivot+1;
               }
               else {
                   end =pivot-1;
               }
    
           }
           return -1;
        }
            public static void main (String[]args){
                int[] arr = {10, 23, 37, 43, 76};
                System.out.println( binarySearch(arr, 76));
    
    
            }
    
}
