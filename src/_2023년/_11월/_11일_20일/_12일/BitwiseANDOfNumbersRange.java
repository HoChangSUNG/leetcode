package _2023년._11월._11일_20일._12일;

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
