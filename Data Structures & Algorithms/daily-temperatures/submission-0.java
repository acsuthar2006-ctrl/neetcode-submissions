class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;

        int[] ans = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque();

        for (int i = 0; i < n; i++) {
            int curr = temp[i];

            while (!stack.isEmpty() && curr > temp[stack.peek()]) {
                int idx = stack.pop();
                ans[idx] = i - idx; // distance
            }

            stack.push(i);
        }

        return ans;
    }
}
