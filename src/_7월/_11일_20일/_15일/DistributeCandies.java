package _7월._11일_20일._15일;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        boolean[] type = new boolean[200001];
        int count = 0;
        int max = candyType.length / 2;
        for (int candy : candyType) {
            int t = candy + 100000;
            if (!type[t]) {
                type[t] = true;
                if (++count == max) return max;
            }
        }
        return count;
    }
}
