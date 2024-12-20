package tree.bai104;

public class MaximumDepthOfBinaryTree {
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
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // Tim cong thuc de quy
        int heightLeftTree = maxDepth(root.left);
        int heightRightTree = maxDepth(root.right);
        int result = Math.max(heightRightTree, heightLeftTree) + 1;
        return result;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        System.out.println(maxDepth(node1));

    }
}
