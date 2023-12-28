package _2023년._12월._11일_20일._16일;

public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        flat(root);
    }

    private TreeNode flat(TreeNode cur) {
        if (cur == null) return null;

        TreeNode left = flat(cur.left);
        TreeNode right = flat(cur.right);

        if (left == null || right == null) {
            if (left == null && right == null) return cur;
            if (left == null) return right;
            if (right == null) {
                cur.right = cur.left;
                cur.left = null;
                return left;
            }
        }
        left.right = cur.right;
        cur.right = cur.left;
        cur.left = null;
        return right;
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
