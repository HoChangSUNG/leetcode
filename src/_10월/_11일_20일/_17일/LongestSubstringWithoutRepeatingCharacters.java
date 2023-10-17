package _10월._11일_20일._17일;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> repeat = new HashMap<>();
        int count = 0;
        int start = -1;
        for (int i = 0; i < s.length(); i++) {
            if (repeat.containsKey(s.charAt(i))) {
                start = Math.max(start, repeat.get(s.charAt(i)));
            }

            repeat.put(s.charAt(i), i);
            count = Math.max(count, i - start);
        }

        return count;
    }
}
