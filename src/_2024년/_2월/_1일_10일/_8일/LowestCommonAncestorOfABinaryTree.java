package _2024년._2월._1일_10일._8일;

public class LowestCommonAncestorOfABinaryTree {

    TreeNode answer = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        recursive(root, p, q);
        return answer;
    }

    private int recursive(TreeNode cur, TreeNode p, TreeNode q) {
        if (cur == null) return 0;
        int left = recursive(cur.left, p, q);
        int right = recursive(cur.right, p, q);
        int mid = 0;
        if (cur.val == p.val || cur.val == q.val) {
            mid = 1;
        }
        int result = left + right + mid;
        if (result == 2) {
            answer = cur;
        }

        if (result == 0) return 0;
        else return 1;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
