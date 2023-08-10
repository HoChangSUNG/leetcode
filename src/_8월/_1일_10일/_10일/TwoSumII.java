package _8월._1일_10일._10일;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumII {

    List<Integer> arr;
    Set<Integer> values;

    public TwoSumII() {
        arr = new ArrayList<>();
        values = new HashSet<>();
    }

    public void add(int number) {
        if (arr.size() != 0) {
            for (int i = 0; i < arr.size(); i++) {
                values.add(arr.get(i) + number);
            }
        }
        arr.add(number);
    }

    public boolean find(int value) {
        return values.contains(value);
    }
}
