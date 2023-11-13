package _11월._11일_20일._13일;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int zeroCount = 0;
        for (int i = 5; i <= n; i += 5) {
            int cur = i;
            while (cur % 5 == 0) {
                zeroCount++;
                cur /= 5;
            }
        }
        return zeroCount;
    }
}
