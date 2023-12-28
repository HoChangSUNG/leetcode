package _2023년._9월._21일_30일._23일;

public class ShortestDistanceToACharacter {

    public int[] shortestToChar(String s, char c) {
        int j = s.length() - 1;
        int[] distance = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) j = i;
            distance[i] = Math.abs(i - j);
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) j = i;
            distance[i] = Math.min(Math.abs(i - j), distance[i]);
        }
        return distance;
    }
}
