package _2024년._2월._1일_10일._2일;

import java.util.HashMap;
import java.util.Map;

public class ReverseLinkedListTwo {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int n = 0;
        int reversedIndex = right;
        Map<Integer, ListNode> list = new HashMap<>();
        ListNode cur = head;
        while (cur != null) {
            n++;
            if (left <= n && n <= right) {
                list.put(reversedIndex--, cur);
            } else {
                list.put(n, cur);
            }
            cur = cur.next;
        }
        for (int i = 2; i <= n; i++) {
            list.get(i - 1).next = list.get(i);
        }
        list.get(n).next = null;
        return list.get(1);
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
