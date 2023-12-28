package _2023년._9월._1일_10일._4일;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        boolean isLast = false;
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (isLast && s.charAt(i) == ' ') return cnt;
            else if (!isLast && s.charAt(i) == ' ') continue;
            isLast = true;
            cnt++;

        }
        return cnt;
    }
}
