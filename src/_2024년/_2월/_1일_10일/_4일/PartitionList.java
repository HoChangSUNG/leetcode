package _2024년._2월._1일_10일._4일;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(-1);
        ListNode after = new ListNode(-1);
        ListNode dummyBefore = before;
        ListNode dummyAfter = after;

        while (head != null) {
            if (head.val < x) {
                dummyBefore.next = head;
                dummyBefore = dummyBefore.next;

            } else {
                dummyAfter.next = head;
                dummyAfter = dummyAfter.next;
            }
            head = head.next;
        }

        if (before.next == null) return after.next;
        dummyBefore.next = after.next;
        dummyAfter.next = null;
        return before.next;
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
