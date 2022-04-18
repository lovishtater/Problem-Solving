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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<>();
        if (root == null) return a;
        preorder(root, a);
        return a;
    }
    public List<Integer> preorder(TreeNode root, List arr){
        if (root == null) return null;
        arr.add(root.val);
        preorder(root.left,arr);
        preorder(root.right, arr);
        return arr;
    }
}