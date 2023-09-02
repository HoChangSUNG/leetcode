package _9월._1일_10일._2일;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if ((c == 'I' || c == 'X' || c == 'C') && i < s.length() - 1) {
                Character next = s.charAt(i + 1);
                if (map.get(c) * 5 == map.get(next) || map.get(c) * 10 == map.get(next)) {
                    res = res - map.get(c);
                    continue;
                }
            }
            res += map.get(c);
        }
        return res;
    }
}
