package _7월._21일_31일._30일;

public class VerifyingAnAlienDictionary {

    private int[] alpha = new int[26];

    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < 26; i++) {
            alpha[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            if (compareTo(words[i - 1], words[i]) > 0) return false;
        }
        return true;
    }

    public int compareTo(String a, String b) {
        int n = a.length();
        int m = b.length();
        for (int i = 0; i < n && i < m; i++) {
            int com = alpha[a.charAt(i) - 'a'] - alpha[b.charAt(i) - 'a'];
            if (com != 0) return com;

        }
        return n - m;
    }
}
