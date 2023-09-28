package _9월._21일_30일._28일;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            result = Math.max(result, width * Math.min(height[left], height[right]));
            if (height[left] <= height[right]) left++;
            else right--;
        }
        return result;
    }
}
