package _2023년._9월._11일_20일._20일;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> plate = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isAlphabetic(licensePlate.charAt(i))) {
                char cur = Character.toLowerCase(licensePlate.charAt(i));
                plate.put(cur, plate.getOrDefault(cur, 0) + 1);
            }
        }
        String result = null;
        for (int i = 0; i < words.length; i++) {
            int[] alpha = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                alpha[words[i].charAt(j) - 'a'] += 1;
            }
            boolean isRight = true;
            for (Map.Entry<Character, Integer> entry : plate.entrySet()) {
                if (alpha[entry.getKey() - 'a'] < entry.getValue()) {
                    isRight = false;
                    break;
                }
            }
            if (isRight) {
                if (result == null || result.length() > words[i].length()) result = words[i];
            }
        }
        return result;
    }
}
