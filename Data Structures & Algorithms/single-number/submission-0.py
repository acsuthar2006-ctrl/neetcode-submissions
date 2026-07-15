class Solution:
    def singleNumber(self, arr: List[int]) -> int:
        ans = 0

        for ele in arr:
            ans ^= ele
        
        return ans
