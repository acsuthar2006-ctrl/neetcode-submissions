class Solution:
    def findMaxConsecutiveOnes(self, arr: List[int]) -> int:
        n = len(arr)
        maxlen = 0
        currlen = 0

        for i in range(n):
            if arr[i] != 1:
                maxlen = max(maxlen , currlen)
                currlen = 0
            else:
                currlen += 1

        return max(maxlen,currlen)