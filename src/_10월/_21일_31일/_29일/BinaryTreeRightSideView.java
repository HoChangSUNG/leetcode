package _10월._21일_31일._29일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    private Queue<TreeNode> nodes = new LinkedList<>();

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) nodes.add(root);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            result.add(nodes.peek().val);
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                if (node.right != null) nodes.add(node.right);
                if (node.left != null) nodes.add(node.left);
            }
        }
        return result;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
