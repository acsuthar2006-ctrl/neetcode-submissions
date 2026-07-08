class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();

        HashMap<Character , Integer> lastIndex = new HashMap();
        for (int i = 0; i < n; i++) {
            lastIndex.put(s.charAt(i) , i);
        }

        List<Integer> ans = new ArrayList();
        int farthest = lastIndex.get(s.charAt(0));
        int cnt = 1;

        for (int i = 1; i < n; i++) {
            farthest = Math.max(farthest , lastIndex.get(s.charAt(i)));
            cnt++;

            if (farthest == i) {
                ans.add(cnt);
                cnt = 0;
            } 
        }

        if (cnt > 0) {
            ans.add(cnt);
        }

        return ans;
    }
}
