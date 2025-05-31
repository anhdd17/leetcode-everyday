from typing import List

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        """
        Given a non-empty array of integers nums, every element appears twice except for one.
        Find that single one.

        :param nums: List[int] - List of integers where every element appears twice except for one.
        :return: int - The single integer that appears only once.
        """
        result = 0
        for num in nums:
            result ^= num
        return result
