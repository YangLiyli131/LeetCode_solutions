// problem link
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

cclass Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) return 0;
        int n = prices.length;
        int res = Integer.MIN_VALUE;
        int cur_min = prices[0];
        for(int i = 1; i < n; i++){
            if(prices[i] <= cur_min){
                cur_min = prices[i];
            }else{
                int d = prices[i] - cur_min;
                res = res < d? d : res;
            }
        }
        return Math.max(0,res);
    }
}