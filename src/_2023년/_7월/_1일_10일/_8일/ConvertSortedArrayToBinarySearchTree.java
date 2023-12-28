package _2023년._7월._1일_10일._8일;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        TreeNode cur = new TreeNode(nums[mid]);
        sorted(cur, start, mid - 1, nums);
        sorted(cur, mid + 1, end, nums);
        return cur;
    }

    public void sorted(TreeNode cur, int start, int end, int[] nums) {
        if (start > end) {
            return;
        }
        int mid = (start + end) / 2;
        TreeNode next = new TreeNode(nums[mid]);
        if (nums[mid] < cur.val) {
            cur.left = next;
        } else {
            cur.right = next;
        }
        sorted(next, start, mid - 1, nums);
        sorted(next, mid + 1, end, nums);

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
