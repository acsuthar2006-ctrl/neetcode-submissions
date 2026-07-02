class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            bucket.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            bucket.get(freq).add(num);
        }

        int[] ans = new int[k];
        int idx = 0;

        for (int i = n; i >= 0 && idx < k; i--) {
            for (int num : bucket.get(i)) {
                ans[idx++] = num;

                if (idx == k) {
                    return ans;
                }
            }
        }

        return ans;
    }
}