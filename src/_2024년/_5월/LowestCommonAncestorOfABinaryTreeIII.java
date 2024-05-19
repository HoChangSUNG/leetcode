package _2024년._5월;

import java.util.HashMap;
import java.util.Map;

public class LowestCommonAncestorOfABinaryTreeIII {
    public Node lowestCommonAncestor(Node p, Node q) {

        Map<Integer, Node> visited = new HashMap<>();
        calculateAncestor(p, visited);
        return calculateAncestor(q, visited);
    }

    private Node calculateAncestor(Node cur, Map<Integer, Node> visited) {
        while (cur != null) {
            if (visited.containsKey(cur.val)) {
                return visited.get(cur.val);
            }
            visited.put(cur.val, cur);
            cur = cur.parent;
        }
        return null;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;
    };
}
