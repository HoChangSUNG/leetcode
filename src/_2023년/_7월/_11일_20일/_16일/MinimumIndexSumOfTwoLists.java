package _2023년._7월._11일_20일._16일;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> maps = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            maps.put(list1[i], i);
        }
        int min = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list2.length; i++) {
            Integer j = maps.get(list2[i]);
            if (j != null && i + j <= min) {

                if (min > i + j) {
                    result.clear();
                    result.add(list2[i]);
                    min = i + j;
                } else {
                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
