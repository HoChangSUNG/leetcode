package _12월._11일_20일._18일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        if (root == null) return result;
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode next = q.poll();
                temp.add(next.val);
                if (next.left != null) q.add(next.left);
                if (next.right != null) q.add(next.right);
            }
            result.add(temp);
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
