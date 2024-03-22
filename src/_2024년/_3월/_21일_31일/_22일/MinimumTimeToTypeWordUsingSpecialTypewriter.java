package _2024년._3월._21일_31일._22일;

public class MinimumTimeToTypeWordUsingSpecialTypewriter {
    public int minTimeToType(String word) {
        int result = getDistance(word.charAt(0), 'a') + 1;
        for (int i = 1; i < word.length(); i++) {
            result += getDistance(word.charAt(i), word.charAt(i - 1));
            result += 1;
        }
        return result;

    }

    private int getDistance(Character a, Character b) {
        int dis = Math.abs(a - b);
        dis = Math.min(dis, 'z' - Math.max(a, b) + Math.min(a, b) - 'a' + 1);
        return dis;
    }
}
