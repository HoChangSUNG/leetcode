package _12월._1일_10일._6일;

import java.util.*;

public class InsertDeleteGetRandomO_1 {
    private Map<Integer, Integer> map;
    private ArrayList<Integer> arr = new ArrayList<>();
    private int index = -1;
    Random random = new Random();

    public InsertDeleteGetRandomO_1() {
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            map.put(val, arr.size());
            arr.add(arr.size(), val);
            return true;
        }
        return false;

    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int last = arr.get(arr.size() - 1);
            int idx = map.get(val);
            arr.set(idx, last);
            map.put(last, idx);

            arr.remove(arr.size() - 1);
            map.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int i = random.nextInt(arr.size());
        return arr.get(i);
    }
}
