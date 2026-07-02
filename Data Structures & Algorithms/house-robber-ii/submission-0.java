class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        return Math.max(
            helper(nums, 0, n - 2),
            helper(nums, 1, n - 1)
        );
    }

    private int helper(int[] nums, int left, int right) {
        int len = right - left + 1;

        if (len == 1) return nums[left];

        int[] dp = new int[len];

        dp[0] = nums[left];
        dp[1] = Math.max(nums[left], nums[left + 1]);

        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(
                nums[left + i] + dp[i - 2],
                dp[i - 1]
            );
        }

        return dp[len - 1];
    }
}