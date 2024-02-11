package _2024년._2월._11일_20일._11일;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode cur, long left, long right) {
        if (cur == null) return true;

        if (left < cur.val && cur.val < right) {
            return isValid(cur.left, left, cur.val) && isValid(cur.right, cur.val, right);
        } else {
            return false;
        }
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
