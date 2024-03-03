package _2024년._3월._1일_10일._3일;

public class BitwiseANDOfNumbersRange {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }
}
