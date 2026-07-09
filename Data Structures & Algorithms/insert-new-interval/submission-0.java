class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;

        ArrayList<int[]> ans = new ArrayList();
        int i = 0;

        while (i < n && newInterval[0] > intervals[i][1])  {
            ans.add(new int[]{intervals[i][0] , intervals[i][1]});
            i++;
        }

        int newStart = newInterval[0];
        int newEnd = newInterval[1];

        while (i < n && newEnd >= intervals[i][0]) {
            newStart = Math.min(newStart, intervals[i][0]);
            newEnd = Math.max(newEnd , intervals[i][1]);
            i++;
        }

        ans.add(new int[]{newStart , newEnd});

        while (i < n) {
            ans.add(new int[]{intervals[i][0] , intervals[i][1]});
            i++;
        }

        return ans.toArray(new int[0][]);
    }
}