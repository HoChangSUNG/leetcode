package _9월._21일_30일._22일;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class DesignHashMap {

    private Bucket[] buckets;
    private int size;
    public DesignHashMap() {
        size = 500;
        buckets = new Bucket[size];
        for(int i = 0;i<size;i++){
            buckets[i] = new Bucket();
        }

    }

    public void put(int key, int value) {
        buckets[hash(key)].add(key,value);
    }

    public int get(int key) {
        return buckets[hash(key)].get(key);
    }

    public void remove(int key) {
        buckets[hash(key)].remove(key);
    }

    private int hash(int key){
        return key%size;
    }

    static class Bucket{
        private List<Node> list;

        public Bucket() {
            this.list = new LinkedList<Node>();
        }

        public void add(int key,int value){
            Node node = new Node(key, value);
            for(int i = 0;i<list.size();i++){
                if(list.get(i).key==key){list.get(i).value=value; return;}
            }
            list.add(node);
        }

        public int get(int key){
            for(int i = 0;i<list.size();i++) {
                if (list.get(i).key == key) return list.get(i).value;
            }
            return -1;
        }

        public void remove(int key){
            for(int i = 0;i<list.size();i++) {
                if (list.get(i).key == key) {list.remove(i); break;}
            }

        }

    }

    static class Node{
        private int key;
        private int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node node = (Node) o;
            return key == node.key && value == node.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }
}
