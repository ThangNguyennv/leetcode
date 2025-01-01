package tree.bai112;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
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

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) { // Node lá
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);

    }

    public static void preorder(TreeNode root, int targetSum, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            preorder(root.left, targetSum, list);
            preorder(root.right, targetSum, list);
        }
    }

    public static void printTree(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        preorder(root, targetSum, list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        System.out.println(hasPathSum(root, 22));
//        printTree(root, 22);
    }
}
