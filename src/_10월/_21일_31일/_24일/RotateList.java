package _10월._21일_31일._24일;

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)return head;
        int n = 0;
        ListNode cur = head;
        ListNode tail =null;

        while(cur!=null){
            if(cur.next==null){
                tail = cur;
            }
            cur = cur.next;
            n++;
        }

        k%=n;
        tail.next=head;
        cur = head;
        for(int i = 1;i<n-k;i++){
            cur = cur.next;
        }
        ListNode start = cur.next;
        cur.next=null;
        return start;
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
