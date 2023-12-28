package _2023년._10월._21일_31일._25일;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    Map<Integer, ListNode> dic;
    ListNode tail;
    ListNode head;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        dic = new HashMap<>();
        head = new ListNode(-1, -1);
        tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!dic.containsKey(key)) {
            return -1;
        }
        ListNode node = dic.get(key);
        remove(node);
        add(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (dic.containsKey(key)) {
            remove(dic.get(key));
        }
        ListNode node = new ListNode(key, value);
        add(node);
        dic.put(key, node);
        if (dic.size() > capacity) {
            ListNode delete = head.next;
            remove(delete);
            dic.remove(delete.key);
        }
    }

    private void add(ListNode node) {
        ListNode previous = tail.prev;
        node.next = tail;
        node.prev = previous;
        previous.next = node;
        tail.prev = node;
    }

    private void remove(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    static class ListNode {
        int key;
        int val;
        ListNode next;
        ListNode prev;

        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
