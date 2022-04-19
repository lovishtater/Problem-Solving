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
    TreeNode previous = null;
    TreeNode first = null;
    TreeNode second = null;

    public void recoverTree(TreeNode root) {
        solve(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    public void solve(TreeNode root) {

        if (root == null) {
            return;
        }
        solve(root.left);
        if (previous != null && root.val < previous.val) {
            if (first == null) {
                first = previous;
            }
            second = root;

        }
        previous = root;
        solve(root.right);

    }
}