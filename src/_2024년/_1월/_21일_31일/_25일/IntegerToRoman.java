package _2024년._1월._21일_31일._25일;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, String> convert = new HashMap<>();

        convert.put(1, "I");
        convert.put(5, "V");
        convert.put(10, "X");
        convert.put(50, "L");
        convert.put(100, "C");
        convert.put(500, "D");
        convert.put(1000, "M");

        int digit = 1;
        while (num != 0) {
            int remain = num % 10;
            num /= 10;
            createRoman(digit, remain, convert, sb);
            digit *= 10;
        }
        return sb.reverse().toString();
    }

    private void createRoman(int digit, int val, Map<Integer, String> convert, StringBuilder sb) {
        if (val == 9) {
            sb.append(convert.get(digit * 10));
            sb.append(convert.get(digit));
        } else if (val == 4) {
            sb.append(convert.get(digit * 5));
            sb.append(convert.get(digit));
        } else {
            if (val >= 5) {
                for (int i = 0; i < val - 5; i++) {
                    sb.append(convert.get(digit));
                }
                sb.append(convert.get(digit * 5));
            } else {
                for (int i = 0; i < val; i++) {
                    sb.append(convert.get(digit));
                }
            }
        }
    }
}
