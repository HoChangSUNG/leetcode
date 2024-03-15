package _2024년._3월._11일_20일._15일;

public class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + arr[i];
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if ((sum[i + 1] - sum[0]) == (sum[j + 1] - sum[i + 1]) && (sum[j + 1] - sum[i + 1]) == (sum[n] - sum[j + 1]))
                    return true;
            }
        }
        return false;
    }
}
