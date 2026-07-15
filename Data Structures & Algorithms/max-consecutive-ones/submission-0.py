class Solution:
    def findMaxConsecutiveOnes(self, arr: List[int]) -> int:
        n = len(arr)
        minlen = n
        currlen = 1

        for i in range(n):
            if arr[i] != 1:
                minlen = min(minlen , currlen)
                currlen = 0
            else:
                currlen += 1

        return minlen