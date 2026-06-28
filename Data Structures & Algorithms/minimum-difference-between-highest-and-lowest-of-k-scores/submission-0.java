class Solution {
    public int minimumDifference(int[] arr, int k) {
        int n = arr.length;

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;    

        for (int i = 0 ; i <= n - k ; i++) {
            min = Math.min(min , Math.abs(arr[i + k - 1] - arr[i]));
        }

        return min;
    }
}