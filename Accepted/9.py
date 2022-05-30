# 9. Palindrome Number

# Trial 1

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
#          평소였으면 아마 10으로 나눈 몫이랑 나머지 이용해서 풀었을 것 같음. 이 방법으로도 한 번 풀어봐야겠다.


# Trial 2

class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x<0: return False     
        
        num = x
        n = 0
        while num>0:
            n = n*10 + num%10
            num = num//10
            
        if n==x: return True
        else: return False

# Runtime 41.03%, Memory 59.66% - 여러 번 돌려본 결과 평균 정도로 나온 것 같긴 한데 이것보다 더 효율이 좋게 어떻게 풀지..? 다른 사람들 코드도 참고해봐야겠다.
