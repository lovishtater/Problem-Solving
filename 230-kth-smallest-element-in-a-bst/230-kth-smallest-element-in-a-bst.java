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
public int kthSmallest(TreeNode root, int k) {
	var kSmallest = new int[1];
	inorder(root, new int[]{k}, kSmallest);
	return kSmallest[0];
}

private void inorder(TreeNode root, int[] count, int[] kSmallest) {
	if (root == null || count[0] == 0)
		return;
	// recurse left
	inorder(root.left, count, kSmallest);
	// visit
	if (--count[0] == 0)
		kSmallest[0] = root.val;
	else
	// recurse right
		inorder(root.right, count, kSmallest);
}
}