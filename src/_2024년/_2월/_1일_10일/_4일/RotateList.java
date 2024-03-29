package _2024년._2월._1일_10일._4일;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = null;
        ListNode cur = head;
        int n = 0;
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
