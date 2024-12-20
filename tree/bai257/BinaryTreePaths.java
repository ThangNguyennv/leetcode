package tree.bai257;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        if (root != null) {
            searchBST(root, "", list);
        }
        return list;
    }

    public void searchBST(TreeNode root, String path, List<String> list) {
        if (root.left == null && root.right == null) {
            list.add(path + root.val);
        }
        if (root.left != null) {
            searchBST(root.left, path + root.val + "->", list);
        }
        if (root.right != null) {
            searchBST(root.right, path + root.val + "->", list);
        }
    }
}
