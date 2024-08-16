package day10_2dArrays;
import java.util.*;

public class practice {
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length; // its consider number of rows in matrix
        int m = matrix[0].length; // its consider number of column in matrix

        @SuppressWarnings("resource")
        Scanner sc =  new Scanner(System.in);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");            
            }
            System.out.println();
        }
    }
}
