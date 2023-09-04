package _9월._1일_10일._4일;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) digits[i] = 0;
            else {
                digits[i] += 1;
                return digits;
            }
        }

        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
