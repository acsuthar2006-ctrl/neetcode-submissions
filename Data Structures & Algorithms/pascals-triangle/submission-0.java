class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> ans = new ArrayList<>();

        int[] dp = new int[n+1];

        for (int i = 0 ; i < n ; i++) {
            dp[i] = 1;

            for (int j = i - 1 ; j > 0 ; j--) {
                dp[j] = dp[j] + dp[j-1];
            }

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                row.add(dp[j]);
            }

            ans.add(row);
        }

        return ans;
    }
}