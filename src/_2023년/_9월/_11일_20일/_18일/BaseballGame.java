package _2023년._9월._11일_20일._18일;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int sum = stack.pop() + stack.peek();
                stack.push(sum - stack.peek());
                stack.push(sum);
            } else if (operations[i].equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (operations[i].equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(operations[i]));
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
