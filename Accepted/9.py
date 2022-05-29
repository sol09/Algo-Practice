# 9. Palindrome Number

class Solution:
    def isPalindrome(self, x: int) -> bool:
        num = str(x)
        numlist = []
        for n in num:
            numlist.append(n)
            
        while numlist:
            if numlist[0]==numlist[len(numlist)-1]:
                numlist = numlist[1:len(numlist)-1]
            else:
                return False
        
        return True
      
# Runtime 47.40%, Memory 16.26%
# Review - 평소 풀던 방식이랑 다르게 풀어보긴 했는데 string 변환도 쓰고 list도 써서 속도랑 메모리가 모두 떨어지는 것 같다. 다른 방법도 더 생각해 볼 것.
