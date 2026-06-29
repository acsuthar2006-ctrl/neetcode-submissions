class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return arr[0];
        }

        int[] dp = new int[n];
        dp[0] = arr[0];

        int maxSum = 0;

        for (int i = 1 ; i < n ; i++) {
           dp[i] = Math.max(dp[i-1] + arr[i] , arr[i]); 
        }

        return dp[n-1];
    }
}
