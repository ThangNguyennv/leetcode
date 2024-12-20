package tree.bai897;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
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

    public static TreeNode increasingBST(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return solve(result, 0);
    }

    public static void inorder(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }

    public static TreeNode solve(List<Integer> list, int index) {
        if (index >= list.size()) {
            return null;
        }
        TreeNode root = new TreeNode(list.get(index));
        root.right = solve(list, index + 1);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right= new TreeNode(9);

//        List<Integer> list = new ArrayList<>();
//        inorder(root, list);
        System.out.println(increasingBST(root));
    }
}
