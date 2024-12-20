package tree.bai938;


public class RangeSumOfBST {
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

    int result = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        inordeṛ̣(root, low, high);
        return result;
    }
    public void inordeṛ̣(TreeNode root, int low, int high) {
        if (root != null) {
            inordeṛ̣(root.left, low, high);
            if (root.val >= low && root.val <= high) {
                result += root.val;
            }
            inordeṛ̣(root.right, low, high);
        }
    }
}
