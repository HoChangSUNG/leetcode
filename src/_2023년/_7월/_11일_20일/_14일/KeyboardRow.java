package _2023년._7월._11일_20일._14일;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] alphabets = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets[i].length(); j++) {
                map.put(alphabets[i].charAt(j), i);
                map.put(alphabets[i].charAt(j), i);
            }
        }


        for (int i = 0; i < words.length; i++) {
            int row = map.get(Character.toLowerCase(words[i].charAt(0)));
            for (int j = 1; j < words[i].length(); j++) {
                if (row != map.get(Character.toLowerCase(words[i].charAt(j)))) {
                    row = -1;
                    break;
                }
            }
            if (row != -1) result.add(words[i]);
        }
        return result.toArray(new String[0]);
    }
}
