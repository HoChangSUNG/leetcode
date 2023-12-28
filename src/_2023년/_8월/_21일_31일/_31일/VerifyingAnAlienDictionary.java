package _2023년._8월._21일_31일._31일;

import java.util.HashMap;
import java.util.Map;

public class VerifyingAnAlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (compareTo(words[i], words[i + 1], map) > 0) {
                return false;
            }
        }
        return true;
    }

    public int compareTo(String a, String b, Map<Character, Integer> prior) {
        int i = 0;
        while (i < a.length() & i < b.length()) {
            int aPrior = prior.get(a.charAt(i));
            int bPrior = prior.get(b.charAt(i));
            if (aPrior - bPrior == 0) i++;
            else return aPrior - bPrior;
        }
        return a.length() - b.length();
    }
}
