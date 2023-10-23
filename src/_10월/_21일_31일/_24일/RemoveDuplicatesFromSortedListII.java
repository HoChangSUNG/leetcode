package _10월._21일_31일._24일;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-101);
        ListNode prev = dummy;
        ListNode cur = head;
        Set<Integer> visited = new HashSet<>();

        while (cur != null) {
            ListNode temp = cur.next;
            if (cur.next == null || cur.val != cur.next.val) {
                if (!visited.contains(cur.val)) {
                    prev.next = cur;
                    cur.next = null;
                    prev = prev.next;

                }
            } else {
                visited.add(cur.val);
            }
            cur = temp;
        }

        return dummy.next;
    }

    static class ListNode {
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
