# 14. Longest Common Prefix

# Trial 1

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = ""
        cpr = strs[0]
        for i in range(len(cpr)):
            l = cpr[i]
            for string in strs:
                if len(string)<=i or l!=string[i]:
                    return prefix
            prefix += l
        return prefix
      
# Runtime 56.07%, Memory 49.63% - 중첩 반복문을 써서 썩 마음에 드는 코드는 아님. 효율도 썩 좋게 안 나왔고.. 
#                                 근데 이 방법 말고는 생각이 안 나서 다른 코드 보면서 새로 알게 되는 부분 정리해봐야겠다.


# Reference : https://leetcode.com/problems/longest-common-prefix/discuss/6918/Short-Python-Solution

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        shortest = min(strs,key=len)
        for i, ch in enumerate(shortest):
            for other in strs:
                if other[i] != ch:
                    return shortest[:i]
        return shortest
    
# 일단 내 코드는 아닌데 보면서 공부할 만 할 것 같아서 추가함.
# 눈에 띄는 부분은 (1) if문에서의 리스트 null 확인 (2) min() 사용 (3) enumerate() 사용 < 인데, 
# (1)과 (3)은 이미 아는 내용이고 종종 사용했음에도 문제 풀 때는 떠올리지 못 했다. (2)는 함수 속성에 key 를 추가하는 것을 잘 몰랐어서 그 내용을 정리해보려고 함.
