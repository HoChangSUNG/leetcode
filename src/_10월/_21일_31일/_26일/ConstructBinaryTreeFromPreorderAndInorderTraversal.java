package _10월._21일_31일._26일;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    private int preorderIndex = 0;
    Map<Integer, Integer> position;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        position = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            position.put(inorder[i], i);
        }
        return getTree(preorder, 0, preorder.length - 1);
    }

    private TreeNode getTree(int[] preorder, int left, int right) {
        if (left > right) return null;

        int value = preorder[preorderIndex++];
        TreeNode node = new TreeNode(value);

        node.left = getTree(preorder, left, position.get(value) - 1);
        node.right = getTree(preorder, position.get(value) + 1, right);
        return node;
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
