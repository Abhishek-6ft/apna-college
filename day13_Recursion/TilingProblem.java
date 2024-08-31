package day13_Recursion;
/*
 * Tiling Problem
 * Given a "2 * n" board and tiles of the size "2 * 1" count the number of ways to 
 * tile the given board using the the 2 * 1 tiles.
 * (A tile can either be placed horizontally or vertically)
 */
public class TilingProblem {
    public static int tilingProblemCount(int n){ // 2 / n floor size
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // work
        //vertical choice
        int verticalTiles_Fn_1 = tilingProblemCount(n-1);

        //Horizontal choice
        int horizontal_Fn_2 = tilingProblemCount(n - 2);
        
        int totalWays = verticalTiles_Fn_1 + horizontal_Fn_2;
        return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(tilingProblemCount(4));
    }
}