# LeetCode - 2383. Minimum Hours of Training to Win a Competition
# 2024.12.26.

# Trial 1 | 0ms(100%, O(n)), Memory 17.76MB(12.92%, O(1))
class Solution:
    def minNumberOfHours(self, initialEnergy: int, initialExperience: int, energy: List[int], experience: List[int]) -> int:
      tt_energy = sum(energy)
      if initialExperience > sum(experience) and initialEnergy > tt_energy:
             return 0

      tr_time = tt_energy - initialEnergy + 1 if initialEnergy <= tt_energy else 0
      for exp in experience:
          if initialExperience <= exp:
             tr_time += (exp - initialExperience + 1)
             initialExperience += (exp - initialExperience + 1)
         initialExperience += exp
     return tr_time

# Trial 2 | similar performance
class Solution:
    def minNumberOfHours(self, initialEnergy: int, initialExperience: int, energy: List[int], experience: List[int]) -> int:
        if initialExperience > sum(experience) and initialEnergy > tt_energy:
            return 0
        tr_time = 0
        for en, exp in zip(energy, experience):
            if initialExperience <= exp:
                tr_time += (exp - initialExperience + 1)
                initialExperience = exp + 1
            if initialEnergy <= en:
                tr_time += (en - initialEnergy + 1)
                initialEnergy = en + 1
            initialExperience += exp
            initialEnergy -= en
        return tr_time
