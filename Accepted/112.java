// 112. Path Sum

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean flag = false;
        
        if(root==null)
            return false;
        if(root.left==null && root.right==null) {
            if(root.val==targetSum) return true;
            else return false;
        }
        
        int sum = targetSum - root.val;
        if(root.left!=null) {
            flag = hasPathSum(root.left, sum);
        }
        if(root.right!=null && flag==false) {
            flag = hasPathSum(root.right, sum);
        }
        
        return flag;
    }
}
