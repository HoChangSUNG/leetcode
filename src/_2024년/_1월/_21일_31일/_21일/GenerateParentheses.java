package _2024년._1월._21일_31일._21일;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    private List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generateValidParenthesis(0, 0, "", n);
        return result;
    }

    private void generateValidParenthesis(int open, int close, String parenthesis, int n) {
        if (open == n && close == n) {
            result.add(parenthesis);
            return;
        }

        if (open < n) generateValidParenthesis(open + 1, close, parenthesis + '(', n);
        if (close < open) generateValidParenthesis(open, close + 1, parenthesis + ')', n);
    }
}
