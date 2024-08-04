/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, 0, false);
    }

    int dfs(TreeNode root, int sum, boolean isLeft) {

        if (root.left == null && root.right == null && isLeft) {
            return sum + root.val;
        }

        int left = 0, right = 0;
        if (root.left != null) {
            left = dfs(root.left, sum, true);
        }

        if (root.right != null) {
            right = dfs(root.right, sum, false);
        }

        return left + right;
    }
}