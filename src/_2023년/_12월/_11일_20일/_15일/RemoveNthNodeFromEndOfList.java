package _2023년._12월._11일_20일._15일;

import java.util.HashMap;
import java.util.Map;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer, ListNode> map = new HashMap<>();
        int k = 0;
        ListNode cur = head;
        while (cur != null) {
            map.put(k++, cur);
            cur = cur.next;
        }
        if (k - n == 0) return map.get(k - n).next;
        map.get(k - n - 1).next = map.get(k - n).next;
        return head;
    }

    class ListNode {
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
