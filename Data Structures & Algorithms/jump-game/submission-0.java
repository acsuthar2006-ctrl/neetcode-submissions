class Solution {
    public boolean canJump(int[] arr) {
        int n = arr.length;

        boolean[] dp = new boolean[n];
        dp[0] = true;

        for (int i = 1 ; i < n; i++) {

            for (int j = 0; j < i; j++) {
                if (dp[j] && j + arr[j] >= i) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n-1];
    }
}
