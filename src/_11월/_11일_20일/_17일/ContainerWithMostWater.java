package _11월._11일_20일._17일;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        int cur = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                cur = height[left] * (right - left);
                left++;
            } else {
                cur = height[right] * (right - left);
                right--;
            }
            result = Math.max(result, cur);
        }
        return result;
    }
}
