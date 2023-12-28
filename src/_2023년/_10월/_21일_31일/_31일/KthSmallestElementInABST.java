package _2023년._10월._21일_31일._31일;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABST {

    private List<Integer> nodes = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return nodes.get(k - 1);
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);
        nodes.add(node.val);
        inorder(node.right);
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
