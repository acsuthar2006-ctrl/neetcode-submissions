class Solution:
    def twoSum(self, arr: List[int], target: int) -> List[int]:
        ans = []
        dic = {}

        for i in range(len(arr)):
            if target - arr[i] in dic:
                ans.append(dic.get(target - arr[i]))
                ans.append(i)
                break
            dic[arr[i]] = i
        
        return ans