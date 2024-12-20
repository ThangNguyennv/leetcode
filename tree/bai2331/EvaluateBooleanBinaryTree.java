package tree.bai2331;

import tree.bai897.IncreasingOrderSearchTree;

public class EvaluateBooleanBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {

        }

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean evaluateTree(TreeNode root) {
        return solve(root);
    }
    public boolean solve(TreeNode root) {
        if (root.val == 0 || root.val == 1) {
            return root.val == 1;
        } else if (root.val == 2) {
            return solve(root.left) || solve(root.right);
        } else if (root.val == 3) {
            return solve(root.left) && solve(root.right);
        }
        return false;
    }
}
