package _8월._1일_10일._1일;

import java.util.HashMap;
import java.util.Map;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int size = 0;
        int temp = Math.abs(x);
        while (temp > 0) {
            temp /= 10;
            size++;
        }
        while (x != 0) {
            int left = x / (int) Math.pow(10, size - 1);
            int right = x % 10;
            if (left != right) return false;
            x = (x % (int) Math.pow(10, size - 1)) / 10;
            size -= 2;
        }
        return true;
    }
}
