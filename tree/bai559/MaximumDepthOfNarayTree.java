package tree.bai559;

import java.util.List;

public class MaximumDepthOfNarayTree {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children.size() == 0) {
            return 1;
        }
        int ans = Integer.MIN_VALUE;
        for (Node node : root.children) {
            ans = Math.max(ans, maxDepth(node) + 1);
        }
        return ans;
    }
}
