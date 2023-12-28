package _2023년._8월._21일_31일._31일;

public class DeleteColumnsToMakeSorted {

    public int minDeletionSize(String[] strs) {
        int cnt = 0;
        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i - 1].charAt(j) > strs[i].charAt(j)) {
                    cnt += 1;
                    break;
                }
            }
        }
        return cnt;
    }
}
