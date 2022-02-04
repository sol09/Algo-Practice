# 438. Find All Anagrams in a String

class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        result = []
        phash = defaultdict(int)
        shash = defaultdict(int)
        
        for char in p:
            phash[char] += 1
            
        for idx, char in enumerate(s):
            shash[char] += 1
            
            # 누적된 문자 앞에서부터 하나씩 제거하기
            if idx >= len(p):
                delchar = s[idx-len(p)]
                if shash[delchar] > 1:
                    shash[delchar] -= 1
                elif shash[delchar] == 1:
                    del shash[delchar]
            
            if phash == shash:
                result.append(idx + 1 - len(p))
                
        return result
