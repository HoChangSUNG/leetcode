package _11월._21일_30일._30일;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int n = s.length();
        int[] answer = new int[]{0, 0};
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                answer[0] = i;
                answer[1] = i + 1;
            }

        }
        for (int diff = 2; diff < n; diff++) {
            for (int i = 0; i + diff < n; i++) {
                int j = i + diff;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return s.substring(answer[0], answer[1] + 1);
    }
}
