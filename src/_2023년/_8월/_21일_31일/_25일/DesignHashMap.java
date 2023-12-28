package _2023년._8월._21일_31일._25일;

import java.util.ArrayList;

public class DesignHashMap {
    private Bucket[] buckets;
    private int space;

    public DesignHashMap() {
        space = 10000;
        buckets = new Bucket[space];
    }

    public void add(int key) {
        if (buckets[key % space] == null) {
            buckets[key % space] = new Bucket(key);
        } else {
            buckets[key % space].add(key);
        }
    }

    public void remove(int key) {
        if (buckets[key % space] != null) {
            buckets[key % space].remove(key);
        }
    }

    public boolean contains(int key) {
        if (buckets[key % space] == null) return false;
        return buckets[key % space].contains(key);
    }

    static class Bucket {
        ArrayList<Integer> arr;

        public Bucket(int key) {
            arr = new ArrayList<>();
            arr.add(key);
        }

        public void add(int key) {
            if (!arr.contains(key)) arr.add(key);
        }

        public void remove(int key) {
            arr.remove((Integer) key);
        }

        public boolean contains(int key) {
            return arr.contains(key);
        }
    }

}
