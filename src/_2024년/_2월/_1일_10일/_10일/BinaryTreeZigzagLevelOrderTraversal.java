package _2024년._2월._1일_10일._10일;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        recursive(root, 0);
        return result;
    }

    private void recursive(TreeNode cur, int level) {
        if (cur == null) return;

        if (level >= result.size()) {
            result.add(new ArrayList<>());
            result.get(level).add(cur.val);
        } else {
            if (level % 2 == 1) {
                result.get(level).add(0, cur.val);
            } else {
                result.get(level).add(cur.val);
            }
        }

        recursive(cur.left, level + 1);
        recursive(cur.right, level + 1);
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
