package _8월._1일_10일._8일;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        TreeNode head = new TreeNode(nums[mid]);
        sort(start, mid - 1, head, nums);
        sort(mid + 1, end, head, nums);
        return head;
    }

    public void sort(int start, int end, TreeNode parent, int[] nums) {
        if (start > end) return;
        int mid = (start + end) / 2;
        TreeNode cur = new TreeNode(nums[mid]);

        if (nums[mid] < parent.val) {
            parent.left = cur;
        } else {
            parent.right = cur;
        }
        sort(start, mid - 1, cur, nums);
        sort(mid + 1, end, cur, nums);
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
