package tree.bai637;

import tree.bai572.SubtreeOfAnotherTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        double sum = 0;
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            sum += temp.val;
            list.add(sum);
            if (root.left != null) {
                q.add(root.left);
            }
            if (root.right != null) {
                q.add(root.right);
            }
        }
        return list;
    }
}
