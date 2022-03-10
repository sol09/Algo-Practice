# 1470. Shuffle the Array

class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        re = []
        for i in range(n):
            re.append(nums[i])
            re.append(nums[n+i])
        return re

# https://edorrr.tistory.com/53
