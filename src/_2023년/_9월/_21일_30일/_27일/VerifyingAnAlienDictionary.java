package _2023년._9월._21일_30일._27일;

public class VerifyingAnAlienDictionary {

    private int[] alien = new int[26];

    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++) {
            alien[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (compareTo(words[i], words[i + 1]) > 0) return false;
        }
        return true;
    }

    private int compareTo(String word1, String word2) {
        int n = Math.min(word1.length(), word2.length());
        for (int i = 0; i < n; i++) {
            int diff = alien[word1.charAt(i) - 'a'] - alien[word2.charAt(i) - 'a'];
            if (diff != 0) return diff;
        }
        if (word1.length() == word2.length()) return 0;
        return word1.length() < word2.length() ? -1 : 1;
    }
}
