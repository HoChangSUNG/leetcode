package _2023년._11월._21일_30일._21일;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combination(candidates, 0, target, temp, result);
        return result;
    }

    private void combination(int[] candidates, int index, int target, List<Integer> temp, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        if (target < 0) return;

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            temp.add(candidates[i]);
            combination(candidates, i + 1, target - candidates[i], temp, result);
            temp.remove(temp.size() - 1);
        }
    }
}
