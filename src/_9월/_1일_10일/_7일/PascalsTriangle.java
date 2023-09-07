package _9월._1일_10일._7일;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        for (int i = 1; i < numRows; i++) {
            temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}
