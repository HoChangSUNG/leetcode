package _2023년._12월._11일_20일._16일;

public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return subSum(0, root);
    }

    private int subSum(int num, TreeNode cur) {
        if (cur == null) return 0;

        int left = subSum(num * 10 + cur.val, cur.left);
        int right = subSum(num * 10 + cur.val, cur.right);

        int sum = left + right;
        if (sum == 0) return num * 10 + cur.val;
        return sum;
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