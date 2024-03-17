package _2024년._3월._11일_20일._17일;

public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') count++;
            else count--;
            if (count == 0) result++;
        }
        return result;
    }
}
