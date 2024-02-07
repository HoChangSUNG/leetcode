package _2024년._2월._1일_10일._7일;

public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        flattenTree(root);
    }

    private TreeNode flattenTree(TreeNode cur) {
        if (cur == null) return null;

        TreeNode left = flattenTree(cur.left);
        TreeNode right = flattenTree(cur.right);


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
