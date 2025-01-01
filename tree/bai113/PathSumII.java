package tree.bai113;

import tree.bai112.PathSum;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
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

    static List<List<Integer>> ans = new ArrayList<>();

    public static void dfs(TreeNode node, List<Integer> path, int remainingSum) {
        if (node == null) {
            return;
        }
        path.add(node.val);
        if (node.left == null && node.right == null && remainingSum == node.val) {
            ans.add(new ArrayList<>(path));
        }
        dfs(node.left, path, remainingSum - node.val);
        dfs(node.right, path, remainingSum - node.val);
        path.remove(path.size() - 1);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        dfs(root, path, targetSum);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(5);

        System.out.println(pathSum(root, 22));
//        printTree(root, 22);
    }
}
