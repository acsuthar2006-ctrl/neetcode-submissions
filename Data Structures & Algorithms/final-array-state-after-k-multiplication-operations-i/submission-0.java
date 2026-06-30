class Solution {
    public int[] getFinalState(int[] arr, int k, int m) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            }
        );

        for (int i = 0 ; i < arr.length; i++) {
            pq.offer(new int[]{arr[i] , i});
        }

        while (k-- > 0) {
            int[] curr = pq.poll();
            arr[curr[1]] = curr[0] * m;

            pq.offer(new int[] {arr[curr[1]] , curr[1]});
        }

        return arr;
    }
}