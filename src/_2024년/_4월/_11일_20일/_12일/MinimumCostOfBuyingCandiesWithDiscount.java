package _2024년._4월._11일_20일._12일;

import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int freeCheck = 0;
        int result = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            if (freeCheck % 3 != 2) {
                result += cost[i];
            }
            freeCheck = (freeCheck + 1) % 3;
        }
        return result;
    }
}
