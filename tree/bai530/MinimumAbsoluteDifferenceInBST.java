package tree.bai530;

import tree.bai257.BinaryTreePaths;

public class MinimumAbsoluteDifferenceInBST {
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

    public int getMinimumDifference(TreeNode root) {
        int max_val = Integer.MAX_VALUE;
        if (root == null) {
            return 0;
        } else {
            return Math.min(Math.abs(getMinimumDifference(root.left) - getMinimumDifference(root.right)), max_val);
        }
    }
}
