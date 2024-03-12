package _2024년._3월._11일_20일._12일;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int result = 0;
        boolean isOddExist = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                isOddExist = true;
            }
            result += (entry.getValue() / 2);
        }
        return isOddExist ? result * 2 + 1 : result * 2;
    }
}
