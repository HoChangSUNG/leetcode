package _2024년._1월._21일_31일._31일;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    private Deque<Integer> min;
    private Deque<Integer> stack;

    public MinStack() {
        min = new LinkedList<>();
        stack = new LinkedList<>();
    }

    public void push(int val) {
        stack.addLast(val);
        if (!min.isEmpty()) {
            val = Math.min(min.getLast(), val);
        }
        min.addLast(val);
    }

    public void pop() {
        stack.removeLast();
        min.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return min.getLast();
    }
}
