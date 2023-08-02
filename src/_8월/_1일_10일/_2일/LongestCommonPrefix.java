package _8월._1일_10일._2일;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length()) min = strs[i].length();
        }
        for (int j = 0; j < min; j++) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != strs[0].charAt(j)) return answer;
            }
            answer += strs[0].charAt(j);
        }
        return answer;
    }
}
