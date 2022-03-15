# 1249. Minimum Remove to Make Valid Parentheses

class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        s = list(s)
        tmp = []
        for i, char in enumerate(s):
            if char == '(':
                tmp.append(i)
            elif char == ')':
                if tmp:
                    tmp.pop()
                else:
                    s[i] = ''
        while tmp:
            s[tmp.pop()] = ''
        return ''.join(s)
      
# https://edorrr.tistory.com/58
