# 134. Gas Station

class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        n=len(gas)
        
        if sum(gas)<sum(cost):
            return -1
        
        tank=0
        st=0
        for i in range(n):
            tank=tank+gas[i]-cost[i]
            if tank<0:
                tank=0
                st=i+1
        
        return st
