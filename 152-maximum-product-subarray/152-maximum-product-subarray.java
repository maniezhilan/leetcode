class Solution {
    public int maxProduct(int[] nums) {
        //base case
        if(nums.length == 0) return 0;
        //max_so_far
        int max_so_far = nums[0];
        //min_so_far
        int min_so_far = nums[0];
        //result
        int result = max_so_far;
        
        for(int i=1; i< nums.length; i++){
            int curr = nums[i];
            int temp_max = Math.max(curr, Math.max(max_so_far*curr, min_so_far*curr));
            min_so_far = Math.min(curr, Math.min(max_so_far*curr, min_so_far*curr));
            max_so_far = temp_max;
            result = Math.max(max_so_far,result);
            
        }
        return result;
        
    }
      
}