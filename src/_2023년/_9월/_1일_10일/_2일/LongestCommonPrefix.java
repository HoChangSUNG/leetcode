package _2023년._9월._1일_10일._2일;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1 || strs[0].length() == 0) return strs[0];

        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= j || strs[i].charAt(j) != strs[0].charAt(j)) return strs[0].substring(0, j);
            }
        }
        return strs[0];
    }
}
