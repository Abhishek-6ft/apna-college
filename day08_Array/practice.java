package day08_Array;

public class practice {
    
    public static int BuyAndSell(int prices[]){
        int BuyPrice = Integer.MAX_VALUE;
        int Max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (BuyPrice < prices[i]) {
                int profit = prices[i] - BuyPrice;
                Max_profit = Math.max(Max_profit, profit);
            } else {
                BuyPrice = prices[i];
            }
        }
        return Max_profit;
    }


    public static void main(String args[]){
        int prices[] = { 7, 1, 5, 3, 6, 4};

        System.out.println(BuyAndSell(prices));
    }
}
