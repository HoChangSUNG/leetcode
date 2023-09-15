package _9월._11일_20일._15일;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        int max = candyType.length / 2;
        for (int candy : candyType) {
            set.add(candy);
        }

        return Math.min(set.size(), max);
    }
}
