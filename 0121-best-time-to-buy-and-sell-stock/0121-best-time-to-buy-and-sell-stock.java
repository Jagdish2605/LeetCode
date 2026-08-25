class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;

        for(int price : prices){

            if(price < minValue){
                minValue = price;
            }
            else{
                int profit = price - minValue;
                maxValue = Math.max(maxValue,profit);
            }

        }

    return maxValue;
    }
}