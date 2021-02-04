// 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
	    int index=0;
        int result=0;
	        
	    for (int i=1;i<prices.length;i++){
	        if (min>prices[i])
	            min = prices[i];
            else {
                // 수익의 최댓값 구하기
                int tmp = prices[i] - min;
                if(tmp>result)
                    result = tmp;
            }
	    }
        return result;
    }
} 
