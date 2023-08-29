package _8월._21일_31일._29일;

import java.util.HashMap;
import java.util.Map;

public class XOfAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            map.put(deck[i], map.getOrDefault(deck[i], 0) + 1);
        }

        for (int i = 2; i <= deck.length; i++) {
            if (deck.length % i == 0) {
                boolean isRight = true;
                for (Map.Entry entry : map.entrySet()) {
                    if ((Integer) (entry.getValue()) % i != 0) {
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
