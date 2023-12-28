package _2023년._12월._11일_20일._11일;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Map<String, BiFunction<Integer, Integer, Integer>> operate = new HashMap<>();
        operateInit(operate);

        for (int i = 0; i < tokens.length; i++) {
            String cur = tokens[i];
            if (cur.equals("+") || cur.equals("-") || cur.equals("/") || cur.equals("*")) {
                Integer post = stack.pop();
                Integer pre = stack.pop();
                stack.push(operate.get(cur).apply(pre, post));
            } else {
                stack.push(Integer.valueOf(cur));
            }
        }
        return stack.pop();
    }

    private void operateInit(Map<String, BiFunction<Integer, Integer, Integer>> operate) {
        operate.put("+", (num1, num2) -> num1 + num2);
        operate.put("-", (num1, num2) -> num1 - num2);
        operate.put("*", (num1, num2) -> num1 * num2);
        operate.put("/", (num1, num2) -> num1 / num2);
    }
}
