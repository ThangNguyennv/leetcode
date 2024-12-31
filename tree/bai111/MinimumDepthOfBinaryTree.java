package tree.bai111;

public class MinimumDepthOfBinaryTree {
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

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int heightOfLeftTree = minDepth(root.left);
        int heightOfRightTree = minDepth(root.right);
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return 1 + heightOfRightTree;
        }
        if (root.right == null) {
            return 1 + heightOfLeftTree;
        }
        int height = Math.min(heightOfLeftTree, heightOfRightTree) + 1;
        return height;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        node1.right = node2;
        node2.right = node3;
        node3.right = node4;
        node4.right = node5;

        System.out.println(minDepth(node1));
    }
}
