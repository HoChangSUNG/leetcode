package _2024년._1월._11일_20일._11일;

import java.util.*;
import java.util.function.Function;

public class PermutationsTwo {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 0);
            }
            countMap.put(num, countMap.get(num) + 1);
        }
        LinkedList<Integer> comb = new LinkedList<>();
        backtrack(nums, result, countMap, comb);
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, Map<Integer, Integer> countMap, LinkedList<Integer> comb) {
        if (comb.size() == nums.length) {
            result.add(new ArrayList<>(comb));
            return;
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count == 0) continue;

            comb.add(num);
            countMap.put(num, count - 1);
            backtrack(nums, result, countMap, comb);

            countMap.put(num, count);
            comb.removeLast();
        }
    }
}
