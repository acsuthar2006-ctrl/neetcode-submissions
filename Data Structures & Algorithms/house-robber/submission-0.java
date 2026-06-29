class Solution {
    public int rob(int[] arr) {
        int n = arr.length;

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[1] , dp[0]);

        for (int i = 2 ; i < n ; i++) {
            int rob = dp[i-2] + arr[i];
            int skip = dp[i-1];

            dp[i] = Math.max(rob , skip);
        }

        return dp[n-1];
    }
}
