package day16_BackTrackiing;

public class Sudoko {
    public static boolean isSfe(int sudoko[][], int row, int col, int digit){
        // column
        for (int i = 0; i <= 8; i++) {
            if (sudoko[i][col] == digit) {
                return false;
            }
        }

        // row
        for (int j = 0; j <= 8; j++) {
            if (sudoko[row][j] == digit) {
                return false;
            }
        }

        // grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        // Grid of 3*3
        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j <sc+3; j++) {
                if (sudoko[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean sudokoSolver(int sudoko[][], int row, int col){
        // base
        if (row == 9 && col == 0) {
            return true;
        }

        // recursion
        int nxtrow = row, nextCol = col + 1;
        if (col+1 == 9) {
            nxtrow = row + 1;
            nextCol = 0;
        }

        if (sudoko[row][col] != 0) {
            return  sudokoSolver(sudoko, nxtrow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSfe(sudoko, row, col, digit)) {
                sudoko[row][col] = digit;
                if(sudokoSolver(sudoko, nxtrow, nextCol)) {
                    return true;
                }
                sudoko[row][col] = 0;
            }
        }

        return false;
    }
    public static void printSudoku(int sudoko[][]){
        for (int i = 0; i <9; i++) {
            for (int j = 0; j <9; j++) {
                System.out.print(sudoko[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoko[][] = 
                    {
                        { 5 , 3 , 0 , 0 , 7 , 0 , 0 , 0 , 0 },
                        { 6 , 0 , 0 , 1 , 9 , 5 , 0 , 0 , 0 },
                        { 0 , 9 , 8 , 0 , 0 , 0 , 0 , 6 , 0 },
                        { 8 , 0 , 0 , 0 , 6 , 0 , 0 , 0 , 3 },
                        { 4 , 0 , 0 , 8 , 0 , 3 , 0 , 0 , 1 },
                        { 7 , 0 , 0 , 0 , 2 , 0 , 0 , 0 , 6 },
                        { 0 , 6 , 0 , 0 , 0 , 0 , 2 , 8 , 0 },
                        { 0 , 0 , 0 , 4 , 1 , 9 , 0 , 0 , 5 },
                        { 0 , 0 , 0 , 0 , 8 , 0 , 0 , 7 , 9 }
                    };

        if (sudokoSolver(sudoko, 0, 0)) {
            System.out.println("Solution exists");
            printSudoku(sudoko);
        }else{
            System.out.println("Solution does not exists");
        }
    }
}
