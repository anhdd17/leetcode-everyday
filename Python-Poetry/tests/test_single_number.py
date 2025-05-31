import unittest
from single_number.single_number import Solution

class TestSingleNumber(unittest.TestCase):
    def test_single_number(self):
        sol = Solution()
        # Test cases for finding the single number in an array
        self.assertEqual(sol.singleNumber([2, 2, 1]), 1)
        self.assertEqual(sol.singleNumber([4, 1, 2, 1, 2]), 4)
        self.assertEqual(sol.singleNumber([1]), 1)
        self.assertEqual(sol.singleNumber([0, 1, 0]), 1)
        self.assertEqual(sol.singleNumber([-1, -1, -2]), -2)


if __name__ == "__main__":
    unittest.main()