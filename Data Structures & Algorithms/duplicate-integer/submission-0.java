class Solution {
    public boolean hasDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet();

        for (int ele : arr) {
            if (!set.add(ele)) {
                return true;
            }
        }

        return false;
    }
}