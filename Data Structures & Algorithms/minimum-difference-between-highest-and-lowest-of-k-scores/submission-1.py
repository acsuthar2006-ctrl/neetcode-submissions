class Solution:
    def minimumDifference(self, arr: List[int], k: int) -> int:
        arr.sort()
        n = len(arr)

        ans = 100001

        for i in range(k-1, n):
            diff = abs(arr[i] - arr[i-k+1])
            ans = min(diff, ans)

        return ans