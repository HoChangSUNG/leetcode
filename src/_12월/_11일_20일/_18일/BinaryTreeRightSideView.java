package _12월._11일_20일._18일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            TreeNode last = null;
            for (int i = 0; i < n; i++) {
                last = q.poll();
                if (last.left != null) q.add(last.left);
                if (last.right != null) q.add(last.right);
            }
            result.add(last.val);
        }
        return result;
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
