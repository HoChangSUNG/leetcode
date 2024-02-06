package _2024년._2월._1일_10일._6일;


import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    private int postIndex;
    private Map<Integer, Integer> inOrderMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        postIndex = n - 1;
        for (int i = 0; i < n; i++) {
            inOrderMap.put(inorder[i], i);
        }

        return constructBinaryTree(postorder, 0, n - 1);
    }

    private TreeNode constructBinaryTree(int[] postorder, int left, int right) {
        if (left > right) return null;
        TreeNode cur = new TreeNode(postorder[postIndex--]);

        cur.right = constructBinaryTree(postorder, inOrderMap.get(cur.val) + 1, right);
        cur.left = constructBinaryTree(postorder, left, inOrderMap.get(cur.val) - 1);

        return cur;
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
