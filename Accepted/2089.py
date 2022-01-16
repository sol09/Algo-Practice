# 2089. Find Target Indices After Sorting Array

class Solution(object):
    def targetIndices(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        sNum = nums.sort()
        rList = []
        
        for i in range(0,len(nums)):
            if nums[i] == target:
                rList.append(i) 
                
        return rList
