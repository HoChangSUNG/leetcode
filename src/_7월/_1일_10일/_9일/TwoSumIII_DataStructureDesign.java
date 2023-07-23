package _7월._1일_10일._9일;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoSumIII_DataStructureDesign {
    private List<Integer> arr;

    public TwoSumIII_DataStructureDesign() {
        arr = new ArrayList<Integer>();
    }

    public void add(int number) {
        arr.add(number);
    }

    public boolean find(int value) {
        if (arr.size() == 0) return false;
        Collections.sort(arr);
        int i = 0;
        int j = arr.size() - 1;
        while (i != j) {
            int sum = arr.get(i) + arr.get(j);
            if (sum == value) return true;
            else if (sum > value) j--;
            else i++;
        }
        return false;
    }
}
