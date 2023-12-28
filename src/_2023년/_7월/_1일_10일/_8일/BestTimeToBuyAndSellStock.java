package _2023년._7월._1일_10일._8일;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i - 1]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}
