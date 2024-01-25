package _2024년._1월._21일_31일._25일;

import java.util.*;

public class InsertDeleteGetRandomO_One {
    private Map<Integer, Integer> map;
    private List<Integer> arr;
    private Random random;
    public InsertDeleteGetRandomO_One() {
        map = new HashMap<>();
        arr = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val))return false;
        arr.add(val);
        map.put(val, arr.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;

        int lastIndex = arr.size()-1;
        int removedIndex = map.get(val);
        arr.set(removedIndex, arr.get(lastIndex));
        map.put(arr.get(lastIndex), removedIndex);

        map.remove(val);
        arr.remove(arr.size()-1);
        return true;
    }

    public int getRandom() {
        return arr.get(random.nextInt(arr.size()));
    }
}
