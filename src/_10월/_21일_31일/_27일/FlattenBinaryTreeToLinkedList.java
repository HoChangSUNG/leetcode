package _10월._21일_31일._27일;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        Queue<TreeNode> order = new LinkedList<>();
        preOrder(root, order);
        while (!order.isEmpty()) {
            TreeNode node = order.poll();
            if (!order.isEmpty()) node.right = order.peek();
        }
    }

    private void preOrder(TreeNode node, Queue<TreeNode> order) {
        if (node == null) return;
        order.add(node);
        preOrder(node.left, order);
        preOrder(node.right, order);
        node.left = null;
    }

    public class TreeNode {
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
