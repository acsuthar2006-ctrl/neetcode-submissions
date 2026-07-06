class Solution {
    public int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n + n];

        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
            ans[i + n] = ans[i];
        }

        return ans;
    }
}