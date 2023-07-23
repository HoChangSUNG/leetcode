package _7월._11일_20일._11일;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream {
    Queue<Integer> q;
    double sum = 0;
    int size;

    public MovingAverageFromDataStream(int size) {
        q = new LinkedList<>();
        this.size = size;

    }

    public double next(int val) {
        if (q.size() == size) {
            sum -= q.poll();
        }
        q.offer(val);
        sum += val;
        return sum / q.size();
    }
}
