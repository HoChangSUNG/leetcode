package _2023년._8월._21일_31일._28일;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> set = new HashSet<>();
        int sa = 0;
        int sb = 0;
        for (int a : aliceSizes) sa += a;
        for (int b : bobSizes) sb += b;
        int diff = (sa + sb) / 2;

        for (int b : bobSizes) set.add(b);

        for (int a : aliceSizes) {
            if (set.contains(a + diff - sa)) return new int[]{a, a + diff - sa};
        }
        return null;
    }
}
