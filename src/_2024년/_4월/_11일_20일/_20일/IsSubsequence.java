package _2024년._4월._11일_20일._20일;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int curIndex = 0;
        for (int i = 0; i < t.length() && curIndex < s.length(); i++) {
            if (t.charAt(i) == s.charAt(curIndex)) {
                curIndex++;
            }
        }
        return curIndex == s.length();
    }
}
