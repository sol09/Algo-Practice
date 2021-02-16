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

/* 찾아본 결과 DFS(재귀)와 BFS(스택) 등의 방법으로 풀 수 있는데 DFS는 시간이 빠르고 메모리효율이 적지만 BFS는 메모리효율이 DFS보다 좋고 시간이 느림. 
 * 따라서 원래 문제 출제 의도대로 DFS와 재귀를 선택해서 푸는 것이 적합하다고 판단됨.
 */
