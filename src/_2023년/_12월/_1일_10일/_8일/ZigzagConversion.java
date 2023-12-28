package _2023년._12월._1일_10일._8일;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        StringBuilder[] zigzag = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            zigzag[i] = new StringBuilder();
        }
        int count = 0;
        while (count < s.length()) {
            for (int i = 0; i < numRows; i++) {
                if (count == s.length()) break;
                zigzag[i].append(s.charAt(count));
                count++;
            }
            for (int i = numRows - 2; i > 0; i--) {
                if (count == s.length()) break;
                zigzag[i].append(s.charAt(count));
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            sb.append(zigzag[i].toString());
        }
        return sb.toString();
    }
}
