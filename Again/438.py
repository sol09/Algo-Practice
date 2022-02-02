# 438. Find All Anagrams in a String

class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        result = []
        psorted = sorted(p)
        for i in range(len(s)):
            ssorted = sorted(s[i:i+len(p)])
            if ssorted == psorted:
                result.append(i)
        return result
      
# TimeLimit : Again
