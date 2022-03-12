class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 0;
        //l = buy r = sell
        int maxprofit = 0;
        while( r < prices.length ) {
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                l = r;
            }
            r = r + 1;
        }
     return  maxprofit;
    }
}