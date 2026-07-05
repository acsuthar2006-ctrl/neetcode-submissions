class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0]));

        ArrayList<int[]> merged = new ArrayList();
        merged.add(intervals[0]);

        for (int i = 1; i < n; i++) {
            int last[] = merged.get(merged.size() - 1);
            if (last[1] < intervals[i][0]) {
                merged.add(intervals[i]);

            } else {
                last[1] = Math.max(last[1], intervals[i][1]);
            }
        }

        return merged.toArray(new int[0][]);
    }
}
