package _11월._1일_10일._7일;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PropertyResourceBundle;

public class Combinations {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        findCombination(1, n, k, 0, new int[k]);
        return result;
    }


    private void findCombination(int start, int end, int size, int index, int[] arr) {
        if (size <= index) {
            List<Integer> temp = new ArrayList<>();
            for (int i : arr) {
                temp.add(i);
            }
            result.add(temp);
            return;
        }

        for (int i = start; i <= end; i++) {
            arr[index] = i;
            findCombination(i + 1, end, size, index + 1, arr);
        }
    }


}
