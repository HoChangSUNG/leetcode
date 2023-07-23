package _7월._1일_10일._8일;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    List<Integer> before = result.get(i - 1);
                    temp.add(before.get(j - 1) + before.get(j));
                }
            }
            result.add(temp);
        }
        return result.get(rowIndex);
    }
}
