package _9월._1일_10일._9일;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum_III_DataStructureDesign {

    Map<Integer, Integer> map;

    public Two_Sum_III_DataStructureDesign() {
        map = new HashMap<>();
    }

    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int target = value - entry.getKey();
            if (map.containsKey(target)) {

                if (target == entry.getKey() && entry.getValue() > 1) {
                    return true;
                } else if (target != entry.getKey()) return true;
            }
        }
        return false;
    }
}
