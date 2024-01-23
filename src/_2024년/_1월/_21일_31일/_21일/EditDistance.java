package _2024년._1월._21일_31일._21일;

public class EditDistance {
    Integer[][] memo;

    public int minDistance(String word1, String word2) {
        memo = new Integer[word1.length() + 1][word2.length() + 1];
        return distanceRecur(word1, word2, word1.length(), word2.length());
    }

    private int distanceRecur(String word1, String word2, int word1Index, int word2Index) {
        if (word1Index == 0) return word2Index;
        if (word2Index == 0) return word1Index;

        if (memo[word1Index][word2Index] != null) {
            return memo[word1Index][word2Index];
        }

        int minDistance = 0;

        if (word1.charAt(word1Index - 1) == word2.charAt(word2Index - 1)) {
            minDistance = distanceRecur(word1, word2, word1Index - 1, word2Index - 1);
        } else {
            int insert = distanceRecur(word1, word2, word1Index, word2Index - 1);
            int delete = distanceRecur(word1, word2, word1Index - 1, word2Index);
            int replace = distanceRecur(word1, word2, word1Index - 1, word2Index - 1);
            minDistance = Math.min(insert, Math.min(delete, replace)) + 1;
        }
        memo[word1Index][word2Index] = minDistance;
        return minDistance;
    }
}
