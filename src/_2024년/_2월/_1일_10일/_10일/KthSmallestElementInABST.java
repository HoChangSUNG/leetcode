package _2024년._2월._1일_10일._10일;

import java.util.LinkedList;
import java.util.List;

public class KthSmallestElementInABST {
    List<Integer> smallOrder = new LinkedList<>();

    public int kthSmallest(TreeNode root, int k) {
        search(root);
        return smallOrder.get(k - 1);
    }

    private void search(TreeNode cur) {
        if (cur == null) return;

        search(cur.left);
        smallOrder.add(cur.val);
        search(cur.right);
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
