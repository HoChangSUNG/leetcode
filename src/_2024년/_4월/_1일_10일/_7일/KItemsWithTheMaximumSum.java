package _2024년._4월._1일_10일._7일;

public class KItemsWithTheMaximumSum {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = Math.min(k, numOnes);
        if (k - numOnes - numZeros > 0) {
            sum -= Math.min(k - numOnes - numZeros, k);
        }
        return sum;
    }
}
