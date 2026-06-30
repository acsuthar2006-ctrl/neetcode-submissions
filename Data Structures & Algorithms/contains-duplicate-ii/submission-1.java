class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int n = arr.length;

        int left = 0;

        for (int right = 1 ; right < n ; right++) {
            if (right - left <= k && arr[right] == arr[left]) {
                return true;

            } else if (right - left <= k) {
                right++;

            } else {
                left = right;
            }
        }

        return false;
    }
}