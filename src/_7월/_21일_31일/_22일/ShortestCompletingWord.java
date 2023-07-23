package _7월._21일_31일._22일;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] al = new int[26];
        int count = 0;
        for (int i = 0; i < licensePlate.length(); i++) {
            char c = Character.toLowerCase(licensePlate.charAt(i));
            if (c >= 'a' && c <= 'z') {
                al[c - 'a'] += 1;
                count++;
            }
        }

        int min = -1;
        for (int i = 0; i < words.length; i++) {
            int cur = 0;
            int[] al2 = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                int index = words[i].charAt(j) - 'a';
                if (al[index] != 0) {
                    if (al[index] == al2[index]) continue;
                    al2[index] += 1;
                    cur++;

                }
                if (cur == count) {
                    if (min == -1) {
                        min = i;
                    }
                    if (words[min].length() > words[i].length()) min = i;
                    break;
                }
            }
        }
        return words[min];

    }
}
