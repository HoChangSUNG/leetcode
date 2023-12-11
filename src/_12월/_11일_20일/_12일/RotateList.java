package _12월._11일_20일._12일;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;
        ListNode cur = head;
        ListNode tail = null;
        while (cur != null) {
            tail = cur;
            cur = cur.next;
            n++;
        }
        if (n == 0) return head;

        k %= n;

        tail.next = head;
        cur = head;
        ListNode prev = tail;
        for (int i = 0; i < n - k; i++) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        return cur;
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
