package day10_2dArrays;

import java.util.*;

public class _Arrays {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }

            }
        }
        System.out.println("key not found");
        return false;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // 2d array
        int matrix[][] = new int[3][3];
        // int n = 3, m = 3;
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt(); // for access data
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 1);
    }
}
