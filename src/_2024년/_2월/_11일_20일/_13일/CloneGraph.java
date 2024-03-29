package _2024년._2월._11일_20일._13일;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    private Map<Node, Node> nodeMap = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        createNodeMap(node);
        for (Map.Entry<Node, Node> entry : nodeMap.entrySet()) {
            Node cur = entry.getValue();
            for (Node adj : entry.getKey().neighbors) {
                cur.neighbors.add(nodeMap.get(adj));
            }
        }
        return nodeMap.get(node);
    }

    private void createNodeMap(Node node) {
        nodeMap.put(node, new Node(node.val));
        for (Node adj : node.neighbors) {
            if (!nodeMap.containsKey(adj)) {
                createNodeMap(adj);
            }
        }
    }

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
