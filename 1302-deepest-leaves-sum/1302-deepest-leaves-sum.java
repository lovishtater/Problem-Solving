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
    int deepestLevel = 0;
    int sum = 0;
    
    public void deepestLeavesSum(TreeNode root, int level){
        
        if(root == null) return;
        
        
        
        if(root.left == null && root.right == null && level == deepestLevel) 
        sum += root.val; 
        
        if(root.left == null && root.right == null && level > deepestLevel){
            deepestLevel = level;
            sum = root.val; 
        }
        
        deepestLeavesSum(root.left, level + 1);
        deepestLeavesSum(root.right, level + 1);
    }
    
    public int deepestLeavesSum(TreeNode root) {
        deepestLeavesSum(root,0);
        return sum;
    }
}