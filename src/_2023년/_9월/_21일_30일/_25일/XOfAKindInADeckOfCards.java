package _2023년._9월._21일_30일._25일;

import java.util.HashMap;
import java.util.Map;

public class XOfAKindInADeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {
        int n = deck.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : deck) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        for (int i = 2; i <= n; i++) {
            boolean isRight = true;
            if (n % i == 0) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() % i != 0) {
                        isRight = false;
                        break;
                    }
                }
                if (isRight) return true;
            }
        }
        return false;
    }
}
