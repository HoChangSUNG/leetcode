package _2024년._2월._1일_10일._3일;

public class RemoveDuplicatesFromSortedListTwo {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-101);
        ListNode result = dummy;

        int number = head.val;
        int count = 1;
        head = head.next;

        while (head != null) {
            if (head.val != number) {
                if (count == 1) {
                    result.next = new ListNode(number);
                    result = result.next;
                }
                count = 1;
                number = head.val;
            } else {
                count++;
            }
            head = head.next;
        }
        if (count == 1) {
            result.next = new ListNode(number);
        }
        return dummy.next;
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
