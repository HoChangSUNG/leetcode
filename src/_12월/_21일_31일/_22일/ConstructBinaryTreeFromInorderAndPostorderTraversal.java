package _12월._21일_31일._22일;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    private Map<Integer, Integer> inOrder = new HashMap<>();
    private int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            inOrder.put(inorder[i], i);
        }
        return getTree(postorder, 0, postorder.length - 1);
    }

    private TreeNode getTree(int[] postorder, int left, int right) {
        if (left > right) return null;

        int value = postorder[postIndex--];

        TreeNode cur = new TreeNode(value);
        cur.right = getTree(postorder, inOrder.get(value) + 1, right);
        cur.left = getTree(postorder, left, inOrder.get(value) - 1);
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
