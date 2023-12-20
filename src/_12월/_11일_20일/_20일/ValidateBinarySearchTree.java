package _12월._11일_20일._20일;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode cur, long min, long max) {
        if (cur == null) return true;

        if (cur.val <= min || cur.val >= max) {
            return false;
        }

        return isValid(cur.left, min, cur.val) && isValid(cur.right, cur.val, max);
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
