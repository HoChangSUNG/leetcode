package _2024년._2월._1일_10일._7일;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return sumLeaf(root, 0);
    }

    private int sumLeaf(TreeNode node, int number) {
        if (node == null) return 0;

        int cur = number * 10 + node.val;
        int rightSum = sumLeaf(node.right, cur);
        int leftSum = sumLeaf(node.left, cur);

        int result = rightSum + leftSum;
        if (result == 0) return cur;
        return result;
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
