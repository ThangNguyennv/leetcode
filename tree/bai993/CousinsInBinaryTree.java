package tree.bai993;

import com.sun.source.tree.Tree;

public class CousinsInBinaryTree {
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

    public static boolean isCousins(TreeNode root, int x, int y) { // Có phải ae họ không?
       TreeNode a = findNode(root, x);
        TreeNode b = findNode(root, y);
        return (findLevel(root, a, 0) == findLevel(root, b, 0)) && !isSibling(root, a, b);
    }

    public static TreeNode findNode(TreeNode node, int a) { // Tìm node
        if (node == null) {
            return null;
        }
        if (node.val == a) {
            return node;
        }
        TreeNode n = findNode(node.left, a);
        if (n != null) {
            return n;
        }
        return findNode(node.right, a);
    }

    public static boolean isSibling(TreeNode node, TreeNode x, TreeNode y) { // Có phải ae ruột không?
        if (node == null) {
            return false;
        }
        return (node.left == x && node.right == y) ||
                (node.left == y && node.right == x) ||
                (isSibling(node.left, x, y)) || (isSibling(node.right, x, y));
    }

    public static int findLevel(TreeNode node, TreeNode a, int level) { // Tìm mức
        if (node == null) {
            return 0;
        }
        if (node == a) {
            return level;
        }
        int l = findLevel(node.left, a, level + 1);
        if (l != 0) {
            return l;
        }
        return findLevel(node.right, a, level + 1);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        System.out.println(isCousins(root1, 4, 3));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(5);
        System.out.println(isCousins(root2, 5, 4));

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.left.left = new TreeNode(4);
        System.out.println(isCousins(root3, 2, 3));
    }
}
