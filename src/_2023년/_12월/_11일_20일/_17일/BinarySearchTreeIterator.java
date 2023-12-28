package _2023년._12월._11일_20일._17일;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeIterator {
    Queue<Integer> queue = new LinkedList<>();

    public BinarySearchTreeIterator(TreeNode root) {
        travel(root);
    }

    public int next() {
        return queue.poll();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    private void travel(TreeNode node) {
        if (node == null) {
            return;
        }
        travel(node.left);
        queue.add(node.val);
        travel(node.right);
    }

    class TreeNode {
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