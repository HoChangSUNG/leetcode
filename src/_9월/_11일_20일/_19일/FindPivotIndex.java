package _9월._11일_20일._19일;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] weigth = new int[n + 1];
        for (int i = 0; i < n; i++) {
            weigth[i + 1] = weigth[i] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (weigth[i] == weigth[n] - weigth[i + 1]) return i;
        }
        return -1;
    }
}
