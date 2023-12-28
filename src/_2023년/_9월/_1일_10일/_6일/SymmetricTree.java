package _2023년._9월._1일_10일._6일;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isRight(root.left, root.right);
    }

    private boolean isRight(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;

        return isRight(left.left, right.right) && isRight(left.right, right.left);
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
