package _10월._21일_31일._28일;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeIterator {

    private Queue<Integer> queue = new LinkedList<>();

    public BinarySearchTreeIterator(TreeNode root) {
        inOrder(root);
    }

    public int next() {
        return queue.poll();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);
        queue.add(node.val);
        inOrder(node.right);
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

