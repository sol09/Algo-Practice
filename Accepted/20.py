# 20. Valid Parentheses

# Trial 1
class Solution:
    def isValid(self, s: str) -> bool:
        slist = list(s)
        brkdict = {'(':')', '{':'}', '[':']'}
        queue = []
        for c in slist:
            if c in brkdict.keys():
                queue.append(c)
            elif c in brkdict.values():
                if not queue:
                    return False
                if queue[len(queue)-1]==[k for k,v in brkdict.items() if v==c][0]:
                    queue.pop()
                else:
                    return False
        if queue:
            return False
        else:
            return True
          
# Review - Runtime 32.60%, Memory 68.92%
# 저번에 비슷한 문제를 푼 적이 있어서 비슷한 방법으로 풀어보았다. 그 때는 괄호 종류가 한가지라 바로 pop 하면 되었지만 이번엔 괄호 종류가 여러가지라 딕셔너리를 추가로 사용했다.
# 하지만 효율이 크게 좋지는 않아서 힌트랑 다른 풀이들도 보면서 또 풀어봐야 할 것 같다.
