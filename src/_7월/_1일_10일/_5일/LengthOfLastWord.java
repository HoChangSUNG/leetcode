package _7월._1일_10일._5일;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int left = -1;
        int right = -1;
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) != ' ') {
                if (right == -1) {
                    right = i;
                }
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    left = i;
                }
                if (left != -1) {
                    return right - left + 1;
                }
            }
        }

        return 1;
    }
}
