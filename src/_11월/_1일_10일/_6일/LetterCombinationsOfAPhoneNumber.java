package _11월._1일_10일._6일;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

    Map<Integer, String> map = new HashMap<>();
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return result;
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        combination(digits, 0, new char[digits.length()]);
        return result;
    }

    private void combination(String digits, int index, char[] backtrack) {
        if (index == digits.length()) {
            result.add(String.valueOf(backtrack));
            return;
        }
        String letter = map.get((digits.charAt(index) - '0'));
        for (int i = 0; i < letter.length(); i++) {
            backtrack[index] = letter.charAt(i);
            combination(digits, index + 1, backtrack);
        }
    }
}
