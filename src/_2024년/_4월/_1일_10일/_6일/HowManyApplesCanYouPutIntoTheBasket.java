package _2024년._4월._1일_10일._6일;

import java.util.Arrays;

public class HowManyApplesCanYouPutIntoTheBasket {
    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int bucketAmount = 5000;
        int result = 0;
        for (int i = 0; i < weight.length; i++) {
            if (bucketAmount >= weight[i]) {
                result++;
                bucketAmount -= weight[i];
            }
        }
        return result;
    }
}
