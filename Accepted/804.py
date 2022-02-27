class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        morseList = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                     "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
                     "...-",".--","-..-","-.--","--.."]
        
        re = set()
        
        for w in words:
            reStr = ""
            for c in w:
                idx = ord(c) - ord('a')
                reStr = reStr + morseList[idx]
            re.add(reStr)
        
        return len(re)
      
# https://edorrr.tistory.com/46
