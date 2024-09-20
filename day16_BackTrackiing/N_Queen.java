package day16_BackTrackiing;

public class N_Queen {

    public static boolean isSafe(char board[][], int row, int col){
        // vertically up
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagnol left up
        for (int i = row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagnot right up
        for (int i=row-1, j=col+1; i>=0 && j<board.length; i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char board[][], int row){
        // base
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueen(board, row+1); // function call
                // backtracking
                board[row][j] = '_';
            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("------------chess board--------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '_';
            }
        }

        nQueen(board, 0);
    }
}
