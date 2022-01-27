# 1305. All Elements in Two Binary Search Trees

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:    
    def getAllElements(self, root1: TreeNode, root2: TreeNode) -> List[int]:
        t1List = Solution.dfs(self, root1)
        t2List = Solution.dfs(self, root2)
        
        bstList = t1List + t2List
        bstList.sort()        
        
        return bstList
    
    def dfs(self, root: TreeNode) -> List[int]:
        if root==None:
            return []
        
        tList = [root.val]
        
        if root.left!=None:
            tList = tList + Solution.dfs(self, root.left)
        if root.right!=None:
            tList = tList + Solution.dfs(self, root.right)
        
        return tList
      
# https://edorrr.tistory.com/25
