package _2024년._2월._1일_10일._8일;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeIterator {
    Queue<Integer> queue;

    public BinarySearchTreeIterator(TreeNode root) {
        queue = new LinkedList<>();
        traversal(root);
    }

    private void traversal(TreeNode cur) {
        if (cur == null) return;

        traversal(cur.left);
        queue.add(cur.val);
        traversal(cur.right);
    }

    public int next() {
        return queue.poll();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
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
