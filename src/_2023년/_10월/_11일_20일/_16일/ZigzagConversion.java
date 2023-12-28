package _2023년._10월._11일_20일._16일;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        List<Character>[] zigzag = new ArrayList[numRows];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            zigzag[i] = new ArrayList<>();
        }
        int index = 0;
        boolean upper = false;
        for (int i = 0; i < s.length(); i++) {
            zigzag[index].add(s.charAt(i));
            if (index == 0 && !upper) upper = true;
            else if (index == numRows - 1 && upper) upper = false;

            if (upper) index++;
            else index--;
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < zigzag[i].size(); j++) {
                sb.append(zigzag[i].get(j));
            }
        }
        return sb.toString();
    }
}
