package _8월._21일_31일._23일;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isAlphabetic(licensePlate.charAt(i))) {
                int cnt = map.getOrDefault(Character.toLowerCase(licensePlate.charAt(i)), 0);
                map.put(Character.toLowerCase(licensePlate.charAt(i)), cnt + 1);
            }
        }
        int idx = -1;
        for (int i = 0; i < words.length; i++) {
            int[] a = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                a[words[i].charAt(j) - 'a'] += 1;

            }
            boolean isRight = true;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > a[entry.getKey() - 'a']) {
                    isRight = false;
                    break;
                }
            }
            if (isRight) {
                if (idx == -1) idx = i;
                else {
                    if (words[idx].length() > words[i].length()) idx = i;
                }
            }

        }
        return words[idx];
    }
}
