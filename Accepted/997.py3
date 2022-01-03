class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        
        person = [0]*(n+1)
        
        for i,j in trust:
            person[i] -= 1
            person[j] += 1
        
        for judge in range(1,n+1):
            if person[judge] == n-1:
                return judge        
        
        return -1
