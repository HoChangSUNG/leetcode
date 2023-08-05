package _8월._1일_10일._5일;

public class Sqrtx {

    public int mySqrt(int x) {
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start - start / 2 + end / 2;
            if (mid == (x / mid)) return mid;
            else if (mid > (x / mid)) end = mid - 1;
            else start = mid + 1;
        }
        return end;
    }
}
