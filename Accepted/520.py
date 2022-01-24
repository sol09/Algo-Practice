class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        if word.isupper():
            return True
        elif word.islower():
            return True
        else:
            if word[0].isupper():
                for i in range(1,len(word)):
                    if word[i].isupper():
                        return False
                return True
            else:
                return False
