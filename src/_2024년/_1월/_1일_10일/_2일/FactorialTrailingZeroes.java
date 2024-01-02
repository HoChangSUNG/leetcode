package _2024년._1월._1일_10일._2일;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int result = 0;
        for (int i = 5; i <= n; i += 5) {
            int cur = i;
            while (cur % 5 == 0) {
                result++;
                cur /= 5;
            }
        }
        return result;
    }
}
