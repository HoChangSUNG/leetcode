package _2024년._1월._21일_31일._27일;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> subString = new HashMap<>();
        int maxLongest = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (subString.containsKey(s.charAt(i))) {
                start = Math.max(subString.get(s.charAt(i)) + 1, start);
            }
            subString.put(s.charAt(i), i);
            maxLongest = Math.max(maxLongest, i - start + 1);
        }
        return maxLongest;
    }
}
