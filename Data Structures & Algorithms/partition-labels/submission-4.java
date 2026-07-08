class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();

        HashMap<Character , Integer> lastIndex = new HashMap();
        for (int i = 0; i < n; i++) {
            lastIndex.put(s.charAt(i) , i);
        }

        List<Integer> ans = new ArrayList();
        int farthest = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            farthest = Math.max(farthest , lastIndex.get(s.charAt(i)));

            if (farthest == i) {
                ans.add(i - start + 1);
                start = i + 1;
            }
        }


        return ans;
    }
}
