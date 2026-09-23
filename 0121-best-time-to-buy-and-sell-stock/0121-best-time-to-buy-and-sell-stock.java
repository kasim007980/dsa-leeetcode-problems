class Solution {
    public int maxProfit(int[] prices) {
        int buy_price=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
             int current_profit=prices[i]-buy_price;
        
        if(current_profit>maxprofit){
            maxprofit=current_profit;
        }
        if(prices[i]<buy_price){
            buy_price=prices[i];
        }

        }
        return maxprofit;
       
        
    }
}