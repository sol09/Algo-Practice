class Solution:
    def numberOfArithmeticSlices(self, nums: List[int]) -> int:
    	# 배열 길이가 3 미만이면 산술인 하위 배열은 없다
        if len(nums)<3:
            return 0
        
        arSbCount = []	# 산술 하위 배열의 길이를 저장하는 리스트
        count = 1
        # 산술 하위 배열의 길이 구하기
        for i in range(len(nums)-2):
            dff = nums[i+1] - nums[i]	
            if dff == (nums[i+2] - nums[i+1]):
                # 산술을 만족하고 첫번째에 위치할 때
                if count == 1:
                    count = count+2
                else:
                    count += 1
            # 산술이 끝났을 때
            else:
                if count >= 3:
                    arSbCount.append(count)
                count = 1

        # 반복문이 끝나는 시점의 count 판단 
        if count >= 3:
            arSbCount.append(count)
        
        # 산술인 하위 배열의 길이로 개수 구하기
        re = 0
        if len(arSbCount) == 0:
            return 0
        for c in arSbCount:
            n = c-2
            while(n>0):
                re = re + n
                n -= 1
        return re
        
        '''
        # 하위 배열의 개수 구하는 다른 방법
        if len(arSbCount) == 0:
            return 0
        for c in arSbCount:
            re = re + (c*(c+1)/2) - (2*c-1)
        return int(re)
        '''
        
        # https://edorrr.tistory.com/50
