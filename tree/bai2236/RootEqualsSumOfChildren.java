package tree.bai2236;

import tree.bai938.RangeSumOfBST;

public class RootEqualsSumOfChildren {
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

    public static boolean checkTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return root.val == childSum(root);
    }

    private static int sum = 0;
    public static int childSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        inorder(root);
        return sum - root.val;
    }
    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            sum += root.val;
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        System.out.println(checkTree(root));
    }

}
