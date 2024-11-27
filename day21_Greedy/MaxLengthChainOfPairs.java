package day21_Greedy;
import java.util.*;

public class MaxLengthChainOfPairs {
    
    
    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1]; // Last selected pair end  // chain end
        
        for(int i=1; i<pairs.length; i++){
            if (pairs[i][0] > chainEnd) {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("max length of chain = " + chainLength);
    }
}

/*
 * you are given n pairs of numbers in every pair the first number is always smaller than the second number.
 * A pair(c, d) can come offer pair(a, b) if b<c. Find the longest chain which can be formed from a given set of pairs
 * 
 * pairs = (5, 24) (39, 60) (5,28) (27,40) (50,90)
 * ans = 3;
 */
