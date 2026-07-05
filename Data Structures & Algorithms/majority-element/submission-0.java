class Solution {
    public int majorityElement(int[] arr) {
        int candidate = -1;
        int cnt = 0;

        for (int ele : arr) {
            if (candidate == -1 || cnt < 0) {
                candidate = ele;
                cnt = 1;

            } else if (candidate == ele) {
                cnt++;

            } else {
                cnt--;
            }
        }

        return candidate;
    }
}