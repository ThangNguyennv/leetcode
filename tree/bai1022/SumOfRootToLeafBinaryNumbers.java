package tree.bai1022;

import java.util.ArrayList;
import java.util.List;

public class SumOfRootToLeafBinaryNumbers {
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
// Solution 1:
//    public static int sumRootToLeaf(TreeNode root) {
//        List<String> list = binaryTreePaths(root);
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            String str = list.get(i);
//            for (int j = 0; j < str.length(); j++) {
//                sum += Integer.parseInt(String.valueOf(str.charAt(j))) * Math.pow(2, str.length() - 1 - j);
//            }
//        }
//        return sum;
//    }
//
//    public static List<String> binaryTreePaths(TreeNode root) {
//        List<String> list = new ArrayList<>();
//        if (root == null) {
//            return list;
//        } else {
//            searchBST(root, "", list);
//        }
//        return list;
//    }
//
//    public static void searchBST(TreeNode root, String path, List<String> list) {
//         if (root.left == null && root.right == null) {
//             list.add(path + root.val);
//         }
//         if (root.left != null) {
//             searchBST(root.left, path + root.val, list);
//         }
//         if (root.right != null) {
//             searchBST(root.right, path + root.val, list);
//         }
//    }

// Solution 2:
    private static int result = 0;
    public static void DFS(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        val = val * 2 + root.val;
        if (root.left == null && root.right == null) {
            result += val;
        }
        DFS(root.left, val);
        DFS(root.right, val);
    }
    public static int sumRootToLeaf(TreeNode root) {
        DFS(root, 0);
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        System.out.println(sumRootToLeaf(root));
    }
}
