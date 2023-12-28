package _2023년._9월._21일_30일._22일;

public class NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String s) {
        int line = 1;
        int pixel = 0;
        for (int i = 0; i < s.length(); i++) {
            int p = widths[s.charAt(i) - 'a'];
            if (pixel + p > 100) {
                pixel = p;
                line++;
            } else {
                pixel += p;
            }
        }
        return new int[]{line, pixel};
    }
}
