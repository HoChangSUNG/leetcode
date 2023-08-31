package _8월._21일_31일._31일;

public class DIStringMatch {

    public int[] diStringMatch(String s) {
        int min = 0;
        int max = s.length();
        int[] res = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') res[i] = min++;
            else res[i] = max--;
        }
        res[res.length - 1] = min;
        return res;
    }
}
