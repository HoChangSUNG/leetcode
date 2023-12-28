package _2023년._12월._21일_31일._22일;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    private int preIndex = 0;
    private Map<Integer, Integer> inOrder = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < preorder.length; i++) {
            inOrder.put(inorder[i], i);
        }
        return getTree(preorder, 0, inorder.length - 1);
    }

    private TreeNode getTree(int[] preorder, int left, int right) {
        if (left > right) return null;

        int value = preorder[preIndex++];
        TreeNode cur = new TreeNode(value);

        cur.left = getTree(preorder, left, inOrder.get(value) - 1);
        cur.right = getTree(preorder, inOrder.get(value) + 1, right);
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
