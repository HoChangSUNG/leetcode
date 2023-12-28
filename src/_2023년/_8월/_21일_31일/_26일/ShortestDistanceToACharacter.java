package _2023년._8월._21일_31일._26일;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int pos = s.length();
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) pos = i;
            res[i] = Math.abs(i - pos);
        }
        pos = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) pos = i;
            res[i] = Math.min(Math.abs(pos - i), res[i]);
        }
        return res;
    }
}
