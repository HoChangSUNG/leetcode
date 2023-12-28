package _2023년._11월._21일_30일._29일;

public class SortColors {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int cur = 0;
        int p2 = nums.length - 1;

        int tmp;
        while (cur <= p2) {
            if (nums[cur] == 0) {
                tmp = nums[cur];
                nums[cur] = nums[p0];
                nums[p0] = tmp;
                p0++;
                cur++;
            } else if (nums[cur] == 2) {
                tmp = nums[cur];
                nums[cur] = nums[p2];
                nums[p2] = tmp;
                p2--;
            } else cur++;
        }
    }
}
