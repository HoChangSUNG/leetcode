package _2024년._4월;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return hasPathSum(root, targetSum, 0);
    }

    private boolean hasPathSum(TreeNode cur, int targetSum, int curSum) {
        if (cur == null) return false;
        curSum += cur.val;
        if (cur.left == null && cur.right == null) return targetSum == curSum;

        boolean leftResult = hasPathSum(cur.left, targetSum, curSum);
        boolean rightResult = hasPathSum(cur.right, targetSum, curSum);
        return leftResult || rightResult;
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