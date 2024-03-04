package _2024년._3월._1일_10일._4일;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int five = 0;
        int two = 0;
        for (int i = 1; i <= n; i++) {
            int cur = i;
            while (cur % 5 == 0) {
                five++;
                cur /= 5;
            }
            while (cur % 2 == 0) {
                two++;
                cur /= 2;
            }
        }
        return Math.min(five, two);
    }
}
