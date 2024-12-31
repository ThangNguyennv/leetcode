package tree.bai1379;


import java.util.LinkedList;
import java.util.Queue;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
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

    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        // Solution 1:
//        if (original == null) {
//            return null;
//        }
//        // General case:
//        if (original == target) {
//            // current original node is target, so is cloned
//            return cloned;
//        }
//        if (getTargetCopy(original.left, cloned.left, target) != null) {
//            return getTargetCopy(original.left, cloned.left, target);
//        } else {
//            return getTargetCopy(original.right, cloned.right, target);
//        }
        // Solution 2:
        if (original == null) {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(cloned);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.val == target.val) {
                return temp;
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);

        TreeNode cloned = new TreeNode(7);
        cloned.left = new TreeNode(4);
        cloned.right = new TreeNode(3);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(19);

        TreeNode target = new TreeNode(3);
        System.out.println(getTargetCopy(original, cloned, target));
    }
}
