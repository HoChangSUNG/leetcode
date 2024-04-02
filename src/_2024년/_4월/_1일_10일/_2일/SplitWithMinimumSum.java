package _2024년._4월._1일_10일._2일;

import java.util.Arrays;

public class SplitWithMinimumSum {
    public int splitNum(int num) {
        String str = num + "";
        char[] str1 = str.toCharArray();
        Arrays.sort(str1);
        String x1 = "";
        String x2 = "";
        for (int i = 0; i < str1.length; i++) {
            if (i % 2 == 0) x1 += str1[i];
            else x2 += str1[i];
        }
        return Integer.parseInt(x1) + Integer.parseInt(x2);
    }
}
