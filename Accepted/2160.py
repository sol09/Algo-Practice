# LeetCode - 2160. Longest Subsequence With Limited Sum
# 2024.12.24.

# Trial 1 | 0ms(100%), 17.7MB(5.77%)
class Solution:
    def minimumSum(self, num: int) -> int:
        splitnum = sorted([int(x) for x in str(num)])
        return sum([10*x if idx < 2 else x for idx, x in enumerate(splitnum)])

# Trial 2 | 0ms(100%), 17.58MB(8.4%)
class Solution:
    def minimumSum(self, num: int) -> int:
        return sum([10*x if idx < 2 else x for idx, x in enumerate(map(int, sorted(str(num))))])
