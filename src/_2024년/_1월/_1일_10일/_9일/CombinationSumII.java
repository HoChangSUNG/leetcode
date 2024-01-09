package _2024년._1월._1일_10일._9일;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumII {

    LinkedList<Integer> cur = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combination(candidates, target, 0);
        return result;
    }

    private void combination(int[] candidates, int target, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(cur));
        }
        for (int i = index; i < candidates.length; i++) {
            if (target >= candidates[i]) {
                cur.add(candidates[i]);
                combination(candidates, target - candidates[i], i + 1);
                cur.removeLast();
            }
            while (i < candidates.length - 1 && candidates[i] == candidates[i + 1]) {
                i++;
            }
        }
    }
}
