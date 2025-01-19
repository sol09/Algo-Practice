# LeetCode - 2389. Longest Subsequence With Limited Sum
# 2024.12.19.

# Trial 1 | 79ms(28.52%), 17.79MB(9.26%)
class Solution:
    def answerQueries(self, nums: List[int], queries: List[int]) -> List[int]:
        prefix = list(accumulate(sorted(nums)))
        answer = list()
        for q in queries:
            for idx, pre in enumerate(prefix):
                if pre>q:
                    answer.append(idx)
                    break
             if prefix[-1]<=q:
                 answer.append(len(nums))
         return answer

# Trial 2 | 2ms(97.88%), 17.55MB(27.93%)
class Solution:
    def answerQueries(self, nums: List[int], queries: List[int]) -> List[int]:
        prefix = list(accumulate(sorted(nums)))
        return [bisect_right(prefix, q) for q in queries]
