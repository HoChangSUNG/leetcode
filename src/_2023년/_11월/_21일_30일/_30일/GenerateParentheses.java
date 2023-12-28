package _2023년._11월._21일_30일._30일;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        findParenthesisCount(0, 0, n, "", result);
        return result;
    }

    private void findParenthesisCount(int open, int close, int n, String parentheses, List<String> result) {
        if (open == close && open == n) {
            result.add(parentheses);
            return;
        }
        if (open == n) {
            findParenthesisCount(open, close + 1, n, parentheses + ')', result);
        } else {
            if (open != close) findParenthesisCount(open, close + 1, n, parentheses + ')', result);
            findParenthesisCount(open + 1, close, n, parentheses + '(', result);
        }
    }
}
