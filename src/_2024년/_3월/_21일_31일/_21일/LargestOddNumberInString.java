package _2024년._3월._21일_31일._21일;

public class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            if (Integer.valueOf(num.charAt(i)) % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
