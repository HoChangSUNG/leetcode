package _8월._1일_10일._1일;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> maps = new HashMap<>();
        maps.put('I', 1);
        maps.put('V', 5);
        maps.put('X', 10);
        maps.put('L', 50);
        maps.put('C', 100);
        maps.put('D', 500);
        maps.put('M', 1000);
        int result = maps.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int cur = maps.get(s.charAt(i));
            int pre = maps.get(s.charAt(i - 1));
            if (cur / 5 == pre || cur / 10 == pre) {
                result -= pre;
                result += (cur - pre);
            } else {
                result += cur;
            }
        }
        return result;
    }
}
