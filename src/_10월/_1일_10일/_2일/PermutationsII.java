package _10월._1일_10일._2일;

import java.util.*;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        Integer[] permute = new Integer[nums.length];

        permutation(nums, 0, visited, result, permute);
        return new ArrayList<List<Integer>>(result);
    }

    private void permutation(int[] nums, int index, boolean[] visited, Set<List<Integer>> result, Integer[] permute) {
        if (nums.length == index) {
            result.add(new ArrayList<>(Arrays.asList(permute)));
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                permute[index] = nums[i];
                permutation(nums, index + 1, visited, result, permute);
                visited[i] = false;
            }
        }
    }
}
