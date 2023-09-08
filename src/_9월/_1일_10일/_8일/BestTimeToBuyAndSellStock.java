package _9월._1일_10일._8일;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] buy = new int[n];
        buy[0] = prices[0];
        for (int i = 1; i < n; i++) {
            buy[i] = Math.min(buy[i - 1], prices[i]);
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            int diff = prices[i] - buy[i];
            if (diff > result) result = diff;
        }
        return result;
    }
}
