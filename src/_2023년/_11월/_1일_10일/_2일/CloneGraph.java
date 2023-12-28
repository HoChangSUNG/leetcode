package _2023년._11월._1일_10일._2일;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {

    Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return node;

        if (visited.containsKey(node)) return visited.get(node);
        Node cloneNode = new Node(node.val);
        visited.put(node, cloneNode);

        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }
        return cloneNode;
    }

    static class Node {
         int val;
         List<Node> neighbors;
         Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
         Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
         Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
