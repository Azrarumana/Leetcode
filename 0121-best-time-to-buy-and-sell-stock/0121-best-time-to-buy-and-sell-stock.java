class Solution {
    public int maxProfit(int[] prices) {
        int cur=prices[0];
        int maxProf=0;
        for(int i=0;i<prices.length;i++)
        {
            cur=Math.min(cur,prices[i]);
            int profit=prices[i]-cur;
            maxProf=Math.max(profit, maxProf);
        }
        return maxProf;
        
    }
}