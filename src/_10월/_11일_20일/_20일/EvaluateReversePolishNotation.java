package _10월._11일_20일._20일;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            Node cur = new Node(tokens[i]);
            if (cur.isOperator()) {
                int right = stack.pop().getOperand();
                int left = stack.pop().getOperand();

                stack.push(new Node(calculate(left, right, cur.getOperator())));
            } else {
                stack.push(cur);
            }
        }
        return stack.pop().getOperand();
    }

    private int calculate(int value1, int value2, String op) {
        switch (op) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            default:
                return value1 / value2;
        }
    }

    static class Node {
        private String value;

        Node(String value) {
            this.value = value;
        }

        Node(int value) {
            this.value = String.valueOf(value);
        }

        public boolean isOperator() {
            return value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/");
        }

        public int getOperand() {
            if (!isOperator()) {
                return Integer.parseInt(value);
            }
            throw new RuntimeException("not operand");
        }

        public String getOperator() {
            if (isOperator()) {
                return value;
            }
            throw new RuntimeException("not operator");
        }
    }
}
