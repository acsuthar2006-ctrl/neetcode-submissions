class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        n = len(heights)
        stack = []
        ans = 0

        for i in range(n):
            curr = heights[i]

            while stack and curr < heights[stack[-1]]:
                height = heights[stack.pop()]
                left = -1
                if stack:
                    left = stack[-1]
                
                width = i - 1 - left
                
                ans = max(ans, height * width)
        
            stack.append(i)

        while stack:
            height = heights[stack.pop()]
            left = -1
            if stack:
                left = stack[-1]
            
            width = n - 1 - left
            
            ans = max(ans, height * width)

        return ans



