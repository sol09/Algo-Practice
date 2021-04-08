// 938.

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

// 210407
class Solution {
    int sum=0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        // 트리에서 low와 high 범위 내의 노드값을 더해서 반환하는 문제
        
        //if(root==null) return 0;    // tree의 노드 수가 1 이상이므로 해당없음.
        
        if(root.left==null && root.right==null) {
            if(low<=root.val && root.val<=high) return (sum + root.val);
            else return 0;
        }
        
        if(root.left!=null)
            rangeSumBST(root.left, low, high);
        if(root.right!=null)
            rangeSumBST(root.right, low, high);
        
        return sum;
    }
}
/* 미완성 */


// 210408
class Solution {
    int sum=0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        // 트리에서 low와 high 범위 내의 노드값을 더해서 반환하는 문제
        
        //if(root==null) return 0;    // tree의 노드 수가 1 이상이므로 해당없음.
        
        if(root.left!=null)
            sum = rangeSumBST(root.left, low, high);
        if(root.right!=null)
            sum = rangeSumBST(root.right, low, high);
        
        if(low<=root.val && root.val<=high) return (sum + root.val);
        else return (sum + 0);
        
        // return sum;   // Line 32: error: unreachable statement, (^)return sum;
    }
}
/* 기존 문제들과 비슷하지만 조건문의 순서를 바꿔야 해결되는 문제였음. 시간 47.94%, 공간 38.82%. 효율 높이는 방법 생각해 볼 것 */
