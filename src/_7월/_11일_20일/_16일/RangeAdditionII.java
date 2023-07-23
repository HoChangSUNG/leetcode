package _7월._11일_20일._16일;

public class RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        for (int i = 0; i < ops.length; i++) {
            int x = ops[i][0];
            int y = ops[i][1];

            if (m > x) m = x;
            if (n > y) n = y;
        }
        return m * n;
    }
}
