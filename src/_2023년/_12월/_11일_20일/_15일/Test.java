package _2023년._12월._11일_20일._15일;

public class Test {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode removed = new ListNode(-101);
        ListNode result = removed;
        if (head == null) return null;

        int count = 1;
        int number = head.val;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val != number) {
                if (count == 1) {
                    result.next = new ListNode(number);
                    result = result.next;
                }
                count = 1;
                number = cur.val;
            } else {
                count++;
            }
            cur = cur.next;
        }
        if (count == 1) {
            result.next = new ListNode(number);
        }
        return removed.next;
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
