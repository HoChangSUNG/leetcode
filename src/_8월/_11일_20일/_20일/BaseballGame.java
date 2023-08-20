package _8월._11일_20일._20일;

import java.util.Stack;

public class BaseballGame {

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String cur = operations[i];
            if (cur.equals("+")) {
                int operand = stack.pop();
                int temp = operand + stack.peek();

                stack.push(operand);
                stack.push(temp);
            } else if (cur.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (cur.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(cur));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
