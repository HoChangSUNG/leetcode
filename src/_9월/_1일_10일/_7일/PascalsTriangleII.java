package _9월._1일_10일._7일;

import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        Integer[] result = new Integer[rowIndex + 1];
        result[0] = 1;
        for (int i = 1; i < rowIndex + 1; i++) {
            result[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                result[j] = result[j - 1] + result[j];
            }
        }

        return Arrays.asList(result);
    }
}
