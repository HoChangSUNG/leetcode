package _8월._1일_10일._9일;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int price = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] - min > price) price = prices[i] - min;
            min = Math.min(min, prices[i]);
        }
        return price;
    }
}
