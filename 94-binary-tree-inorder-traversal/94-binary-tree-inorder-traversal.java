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
     public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result= new ArrayList<>();
            if(root == null) return result;
            inorder(root,result);
            return result ; 
     }
    
    public List<Integer> inorder(TreeNode root, List arr) {
        if (root == null) return null;
        
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
        return arr;
    }
    
}