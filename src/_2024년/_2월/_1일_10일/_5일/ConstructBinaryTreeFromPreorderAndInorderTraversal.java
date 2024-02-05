package _2024년._2월._1일_10일._5일;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    private int index = 0;
    private Map<Integer, Integer> inOrder = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            inOrder.put(inorder[i], i);
        }
        return constructBinaryTree(preorder, 0, n - 1);
    }

    private TreeNode constructBinaryTree(int[] preorder, int left, int right) {
        if (left > right) return null;

        TreeNode cur = new TreeNode(preorder[index++]);
        int curIndex = inOrder.get(cur.val);
        cur.left = constructBinaryTree(preorder, left, curIndex - 1);
        cur.right = constructBinaryTree(preorder, curIndex + 1, right);
        return cur;
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
