package _9월._21일_30일._21일;

import java.util.LinkedList;

public class DesignHashSet {
    private int size;
    private Bucket[] bucket;

    public DesignHashSet() {
        size = 500;
        bucket = new Bucket[size];
        for(int i = 0;i<size;i++){
            bucket[i] = new Bucket();
        }
    }

    public void add(int key) {
        bucket[hash(key)].add(key);
    }

    public void remove(int key) {
        bucket[hash(key)].remove(key);
    }

    public boolean contains(int key) {
        return bucket[hash(key)].contains(key);
    }

    private int hash(int key){
        return key%size;
    }

    static class Bucket{
        private LinkedList<Integer> list;
        public Bucket() {
            list = new LinkedList<Integer>();
        }

        public void add(Integer key){
            if(!contains(key)){
                list.add(key);
            }
        }

        public boolean contains(Integer key){
            return list.contains(key);
        }

        public void remove(Integer key){
            list.remove(key);
        }
    }
}
