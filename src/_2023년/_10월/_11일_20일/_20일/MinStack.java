package _2023년._10월._11일_20일._20일;

import java.util.Stack;

public class MinStack {

    Stack<Node> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.add(new Node(val, val));
        } else {
            int min = Math.min(stack.peek().min, val);
            stack.add(new Node(val, min));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }

    static class Node {
        private int val;
        private int min;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
}
