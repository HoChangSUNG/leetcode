package _2024년._1월._11일_20일._19일;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] palindrome = new boolean[n][n];
        String result = s.substring(0, 1);

        for (int i = 0; i < n; i++) {
            palindrome[i][i] = true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                palindrome[i][i + 1] = true;
                result = s.substring(i, i + 2);
            }
        }
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + i > n) continue;
                if (palindrome[j + 1][i + j - 2]) {
                    if (s.charAt(j) == s.charAt(i + j - 1)) {
                        palindrome[j][i + j - 1] = true;
                        if (result.length() < i) result = s.substring(j, i + j);
                    }
                }
            }
        }
        return result;
    }
}
