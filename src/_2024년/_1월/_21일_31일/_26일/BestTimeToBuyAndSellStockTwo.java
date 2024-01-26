package _2024년._1월._21일_31일._26일;

public class BestTimeToBuyAndSellStockTwo {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        int high = prices[0];
        int low = prices[0];

        int i = 0;
        while (i < n - 1) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) i++;
            low = prices[i];
            while (i < n - 1 && prices[i] <= prices[i + 1]) i++;
            high = prices[i];
            maxProfit += (high - low);
        }
        return maxProfit;
    }
}
