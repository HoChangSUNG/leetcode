package _10월._11일_20일._15일;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    public String intToRoman(int num) {
        Map<Integer, Character> romans = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        romans.put(1, 'I');
        romans.put(5, 'V');
        romans.put(10, 'X');
        romans.put(50, 'L');
        romans.put(100, 'C');
        romans.put(500, 'D');
        romans.put(1000, 'M');
        int position = 1;
        while (num != 0) {
            int cur = num % 10;
            num /= 10;
            if (romans.containsKey(cur * position)) {
                sb.append(romans.get(cur * position));
            } else if (cur == 4 || cur == 9) {
                if (cur == 4) {
                    sb.append(romans.get(position * 5));
                    sb.append(romans.get(position));
                }
                if (cur == 9) {
                    sb.append(romans.get(position * 10));
                    sb.append(romans.get(position));
                }
            } else {
                if (cur > 5) {
                    for (int i = 0; i < cur - 5; i++) {
                        sb.append(romans.get(position));
                    }
                    sb.append(romans.get(position * 5));

                } else {
                    for (int i = 0; i < cur; i++) {
                        sb.append(romans.get(position));
                    }
                }
            }
            position *= 10;
        }
        return sb.reverse().toString();
    }
}
