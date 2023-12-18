package _12월._11일_20일._19일;

import java.util.ArrayList;

public class KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        recursive(root,result);
        return result.get(k-1);
    }

    private void recursive(TreeNode cur, ArrayList<Integer> result){
        if(cur==null)return;
        recursive(cur.left, result);
        result.add(cur.val);
        recursive(cur.right, result);
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
