package _8월._11일_20일._13일;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        long[] arr = new long[]{Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (arr[0] == nums[i] || arr[1] == nums[i] || arr[2] == nums[i]) continue;
            if (arr[0] < nums[i]) {
                arr[2] = arr[1];
                arr[1] = arr[0];
                arr[0] = nums[i];
                count++;
            } else if (arr[1] < nums[i]) {
                arr[2] = arr[1];
                arr[1] = nums[i];
                count++;
            } else if (arr[2] < nums[i]) {
                arr[2] = nums[i];
                count++;
            }
        }

        return count >= 3 ? (int) arr[2] : (int) arr[0];
    }
}
