package _2023년._10월._21일_31일._25일;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode dummyBefore = new ListNode(-101);
        ListNode dummyAfter = new ListNode(101);
        ListNode before = dummyBefore;
        ListNode after = dummyAfter;
        while (head != null) {
            ListNode temp = head.next;
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head.next = null;
            head = temp;
        }
        if (dummyBefore.next == null) {
            return dummyAfter.next;
        }
        before.next = dummyAfter.next;
        return dummyBefore.next;

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
