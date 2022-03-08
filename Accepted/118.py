# 118. Pascal's Triangle

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        re = [[1]]
        for r in range(1,numRows):
            re.append([1] * (r+1))
            for i in range(1,r):
                re[r][i] = re[r-1][i-1] + re[r-1][i]
        return re
      
# https://edorrr.tistory.com/52
