class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //1. count the frequencies - o(n)
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.merge(num, 1, Integer::sum);
        }
        //2. Bucket the frequencies - o(n)
        List<List<Integer>> buckets = new ArrayList<>();
        for(int i=0; i<= nums.length; i++){
            buckets.add(new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> e: freq.entrySet()) {
            buckets.get(e.getValue()).add(e.getKey());
        }
        //3. Top K by traversal - o(n)
        int idx = 0;
        int [] results = new int[k];
        for(int f = nums.length; f >= 1 && idx < k; f--){
            for(int num: buckets.get(f)){
                results[idx++] = num;
                if(idx == k ) return results;
            }
        }
        return results;
    }
}