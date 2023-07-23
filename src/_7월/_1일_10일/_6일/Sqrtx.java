package _7월._1일_10일._6일;

public class Sqrtx {
    public int mySqrt(int x) {
        if (x < 1) {
            return 0;
        }
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
