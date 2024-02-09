package _2024년._2월._1일_10일._9일;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        searchRightSide(root, 1);
        return result;
    }

    private void searchRightSide(TreeNode root, int level) {
        if (root == null) return;

        if (result.size() < level) {
            result.add(root.val);
        }

        searchRightSide(root.right, level + 1);
        searchRightSide(root.left, level + 1);
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
