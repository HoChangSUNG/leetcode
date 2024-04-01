package _2024년._4월._1일_10일._1일;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int zero = 0;
        int one = 0;
        for (Character c : s.toCharArray()) {
            if (c == '0') zero++;
            else one++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('1');
        one--;
        for (int i = 0; i < zero; i++) {
            sb.append('0');
        }
        for (int i = 0; i < one; i++) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
