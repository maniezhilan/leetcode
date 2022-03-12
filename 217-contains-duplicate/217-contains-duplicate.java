class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
        
    }
}