package Arrays;

public class searchRotatedSorted {
    static int recursionSearch(int[] arr, int target, int start, int end) {
        int mid = end + (start - end) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] < arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return recursionSearch(arr, target, start, mid - 1);
            } else {
                return recursionSearch(arr, target, mid = 1, end);
            }
        } else {
            if (target >= arr[mid] && target <= arr[end]) {
                return recursionSearch(arr, target, mid + 1, end);
            } else {
                return recursionSearch(arr, target, start, mid - 1);
            }
        }
    }

    static int search(int[] arr, int target, int start, int end) {
        int mid;
        while (start <= end) {
            mid = end + (start - end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target >= arr[start] && target <= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 19, 21, 26, 32, 3, 6, 9, 10 };
        int start = 0;
        int end = arr.length - 1;
        System.out.println(recursionSearch(arr, 3, start, end));
    }
}
