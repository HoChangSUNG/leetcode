package _12월._11일_20일._14일;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        Map<Node, Node> copy = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            copy.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            copy.get(cur).next = copy.get(cur.next);
            copy.get(cur).random = copy.get(cur.random);
            cur = cur.next;
        }
        return copy.get(head);
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
