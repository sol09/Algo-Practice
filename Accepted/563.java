// 563. Binary Tree Tilt

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
    private int re=0;
    
    public int findTilt(TreeNode root) {
        /*if(root.left==null && root.right==null)
            return 0;*/ //런타임 오류 발생
        
        valSum(root);
        
        return re;
    }
    
    public int valSum(TreeNode root) {
        if(root==null)
            return 0;
        
        int left = valSum(root.left);
        int right = valSum(root.right);
        
        int n = Math.abs(left-right);
        re += n;
        
        return root.val+left+right;
    }
}

/* 
 * 노드의 왼쪽 합, 오른쪽 합을 구해서 그 차를 모두 더해 반환하는 문제
 * 최종 반환값을 클래스 전체에서 사용하면서 합을 더해가야 하기 때문에 private int 변수를 선언 후 사용.
 * 가장 낮은 레벨에서부터 탐색이 진행되며 이 때 왼쪽 합, 오른쪽 합, 해당 탐색 노드의 값을 더해 리턴하면 그게 곧 그 다음 레벨의 왼쪽 합, 오른쪽 합이 됨.
 * 최종 반환값에 더하는 값은 왼쪽 합, 오른쪽 합의 차이만 더하므로 리턴값과 별개의 값이다. 따라서 최종 반환값을 함수 밖에 정의하고 이용해야 함.
 */
