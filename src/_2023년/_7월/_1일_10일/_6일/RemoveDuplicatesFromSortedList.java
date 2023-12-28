package _2023년._7월._1일_10일._6일;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        for (int i = 0; cur.next != null; i++) {
            ListNode nextNode = cur.next;
            if (cur.val == nextNode.val) {
                cur.next = nextNode.next;
            }
            if (cur.val != nextNode.val) {
                cur = cur.next;
            }
        }
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
