// 257. Binary Tree Paths

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> re = new ArrayList<String>();
        
        if(root==null)
            return re;
        
        return dfs(root, "", re);
    }
    
    public List<String> dfs(TreeNode root, String pth, List<String> re) {
        if(root.left==null && root.right==null)
            re.add(pth+root.val);
        
        if(root.left!=null) {
            dfs(root.left, pth+root.val+"->", re);
        }
    
        if(root.right!=null) {
            dfs(root.right, pth+root.val+"->", re);
        }
        
        return re;
    }
}
