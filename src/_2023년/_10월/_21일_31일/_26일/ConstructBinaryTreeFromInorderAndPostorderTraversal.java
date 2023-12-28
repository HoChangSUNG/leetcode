package _2023년._10월._21일_31일._26일;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    int postorderIndex;
    Map<Integer, Integer> position;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        position = new HashMap<>();
        postorderIndex = inorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            position.put(inorder[i], i);
        }
        return getTree(postorder, 0, inorder.length - 1);
    }

    private TreeNode getTree(int[] postorder, int left, int right) {
        if (left > right) return null;

        int value = postorder[postorderIndex--];
        TreeNode node = new TreeNode(value);

        node.right = getTree(postorder, position.get(value) + 1, right);
        node.left = getTree(postorder, left, position.get(value) - 1);
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
