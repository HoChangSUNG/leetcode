package _8월._21일_31일._26일;

public class NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String s) {
        int mod = 0;
        int q = 0;

        for (int i = 0; i < s.length(); i++) {
            q += widths[s.charAt(i) - 'a'];
            if (q > 100) {
                mod += 1;
                q = widths[s.charAt(i) - 'a'];
            }

        }
        return new int[]{mod + 1, q};
    }


}
