package _2024년._2월._1일_10일._5일;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private Map<Integer, Node> list = new HashMap<>();
    private int capacity;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!list.containsKey(key)) return -1;
        Node node = list.get(key);
        remove(node);
        add(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (list.containsKey(key)) {
            remove(list.get(key));
        }
        Node node = new Node(key, value);
        list.put(key, node);
        add(node);
        if (list.size() > capacity) {
            Node delete = head.next;
            remove(delete);
            list.remove(delete.key);
        }
    }

    private void add(Node node) {
        Node prev = tail.prev;
        node.next = tail;
        tail.prev = node;
        node.prev = prev;
        prev.next = node;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }


    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
