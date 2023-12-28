package _2023년._12월._21일_31일._28일;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    private List<List<Integer>> result;
    private int n;
    private int k;

    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        this.n = n;
        this.k = k;

        List<Integer> visited = new ArrayList<>();
        combination(1, visited);
        return result;
    }

    private void combination(int start, List<Integer> visited) {
        if (k == visited.size()) {
            result.add(new ArrayList<Integer>(visited));
            return;
        }
        if (start > n) return;

        for (int i = start; i <= n; i++) {
            visited.add(i);
            combination(i + 1, visited);
            visited.remove(visited.size() - 1);
        }
    }
}
