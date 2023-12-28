package _2023년._9월._1일_10일._7일;

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        bst(start, mid - 1, node, nums);
        bst(mid + 1, end, node, nums);
        return node;
    }

    public void bst(int start, int end, TreeNode node, int[] nums) {
        if (start > end) return;

        int mid = (start + end) / 2;
        TreeNode cur = new TreeNode(nums[mid]);

        if (cur.val < node.val) node.left = cur;
        else node.right = cur;
        bst(start, mid - 1, cur, nums);
        bst(mid + 1, end, cur, nums);
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
