package day21_Greedy;
import java.util.*;

public class Fractionalknapsack {

    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col => index & 1st col => ratio;

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalValue = 0;

        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) { // include full item?
                finalValue += val[idx];
                capacity -= weight[idx];
            } else {
                //include fractional item
                finalValue += (ratio[i][1]) * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value = " + finalValue);
    }
}

//Fractional Knapsack

/*
Given the weights and value of N items, put these items in a Knapsack of capacity W
to get the the maximum total value in the knapsack

value = [60, 100, 200]
weight = [10, 20, 30]
w = 50
answer = 240
*/
