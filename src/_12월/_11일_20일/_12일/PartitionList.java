package _12월._11일_20일._12일;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode before_head = new ListNode();
        ListNode after_head = new ListNode();
        ListNode before_cur = before_head;
        ListNode after_cur = after_head;

        while (head != null) {
            if (head.val < x) {
                before_cur.next = head;
                before_cur = before_cur.next;
            } else {
                after_cur.next = head;
                after_cur = after_cur.next;
            }
            head = head.next;
        }
        if (before_head.next == null) return after_head.next;
        before_cur.next = after_head.next;
        after_cur.next = null;
        return before_head.next;
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
