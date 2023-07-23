package _7월._1일_10일._7일;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return traversal(root.left, root.right);
    }

    private boolean traversal(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }

        return traversal(p.left, q.right) && traversal(p.right, q.left);
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
