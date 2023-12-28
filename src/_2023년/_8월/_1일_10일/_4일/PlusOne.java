package _2023년._8월._1일_10일._4일;

import java.util.ArrayList;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int carry = 1;
        ArrayList<Integer> arr = new ArrayList();
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry + digits[i] == 10) {
                arr.add(0);
            } else {
                arr.add(digits[i] + carry);
                carry = 0;
            }
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr.get(arr.size() - 1 - i);
        }
        return result;
    }
}
