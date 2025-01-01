package tree.bai501;

import tree.bai530.MinimumAbsoluteDifferenceInBST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeInBinarySearchTree {
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

    public static int[] findMode(TreeNode root) {
        if (root == null) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        inorder(root, map);
        int maxts = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxts = Math.max(maxts, entry.getValue());
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxts) {
                list.add(entry.getKey());
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void inorder(TreeNode root, Map<Integer, Integer> map) {
        if (root != null) {
            inorder(root.left, map);
            if (!map.containsKey(root.val)) {
                map.put(root.val, 1);
            } else {
                map.put(root.val, map.get(root.val) + 1);
            }
            inorder(root.right, map);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        int[] res = findMode(root);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
