package _2023년._12월._1일_10일._10일;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    private Deque<Integer> queue;
    private Deque<Integer> elements;

    public MinStack() {
        queue = new LinkedList<>();
        elements = new LinkedList<>();
    }

    public void push(int val) {
        int minVal = val;
        if (!queue.isEmpty()) {
            minVal = Math.min(minVal, queue.peekLast());
        }
        queue.addLast(minVal);
        elements.addLast(val);

    }

    public void pop() {
        queue.removeLast();
        elements.removeLast();
    }

    public int top() {
        return elements.peekLast();
    }

    public int getMin() {
        return queue.peekLast();
    }
}
