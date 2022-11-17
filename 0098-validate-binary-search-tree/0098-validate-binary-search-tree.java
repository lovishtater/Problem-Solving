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
    public static boolean check(TreeNode root , TreeNode min , TreeNode max){
        if(root == null ) return true;
        
        if(min!= null  && root.val<=min.val) return false;
        else if(max!=null && root.val>=max.val) return false;
        
        return check(root.left,min,root ) && check(root.right , root,max);
        }
    
    public boolean isValidBST(TreeNode root) {
       return check(root,null,null);
    }
}