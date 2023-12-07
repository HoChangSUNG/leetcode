package _12월._1일_10일._7일;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();
        roman(map);
        StringBuilder sb = new StringBuilder();

        int digit = 1;
        while (num > 0) {
            int cur = num % 10;
            if (cur == 4) sb.insert(0, map.get(1 * digit) + map.get(5 * digit));
            else if (cur == 9) sb.insert(0, map.get(1 * digit) + map.get(10 * digit));
            else {
                String temp = "";
                while (cur != 0) {
                    if (cur >= 5) {
                        cur -= 5;
                        temp += map.get(5 * digit);
                    } else {
                        cur -= 1;
                        temp += map.get(1 * digit);
                    }
                }
                sb.insert(0, temp);
            }
            num /= 10;
            digit *= 10;
        }
        return sb.toString();
    }

    private void roman(Map<Integer, String> map) {
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
    }
}
