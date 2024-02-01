package _2024년._2월._1일_10일._1일;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val = 0;
            if (l1 != null && l2 != null) {
                val = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                val = carry;
                if (l1 == null) {
                    val += l2.val;
                    l2 = l2.next;
                } else {
                    val += l1.val;
                    l1 = l1.next;
                }
            }
            carry = val / 10;
            val %= 10;
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        if (carry != 0) {
            cur.next = new ListNode(carry);
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
