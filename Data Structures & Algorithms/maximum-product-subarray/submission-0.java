class Solution {
    public int maxProduct(int[] arr) {

        int n = arr.length;

        int[] maxDp = new int[n];
        int[] minDp = new int[n];

        maxDp[0] = arr[0];
        minDp[0] = arr[0];

        int ans = arr[0];

        for (int i = 1; i < n; i++) {

            maxDp[i] = Math.max(
                arr[i],
                Math.max(arr[i] * maxDp[i - 1],
                         arr[i] * minDp[i - 1])
            );

            minDp[i] = Math.min(
                arr[i],
                Math.min(arr[i] * maxDp[i - 1],
                         arr[i] * minDp[i - 1])
            );

            ans = Math.max(ans, maxDp[i]);
        }

        return ans;
    }
}