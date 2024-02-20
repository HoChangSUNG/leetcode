package _2024년._2월._11일_20일._20일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        combination(n, k, 1, 0, new LinkedList<>());
        return result;
    }

    private void combination(int n, int k, int start, int index, LinkedList<Integer> arr){
        if(arr.size() == k){
            result.add(new ArrayList<>(arr));
            return;
        }
        for(int i = start;i<=n;i++){
            arr.add(i);
            combination(n,k,i+1,index+1,arr);
            arr.removeLast();
        }
    }
}
