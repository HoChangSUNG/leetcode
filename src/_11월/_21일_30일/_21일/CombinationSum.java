package _11월._21일_30일._21일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new LinkedList<Integer>();
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,target,0,temp,result);
        return result;
    }

    private void backtrack(int[]comb, int target,int start,List<Integer> remain,List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<Integer>(remain));
            return;
        }
        if(target < 0)return;

        for(int i = start;i<comb.length;i++){
            remain.add(comb[i]);
            backtrack(comb,target-comb[i],i,remain,result);
            remain.remove(remain.size()-1);
        }
    }
}
