package _2023년._7월._21일_31일._28일;

import java.util.HashMap;
import java.util.Map;

public class XOfAKindInADeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {
        int n = deck.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(deck[i], map.getOrDefault(deck[i], 0) + 1);
        }

        search:
        for (int x = 2; x <= n; x++) {
            if (n % x == 0) {
                for (int v : map.values()) {
                    if (v % x != 0) continue search;
                }
                return true;
            }
        }
        return false;

    }
}
