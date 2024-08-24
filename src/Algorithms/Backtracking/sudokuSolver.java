package Algorithms.Backtracking;

public class sudokuSolver {
    public static boolean sudokuSolved(int[][] sudoku, int row, int col) {
        // base case
        if (row == 9 && col == 9) {
            return true;
        } else if (row == 9) {
            return false;
        }
        // recursion
        int newRow = row;
        int newCol = col + 1;
        if (col + 1 == 9) {
            newRow = row + 1;
            newCol = 0;
        }
        if (sudoku[row][col] != 0) {
            return sudokuSolved(sudoku, newRow, newCol);
        }
        for (int i = 1; i <= 9; i++) {
            if (isSafe(sudoku, row, col, i)) {
                sudoku[row][col] = i;
            }
            if (sudokuSolved(sudoku, newRow, newCol)) {
                return true;
            }

        }
        return false;
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
    for (int i = 0; i < 9; i++) {
        if (sudoku[row][i]==digit||sudoku[i][col]==digit) {
            return false;
        }

        
    }
    int startRow = (row/3)*3;
    int startcol = (col/3)*3;
    for (int i = startRow; i <startRow+3; i++) {
        for (int j = startcol; j < startcol+3; j++) {
            if (sudoku[i][j]==digit) {
                return false;
            }
        }
    }
    return true;
    }

    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                           { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                           { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                           { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                           { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                           { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                           { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                           { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                           { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        System.out.println(sudokuSolved(sudoku, 0, 0));

    }
}
