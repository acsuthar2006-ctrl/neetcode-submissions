class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        n = len(piles)
        left, right = min(piles), max(piles)

        def isValid(piles, mid, h):
            totalhours = 0
            for pile in piles:
                totalhours += math.ceil(pile / mid)
                if totalhours > h:
                    return False
            return True
        
        ans = 0
        while left <= right:
            mid = left + (right - left) // 2
            if isValid(piles, mid, h):
                ans = mid
                right = mid - 1
            else:
                left = mid + 1

        return ans