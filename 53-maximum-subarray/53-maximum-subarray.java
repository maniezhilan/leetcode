class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSub=nums[0];
        for(int i=0;i<nums.length; i++) {
            if(currSum < 0){
                currSum = 0;
            }
            currSum+=nums[i];
            maxSub=Math.max(maxSub,currSum);
        }
        return maxSub;
    }
}