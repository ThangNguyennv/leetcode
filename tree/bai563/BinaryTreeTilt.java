package tree.bai563;

public class BinaryTreeTilt {
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
    static int ans = 0;
    public static int findTilt(TreeNode root) {
        postOrder(root);
        return ans;
    }
    public static int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        ans += Math.abs(left - right);
        return root.val + left + right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);

        System.out.println(findTilt(root));
    }
}
