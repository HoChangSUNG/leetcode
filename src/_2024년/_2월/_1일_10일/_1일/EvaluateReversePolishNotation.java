package _2024년._2월._1일_10일._1일;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isOperator(tokens[i])) {
                calculate(tokens[i], numbers);
            } else {
                numbers.push(Integer.valueOf(tokens[i]));
            }
        }
        return numbers.peek();
    }

    private boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")) return true;
        return false;
    }

    private void calculate(String op, Stack<Integer> stack) {
        Integer second = stack.pop();
        Integer first = stack.pop();

        if (op.equals("+")) {
            stack.push(first + second);
        } else if (op.equals("-")) {
            stack.push(first - second);
        } else if (op.equals("/")) {
            stack.push(first / second);
        } else {
            stack.push(first * second);
        }
    }
}
