package _2024년._3월._11일_20일._18일;

import java.util.ArrayList;
import java.util.List;

public class Maximum69Number {
    public int maximum69Number(int num) {
        boolean isChangable = false;
        List<Integer> numbers = new ArrayList<>();
        while (num != 0) {
            if (num % 10 == 6) isChangable = true;
            numbers.add(num % 10);
            num /= 10;
        }
        int result = 0;
        for (int i = numbers.size() - 1; i >= 0; i--) {
            result *= 10;
            if (isChangable && numbers.get(i) == 6) {
                result += 9;
                isChangable = false;
            } else {
                result += numbers.get(i);
            }
        }
        return result;
    }
}
