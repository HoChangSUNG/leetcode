package _8월._11일_20일._16일;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {

    public String[] findWords(String[] words) {
        Map<Character, Integer> keyMap = new HashMap<>();
        List<String> temp = new ArrayList<>();
        putKeyboard("qwertyuiop", 1, keyMap);
        putKeyboard("asdfghjkl", 2, keyMap);
        putKeyboard("zxcvbnm", 3, keyMap);

        for (String word : words) {
            boolean isTrue = true;
            String convert = word.toLowerCase();
            for (int i = 1; i < convert.length(); i++) {
                if (keyMap.get(convert.charAt(0)) != keyMap.get(convert.charAt(i))) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                temp.add(word);
            }
        }
        return temp.toArray(new String[0]);
    }

    private void putKeyboard(String keyboard, int level, Map keyMap) {
        for (int i = 0; i < keyboard.length(); i++) {
            keyMap.put(keyboard.charAt(i), level);
        }
    }

}
