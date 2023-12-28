package _2023년._10월._21일_31일._31일;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return recursive(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    private boolean recursive(TreeNode cur, long left, long right) {
        if (cur == null) return true;

        if (left < cur.val && cur.val < right) {
            return recursive(cur.left, left, cur.val) && recursive(cur.right, cur.val, right);
        } else {
            return false;
        }
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
