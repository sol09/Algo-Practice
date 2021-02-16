// 104. Maximum Depth of Binary Tree

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
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return 1;

        int dpl = 1;
        int dpr = 1;
        
        if(root.left!=null)
            dpl += maxDepth(root.left);
        if(root.right!=null)
            dpr += maxDepth(root.right);
        
        return Math.max(dpl,dpr);
    }
}

// 재귀형식이라 메모리 효율이 안 좋게 나옴. 다른 방법은 어떤 게 있을지 고민해볼것
