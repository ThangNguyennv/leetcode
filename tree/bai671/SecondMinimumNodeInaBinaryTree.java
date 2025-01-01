package tree.bai671;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondMinimumNodeInaBinaryTree {
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

    public static int findSecondMinimumValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int minValue = Integer.MAX_VALUE;
        int minSecondValue = Integer.MAX_VALUE;
        for (int x : list) {
            minValue = Math.min(minValue, x);
        }
        Collections.sort(list);
        for (int x : list) {
            if (x > minValue) {
                return x;
            }
        }
        return -1;
    }

    public static void inorder(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        System.out.println(findSecondMinimumValue(root));
    }
}
