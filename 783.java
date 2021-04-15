// 783. Min

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
    int diff = Integer.MAX_VALUE;
    List<Integer> values = new ArrayList<Integer>();
    public int minDiffInBST(TreeNode root) {
        
        values.add(root.val);
        
        if(root.left!=null) {
            for (int n : values)
                if(Math.abs(n-root.left.val)<diff)
                    diff = Math.abs(n-root.left.val);
            minDiffInBST(root.left);
        }
        if(root.right!=null) {
            for (int n : values)
                if(Math.abs(n-root.right.val)<diff)
                    diff = Math.abs(n-root.right.val);
            minDiffInBST(root.right);
        }
        
        return diff;
    }
}
