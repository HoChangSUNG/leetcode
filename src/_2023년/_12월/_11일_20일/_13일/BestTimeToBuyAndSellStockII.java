package _2023년._12월._11일_20일._13일;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int peak = prices[0];
        int valley = prices[0];
        int maxProfit = 0;
        int i = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) i++;
            peak = prices[i];
            maxProfit += (peak - valley);
        }

        return maxProfit;
    }
}
