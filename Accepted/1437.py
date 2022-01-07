'''
Check If All 1's Are at Least Length K Places Away

Given an binary array nums and an integer k, return true if all 1's are at least k places away from each other, otherwise return false.
'''

class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        flag = False  # 배열이 0으로 시작할 경우, 거리를 계산하지 않기 위한 장치
        d = 0         # 거리
        
        for n in nums:
            if n == 0:
                d += 1
            else:
                if flag:  # 이전에 1이 있었을 경우
                    if d < k:
                        return False
                d = 0
                flag = True
                
        return True
