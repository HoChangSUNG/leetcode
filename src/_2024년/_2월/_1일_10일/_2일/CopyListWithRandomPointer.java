package _2024년._2월._1일_10일._2일;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        Map<Node, Node> copy = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            Node copyCur = cloneNode(cur, copy);
            copyCur.next = cloneNode(cur.next, copy);
            copyCur.random = cloneNode(cur.random, copy);
            cur = cur.next;
        }
        return copy.get(head);
    }

    private Node cloneNode(Node cur, Map<Node, Node> copy) {
        Node newNode = null;
        if (cur == null) return null;
        if (!copy.containsKey(cur)) {
            newNode = new Node(cur.val);
            copy.put(cur, newNode);
        } else {
            newNode = copy.get(cur);
        }
        return newNode;
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
