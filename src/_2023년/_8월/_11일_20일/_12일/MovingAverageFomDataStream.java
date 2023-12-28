package _2023년._8월._11일_20일._12일;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverageFomDataStream {

    private int size;
    private Deque<Integer> dequeue;
    private Long sum;

    public MovingAverageFomDataStream(int size) {
        this.size = size;
        dequeue = new ArrayDeque<>();
        sum = 0l;
    }

    public double next(int val) {
        sum += val;
        dequeue.addLast(val);
        if (dequeue.size() > size) {
            sum -= dequeue.pollFirst();
        }
        return sum / (double) dequeue.size();
    }
}
