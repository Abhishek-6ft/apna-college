package day21_Greedy;
import java.util.*;


public class IndiansCoins {
    
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000, 5000, 10000};

        Arrays.sort(coins, Comparator.reverseOrder());
        // System.out.println(coins);

        int countOfCoins = 0;
        int Amount = 69;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<coins.length; i++) {
            if (coins[i] <= Amount) {
                while (coins[i] <= Amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    Amount -= coins[i];
                }
            }
        }
        System.out.println("total min coins used = " + countOfCoins);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+ " ");
        }
        System.out.println();
    }
}


/* 
Indian coins
We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000]
Find the min no. of coins/notes to make change for a value V.
V = 121
ans = 3 (100 + 20 + 1)
*/
