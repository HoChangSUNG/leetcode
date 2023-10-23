package _10월._21일_31일._23일;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            size++;
        }

        if (size - n == 0) return head.next;
        cur = head;
        ListNode prev = null;
        for (int i = 0; i < size - n; i++) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = cur.next;
        return head;
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
