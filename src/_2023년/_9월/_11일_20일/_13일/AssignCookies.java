package _2023년._9월._11일_20일._13일;

import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < g.length && idx2 < s.length) {
            if (g[idx1] <= s[idx2]) {
                idx1++;
                idx2++;
            } else {
                idx2++;
            }
        }
        return idx1;
    }
}
