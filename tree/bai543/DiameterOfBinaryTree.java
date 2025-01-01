package tree.bai543;

import java.util.*;

public class DiameterOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {

        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
    static int diameter;
    public static int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        helper(root);
        return diameter;
    }

    private static int helper(TreeNode root) {
         if (root == null) {
             return 0;
         }
         int left = helper(root.left);
         int right = helper(root.right);
         diameter = Math.max(diameter, left + right);
         return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(diameterOfBinaryTree(root));
    }
}
