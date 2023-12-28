package _2023년._9월._21일_30일._30일;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationSum {

    private Stack<Integer> stack;
    List<List<Integer>> result;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        stack = new Stack<>();
        combination(candidates, 0, target);
        return result;
    }

    private void combination(int[] candidate, int index, int target) {
        if (target == 0) result.add(new ArrayList<>(stack));
        if (target < 0 || index == candidate.length) return;
        for (int i = index; i < candidate.length; i++) {
            stack.push(candidate[i]);
            combination(candidate, i, target - candidate[i]);
            stack.pop();
        }
    }

}
