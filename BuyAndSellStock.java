class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minval = Integer.MAX_VALUE;
        for(int price : prices){
            if(price<minval){
                minval = price;
            }else if(price-minval>profit){
                profit = price-minval;
            }
        }        
        return profit;
    }
}
