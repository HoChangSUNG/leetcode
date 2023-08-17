package _8월._11일_20일._17일;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        int max = candyType.length / 2;
        int eat = 0;
        for (int i = 0; i < candyType.length; i++) {
            if (!set.contains(candyType[i])) {
                if (eat == max) return max;
                eat++;
                set.add(candyType[i]);
            }
        }
        return eat;
    }
}
