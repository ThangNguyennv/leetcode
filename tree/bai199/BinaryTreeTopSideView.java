package tree.bai199;

import java.util.*;

public class BinaryTreeTopSideView {
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

    static class Pair {
        TreeNode node;
        int hd;

        public Pair(int hd, TreeNode node) {
            this.hd = hd;
            this.node = node;
        }
    }

    public static List<Integer> topSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // Sử dụng TreeMap để lưu các node theo thứ tự HD (Horizontal Distance)
        Map<Integer, Integer> topViewMap = new TreeMap<>();

        // Hàng đợi để duyệt cây
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, root)); // root có hd = 0
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            TreeNode node = curr.node;
            int hd = curr.hd;

            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, node.val);
            }

            // Thêm các node con vào hàng đợi với HD tương ứng
            if (node.left != null) {
                q.add(new Pair(hd - 1, node.left));
            }
            if (node.right != null) {
                q.add(new Pair(hd + 1, node.right));
            }
        }

        for (int value : topViewMap.values()) {
            result.add(value);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);

        System.out.println(topSideView(root));
    }
}
