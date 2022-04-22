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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr= new ArrayList<>();
        if(root==null) return arr;
        postorder(root,arr);
        return arr;
    }
    
    public List<Integer> postorder(TreeNode root, List arr ){
        if (root == null) return null;
        
        postorder(root.left,arr);
        postorder(root.right,arr);
        arr.add(root.val);
        return arr;
    }
}