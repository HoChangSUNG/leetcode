package _8월._1일_10일._8일;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> first = new ArrayList();
        first.add(1);
        arr.add(first);
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j <= i - 1; j++) {
                int cur = arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j);
                temp.add(cur);
            }
            temp.add(1);
            arr.add(temp);
        }

        return arr;
    }
}
