package _2024년._1월._1일_10일._9일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

    LinkedList<Integer> cur = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combination(candidates, 0, target);
        return result;
    }

    private void combination(int[] candidates, int index, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(cur));
        }

        for (int i = index; i < candidates.length; i++) {
            if (target >= candidates[i]) {
                cur.add(candidates[i]);
                combination(candidates, i, target - candidates[i]);
                cur.removeLast();
            }
        }
    }
}
