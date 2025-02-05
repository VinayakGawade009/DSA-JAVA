class Solution {
    public int maxProfit(int[] prices) { // time complexity = O(n)
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i]; // As buying price must be low as posible
            }
        }
        return maxProfit;
    }
}