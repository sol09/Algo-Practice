# LeetCode - 561. Array Partition
# 2024.12.16.

# Trial 1 | 36ms(18.2%), 19.2MB(24.7%)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        result = 0
        for i in range(0,len(nums),2):
            result += min(nums[i],nums[i+1])
        return result

# Trial 2 | 18ms(98.2%), 19.2MB
class Solution:
   def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        return sum([nums[i] for i in range(0,len(nums),2)])
