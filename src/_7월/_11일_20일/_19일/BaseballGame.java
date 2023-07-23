package _7월._11일_20일._19일;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                int mul = 2 * stack.peek();
                stack.add(mul);
            } else if (operations[i].equals("+")) {
                int first = stack.pop();
                int add = first + stack.peek();
                stack.add(first);
                stack.add(add);
            } else {
                stack.push(Integer.valueOf(operations[i]));
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
