package tree.bai872;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
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
    public static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inorder(root1, list1);
        inorder(root2, list2);
        if (list1.size() != list2.size()) {
            return false;
        } else {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i).compareTo(list2.get(i)) < 0 || list1.get(i).compareTo(list2.get(i)) > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void inorder(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorder(root.left, list);
            if (isLeaf(root)) {
                list.add(root.val);
            }
            inorder(root.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(200);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(200);

        System.out.println(leafSimilar(root1, root2));

    }
}
