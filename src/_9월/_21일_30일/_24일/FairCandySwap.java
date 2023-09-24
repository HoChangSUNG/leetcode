package _9월._21일_30일._24일;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> alice = new HashSet<>();
        int aliceNum = 0;
        int bobNum = 0;
        for (int aliceSize : aliceSizes) {
            alice.add(aliceSize);
            aliceNum += aliceSize;
        }
        for (int bobSize : bobSizes) bobNum += bobSize;
        for (int bobSize : bobSizes) {
            int changeAlice = (aliceNum - bobNum) / 2 + bobSize;
            if (alice.contains(changeAlice)) return new int[]{changeAlice, bobSize};
        }
        return null;
    }
}
