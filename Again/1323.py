# 필히 다시 풀기!

class Solution(object):
    def maximum69Number (self, num):
        """
        :type num: int
        :rtype: int
        """
        snum = list(str(num))
        for i in range(0,len(snum)):
            if snum[i]=='6':
                snum[i]='9'
                return int("".join(snum))
        if num>1000:
            return 9999
        elif num>100:
            return 999
        elif num>10:
            return 99
        else:
            return 9
