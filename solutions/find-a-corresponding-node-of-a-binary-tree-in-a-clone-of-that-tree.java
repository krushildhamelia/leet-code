class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public final TreeNode getTargetCopy(final TreeNode ignore, final TreeNode cloned, final TreeNode target) {
        // DFS => Stack => LIFO => Recursion => Vertical Iteration and
        // BFS => Queue => FIFO => Horizontal iteration => for loop


        if (cloned == null) { // base condition
            return null;
        }

        return dfs(cloned, target.val);
    }

    private TreeNode dfs(final TreeNode cloned, final int val) {

        if (cloned == null) {
            return null;
        }
        // if (cloned.val == val) { // base
        //     return cloned;
        // }

        if (cloned.left != null) {
            cloned.left = dfs(cloned.left, val);
        }

        if (cloned.right != null) {
            cloned.right = dfs(cloned.right, val);
        }

        if (cloned.left != null && cloned.left.val == val) {
            return cloned.left;
        } else if (cloned.right != null && cloned.right.val == val) {
            return cloned.right;
        } else {
            return cloned;
        }
        // return null;
    }
}