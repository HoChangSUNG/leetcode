package _10월._21일_31일._28일;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbers {

    private List<Integer> value = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        preorder(root, 0);
        int sum = 0;
        for (Integer v : value) {
            sum += v;
        }
        return sum;
    }

    private void preorder(TreeNode node, int sum) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            value.add(sum * 10 + node.val);
            return;
        }
        preorder(node.left, sum * 10 + node.val);
        preorder(node.right, sum * 10 + node.val);
    }

    static class TreeNode {
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
