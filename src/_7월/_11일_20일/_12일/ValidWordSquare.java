package _7월._11일_20일._12일;

import java.util.List;

public class ValidWordSquare {
    public boolean validWordSquare(List<String> words) {
        int k = words.size();
        int maxCol = 0;
        for (String a : words) {
            if (maxCol < a.length()) {
                maxCol = a.length();
            }
        }
        if (k != maxCol) return false;


        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                char a = ' ';
                char b = ' ';
                if (j < words.get(i).length()) { // 왼쪽으로
                    a = words.get(i).charAt(j);
                }
                if (i < words.get(j).length()) { // 아래로
                    b = words.get(j).charAt(i);
                }
                if (a != b) return false;
            }
        }
        return true;
    }
}
