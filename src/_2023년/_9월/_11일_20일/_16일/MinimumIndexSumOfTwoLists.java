package _2023년._9월._11일_20일._16일;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> maps = new HashMap<>();
        Map<String, Integer> results = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            maps.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (maps.containsKey(list2[i])) {
                results.put(list2[i], maps.get(list2[i]) + i);
            }
        }
        List<String> result = new ArrayList<>();
        int min = list1.length + list2.length;
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            if (min > entry.getValue()) {
                min = entry.getValue();
                result.clear();
                result.add(entry.getKey());
            } else if (min == entry.getValue()) {
                result.add(entry.getKey());
            }
        }
        return result.toArray(new String[0]);
    }
}
