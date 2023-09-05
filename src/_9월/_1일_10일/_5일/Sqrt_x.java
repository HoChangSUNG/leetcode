package _9월._1일_10일._5일;

public class Sqrt_x {

    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid == x / mid) return mid;
            else if (mid < x / mid) left = mid + 1;
            else right = mid - 1;
        }
        return right;
    }
}
