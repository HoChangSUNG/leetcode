package _2023년._8월._11일_20일._17일;

public class RangeAdditionII {

    public int maxCount(int m, int n, int[][] ops) {
        for (int[] op : ops) {
            if (m > op[0]) m = op[0];
            if (n > op[1]) n = op[1];
        }
        return m * n;
    }
}
