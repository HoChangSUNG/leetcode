package _2024년._2월._1일_10일._3일;

import java.util.HashMap;
import java.util.Map;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer, ListNode> store = new HashMap<>();
        ListNode cur = head;
        int index = 0;
        while (cur != null) {
            store.put(index++, cur);
            cur = cur.next;
        }

        int removedIndex = index - n;
        if (removedIndex == 0) return head.next;
        store.get(removedIndex - 1).next = store.get(removedIndex + 1);
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
