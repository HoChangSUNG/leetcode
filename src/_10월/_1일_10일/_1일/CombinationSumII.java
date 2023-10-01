package _10월._1일_10일._1일;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumII {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        LinkedList<Integer> store = new LinkedList<Integer>();
        Arrays.sort(candidates);
        combination(candidates, target, 0, store);
        return new ArrayList<List<Integer>>(result);
    }

    public void combination(int[] candidates, int target, int index, LinkedList<Integer> store) {
        if (target == 0) {
            List temp = new ArrayList<>(store);
            result.add(temp);
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (target - candidates[i] < 0) break;
            store.addLast(candidates[i]);
            combination(candidates, target - candidates[i], i + 1, store);
            store.removeLast();
        }
    }
}
