package _11월._21일_30일._22일;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        LinkedList<Integer> temp = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums, seen, temp, result);
        return result;
    }

    private void permutation(int[] nums, HashSet<Integer> seen, LinkedList<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == nums.length) result.add(new ArrayList<>(temp));

        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) continue;

            seen.add(nums[i]);
            temp.add(nums[i]);
            permutation(nums, seen, temp, result);
            temp.removeLast();
            seen.remove(nums[i]);
        }
    }
}