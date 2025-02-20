from typing import List

class Solution:
    def findDifferentBinaryString(self, nums: List[str]) -> str:
        # Cantor's Diagonalization: Flip the i-th bit of the i-th string
        # return "".join("1" if nums[i][i] == "0" else "0" for i in range(len(nums)))
        # =======================================================
        #normal syntax
        result = []
        totalElements = len(nums)
        for i in range(totalElements):
            if nums[i][i] == "0":
                result.append("1")
            else:
                result.append("0")
        # conver list to string
        return "".join(result)

if __name__ == "__main__":
    nums = ["01", "10"]
    solution = Solution()
    print(solution.findDifferentBinaryString(nums))  # Output: "11" or "00"
