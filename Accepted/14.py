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
