class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0 ; i < n-k ; i++) {

            for (int j = i+1 ; j <= i+k ; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }

        }

        return false;
    }
}