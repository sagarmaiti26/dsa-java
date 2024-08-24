package Algorithms.Backtracking;

public class NQueens {
    static int count = 0;

    static void Nqueen(char[][] arr, int row) {
        if (row == arr.length) {
            System.out.println("___New Board___");
            printBoard(arr);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (isSafe(arr, row, i)) {
                arr[row][i] = 'Q';
                Nqueen(arr, row + 1);
                arr[row][i] = '#';
            }

        }
    }

    static boolean isSafe(char[][] arr, int row, int col) {
        // Vertical Up Check
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal Left Check

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

            if (arr[i][j] == 'Q') {
                return false;
            }

        }

        // Diagonal Right Check
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }

        }
        return true;
    }

    static void printBoard(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Count N Queens

    static void countNqueen(char[][] arr, int row) {
        if (row == arr.length) {
            count++;
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (isSafe(arr, row, i)) {
                arr[row][i] = 'Q';
                countNqueen(arr, row + 1);
                arr[row][i] = '#';
            }

        }
    }

    // Check If N Queen Possible or Not
    static boolean CheckNqueen(char[][] arr, int row) {
        if (row == arr.length) {
            return true;
        }
        for (int i = 0; i < arr.length; i++) {
            if (isSafe(arr, row, i)) {
                arr[row][i] = 'Q';
                if (CheckNqueen(arr, row + 1)) {
                    return true;
                }

            }

        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        char queen[][] = new char[n][n];
        for (int i = 0; i < queen.length; i++) {
            for (int j = 0; j < queen.length; j++) {
                queen[i][j] = '#';
            }
        }
        // Nqueen(queen, 0);
        // countNqueen(queen, 0);
        System.out.println(CheckNqueen(queen, 0));
        // System.out.println(count);

    }

}
