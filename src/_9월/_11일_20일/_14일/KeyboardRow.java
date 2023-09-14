package _9월._11일_20일._14일;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

    public String[] findWords(String[] words) {
        int[] alpha = new int[26];
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length(); j++) {
                alpha[rows[i].charAt(j) - 'a'] = i;
            }
        }

        for (String word : words) {
            boolean flag = true;
            char criteria = Character.toLowerCase(word.charAt(0));
            for (int i = 1; i < word.length(); i++) {
                char cur = Character.toLowerCase(word.charAt(i));
                if (alpha[criteria - 'a'] != alpha[cur - 'a']) {
                    flag = false;
                    break;
                }
            }
            if (flag) result.add(word);
        }

        return result.toArray(new String[0]);

    }
}
