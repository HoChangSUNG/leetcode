package _2024년._1월._1일_10일._10일;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        Set<Integer> visited = new HashSet<>();
        List<Integer> cur = new ArrayList<>();
        permute(nums, 0, visited, cur);
        return result;
    }

    private void permute(int[] nums, int index, Set<Integer> visited, List<Integer> cur) {
        if (index == nums.length) result.add(new ArrayList<>(cur));

        for (int i = 0; i < nums.length; i++) {
            if (!visited.contains(nums[i])) {
                visited.add(nums[i]);
                cur.add(nums[i]);
                permute(nums, index + 1, visited, cur);
                cur.remove(cur.size() - 1);
                visited.remove(nums[i]);
            }
        }
    }
}
