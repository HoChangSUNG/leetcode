package _2024년._4월;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST {
    public int getMinimumDifference(TreeNode root) {
        List<TreeNode> sorted = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        inorder(root, sorted);

        for (int i = 1; i < sorted.size(); i++) {
            min = Math.min(min, sorted.get(i).val - sorted.get(i - 1).val);
        }
        return min;
    }

    private void inorder(TreeNode cur, List<TreeNode> sorted) {
        if (cur == null) return;

        inorder(cur.left, sorted);
        sorted.add(cur);
        inorder(cur.right, sorted);
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
