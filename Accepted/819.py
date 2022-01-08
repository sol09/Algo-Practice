class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        # paragraph를 소문자로 바꾸고 특수문자를 제거함
        pStr = ''.join(c if c.isalnum() else ' ' for c in paragraph.lower())
        # paragraph 안의 단어들을 pList에 저장함
        pList = pStr.split()
        
        # 단어 수를 세기 위해 딕셔너리 사용
        pDict = {}
        for w in pList:
            if (w in pDict):
                pDict[w] += 1
            else:
                pDict[w] = 1
        
        # 딕셔너리 내용을 빈도수에 따라 내림차순 정렬함
        sDict = []
        sDict = sorted(pDict.items(), key=lambda x: x[1], reverse=True)
        for i in range(0, len(sDict)):
            if sDict[i][0] not in banned:
                return sDict[i][0]
