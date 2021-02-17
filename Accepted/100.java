// 100. Same Tree

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag = false;
        
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        
        if(p.val!=q.val)
            return false;
        
        flag = (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        
        return flag;
    }
}

/* 104번과 마찬가지로 메모리 효율이 좋지 않지만 Solution을 참고하면 이 경우와 두 번째 경우 모두 공간복잡도가 같음. 그래도 한 번 더 찾아볼 것.
 */
