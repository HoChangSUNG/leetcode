package _2023년._7월._21일_31일._24일;

public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        result[0] = 1;
        int idx = 0;
        while (idx < s.length()) {
            int pixel = widths[s.charAt(idx) - 'a'];
            if (result[1] + pixel <= 100) result[1] += pixel;
            else {
                result[0] += 1;
                result[1] = pixel;
            }
            idx++;
        }
        return result;
    }
}
