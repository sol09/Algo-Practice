// 111. Minimum Depth of Binary Tree

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

// 210414 DFS
class Solution {
    public int minDepth(TreeNode root) {
        // tree에 node가 없는 경우
        if(root==null)
            return 0;
        // root가 leaf인 경우
        if(root.left==null && root.right==null)
            return 1;
        
        // root에 왼쪽 자식노드가 있는 경우
        int dep_left=1;
        if(root.left!=null)
            dep_left += minDepth(root.left);
        
        // root에 오른쪽 자식노드가 있는 경우
        int dep_right=1;
        if(root.right!=null)
            dep_right += minDepth(root.right);
        
        // root의 한쪽 자식노드가 null인 경우를 제외
        if(dep_left==1 || dep_right==1)
            return Math.max(dep_left, dep_right);
        // root의 양쪽 자식노드가 모두 있는 경우
        else
            return Math.min(dep_left, dep_right);
    }
}

/* 시간 73.6%, 공간 68.44%. BFS로도 풀어볼 것 */
