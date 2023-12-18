package _12월._11일_20일._19일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        recursive(root, 0, result);
        return result;
    }

    private void recursive(TreeNode cur, int level, List<List<Integer>> result) {
        if (cur == null) return;

        if (level >= result.size()) {
            result.add(new LinkedList<Integer>());
            result.get(level).add(cur.val);
        } else {
            if (level % 2 == 0) {
                result.get(level).add(cur.val);
            } else {
                result.get(level).add(0, cur.val);
            }
        }
        recursive(cur.left, level + 1, result);
        recursive(cur.right, level + 1, result);
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
