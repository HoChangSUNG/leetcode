package _2024년._6월;

import java.util.ArrayList;
import java.util.List;

public class BuildingsWithAnOceanView {
    public int[] findBuildings(int[] heights) {
        int n = heights.length;
        int[] obstacle = new int[n + 1];
        for (int i = n - 1; i > 0; i--) {
            obstacle[i] = Math.max(heights[i], obstacle[i + 1]);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (heights[i] > obstacle[i + 1]) {
                result.add(i);
            }
        }
        return result.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
