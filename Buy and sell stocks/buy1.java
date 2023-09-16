class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];// here we want to sell from the first day itself
        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
