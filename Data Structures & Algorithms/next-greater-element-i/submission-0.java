class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] ans = new int[n1];

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n2; i++) {
            int curr = arr2[i];

            while (!stack.isEmpty() && curr > arr2[stack.peek()]) {
                int idx = stack.pop();
                map.put(arr2[idx], curr);
            }

            stack.push(i);
        }

        for (int i = 0; i < n1; i++) {
            ans[i] = map.getOrDefault(arr1[i] , -1);
        }

        return ans;
    }
}