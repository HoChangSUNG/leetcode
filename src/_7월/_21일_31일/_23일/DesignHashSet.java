package _7월._21일_31일._23일;

import java.util.HashMap;
import java.util.Map;

public class DesignHashSet {
    private Map<Integer, Object> map;
    private final Object DUMMY = new Object();

    public DesignHashSet() {
        map = new HashMap<>();
    }

    public void add(int key) {
        map.put(key, DUMMY);
    }

    public void remove(int key) {
        if (map.containsKey(key)) {
            map.remove(key);
        }
    }

    public boolean contains(int key) {
        return map.containsKey(key) ? true : false;
    }
}
