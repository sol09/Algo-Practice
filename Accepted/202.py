# 202. Happy Number

class Solution:
    def isHappy(self, n: int) -> bool:
        nsum = 0
        nlist = []
        nlist.append(n)
        
        while True:
            while n!=0:
                nsum += pow(n%10,2)
                n = n//10
            if nsum==1:
                return True
            if nsum in nlist:
                return False
            nlist.append(nsum)
            n = nsum
            nsum = 0

# https://edorrr.tistory.com/60
