package _11월._21일_30일._23일;

import java.util.*;

public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> permute = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        permutation(nums, result, permute, 0, visited);
        return new ArrayList<List<Integer>>(result);
    }

    private void permutation(int[] nums, Set<List<Integer>> result, List<Integer> permute, int size, boolean[] visited) {

        if (size == nums.length) {
            result.add(new ArrayList<>(permute));

            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            permute.add(nums[i]);
            permutation(nums, result, permute, size + 1, visited);
            permute.remove(permute.size() - 1);
            visited[i] = false;
        }
    }

}
