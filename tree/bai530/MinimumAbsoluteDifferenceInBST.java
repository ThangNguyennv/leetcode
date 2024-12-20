package tree.bai530;

import com.sun.source.tree.Tree;
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

    int prev = Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        ans = Math.min(ans, Math.abs(root.val - prev));
        prev = root.val;
        inorder(root.right);
    }
}
