class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.merge(num, 1, Integer::sum);
        }

        Queue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((a,b) -> {
            return a.getValue() - b.getValue();
        });

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            q.add(entry);
            if(q.size() > k)
                q.poll();
        }

        int[] ans = new int[k];
        int i = 0;
        while(!q.isEmpty()){
            Map.Entry<Integer, Integer> entry = q.poll();
            ans[i++] = entry.getKey();
        }
        return ans;
        
    }
}
