package _2023년._8월._11일_20일._18일;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        int n = list1.length;
        int m = list2.length;
        for (int i = 0; i < n; i++) {
            map.put(list1[i], i);
        }
        int min = n + m;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (map.containsKey(list2[i])) {
                int least = map.get(list2[i]) + i;
                if (min > least) {
                    res.clear();
                    res.add(list2[i]);
                    min = least;
                } else if (min == least) res.add(list2[i]);
            }
        }
        return res.toArray(new String[0]);
    }
}
