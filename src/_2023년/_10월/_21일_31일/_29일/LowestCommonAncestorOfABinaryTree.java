package _2023년._10월._21일_31일._29일;

public class LowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return recursive(root, p, q);
    }

    private TreeNode recursive(TreeNode node, TreeNode p, TreeNode q) {
        int count = 0;
        TreeNode result = null;
        if (node == null) return null;

        TreeNode left = recursive(node.left, p, q);
        TreeNode right = recursive(node.right, p, q);

        if (left != null) {
            result = left;
            count++;
        }
        if (right != null) {
            result = right;
            count++;
        }

        if (node.val == p.val || node.val == q.val) {
            count++;
            result = node;
        }

        if (count < 2) return result;
        else return node;
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }
}
