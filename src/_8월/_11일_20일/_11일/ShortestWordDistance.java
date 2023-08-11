package _8월._11일_20일._11일;

public class ShortestWordDistance {

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) index1 = i;
            if (wordsDict[i].equals(word2)) index2 = i;
            if (index2 != -1 && index1 != -1) {
                int diff = Math.abs(index1 - index2);
                min = Math.min(diff, min);
            }
        }
        return min;
    }
}
