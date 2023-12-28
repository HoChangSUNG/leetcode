package _2023년._10월._21일_31일._21일;

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {

    private Map<Node, Node> visited = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node oldNode = head;
        Node newNode = new Node(oldNode.val);
        visited.put(oldNode, newNode);

        while (oldNode != null) {
            newNode.next = getCloneNode(oldNode.next);
            newNode.random = getCloneNode(oldNode.random);

            newNode = newNode.next;
            oldNode = oldNode.next;
        }
        return visited.get(head);
    }

    private Node getCloneNode(Node node) {
        if (node == null) return null;
        if (visited.containsKey(node)) {
            return visited.get(node);
        } else {
            visited.put(node, new Node(node.val));
            return visited.get(node);
        }
    }

    static class Node {
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

