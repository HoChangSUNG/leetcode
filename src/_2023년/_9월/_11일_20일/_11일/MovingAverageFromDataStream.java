package _2023년._9월._11일_20일._11일;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverageFromDataStream {

    private Deque<Integer> queue;
    private int size;
    private double sum = 0;

    public MovingAverageFromDataStream(int size) {
        queue = new ArrayDeque<>();
        this.size = size;
    }

    public double next(int val) {
        if (size == queue.size()) {
            sum -= queue.removeFirst();
        }
        queue.addLast(val);
        sum += val;

        return sum / queue.size();
    }
}
