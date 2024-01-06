package _2024년._1월._1일_10일._6일;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxContainer = 0;
        while (left < right) {
            maxContainer = Math.max(maxContainer, (right - left) * Math.min(height[left], height[right]));
            if (height[left] > height[right]) right--;
            else left++;
        }
        return maxContainer;
    }
}
