package day08_Array;

public class Buy_Stock {

    public static int buyAndSellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE; // plus infinite
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // this was calculate today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];

            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 }; //O(n); time complexity

        System.out.println(buyAndSellStock(prices));
    }
}
