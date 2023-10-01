package _10월._1일_10일._1일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> arr = new LinkedList<>();
        permutation(nums, 0, visited, arr, result);
        return result;
    }

    private void permutation(int[] nums, int count, boolean[] visited, LinkedList<Integer> arr, List<List<Integer>> result) {
        int n = nums.length;
        if (count == n) {
            result.add(new ArrayList<Integer>(arr));
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr.add(nums[i]);
                permutation(nums, count + 1, visited, arr, result);
                visited[i] = false;
                arr.removeLast();
            }
        }
    }
}
