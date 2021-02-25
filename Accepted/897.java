// 897. Increasing Order Search Tree

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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(list, root);
        list.sort(null);
        TreeNode tmp = new TreeNode(list.get(0));
        TreeNode nRoot = tmp;
        for(int i=1; i<list.size(); i++) {
            tmp.right = new TreeNode(list.get(i));
            tmp = tmp.right;
        }
        
        return nRoot;
    }
    
    public void dfs(List<Integer> list, TreeNode root) {
        list.add(root.val);
        if(root.left!=null) dfs(list, root.left);
        if(root.right!=null) dfs(list, root.right);
    }
}

/* 이진트리의 노드값을 오름차순으로 해서 오른쪽 노드만 가지는 트리를 만드는 문제.
 * 1. 기존 트리를 탐색해 List<Integer> 에 저장한다.
 * 2. list 를 오름차순으로 정렬하고 새로운 트리를 만들어 list 값을 저장한다.
 */
