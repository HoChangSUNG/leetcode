package _2023년._7월._21일_31일._27일;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int diff = (Arrays.stream(aliceSizes).sum() - Arrays.stream(bobSizes).sum()) / 2;
        Set<Integer> s = new HashSet<>();
        for (int a : aliceSizes) {
            s.add(a);
        }
        for (int b : bobSizes) {
            if (s.contains(b + diff)) return new int[]{b + diff, b};
        }
        return new int[2];
    }
}
