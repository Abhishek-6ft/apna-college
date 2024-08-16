package day08_Array;

// import java.util.*;

// @SuppressWarnings("unused")
public class max_Subarray_sum {

    // public static void find_max_sub(int Mx_Subarry[]) {

    // int currSum = 0;
    // int maxSum = Integer.MIN_VALUE;

    // for (int i = 0; i < Mx_Subarry.length; i++) {
    // int start = i;
    // for (int j = i; j < Mx_Subarry.length; j++) {
    // int end = j;
    // currSum = 0;
    // for (int k = start; k <= end; k++) {
    // currSum += Mx_Subarry[k];

    // }
    // System.out.println(currSum);
    // if (maxSum < currSum) {
    // maxSum = currSum;
    // }
    // }
    // }
    // System.out.println("max sum = " + maxSum);
    // }

    public static void Preffix_type(int Preffix_Subarry[]) {
        int current_Sum = 0;
        int Maximum_Sum = Integer.MIN_VALUE;
        int preffix[] = new int[Preffix_Subarry.length];

        // calculate preffix array
        preffix[0] = Preffix_Subarry[0];
        for (int i = 1; i < preffix.length; i++) {
            preffix[i] = preffix[i - 1] + Preffix_Subarry[i];
        }

        for (int i = 0; i < Preffix_Subarry.length; i++) {
            int start = i;
            for (int j = i; j < Preffix_Subarry.length; j++) {
                int end = j;

                current_Sum = start == 0 ? preffix[end] : preffix[end] - preffix[start - 1];

                if (Maximum_Sum < current_Sum) {
                    Maximum_Sum = current_Sum;
                }
            }
        }

        System.out.println("Max sum = " + Maximum_Sum);

    }


    public static void kadanes(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs<0) {
                cs = 0;
            }
            ms =Math.max(cs, ms);
        }

        System.out.println("our max subarray sum is : " + ms);
    }

    public static void main(String args[]) {
        // int Mx_Subarry[] = { 1, -2, 6, -1, 3 };
        // int Preffix_Subarry[] = { 1, -2, 6, -1, 3 };
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};


        kadanes(number);

        // find_max_sub(Mx_Subarry);
    }
}
