class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int n = arr.length;
        
        HashSet<Integer> window = new HashSet();

        for (int i = 0 ; i < n ; i++) {
            if (window.contains(arr[i])) {
                return true;
            }

            window.add(arr[i]);

            if (window.size() > k) {
                window.remove(arr[i - k]);
            }
        }

        return false;
    }
}