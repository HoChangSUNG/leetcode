package _2023년._7월._21일_31일._30일;

public class DIStringMatch {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int left = 0;
        int right = n;
        int[] result = new int[n + 1];

        for (int i = 0; i < n; i++) {
            result[i] = s.charAt(i) == 'I' ? left++ : right--;
        }
        result[n] = right;
        return result;
    }
}
