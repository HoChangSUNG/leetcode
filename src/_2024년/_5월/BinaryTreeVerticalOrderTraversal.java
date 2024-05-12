package _2024년._5월;

import java.util.*;
import java.util.stream.Collectors;

public class BinaryTreeVerticalOrderTraversal {
    private int maxCol = 0;
    private int minCol = 0;
    private Map<Integer, List<TreeNode>> orderMap = new HashMap<>();
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<NodeWrapper> queue = new LinkedList<>();
        queue.add(new NodeWrapper(root,0));
        while (!queue.isEmpty()) {
            NodeWrapper cur = queue.poll();
            maxCol = Math.max(cur.col,maxCol);
            minCol = Math.min(cur.col,minCol);
            orderMap.computeIfAbsent(cur.col,v-> new ArrayList<>()).add(cur.node);
            if(cur.node.left!=null) queue.add(new NodeWrapper(cur.node.left,cur.col-1));
            if(cur.node.right!=null) queue.add(new NodeWrapper(cur.node.right,cur.col+1));
        }
        for(int i = minCol;i<=maxCol;i++){
            result.add(orderMap.get(i).stream().map(node -> node.val).collect(Collectors.toList()));
        }
        return result;
    }

    class NodeWrapper{
        private TreeNode node;
        private int col;

        public NodeWrapper(TreeNode node, int col) {
            this.node = node;
            this.col = col;
        }
    }
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
