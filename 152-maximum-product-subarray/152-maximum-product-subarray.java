class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0];
        int min = nums[0];
        
        int result = max;
        
        for(int i =1; i< nums.length; i++){
            int curr = nums[i];
            int temp_max = Math.max(curr,Math.max(max*curr,min*curr));
            min = Math.min(curr,Math.min(max*curr,min*curr));
            max = temp_max;
            result = Math.max(temp_max,result);
        }
        return result;
        
    }
}