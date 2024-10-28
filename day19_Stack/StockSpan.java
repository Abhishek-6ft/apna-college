package day19_Stack;

import java.util.Stack;

public class StockSpan {
    public static void stockSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++) { // this loop run to find stock price
            int currentPrice = stock[i]; // current price store the iterative value of i stock
            while (!s.isEmpty() && currentPrice > stock[s.peek()]) { // this loop run until our stack was empty or the
                                                                     // current pice of stock is less than stock peek
                                                                     // values
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }

    }

    public static void main(String[] args) {
        int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stock.length];

        stockSpan(stock, span);

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }

    }
}
